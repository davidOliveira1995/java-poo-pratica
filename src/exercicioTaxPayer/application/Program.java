package exercicioTaxPayer.application;

import exercicioTaxPayer.entities.Company;
import exercicioTaxPayer.entities.Individual;
import exercicioTaxPayer.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.printf("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");

            System.out.printf("Individual or Company? ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Anual Income: ");
            double anualIncome= sc.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double he = sc.nextDouble();

                list.add(new Individual(anualIncome, name, he));
            } else if(ch == 'c') {
                System.out.print("Number of employees: ");
                int numEm = sc.nextInt();

                list.add(new Company(anualIncome, name, numEm));
            }
        }

        double sum = 0.0;
        System.out.println("");
        System.out.print("TAXES PAID: ");

        for (TaxPayer c : list) {
            double tax = c.tax();
            System.out.println(c.getName() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
    }
}
