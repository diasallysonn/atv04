
public class Vendedor extends Funcionario {
	
	public Gerente gerente;
	public Double salario;
	public Integer vendas;
	
	public Vendedor(String nome, String sobrenome, String telefone, String email, String matricula, Gerente gerente,
			Double salario, Integer vendas) {
		super(nome, sobrenome, telefone, email, matricula);
		this.gerente = gerente;
		this.salario = salario;
		this.vendas = vendas;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getVendas() {
		return vendas;
	}

	public void setVendas(Integer vendas) {
		this.vendas = vendas;
	}
	
	
	
	
}
