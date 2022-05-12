package application;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import entities.Notebook;
import entities.Produtos;
import entities.Smartphone;
import entities.Smartwatch;

public class LojaEletronicos {	
	private ArrayList<Produtos> produtos;
	
	public LojaEletronicos() {
		this.produtos = new ArrayList<Produtos>();
	}
	
	public void adicionaProdutos(Produtos eletronico) {
		this.produtos.add(eletronico);
	}

	public void listarProdutos() {
		if(produtos.isEmpty() == false) {
			for(Produtos eletronico:produtos) {
				System.out.println(eletronico.toString());
			}
				System.out.println("Total = " + this.produtos.size() + " produtos listados com sucesso!\n");
		} else {
			System.out.println("Não existem produtos a serem listados =(");
		}
	}
	
	public void excluirProduto(Produtos eletronico) {
		if (this.produtos.contains(eletronico)) {
			this.produtos.remove(eletronico);
			System.out.println("[Produto " + eletronico.getNome() + " excluido com sucesso!]\n");
		}
		else
			System.out.println("Produto inexistente!\n");
	}

	public void excluirTodosProdutos() {
		produtos.clear();
		System.out.println("Produtos excluidos com sucesso!\n");
	}
	public void gravarProdutos()  {
		ObjectOutputStream outputStream = null;
		try {
			outputStream = new ObjectOutputStream (new FileOutputStream("/tmp/produtos.dat"));
			for(Produtos eletronico:produtos) {
				outputStream.writeObject(eletronico);
			}
		}catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}catch (IOException ex) {
			ex.printStackTrace();
		}finally{
			try {
				if (outputStream != null ) {
					outputStream.flush();
					outputStream.close();
				}
			}catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	public void recuperarProdutos() {
		ObjectInputStream inputStream = null;
		try {
			inputStream	= new ObjectInputStream (new FileInputStream ("/tmp/produtos.dat"));
			Object obj = null;
			while((obj = inputStream.readObject ()) != null) {
				if (obj instanceof Smartphone)  
					this.produtos.add((Smartphone)obj);
				else if (obj instanceof Smartwatch)  
					this.produtos.add((Smartwatch)obj);
				else if (obj instanceof Notebook)  
					this.produtos.add((Notebook)obj);
			}
		}catch (EOFException ex) {     // when EOF is reached
			System.out.println ();
		}catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}catch (IOException ex) {
			ex.printStackTrace();
		}finally{
			try {
				if (inputStream != null ) {
					inputStream.close();
					System.out.println("Produtos recuperados com sucesso!\n");
				}
			}catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		
	}

}
