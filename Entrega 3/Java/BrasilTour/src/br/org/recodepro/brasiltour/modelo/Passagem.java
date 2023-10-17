package br.org.recodepro.brasiltour.modelo;

public class Passagem {
	private Integer numPassagem;
	private String origem;
	private String destino;
	private String dataIda;
	private String dataVolta;
	private Integer numPedido;

	public Integer getNumPassagem() {
		return numPassagem;
	}

	public void setNumPassagem(Integer numPassagem) {
		this.numPassagem = numPassagem;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getDataIda() {
		return dataIda;
	}

	public void setDataIda(String dataIda) {
		this.dataIda = dataIda;
	}

	public String getDataVolta() {
		return dataVolta;
	}

	public void setDataVolta(String dataVolta) {
		this.dataVolta = dataVolta;
	}

	public Integer getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(Integer numPedido) {
		this.numPedido = numPedido;
	}

}
