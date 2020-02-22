public class Memory extends OverclockableComponent {
    private int memoryAmount;
    public static final int TEMP_INCREASE_PER_ADDITIONAL_100MHz = 15;

    public Memory(int clocking, double temperature, int maxTemperature, int memoryAmount) {
        super(clocking, temperature, maxTemperature);
        this.memoryAmount = memoryAmount;
    }

    @Override
    public boolean isMaxTempExceeded(int additionalClocking) {
        double tempIncrease = additionalClocking/100*TEMP_INCREASE_PER_ADDITIONAL_100MHz;
        if(getTemperature()+tempIncrease>getMaxTemperature())
            return true;
        else
            return false;
    }

    @Override
    protected double getIncreasedTemperature(int additionalClocking) {
        double tempIncrease = additionalClocking/100*TEMP_INCREASE_PER_ADDITIONAL_100MHz;
        return getTemperature()+tempIncrease;
    }

    @Override
    public String toString() {
        return "Pamięć RAM: \ntaktowanie: " + getClocking() + ",\ntemperatura: " + getTemperature() + ",\nmaksymalna temperatura: " + getMaxTemperature();
    }
}
