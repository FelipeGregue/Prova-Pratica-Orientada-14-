package dto;

import model.Concorrente;
import model.Leilao;

public class VencedorLeilaoDTO {
    private Leilao leilao;
    private double maiorLance;
    private Concorrente concorrenteVencedor;

    public VencedorLeilaoDTO(Leilao leilao, double maiorLance, Concorrente concorrenteVencedor) {
        this.leilao = leilao;
        this.maiorLance = maiorLance;
        this.concorrenteVencedor = concorrenteVencedor;
    }

    public VencedorLeilaoDTO(int id, int id2, String nome, double valor) {
		// TODO Auto-generated constructor stub
	}

	// Getters e setters
    public Leilao getLeilao() {
        return leilao;
    }

    public void setLeilao(Leilao leilao) {
        this.leilao = leilao;
    }

    public double getMaiorLance() {
        return maiorLance;
    }

    public void setMaiorLance(double maiorLance) {
        this.maiorLance = maiorLance;
    }

    public Concorrente getConcorrenteVencedor() {
        return concorrenteVencedor;
    }

    public void setConcorrenteVencedor(Concorrente concorrenteVencedor) {
        this.concorrenteVencedor = concorrenteVencedor;
    }
}

