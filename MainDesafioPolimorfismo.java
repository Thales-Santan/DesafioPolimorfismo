package DesafioPolimorfismo;

public class MainDesafioPolimorfismo {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Totó",4);
		Cavalo cavalo = new Cavalo("Billy",7);
		Preguica preguica = new Preguica("Ana",15);
		
		System.out.println("Cachorro!!!");
		System.out.println(cachorro);
		System.out.println(cachorro.correr());
		System.out.println("*".repeat(50));

		System.out.println("Cavalo!!!");
		System.out.println(cavalo);
		System.out.println(cavalo.correr());
		System.out.println("*".repeat(50));
		
		System.out.println("Preguiça!!!");
		System.out.println(preguica);
		System.out.println(preguica.subir());
		System.out.println("*".repeat(50));
	}

}
