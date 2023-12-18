package br.org.recodepro.brasiltour.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Passagem {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numPassagem;

	@Column
	private String origem;

	@Column
	private String destino;

	@Column
	private String dataIda;

	@Column
	private String dataVolta;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Num_Pedido", nullable = false)
	private Pedido pedido;

	public Integer getNumPassagem() {
		return numPassagem;
	}

	public void setNumPassagem(final Integer numPassagem) {
		this.numPassagem = numPassagem;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(final String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(final String destino) {
		this.destino = destino;
	}

	public String getDataIda() {
		return dataIda;
	}

	public void setDataIda(final String dataIda) {
		this.dataIda = dataIda;
	}

	public String getDataVolta() {
		return dataVolta;
	}

	public void setDataVolta(final String dataVolta) {
		this.dataVolta = dataVolta;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
