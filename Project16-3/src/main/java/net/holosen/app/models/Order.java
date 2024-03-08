package net.holosen.app.models;

import net.holosen.app.enums.Status;
import net.holosen.app.enums.Type;

public class Order {
    private String Id;
    private Product product;
    private Long count;
    private String date;
    private Type type;
    private Status status;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public void setStatus(Integer status) {
        switch (status){
            case 1:this.status = Status.inProduction;
                break;
            case 2:this.status = Status.produced;
                break;
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "Id='" + Id + '\'' +
                ", product=" + product.getName() +
                ", count=" + count +
                ", date='" + date + '\'' +
                ", type=" + type +
                ", status=" + status +
                '}';
    }
}
