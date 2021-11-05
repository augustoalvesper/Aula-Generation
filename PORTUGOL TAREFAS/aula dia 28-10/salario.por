programa
{
	
	funcao inicio()
	{

			// calculw salario, horas trabalhadas, extras e etc. c=codigos n=horas, E=hrextra
			//cada hr excedente vale 20 

		real salarioTotal,salarioExcededente
		inteiro c,n,E

		escreva("\n Entre com o seu codigo: ")
		leia(c)
		escreva("\n Entre com a quantidade de horas trabalhadas: ")
		leia(n)

		se (n>50)
		{
			E = n - 50
			salarioExcededente = E * 20
			salarioTotal = 500 + salarioExcededente
			
		}

			senao
			{
				E = 0
				salarioExcededente = 0
				salarioTotal = n * 10
			}

		escreva("\nCódigo: ",c)
		escreva("\nSalario Excedente: ",salarioExcededente)
		escreva("\nSalario total: ",salarioTotal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 643; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */