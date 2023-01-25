package application;

import entities.Contract;
import entities.Installment;
import service.ContractService;
import service.PaypalService;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.print("Number of the contract: ");
        int number = sc.nextInt();
        System.out.print("Date of the contract (DD/MM/YYYY): ");
        LocalDate date = LocalDate.parse(sc.next(), dtf);
        System.out.print("Contract value: ");
        double contractValue = sc.nextDouble();

        Contract contract = new Contract(number, date, contractValue);
        DateTimeFormatter DTF = contract.getDTF();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, 3);


        System.out.println(contract + "\n");
        System.out.println("installments: ");
        for(Installment i : contract.getInstallments()){
            System.out.println(i);
        }
    }
}
