package DesafioPolimorfismo;

public class Animal {
	//atributos
	private String nome;
	private int idade;
	//construtor
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	//Encapsulamento
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	//metodo
	public String emitirSom() {
		return "Emitindo som do animal...";
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nIdade: " + idade + "\n"+ emitirSom(); 
	}
	
	
}
