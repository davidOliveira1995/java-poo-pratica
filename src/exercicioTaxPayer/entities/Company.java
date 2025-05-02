package exercicioTaxPayer.entities;

public class Company extends TaxPayer {

    private int numberOfEmployees;

    public Company() {
    }

    public Company(double anualIncome, String name, int numberOfEmployees) {
        super(anualIncome, name);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double tax() {
        if (getNumberOfEmployees() > 10 ) {
            return getAnualIncome() * 0.14;
        } else {
            return getAnualIncome() * 0.16;
        }
    }
}
