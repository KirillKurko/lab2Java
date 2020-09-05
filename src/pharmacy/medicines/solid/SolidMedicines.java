package pharmacy.medicines.solid;

import pharmacy.medicines.Medicine;

abstract public class SolidMedicines extends Medicine {
    protected int amount;

    public SolidMedicines() {
        super();
        amount = 0;
    }

    public SolidMedicines(String name, float cost, int amount) {
        super(name, cost);
        this.amount = amount;
    }

    public SolidMedicines(SolidMedicines solidMedicines) {
        super(solidMedicines);
        amount = solidMedicines.amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    protected String generateType() {
        return "solid";
    }

    @Override
    public String toString() {
        return super.toString() + "\nAmount: " + amount;
    }
}
