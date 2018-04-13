package model;

public class Horista extends Empregado {
	
	private Integer idHorista;
	private String precoHora;
	private String horasTrabalhadas;
	
	public Integer getIdHorista() {
		return idHorista;
	}
	public void setIdHorista(Integer idHorista) {
		this.idHorista = idHorista;
	}
	public String getPrecoHora() {
		return precoHora;
	}
	public void setPrecoHora(String precoHora) {
		this.precoHora = precoHora;
	}
	public String getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(String horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
		
	}
	
	
}
