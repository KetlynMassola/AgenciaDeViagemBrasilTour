package br.org.recodepro.brasiltour.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Pedido {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numPedido;

	@Column(name = "Data_pedido")
	private String dataPedido;

	@Column(name = "Forma_pgto")
	private String formaPgto;

	@Column(name = "Valor_pgto")
	private Double valorPgto;

	@ManyToOne
	@JoinColumn(name = "CPF_passageiro")
	private Passageiro passageiro;

	public Integer getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(final Integer numPedido) {
		this.numPedido = numPedido;
	}

	public String getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(final String dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getFormaPgto() {
		return formaPgto;
	}

	public void setFormaPgto(final String formaPgto) {
		this.formaPgto = formaPgto;
	}

	public Double getValorPgto() {
		return valorPgto;
	}

	public void setValorPgto(final Double valorPgto) {
		this.valorPgto = valorPgto;
	}

	public Passageiro getPassageiro() {
		return passageiro;
	}

	public void setPassageiro(Passageiro passageiro) {
		this.passageiro = passageiro;
	}

}
