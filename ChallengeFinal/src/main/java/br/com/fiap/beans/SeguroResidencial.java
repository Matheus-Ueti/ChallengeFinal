package br.com.fiap.beans;

public class SeguroResidencial extends Seguro {
    private boolean areaRisco;
    private int numeroIncidentes;

    public SeguroResidencial(int id, String titular, double valorBase, boolean areaRisco, int numeroIncidentes) {
        super(id, titular, valorBase);
        this.areaRisco = areaRisco;
        this.numeroIncidentes = numeroIncidentes;
    }

    public boolean isAreaRisco() {
        return areaRisco;
    }

    public void setAreaRisco(boolean areaRisco) {
        this.areaRisco = areaRisco;
    }

    public int getNumeroIncidentes() {
        return numeroIncidentes;
    }

    public void setNumeroIncidentes(int numeroIncidentes) {
        this.numeroIncidentes = numeroIncidentes;
    }

    @Override
    public double calcularPremio() {
        double premio = getValorBase();
        if (areaRisco) {
            premio *= 1.3; // Aumenta 30% se a residência estiver em área de risco
        }
        premio *= (1 + 0.05 * numeroIncidentes); // Aumenta 5% por incidente
        return premio;
    }
}