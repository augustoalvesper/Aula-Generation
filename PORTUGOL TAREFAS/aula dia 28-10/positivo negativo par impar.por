programa
{
	
	funcao inicio()
	{
		//indicando se este número é par ou ímpar, e se é positivo ou negativo.]

		inteiro numero

		escreva("\nEntre com um numero: ")
		leia(numero)

		se(numero%2==0)
		{
			se(numero>0)
			{
				escreva("\nPar e Positivo")
				
			}
			senao
			{
				escreva("\nPar e negativo")
			}
		}
		senao
		{
			se(numero>0)
			{
				escreva("\nImPar e Positivo")
				
			}
			senao
			{
				escreva("\nImPar e negativo")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 433; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */