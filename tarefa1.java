package iniciandojava;
import java.util.Scanner;

public class helloworld {
	
	public static void main(String args[]) {
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Quantos carrinhos Arthur tem?");
		
		int atual = ler.nextInt();
		
		System.out.println("Quantos carrinhos Arthur comprou?");
		int compra = ler.nextInt();
		
		int totalCarrinho = atual + compra;
		
		System.out.println("Arthur ficou com " + totalCarrinho + " carrinhos");
		
	}
}
