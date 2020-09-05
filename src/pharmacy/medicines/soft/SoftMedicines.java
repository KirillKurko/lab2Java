package pharmacy.medicines.soft;

import pharmacy.medicines.Medicine;

abstract public class SoftMedicines extends Medicine {
    protected int weight;

    public SoftMedicines() {
        super();
        weight = 0;
    }

    public SoftMedicines(String name, float cost, int weight) {
        super(name, cost);
        this.weight = weight;
    }

    public SoftMedicines(SoftMedicines softMedicines) {
        super(softMedicines);
        weight = softMedicines.weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    protected String generateType() {
        return "soft";
    }

    @Override
    public String toString() {
        return super.toString() + "\nWeight: " + weight;
    }
}
