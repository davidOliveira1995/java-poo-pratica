package exercicios06.entities;

import exercicios06.enums.OrderStatus;

import java.util.Date;

public class Order {

    private Date mommnet;
    private OrderStatus status;

    public Order() {
    }

    public Order(Date mommnet, OrderStatus status) {
        this.mommnet = mommnet;
        this.status = status;
    }

    public Date getMommnet() {
        return mommnet;
    }

    public void setMommnet(Date mommnet) {
        this.mommnet = mommnet;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item) {

    }
}
