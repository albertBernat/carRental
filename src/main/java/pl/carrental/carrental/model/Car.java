package pl.carrental.carrental.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue
    private Long id;

    private String mark;

    private String model;

    private String productionYear;

    private Double costOfRentPerDay;

    private String color;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public Double getCostOfRentPerDay() {
        return costOfRentPerDay;
    }

    public void setCostOfRentPerDay(Double costOfRentPerDay) {
        this.costOfRentPerDay = costOfRentPerDay;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
