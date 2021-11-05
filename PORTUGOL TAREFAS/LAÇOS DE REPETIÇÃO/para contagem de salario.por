programa
{
	//nf,somanumfilhos salario sal
	funcao inicio()
	{
		real sal,mediasal,somasal=0.0,medianf,maiorsal=0.0,perc
		inteiro nf,somanf=0,cont100=0,x

		para(x=1;x<=4;x++)
		{
			escreva("\nEntre com o seu salario: ")
			leia(sal)
			escreva("\nEntre com o numero de filhos: ")
			leia(nf)

			somasal+=sal // somasal = somasal + sal
			somanf+=nf

			se(maiorsal<sal)
			{
				maiorsal = sal
			}
			se(sal<=100)
			{
				cont100++
			}
		}
		mediasal = somasal / 4
		medianf = somanf / 4
		perc = (cont100 * 100) / 4

		escreva("\nMedia salarial: ", mediasal)
		escreva("\nMedia do numero de filhas: ",medianf)
		escreva("\nMaior salario: ",maiorsal)
		escreva("\nPercentual de pessoas com salario ate 100 reais: ",perc)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 732; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */