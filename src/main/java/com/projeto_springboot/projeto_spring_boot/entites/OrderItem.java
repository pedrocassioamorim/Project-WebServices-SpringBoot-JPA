package com.projeto_springboot.projeto_spring_boot.entites;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.projeto_springboot.projeto_spring_boot.entites.pk.OrderItemPK;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private OrderItemPK Id = new OrderItemPK();

    private Integer quantity;
    private Double price;


    public OrderItem(){}

    public OrderItem(Order order, Product product, Integer quantity, Double price) {
        super();
        Id.setOrder(order);
        Id.setProduct(product);
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @JsonIgnore
    public Order getOrder(){
        return Id.getOrder();
    }

    public void setOrder(Order order){
        Id.setOrder(order);
    }

    public Product getProduct(){
        return Id.getProduct();
    }

    public void setProduct(Product product){
        Id.setProduct(product);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItem orderItem)) return false;
        return Objects.equals(Id, orderItem.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "Id=" + Id +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
