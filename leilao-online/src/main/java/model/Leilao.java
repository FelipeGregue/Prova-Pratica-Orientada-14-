package model;

public class Leilao {
    private int id;
    private String descricao;
    private double valorMinimo;
    private String status;

    public Leilao(int id, String descricao, double valorMinimo, String status) {
        this.id = id;
        this.descricao = descricao;
        this.valorMinimo = valorMinimo;
        this.status = status;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorMinimo() {
        return valorMinimo;
    }

    public void setValorMinimo(double valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    private boolean aberto;

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
}

