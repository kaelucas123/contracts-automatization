package entities;

import java.util.Date;

public class Contract {
    private Integer number;
    private Date date;
    private Double totalValue;

    //--------------------------------------------Constructors-----------------------------------------------//
    public Contract() {
    }

    public Contract(Integer number, Date date, Double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
    }

    //---------------------------------------------Getters------------------------------------------------------//
    public Integer getNumber() {
        return number;
    }

    public Date getDate() {
        return date;
    }

    public Double getTotalValue() {
        return totalValue;
    }
    //--------------------------------------------Setters-------------------------------------------------------//
    public void setDate(Date date) {
        this.date = date;
    }
}
