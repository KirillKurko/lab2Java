package pharmacy.medicines.soft;

import java.util.Objects;

public class Ointment extends SoftMedicines {

    private String consistency;
    private static int count = 0;
    private int id;

    public Ointment() {
        super();
        consistency = "";
        ++count;
        id = count;
    }

    public Ointment(String name, float cost, int weight, String consistency) {
        super(name, cost, weight);
        this.consistency = consistency;
        ++count;
        id = count;
    }

    public Ointment(Ointment ointment) {
        super(ointment);
        consistency = ointment.consistency;
        ++count;
        id = count;
    }

    public String getConsistency() {
        return consistency;
    }

    public void setConsistency(String consistency) {
        this.consistency = consistency;
    }

    @Override
    public String toString() {
        return super.toString() + "\nConsistency: " + consistency;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Ointment ointment = (Ointment) obj;
        return id == ointment.id &&
                consistency.equals(ointment.consistency) &&
                weight == ointment.weight &&
                name.equals(ointment.name) &&
                type.equals(ointment.name) &&
                cost == ointment.cost &&
                price == ointment.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(consistency, id);
    }
}
