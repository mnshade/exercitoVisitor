public class Rocinha implements Exercito{

    public String ir(Visitor visitor) {
        return visitor.irRocinha(this);
    }

    private String dataOcup;
    private int totalSoldados;
    private int unidAerea;
    private int carrosChoque;
    private String tipoArmamento;

    public Rocinha(String dataOcup, int totalSoldados, int unidAerea, int carrosChoque, String tipoArmamento) {
        this.dataOcup = dataOcup;
        this.totalSoldados = totalSoldados;
        this.unidAerea = unidAerea;
        this.carrosChoque = carrosChoque;
        this.tipoArmamento = tipoArmamento;
    }

    public String getDataOcup() {
        return dataOcup;
    }


    public int getTotalSoldados() {
        return totalSoldados;
    }


    public int getUnidAerea() {
        return unidAerea;
    }

    public int getCarrosChoque() {
        return carrosChoque;
    }


    public String getTipoArmamento() {
        return tipoArmamento;
    }

}
