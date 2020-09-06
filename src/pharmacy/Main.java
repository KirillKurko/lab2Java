package pharmacy;

import pharmacy.medicines.liquid.Drops;
import pharmacy.medicines.soft.Ointment;
import pharmacy.medicines.solid.Capsules;
import pharmacy.order.Order;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();

        Capsules capsules = new Capsules("Creon", 12.99f, 60, "solid");
        Ointment ointment = new Ointment("Supirocin", 38.99f, 15, "ointment");
        Drops drops = new Drops("Vibrocil", 17.99f, 20, "external");

        order.addMedicine(capsules);
        order.addMedicine(ointment);
        order.addMedicine(drops);

        order.calculatePrice();
        order.printInformation();
    }
}
