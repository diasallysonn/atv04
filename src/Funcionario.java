
public class Funcionario extends Pessoa {

	private String matricula;

	public Funcionario(String nome, String sobrenome, String telefone, String email, String matricula) {
		super(nome, sobrenome, telefone, email);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
}
