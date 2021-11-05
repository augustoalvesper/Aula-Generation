programa
{
	
	funcao inicio()
	{
		real n1,n2,n3,mediaGeral,somaMedia=0.0
		real media[3]
		inteiro x

		para(x=0;x<3;x++)
		{
			escreva("\nEntre com a primeira nota: ")
			leia (n1)
			escreva("\nEntre com a segunda nota: ")
			leia (n2)
			escreva("\nEntre com a terceira nota: ")
			leia (n3)
			
			media[x] = (n1+n2+n3) / 3
			//escreva("\nMedia do aluno foi de: ",media[x]) // se quiser mostrar a media
			somaMedia+= media[x]

			
		}
		
		para(x=0;x<3;x++)
		{
			escreva("\nMedia do aluno: ",x+1," foi de: ",media[x])
			
		}
		mediaGeral = somaMedia / 3
		escreva("\nMedia geral da turma: ",mediaGeral)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 305; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 6, 7, 2}-{n2, 6, 10, 2}-{n3, 6, 13, 2}-{mediaGeral, 6, 16, 10}-{somaMedia, 6, 27, 9}-{media, 7, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */