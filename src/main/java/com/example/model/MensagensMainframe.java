package com.example.model;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TVT_MENSAGENS_MAINFRAME")
public class MensagensMainframe {

	@Id
	@GeneratedValue
	@Column(name = "COD_TVT_MENSAGENS_MAINFRAME")
	private Integer idMsg;

	@Column(name = "STATUS_RETORNO")
	private String status;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_PROCESSAMENTO")
	private Date dtProcess;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INCLUSAO")
	private Calendar dtInclusao = Calendar.getInstance();

	@Column(name = "COD_STARK")
	private String codStark;

	@Column(name = "UNIQUE_ID")
	private String uniqueId;

	@Column(name = "PROCESSO")
	private String processo;

	public Integer getIdMsg() {
		return idMsg;
	}

	public void setIdMsg(Integer idMsg) {
		this.idMsg = idMsg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDtProcess() {
		return dtProcess;
	}

	public void setDtProcess(Date dtProcess) {
		this.dtProcess = dtProcess;
	}

	public Calendar getDtInclusao() {
		return dtInclusao;
	}

	public void setDtInclusao(Calendar dtInclusao) {
		this.dtInclusao = dtInclusao;
	}

	public String getCodStark() {
		return codStark;
	}

	public void setCodStark(String codStark) {
		this.codStark = codStark;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getProcesso() {
		return processo;
	}

	public void setProcesso(String processo) {
		this.processo = processo;
	}

}
