package model;

public class Lance {
    private int id;
    private int idLeilao;
    private int idConcorrente;
    private double valor;

    public Lance(int id, int idLeilao, int idConcorrente, double valor) {
        this.id = id;
        this.idLeilao = idLeilao;
        this.idConcorrente = idConcorrente;
        this.valor = valor;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdLeilao() {
        return idLeilao;
    }

    public void setIdLeilao(int idLeilao) {
        this.idLeilao = idLeilao;
    }

    public int getIdConcorrente() {
        return idConcorrente;
    }

    public void setIdConcorrente(int idConcorrente) {
        this.idConcorrente = idConcorrente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    private Concorrente concorrente;

    public Concorrente getConcorrente() {
        return concorrente;
    }

    public void setConcorrente(Concorrente concorrente) {
        this.concorrente = concorrente;
    }
}

