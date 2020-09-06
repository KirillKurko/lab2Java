package pharmacy.medicines.liquid;

import java.util.Objects;

public class Drops extends  LiquidMedicines {

    private String applicationMode;
    private static int count = 0;
    private int id;

    public Drops() {
        super();
        applicationMode = "";
        ++count;
        id = count;
    }

    public Drops(String name, float cost, int volume, String applicationMode) {
        super(name, cost, volume);
        this.applicationMode = applicationMode;
        ++count;
        id = count;
    }

    public Drops(Drops drops) {
        super(drops);
        applicationMode = drops.applicationMode;
        ++count;
        id = count;
    }

    public String getApplicationMode() {
        return applicationMode;
    }

    public void setApplicationMode(String applicationMode) {
        this.applicationMode = applicationMode;
    }

    @Override
    public String toString() {
        return super.toString() + "\nApplication mode: " + applicationMode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Drops drops = (Drops) obj;
        return id == drops.id &&
                applicationMode.equals(drops.applicationMode) &&
                volume == drops.volume &&
                name.equals(drops.name) &&
                type.equals(drops.name) &&
                cost == drops.cost &&
                price == drops.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationMode, id);
    }
}
