package DesafioPolimorfismo;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public String emitirSom() {
		return "Relinchando...";
	}
	
	public String correr() {
		return "Correndo...";
	}
}
