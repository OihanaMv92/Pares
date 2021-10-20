package es.studium.Pares;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, i;
		System.out.println("Dame un numero entero ");
		numero1 = teclado.nextInt();
		System.out.println("Ingrese otro numero entero ");
		numero2 = teclado.nextInt();
		for(i=numero1;i<=numero2;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		teclado.close();
	}
}
