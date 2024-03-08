public class Product {
    private String Name;
    private String Code;
    private String Price;
    private String Maintain;
    private String Address;
    private Type type;
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getMaintain() {
        return Maintain;
    }

    public void setMaintain(String maintain) {
        Maintain = maintain;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Type getType() {
        return type;
    }

    public void setType(Integer type) {

        switch (type) {
            case 1:
                this.type = Type.washer;
                break;
            case 2:
                this.type = Type.dairy;
                break;
            case 3:
                this.type = Type.Proteins;
                break;
            case 4:
                this.type = Type.snacks;
                break;
            case 5:
                this.type = Type.cannedFood;
                break;
            case 6:
                this.type = Type.Beverages;
                break;
            case 7:
                this.type = Type.Coffee;
                break;
        }
    }
    public String toString(){

        return "Name = " + Name +
                " Code = " + Code +
                "  Price = " + Price +
                "  Maintain = " + Maintain +
                "  Address = " + Address;

    }
}
