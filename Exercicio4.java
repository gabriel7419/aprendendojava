package exercicio;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int fun, horas;
		double salario, horaTrab;

		fun = sc.nextInt();
		horas = sc.nextInt();
		horaTrab = sc.nextDouble();
		
		salario =  horas * horaTrab;
		
		System.out.println("Funcionario = " + fun);
		System.out.printf("SALARIO = %.2f%n", salario);

	}

}
