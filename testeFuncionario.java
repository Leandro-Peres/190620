
public class testeFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		funcionarios f1 = new funcionarios ();
		
		f1.nome="Cris";
		f1.salario=1000;
		f1.endereco="Av. Parada José";
		
		professor prof1 = new professor();
		
		prof1.nome = "Evandro";
		prof1.disciplina = "Java Avançado";
		prof1.titulacao = "Doutor";
		prof1.salario = 10.000;
		prof1.endereco ="Av. Moreira";
		
		prof1.exibirProfessor();
		prof1.exibirDados();
		
		
	}

}
