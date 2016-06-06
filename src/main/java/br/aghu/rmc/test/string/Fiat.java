package br.aghu.rmc.test.string;

public class Fiat extends ClassCarro {
	
	public String minhaString = "str Fiat";

	@Override
	public String mover() {
		return "movimento Fiat.";
	}
	
	public void writeMinhaString() {
		System.out.println( minhaString );
	}

}
