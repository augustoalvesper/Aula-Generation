package iniciandojava;
import java.util.Scanner;
public class tarefa7 {
		public static void main(String args[])
	{
			Scanner ler = new Scanner(System.in);
			double a,b,c,d,e,f,x,y;
			
			System.out.println("Digite o coeficiente a: ");
			a=ler.nextDouble();
			System.out.println("Digite o coeficiente b: ");
			b=ler.nextDouble();
			System.out.println("Digite o coeficiente c: ");
			c=ler.nextDouble();
			System.out.println("Digite o coeficiente d: ");
			d=ler.nextDouble();
			System.out.println("Digite o coeficiente e: ");
			e=ler.nextDouble();
			System.out.println("Digite o coeficiente f: ");
			f=ler.nextDouble();
			
			x = (((c*e)-(b*f))/((a*e)-(b*d)));
			y = (((a*f)-(c*d))/((a*e)-(b*d)));
					
			System.out.printf("o valor de x é: %.2f \nO valor de y é: %.2f",x ,y);
			
		}
	
	
}
