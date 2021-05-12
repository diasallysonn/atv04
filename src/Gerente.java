
public class Gerente extends Funcionario {
	
	private Double salario;

	public Gerente(String nome, String sobrenome, String telefone, String email, String matricula, Double salario) {
		super(nome, sobrenome, telefone, email, matricula);
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	
}
