package com.potiratech.course.entites;

import com.potiratech.course.entites.pk.OrderItemPK;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private OrderItemPK Id;

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
