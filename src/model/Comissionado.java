package model;

public class Comissionado extends Empregado {
	
	private Integer idComissionado;
	private String totalVenda;
	private String taxaComissao;
		
	public Integer getIdComissionado() {
		return idComissionado;
	}
	public void setIdComissionado(Integer idComissionado) {
		this.idComissionado = idComissionado;
	}
	public String getTotalVenda() {
		return totalVenda;
	}
	public void setTotalVenda(String totalVenda) {
		this.totalVenda = totalVenda;
	}
	public String getTaxaComissao() {
		return taxaComissao;
	}
	public void setTaxaComissao(String taxaComissao) {
		this.taxaComissao = taxaComissao;
	}
	
}
