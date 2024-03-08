public class Product {
    private String name;
    private String code;
    private String price;
    private String address;
    private Type type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    public void setType(Integer type){
        switch (type){
            case 1:
                this.type = Type.pickupTruck;
                break;
            case 2:
                this.type = Type.Luxury;
                break;
            case 3:
                this.type = Type.Riding;
                break;
            case 4:
                this.type = Type.LuxuryElec;
                break;
            case 5:
                this.type = Type.RidingElec;
                break;
        }
    }
    public String toString(){

        return "Name = " + name +
                " Code = " + code +
                " Price = " + price +
                " type = " + type;

    }
}
