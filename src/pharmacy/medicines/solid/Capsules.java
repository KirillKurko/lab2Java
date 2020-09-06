package pharmacy.medicines.solid;

import java.util.Objects;

public class Capsules extends SolidMedicines {
    private String shellType;
    private static int count;
    private int id;

    public Capsules() {
        super();
        shellType = "";
        ++count;
        id = count;
    }

    public Capsules(String name, float cost, int amount, String shellType) {
        super(name, cost, amount);
        this.shellType = shellType;
        ++count;
        id = count;
    }

    public Capsules(Capsules capsules) {
        super(capsules);
        shellType = capsules.shellType;
        ++count;
        id = count;
    }

    public String getShellType() {
        return shellType;
    }

    public void setShellType(String shellType) {
        this.shellType = shellType;
    }

    @Override
    public String toString() {
        return super.toString() + "\nShell type: " + shellType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Capsules capsules = (Capsules)obj;
        return id == capsules.id &&
                shellType.equals(capsules.shellType) &&
                amount == capsules.amount &&
                name.equals(capsules.name) &&
                type.equals(capsules.name) &&
                cost == capsules.cost &&
                price == capsules.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shellType, id);
    }
}
