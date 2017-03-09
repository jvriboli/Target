package br.com.tt;

public class Sistema {
	public static void main(String[] args) {

		String[] nomes = new String[10];
		System.out.println(nomes[6]);
		
		//ArrayIndexOutOfBoundsException
		//System.out.println(nomes[10]);
		
		int[] ids = new int[10];
		System.out.println(ids[1]);

		nomes[0] = "Maria";
		nomes[5] = "Juca";
		ids[0] = 1133;
		
		for (String n : nomes) {
			if(n != null){				
				System.out.println("Nome: "+n);
			}
		}
	}
}
