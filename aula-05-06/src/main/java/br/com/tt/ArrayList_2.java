package br.com.tt;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2 {
	public static void main(String[] args) {
		
		List lista = new ArrayList();
		lista.add("Pedro");
		lista.add(1);
		lista.add(new ArrayList_2());

		for (Object l : lista) {
			System.out.println(l.getClass());
			System.out.println("\t" + l.getClass().getSimpleName());
			if (l instanceof String) {
				System.out.println(((String) l).toUpperCase());
			} else if (l instanceof Integer) {
				System.out.println((Integer) l + 10);
			}

		}
	}
}
