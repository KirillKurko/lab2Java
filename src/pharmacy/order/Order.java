package pharmacy.order;

import java.util.*;
import pharmacy.PriceInterface;
import pharmacy.medicines.Medicine;

public class Order implements PriceInterface {
    private List<Medicine> medicines;
    private int cost;
    private int price;
    private static int ordersNumber = 0;

    public Order() {
        medicines = new ArrayList<Medicine>();
        ++ordersNumber;
    }

    public void addMedicine(Medicine medicine) {
        medicines.add(medicine);
    }

    @Override
    public float calculatePrice() {
        for (Medicine medicine: medicines) {
            cost += medicine.getCost();
            price += medicine.getPrice();
        }
        return price;
    }

    public void printOrderInformation() {
        for (Medicine medicine: medicines) {
            System.out.println("\n" + medicine);
        }
        System.out.println("\n\n\nTotal information");
        System.out.println("Cost: " + cost + "\nPrice: " + price);
    }

    @Override
    protected void finalize() {
        try {
            super.finalize();
        }
        catch (Throwable exception) {
            System.err.println("Error while deleting object");
        }
        --ordersNumber;
    }
}