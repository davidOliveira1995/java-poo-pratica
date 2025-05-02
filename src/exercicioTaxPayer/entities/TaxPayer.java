package exercicioTaxPayer.entities;

public abstract class TaxPayer {

    private String name;
    private double anualIncome;

    public TaxPayer() {
    }

    public TaxPayer(double anualIncome, String name) {
        this.anualIncome = anualIncome;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public abstract double tax();
}
