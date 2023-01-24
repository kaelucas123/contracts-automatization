package service;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months){
        double monthValue = contract.getTotalValue() / months;
        LocalDate actualMonth = contract.getLocalDate();

        for(int i = 1; i < months + 1; i++){
             LocalDate month = actualMonth.plusMonths(i);
             double valueToPay = (monthValue + (onlinePaymentService.interest(monthValue, i))); 
             contract.getInstallments().add(new Installment(month, valueToPay + (onlinePaymentService.paymentFee(valueToPay))));
        }

    }
}
