package exercicios06.application;

import exercicios06.entities.Client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        /*
        Enter cliente data:
        Name: Alex Green
        Email: alex@gmail.com
        Birth date (DD/MM/YYYY): 15/03/1985
        Enter order data:
        Status: PROCESSING
        How many items to this order? 2
        Enter #1 item data:
        Product name: TV
        Product price: 1000.00
        Quantity: 1
        Enter #2 item data:
        Product name: Mouse
        Product price: 40.00
        Quantity: 2
         */

        Client cliente1 = new Client();
        System.out.println("Enter cliente data:");

        System.out.print("Name: ");
        cliente1.setName(sc.nextLine());

        System.out.print("Email: ");
        cliente1.setEmail(sc.nextLine());

        System.out.print("Birth date (DD/MM/YYYY): ");
        String inputData = sc.nextLine();

        Date data = sdf.parse(inputData);


        sc.close();
    }
}
