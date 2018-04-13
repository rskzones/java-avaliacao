package model;

public class Assalariado extends Empregado {
	
	private Integer idAssalariado;
	private String salario;
	
	public Integer getIdAssalariado() {
		return idAssalariado;
	}
	public void setIdAssalariado(Integer idAssalariado) {
		this.idAssalariado = idAssalariado;
	}
	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}	
	
}
