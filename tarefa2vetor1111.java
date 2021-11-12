package iniciandojava;

public class tarefa2vetor1111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] A = new int[] {1,0,5,-2,-5,7};
		int soma=0,x,f=0;
		
		for(x=1;x<6;x++)
		{
			if(A[x] == A[0] || A[x] == A[1] || A[x] == A[5])
			{
				soma+= A[x];
			}
			
			}
		System.out.println("\nA soma das posições A[0],A[1],A[5], é de: "+soma+".");
		A[4] = 100;
		
		for(int num:A)
		{
			System.out.println("A["+f+"] = "+num+".");
			f++;
		}
		System.out.println();
	}

}