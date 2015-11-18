package br.edu.Eventos.Modelos;

import java.util.List;

public class Evento {
	private String Nome;
	private String Solicitante;
	private String setor;
	private String ramal;
	private String data;
	private String local;
	private String prioridade;
	private String horaInicio;
	private String horaFim;
	private List<String> opcionais;
	private String observacao;
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSolicitante() {
		return Solicitante;
	}
	public void setSolicitante(String solicitante) {
		Solicitante = solicitante;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public String getRamal() {
		return ramal;
	}
	public void setRamal(String ramal) {
		this.ramal = ramal;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}
	public List<String> getOpcionais() {
		return opcionais;
	}
	public void setOpcionais(List<String> opcionais) {
		this.opcionais = opcionais;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	
}
