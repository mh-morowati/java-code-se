package net.holosen.app;

public class Invoice {
    private String name;
    private String productName;
    private Integer weight;
    private Long price;
    private Long totalPrice;
    private String date;
    private String time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String serialize() {
        return name + "---" +
                productName + "---" +
                weight + "---" +
                price + "---" +
                totalPrice + "---" +
                date + "---" +
                time;
    }

    public Invoice deserialize(String str) {
        String[] split = str.split("---");
        this.setName(split[0]);
        this.setProductName(split[1]);
        this.setWeight(Integer.valueOf(split[2]));
        this.setPrice(Long.valueOf(split[3]));
        this.setTotalPrice(Long.valueOf(split[4]));
        this.setDate(split[5]);
        this.setTime(split[6]);
        return this;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "name='" + name + '\'' +
                ", productName='" + productName + '\'' +
                ", weight=" + weight +
                ", price=" + price + " تومان" +
                ", totalPrice=" + totalPrice + " تومان" +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
