package br.com.tt;

public class Switch {
	public static void main(String[] args) {

		String turno = "n";

		switch (turno) {
		case "M":
		case "m":
			System.out.println("Bom Dia");
			break;
		case "T":
		case "t":
			System.out.println("Boa Tarde");
			break;
		case "N":
		case "n":
			System.out.println("Boa Noite");
			break;
		default:
			System.out.println("Olá");
			break;
		}

	}

}
