package br.com.tt;

public enum DiaSemana {
	SEGUNDA(2, "Segunda"),
	TERCA(3, "Ter�a"),
	QUARTA(4, "Quarta"),
	QUINTA(5, "Quinta"),
	SEXTA(6, "Sexta"),
	SABADO(7, "S�bado"),
	DOMINGO(1, "Domingo");
	
		int dia;
		String diaExtenso;
		DiaSemana(int dia, String diaExtenso ){
			this.dia = dia;
			this.diaExtenso = diaExtenso;
	}
}
