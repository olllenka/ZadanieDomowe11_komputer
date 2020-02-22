public abstract class OverclockableComponent extends Component {
    private int clocking;
    private double temperature;
    private int maxTemperature;

    public OverclockableComponent(int clocking, double temperature, int maxTemperature) {
        this.clocking = clocking;
        this.temperature = temperature;
        this.maxTemperature = maxTemperature;
    }

    public void overclock(int additionalClocking) {
        if(isMaxTempExceeded(additionalClocking))
            throw new TemperatureExceededException("Zwiększenie taktowania spowoduje przekroczenie maksymalnej bezpiecznej temperatury!");
        else{
            clocking+=additionalClocking;
            temperature=getIncreasedTemperature(additionalClocking);
        }
    }

    protected abstract boolean isMaxTempExceeded(int additionalClocking);

    protected abstract double getIncreasedTemperature(int additionalClocking);

    public int getClocking() {
        return clocking;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }
}
