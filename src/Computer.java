public class Computer {
    private Processor processor;
    private Memory memory;
    private HardDisc hardDisc;

    public Computer(Processor processor, Memory memory, HardDisc hardDisc) {
        this.processor = processor;
        this.memory = memory;
        this.hardDisc = hardDisc;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Memory getMemory() {
        return memory;
    }

    public HardDisc getHardDisc() {
        return hardDisc;
    }
}
