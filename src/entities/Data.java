package entities;

import java.util.Date;

import javax.swing.JFormattedTextField;

public class Data {
	private String razaoSocial;
	private String contato;
	private String tecnico;
	private String data;
	private String product;
	private String serie;
	private String marca;
	private String modelo;
	private String ocorrencia;
	private String observacoes;
	private Integer horaInicio;
	private Integer horaFim;
	private String atividade;
	
	public Integer horaTotal() {
		return horaInicio + horaFim;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Integer getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Integer horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Integer getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(Integer horaFim) {
		this.horaFim = horaFim;
	}

	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}

	public Data(String razaoSocial, String contato, String tecnico, String data, String product, String serie,
			String marca, String modelo, String ocorrencia, String observacoes, Integer horaInicio, Integer horaFim,
			String atividade) {
		this.razaoSocial = razaoSocial;
		this.contato = contato;
		this.tecnico = tecnico;
		this.data = data;
		this.product = product;
		this.serie = serie;
		this.marca = marca;
		this.modelo = modelo;
		this.ocorrencia = ocorrencia;
		this.observacoes = observacoes;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.atividade = atividade;
	}

	public Data(String razaoSocial, String contato, String tecnico, String data, String product, String serie,
			String marca, String modelo, String ocorrencia, String observacoes, String atividade) {
		this.razaoSocial = razaoSocial;
		this.contato = contato;
		this.tecnico = tecnico;
		this.data = data;
		this.product = product;
		this.serie = serie;
		this.marca = marca;
		this.modelo = modelo;
		this.ocorrencia = ocorrencia;
		this.observacoes = observacoes;
		this.atividade = atividade;
	}
	public Data() {}
	
}
