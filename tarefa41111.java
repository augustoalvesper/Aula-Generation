package iniciandojava;

import java.util.Scanner;

public class tarefa41111 {

	public static void main(String[] args) {
		
		float [] [] array1 = new float [2][2];
		float [] [] array2 = new float [2][2];
		float [] [] array3 = new float [2][2];
		int linha,coluna,var,op;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.println("\nEntre com os valores do array1: ");
				array1[linha][coluna] = leia.nextFloat();
				System.out.println("\nEntre com os valores do array2: ");
				array2[linha][coluna] = leia.nextFloat();
			}
		}
		do
		{
			System.out.println("\n\t\tMenu de opções: ");
			System.out.println("\n(1) somar as duas matrizes");
			System.out.println("\n(2) subtrair a primeira matriz da segunda");
			System.out.println("\n(3) adicionar uma variavel as duas matrizes");
			System.out.println("\n(4) imprimir as matrizes");
			System.out.println("\n(5) sair do programa");
			System.out.println("\n Digite sua opção");
			op = leia.nextInt();
			
			switch(op)
			{
			case 1: 
				for(linha=0;linha<2;linha++)
				{
					for(coluna=0;coluna<2;coluna++)
					{
						array3[linha][coluna] = array1[linha][coluna] + array2[linha][coluna];
						System.out.println("\nSoma: "+array3[linha][coluna]);
			}
		}
		break;
	case 2: 
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
			array3[linha][coluna] = array1[linha][coluna] + array2[linha][coluna];
			System.out.println("\nSoma: "+array3[linha][coluna]);
	}
}
		break;
	case 3: 
		System.out.println("\nEntre com um valor: ");
		var = leia.nextInt();
		for(linha=0;linha<2;linha++)
	{
			for(coluna=0;coluna<2;coluna++)
			{
			array1[linha][coluna] = array1[linha][coluna] + var;
			array2[linha][coluna] = array2[linha][coluna] + var;
			System.out.println("\nvariaval somada ao array1: "+array1[linha][coluna]);
			System.out.println("\nvariaval somada ao array2: "+array2[linha][coluna]);
			}				
		}
		break;
	case 4:
		for(linha=0;linha<2;linha++)
		{
			for(coluna=0;coluna<2;coluna++)
			{
				System.out.println("\nArray: "+array1[linha][coluna]);
				System.out.println("\nArray: "+array2[linha][coluna]);
			}
		}
		break;
	case 5:
		System.out.println("\nMuito obrigado por utilizar o nosso sitema!");
		break;
	default:
		System.out.println("\nOpção invalida");
		
		}
		}
		while(op!=5);
	}

}












