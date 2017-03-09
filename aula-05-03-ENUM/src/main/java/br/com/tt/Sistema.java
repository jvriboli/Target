package br.com.tt;

public class Sistema {
	public static void main(String[] args) {
		DiaSemana diaDaMulher = DiaSemana.QUARTA;
		DiaSemana descansar = DiaSemana.DOMINGO;
		
		int diaDomingo = DiaSemana.DOMINGO.dia;
		
		DiaSemana[] dias = DiaSemana.values();
		
		for (DiaSemana d : dias) {
			System.out.println(d.diaExtenso);
		}
	}
}
