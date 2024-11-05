package br.com.fiap.beans;

public abstract class Seguro {
    private int id;
    private String titular;
    private double valorBase;

    public Seguro(int id, String titular, double valorBase) {
        this.id = id;
        this.titular = titular;
        this.valorBase = valorBase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
    public abstract double calcularPremio();
}