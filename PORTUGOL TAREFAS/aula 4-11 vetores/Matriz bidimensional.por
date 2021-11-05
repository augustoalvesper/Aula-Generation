programa
{
	//preencher matriz, somatoria dos pares e quantidade dde impares
	funcao inicio()
	{
		inteiro numeros[2][3],somaPar=0,contImpar=0,linha,coluna

		para(linha=0;linha<2;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nEntre com um numero: ")
				leia(numeros[linha][coluna])
				se(numeros[linha][coluna] % 2 == 0)
				{
					somaPar+=numeros[linha][coluna]
				}
				senao
				{
					contImpar++
				}
			}
			

			
		}
		escreva("\nSomatorio de numeros pares: ",somaPar)
		escreva("\nQuantidade de numeros impares: ",contImpar)	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 141; 
 * @PONTOS-DE-PARADA = 20, 6, 27, 12, 28, 13;
 * @SIMBOLOS-INSPECIONADOS = {numeros, 6, 10, 7}-{somaPar, 6, 24, 7}-{contImpar, 6, 34, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */