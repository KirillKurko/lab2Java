package pharmacy.medicines.liquid;

import pharmacy.medicines.Medicine;

public class LiquidMedicines extends Medicine {

    protected int volume;

    public LiquidMedicines() {
        super();
        volume = 0;
    }

    public LiquidMedicines(String name, float cost, int volume) {
        super(name, cost);
        this.volume = volume;
    }

    public LiquidMedicines(LiquidMedicines liquidMedicines) {
        super(liquidMedicines);
        volume = liquidMedicines.volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    protected String generateType() {
        return "liquid";
    }

    @Override
    public String toString() {
        return super.toString() + "\nVolume: " + volume;
    }
}
