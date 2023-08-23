package exercicio;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod1, cod2;
		double num1, num2, vun1, vun2, soma, vp1, vp2;
		
		System.out.println("Insira o código do primeiro produto: ");
		cod1 = sc.nextInt();
		System.out.println("Agora insira a quantidade a ser comprada do produto de código " + cod1 + ": ");
		num1 = sc.nextDouble();
		System.out.println("Por fim, insira o valor unitário do produto " + cod1 + ": ");
		vun1 = sc.nextDouble();
		vp1 = vun1 * num1;
		
		System.out.println("Insira o código do segundo produto: ");
		cod2 = sc.nextInt();
		System.out.println("Agora insira a quantidade a ser comprada do produto de código " + cod2 + ": ");
		num2 = sc.nextDouble();
		System.out.println("Por fim, insira o valor unitário do produto " + cod2 + ": ");
		vun2 = sc.nextDouble();
		vp2 = vun2 * num2;
		
		soma = vp2 + vp1;
		
		System.out.printf("Valor a pagar: R$ %.2f%n", soma);
		
		
		
		

	}

}
