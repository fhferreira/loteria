package br.aghu.rmc.test.string;

public class TesteCarrosMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("TesteCarrosMain ....");
		
		ClassCarro carro = new Idea();
		
		ClassCarro fiat = new Fiat();
		
		fiat = carro;
		
		System.out.println("resultado: " + fiat.mover());
		

		Fiat idea = new Idea();

		idea.writeMinhaString();
		
		
		System.out.println("Garbage collector"); 
	}

}
