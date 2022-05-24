package atvd04;

public class pessoa {
	private String nome;
	private int idade;
	private char sexo;
	private carro carro;
	
	@Override
	public String toString() {
		return "pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", carro=" + carro + "]";
	}
	
	public pessoa() {}
	public pessoa(String nome, int idade, char sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	
	public String getNome() { //Chamar nome.
		return nome;
	}
	public void setNome(String nome) {//setar nome.
		this.nome = nome;
	}
	
	
	public int getIdade() { //Chamar idade.
		return idade;
	}
	public void setIdade(int idade) {//setar idade.
		this.idade = idade;
	}
	
	
	public char getSexo() { //Chamar sexo.
		return sexo;
	}
	public void setSexo(char sexo) { //setar sexo.
		this.sexo = sexo;
	}
	
	
	public carro getCarro() { //Chamar carro.
		return carro;
	}
	public void setCarro(carro carro) {//setar carro.
		this.carro = carro;
	}
	
	//Ações feitas pela pessoa no carro.
	void ligarCarro() {
		carro.ligarCarro();
	}
	void desligarCarro() {
		carro.desligarCarro();
	}
	void acelerarCarro() {
		carro.acelerarCarro();
	}
	void frearCarro() {
		carro.frearCarro();
	}
	
}//Fim do class pessoa.
