public class Processor extends OverclockableComponent {
    public static final int TEMP_INCREASE_PER_ADDITIONAL_100MHz = 10;

    public Processor(int clocking, double temperature, int maxTemperature) {
        super(clocking, temperature, maxTemperature);
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
        return "Procesor: \ntaktowanie: " + getClocking() + ",\ntemperatura: " + getTemperature() + ",\nmaksymalna temperatura: " + getMaxTemperature();
    }
}
