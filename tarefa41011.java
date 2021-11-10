package iniciandojava;

import java.util.Scanner;

public class tarefa41011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade,genero,fp,contpc=0,contmn=0,contha=0,contoc=0,contpn40 = 0,contpc18=0,x=1;
		
		Scanner leia = new Scanner(System.in);
		
		while(x<=5)
		{
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			while(idade<=0 || idade>=125)
			{
				System.out.println("\nEntre com a sua idade: ");
				idade = leia.nextInt();
			}
			System.out.println("\nEntre com o seu genero:\n1 - feminino\n 2 - Masculino\n 3 - Outros ");
			genero = leia.nextInt();
			while(genero<1 || genero>3) 
			{
				System.out.println("\nEntre com o seu genero:\n1 - feminino\n 2 - Masculino\n 3 - Outros ");
				genero = leia.nextInt();
			}
			System.out.println("\nEntre com o seu fator psicologico:\n1 - Calmo\n2 - Nervoso\n 3 - Agressivo ");
			fp = leia.nextInt();
			while(fp<1 || fp>3)
			{
				System.out.println("\nEntre com o seu fator psicologico:\n1 - Calmo\n2 - Nervoso\n 3 - Agressivo ");
				fp = leia.nextInt();
			}
			
			if(fp==1)
			{
				contpc++;
			}
			
			if(genero==1 && fp==2) 
			{
				contmn++;
			}
			
			if(genero==2 && fp==3)
			{
				contha++;
			}
			if(genero==3 && fp==1)
			{
				contoc++;
			}
			
			if(fp==2 && idade>40)
			{
				contpn40++;
				
			}
			if(fp==1)
			{
				contpc18++;
			}
			
			x++;
		}
		
		System.out.println("Pessoas calmas: "+contpc);
		System.out.println("Mulheres nervosas: "+contmn);
		System.out.println("Homens agressivos: "+contha);
		System.out.println("Outros calmas: "+contoc);
		System.out.println("Pessoas nervosas com mais de 40: "+contpn40);
		System.out.println("Pessoas calmas menores de 18: "+contpc18);
		
		
	}

}
