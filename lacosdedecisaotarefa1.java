package iniciandojava;

import java.util.Scanner;

public class lacosdedecisaotarefa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a sua idade: ");
		idade = leia.nextFloat();
		
		if (idade>=18)
		{
		System.out.println("Você esta na categoria adulto!");
		}
		else if (idade>=5 && idade <=7)
		{
			System.out.println("\nVocê esta na categoria Infantil A");	
		}
		else if (idade>=8 && idade <=11)
		{
			System.out.println("\nVocê esta na categoria Infantil B");
		}
		else if(idade>=12 && idade <=13)
		{
			System.out.println("\nVocê esta na categoria Juvenil A");
		}
		else if(idade>=14 && idade <=17)
		{
			System.out.println("\\nVocê esta na categoria Juvenil B");
		}
	}

}
