package iniciandojava;

import java.util.Scanner;

public class Tarefa1 {

	public static void main(String args[]) 
	{
		
		Scanner ler = new Scanner(System.in);
		
		int mes,ano,dia,nasc,totaldias;
		String nome;
		
		System.out.println("Por favor, insira o seu nome: ");
		nome = ler.next();
		
		System.out.println("insira o ano atual ");
		ano = ler.nextInt();
		
		System.out.println("insira o mes atual ");
		mes = ler.nextInt();
		
		System.out.println("insira o dia atual ");
		dia = ler.nextInt();

		System.out.println("insira o seu ano de nascimento ");
		nasc = ler.nextInt();
		
		totaldias = ((ano-nasc - 1) *365) + ((mes*30) + dia*1);
		
		System.out.println("\nCaro " + nome + ", a tua quantidade de dias vividos até hoje é de " + totaldias + " dias");
		
		
		
	}
	
}
