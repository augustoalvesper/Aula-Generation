package iniciandojava;

import java.util.Scanner;

public class tarefa5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float n1,n2,n3,media; //float = real no portugol
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		n1 = ler.nextFloat();
		
		System.out.println("\nEntre com a segunda nota: ");
		n2 = ler.nextFloat();
		
		System.out.println("\nEntre com a terceira nota: ");
		n3 = ler.nextFloat();
		
		media = (n1*2 + n2*3 + n3*5) / 10;
		
		System.out.println("A média das tuas notas é de " + media);
		
		//função arredondar - System.out.printf("\n Sua media foi de: %2.2f",media); - Onde o % indica dado tipo float. 

	}
		
	}