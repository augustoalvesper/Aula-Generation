package exercicios;


	public class TesteAutomovel {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			//instanciando um objeto da classe Automovel
			Automovel auto1 = new Automovel("Vinicius Vinha","Celta","ABC1234",2014);
			auto1.imprimirInfo();
			System.out.println("\n***Transfer�ncia de Propriet�rio***");
			auto1.setNomeProprietario("Pedro Jones");
			auto1.imprimirInfo();
			
			Automovel auto2 = new Automovel("Marcela Almeida","Fusca","VEF245",1980);
			auto2.imprimirInfo();
			System.out.println("\n***Mudan�a de Placa***");
			auto2.setPlaca("CDE200");
			auto2.imprimirInfo();
		}

	
	
}
