package atvd04;

public class carro {
	private String tipo;
	private String cor;
	private String placa;
	private int numPortas;
	private pessoa Dono;
	
	@Override
	public String toString() {
		return String.format("carro [tipo=" + tipo + ", cor=" + cor + ", placa=" + placa + ", numPortas=" + numPortas + ", Dono="
				+ Dono + "]");}
	
	
	public carro() {}
	public carro(String tipo, String cor, String placa, int numPortas) {
		this.tipo = tipo;
		this.cor = cor;
		this.placa = placa;
		this.numPortas = numPortas;
	}
	

	public pessoa getDono() {//Chama o Dono.
		return Dono;
	}
	public void setDono(pessoa dono) {//Define o dono. 
		Dono = dono;
	}
	
	
	public String getTipo() {//Chama o tipo do carro.
		return tipo;
	}
	public void setTipo(String tipo) {//Define o tipo do carro. 
		this.tipo = tipo;
	}
	
	
	public String getCor() {//Chama a cor do carro.
		return cor;
	}
	public void setCor(String cor) {//Define a cor do carro.
		this.cor = cor;
	}
	
	
	public String getPlaca() {//Chama a placa do carro.
		return placa;
	}
	public void setPlaca(String placa) {//Define a placa do carro. 
		this.placa = placa;
	}
	
	
	public int getNumPortas() {//Chama o num de portas do carro.
		return numPortas;
	}
	public void setNumPortas(int numPortas) {//Define o num de portas do carro. 
		this.numPortas = numPortas;
	}
	
	//MÉTODOS FEITOS PELO CARRO.
	
	void ligarCarro() {
		System.out.println("Carro ligado.");
	}
	void desligarCarro() {
		System.out.println("Carro desligado.");
	}
	void acelerarCarro() {
		System.out.println("Acelerando...");
	}
	void frearCarro() {
		System.out.println("freando...");
	}

}//Fim da classe Carro.
