package br.com.fiap.beans;

public class SeguroAuto extends Seguro {
    private int idadeMotorista;
    private int numeroAcidentes;

    public SeguroAuto(int id, String titular, double valorBase, int idadeMotorista, int numeroAcidentes) {
        super(id, titular, valorBase);
        this.idadeMotorista = idadeMotorista;
        this.numeroAcidentes = numeroAcidentes;
    }

    public int getIdadeMotorista() {
        return idadeMotorista;
    }

    public void setIdadeMotorista(int idadeMotorista) {
        this.idadeMotorista = idadeMotorista;
    }

    public int getNumeroAcidentes() {
        return numeroAcidentes;
    }

    public void setNumeroAcidentes(int numeroAcidentes) {
        this.numeroAcidentes = numeroAcidentes;
    }

    @Override
    public double calcularPremio() {
        double premio = getValorBase();
        if (idadeMotorista < 25) {
            premio *= 1.2; // Aumenta 20% se o motorista for jovem
        }
        premio *= (1 + 0.1 * numeroAcidentes); // Aumenta 10% por acidente
        return premio;
    }
}