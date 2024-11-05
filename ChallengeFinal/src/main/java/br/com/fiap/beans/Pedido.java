package br.com.fiap.beans;

import java.util.Date;

public class Pedido {
    private int id;
    private int idCliente;
    private Date data;
    private double total;

    public Pedido(int id, int idCliente, Date data, double total) {
        this.id = id;
        this.idCliente = idCliente;
        this.data = data;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}