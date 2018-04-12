package model;

public class Comissionado extends Empregado {
	
	private Integer idComissionado;
	private float totalVenda;
	private float totalComissao;
		
	public Integer getIdComissionado() {
		return idComissionado;
	}
	public void setIdComissionado(Integer idComissionado) {
		this.idComissionado = idComissionado;
	}
	public float getTotalVenda() {
		return totalVenda;
	}
	public void setTotalVenda(float totalVenda) {
		this.totalVenda = totalVenda;
	}
	public float getTotalComissao() {
		return totalComissao;
	}
	public void setTotalComissao(float totalComissao) {
		this.totalComissao = totalComissao;
	}
		
	
}
