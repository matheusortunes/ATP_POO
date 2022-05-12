package entities;

public class Smartphone extends Produtos {
    private static final long serialVersionUID = 1L;
    private int chips;

    public Smartphone(String marca, String modelo, double tela, int chips) {
	super(marca, modelo, tela);
	this.categoria = "Smartphone";
	this.chips = chips;
    }
	
    @Override
    public String toString() {
        return  "\n======" + this.categoria + "======" + 
                "\nMarca: " + marca + 
                "\nModelo: " + modelo + 
                "\nTela: " + tela +
                "\nQuantidade de chips: " + chips;
    }       

    public int getChips() {
        return chips;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }
    
    public String funcionalidades() {
    	return  "Funções do " + this.categoria + ": \n" +
    			"Fazer ligações \n" +
    			"Mensagens de Texto \n" +
    			"Ouvir músicas \n" +
    			"Apps e Redes Sociais \n" + 
    			"Games";
    }
}
