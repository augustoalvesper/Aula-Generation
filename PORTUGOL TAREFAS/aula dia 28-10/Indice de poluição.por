programa
{
	
	funcao inicio()
	{
		real ip //indice de poluiição
		
		escreva("\nEntre com o índicde de poluição: ")
		leia(ip)
		
		se (ip>=0.05 e ip<=0.25)
		{
			escreva("\nÍndice aceitável!")
		}
		senao se(ip>=0.25 e ip<=0.3)
		{
			escreva("\nPrimeiro grupo -->Suspender as atividades<--")
		}
		senao se(ip>0.3 e ip<=0.4)
		{
			escreva("\nPrimeiro e segundo grupos -->Suspender as atividades<--")
		}
		senao se(ip>0.4 e ip<=0.5)
		{
			escreva("\nPrimeiro, segundo e terceiro grupos -->Suspender as atividades<--")
		}
		senao
		{
			escreva("\nFora de notificação")
		}
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 227; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */