import java.lang.ref.SoftReference;

public abstract class Component {
    private String modelName;
    private String producerName;
    private String serialNumber;

    public Component() {
    }

    public Component(String modelName, String producerName, String serialNumber) {
        this.modelName = modelName;
        this.producerName = producerName;
        this.serialNumber = serialNumber;
    }
}
