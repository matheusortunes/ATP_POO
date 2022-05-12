package entities;

public class Notebook extends Produtos {
    private static final long serialVersionUID = 1L;
    private String processador;
    private int memoriaRam;
    private String disco;

    public Notebook(String marca, String modelo, double tela, String processador, int memoriaRam, String disco) {
            super(marca, modelo, tela);
            this.categoria = "Notebook";
            this.processador = processador;
            this.memoriaRam = memoriaRam;
            this.disco = disco;
    }
	
    @Override
    public String toString() {
    return  "\n=======" + this.categoria + "=======" + 
            "\nMarca: " + this.marca + 
            "\nModelo: " + this.modelo + 
            "\nTela: " + this.tela +
            "\nMemória Interna: " + this.disco +
            "\nProcessador: " + this.processador +
            "\nMemória RAM: " + this.memoriaRam + "GB";
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }
        
    public String funcionalidades() {
    	return  "Funções do " + this.categoria + ": \n" +
    			"Pacote Office \n" +
    			"Acesso a Internet \n" + 
    			"Games";
    }    
}
