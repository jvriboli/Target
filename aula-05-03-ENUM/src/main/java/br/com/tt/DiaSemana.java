package br.com.tt;

public enum DiaSemana {
	SEGUNDA(2, "Segunda"),
	TERCA(3, "Terça"),
	QUARTA(4, "Quarta"),
	QUINTA(5, "Quinta"),
	SEXTA(6, "Sexta"),
	SABADO(7, "Sábado"),
	DOMINGO(1, "Domingo");
	
		int dia;
		String diaExtenso;
		DiaSemana(int dia, String diaExtenso ){
			this.dia = dia;
			this.diaExtenso = diaExtenso;
	}
}
