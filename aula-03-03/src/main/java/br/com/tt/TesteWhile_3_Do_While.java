package br.com.tt;

public class TesteWhile_3_Do_While {
	public static void main(String[] args) {
		
		int i = 1; //incrementa ate 10
		//int i = 20; //somente uma vez, pois é false
		
		do{
			//primeiro printa
			System.out.println(i++);
			//depois verifica se precisa novamente
		}while(i <= 10);
		
	}

}
