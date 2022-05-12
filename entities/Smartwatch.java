package entities;

public class Smartwatch extends Produtos {
    private static final long serialVersionUID = 1L;
    private String pulseira;

    public Smartwatch(String marca, String modelo, double tela, String pulseira) {
	super(marca, modelo, tela);
	this.categoria = "Smartwatch";
	this.pulseira = pulseira;
    }
	
    @Override
    public String toString() {
        return  "\n======" + this.categoria + "======" + 
                "\nMarca: " + this.marca + 
                "\nModelo: " + this.modelo + 
                "\nTela: " + this.tela +
                "\nPulseira: " + this.pulseira;
}     
    
    public String getPulseira() {
        return pulseira;
    }

    public void setPulseira(String pulseira) {
        this.pulseira = pulseira;
    }  
    
    public String funcionalidades() {
    	return  "Funções do " + this.categoria + ": \n" +
    			"Mostrar as horas \n" +
    			"Notificações \n" +
    			"Troca suas músicas \n" +
    			"Alarme \n" + 
    			"Clima/Tempo";
    }
}