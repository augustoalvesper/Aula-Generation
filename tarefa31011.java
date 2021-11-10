package iniciandojava;

import java.util.Scanner;

public class tarefa31011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner leia = new Scanner(System.in);
		
		int idade,cont21=0,cont50=0;
		
		System.out.println("\nEntre com a sua idade: ");
		idade = leia.nextInt();
		
		while(idade!=-99)
		{
			if(idade<21)
			{
				cont21++;
			}
			if(idade>50)
			{
				cont50++;
			}
			
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			
		}
		System.out.println("\nTemos: "+cont21+" pessoas com menos de 21 anos");
		System.out.println("\nTemos: "+cont50+" pessoas com mais de 50 anos");
		
		
	}
	
	
	
	

}
