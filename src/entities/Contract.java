package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private Integer number;
    private LocalDate localDate;
    private Double totalValue;
    private List<Installment> installments = new ArrayList<>();

    private final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    //--------------------------------------------Constructors-----------------------------------------------//
    public Contract() {
    }

    public Contract(Integer number, LocalDate localDate, Double totalValue) {
        this.number = number;
        this.localDate = localDate;
        this.totalValue = totalValue;
    }

    //---------------------------------------------Getters------------------------------------------------------//
    public Integer getNumber() {
        return number;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public List<Installment> getInstallments() {
        return installments;
    }

    public DateTimeFormatter getDTF() {
        return DTF;
    }

    //--------------------------------------------Setters-------------------------------------------------------//
    public void setDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Number: ").append(getNumber());
        sb.append("\nContract date: ").append(DTF.format(getLocalDate()));
        sb.append("\nTotal value: ").append(getTotalValue());

        return sb.toString();
    }
}
