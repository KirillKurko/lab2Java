package pharmacy.medicines;

import pharmacy.PriceInterface;

abstract public class Medicine implements PriceInterface {

    protected String name;
    protected String type;
    protected float cost;
    protected float price;

    public Medicine() {
        name = "";
        type = "";
        cost = 0.0f;
        price = 0.0f;
    }

    public Medicine(String name, float cost) {
        this.name = name;
        this.type = generateType();
        this.cost = cost;
        this.price = calculatePrice();
    }

    public Medicine(Medicine medicine) {
        type = medicine.type;
        name = medicine.name;
        cost = medicine.cost;
        price = medicine.price;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public float getCost() {
        return cost;
    }

    public float getPrice() {
        return price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(float cost) {
        this.cost = cost;
        price = calculatePrice();
    }

    public void setPrice(float price) {
        this.price = price;
    }

    abstract protected String generateType();

    @Override
    public float calculatePrice() {
        price = cost * 1.2f;
        return price;
    }

    @Override
    public String toString() {
        return "\nName: " + name + "\nType: " + type + "\nPrice: " + price;
    }
}
