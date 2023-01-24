package application;

import entities.Contract;
import service.ContractService;
import service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Program {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse("25/06/2018", dtf);
        Contract contract = new Contract(8028, date, 600.0);
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, 3);

        System.out.println(contract);
    }
}
