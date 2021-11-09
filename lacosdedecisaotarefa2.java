package iniciandojava;

import java.util.Scanner;

public class lacosdedecisaotarefa2 {

	public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);
        int a[]= new int[3];
        int maior = 0;

        for(int i=0;i<3;i++){
        System.out.print("Entre com o número : ");
        a[i] = entrada.nextInt();

         if (a[i]>maior)
         {
             maior = a[i];
         }
        }
        System.out.println("o maior numero e: " + maior);
    }
}
