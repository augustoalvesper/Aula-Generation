programa
{
	//tarefa 2
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro lancamento[10],Maior=0,x,somaLancamento=0,contMaior=0
		real media

		para(x=0;x<10;x++)
		{
			lancamento[x] = Util.sorteia(1,6)
			somaLancamento+=lancamento[x] //somaLancamento = somaLancamento + lancamento [x
			escreva("\nLançamento ",x+1," : ",lancamento[x])

			se(Maior<lancamento[x])
			{
				Maior = lancamento[x]
			}
		}
		para(x=0;x<10;x++)
		{
			se(Maior == lancamento[x])
			{
				contMaior++
			}
		}
		media = somaLancamento / 10
		escreva("\nMedia de lançamentos: ",media)
		escreva("\nQuantidade do maior numero foi: ",contMaior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 150; 
 * @PONTOS-DE-PARADA = 19, 8, 9, 26, 13, 29, 30, 15, 31;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, funcao;
 */