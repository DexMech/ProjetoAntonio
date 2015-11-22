package br.edu.Eventos.Modelos;

import java.util.Date;


public class Evento {
	private String Nome;
	private String Solicitante;
	private String setor;
	private String ramal;
	private Date data;
	private String local;
	private String prioridade;
	private String horaInicio;
	private String horaFim;
	public String getAuditorio() {
		return auditorio;
	}
	public void setAuditorio(String auditorio) {
		this.auditorio = auditorio;
	}
	private String auditorio;

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
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
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

	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


}
