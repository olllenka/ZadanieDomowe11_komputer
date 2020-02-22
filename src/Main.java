public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(3000, 40, 80);
        Memory memory = new Memory(1066, 35, 60, 4096);
        HardDisc hardDisc = new HardDisc(128);

        Computer computer = new Computer(processor, memory, hardDisc);

        System.out.println(computer.getProcessor().toString());
        System.out.println(computer.getMemory().toString());
        System.out.println();

        try {
            computer.getProcessor().overclock(100);
            System.out.println(computer.getProcessor().toString());
            System.out.println();
            computer.getProcessor().overclock(500);
            System.out.println(computer.getProcessor().toString());
            System.out.println();
        } catch (TemperatureExceededException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();

        try {
            computer.getMemory().overclock(100);
            System.out.println(computer.getMemory().toString());
            System.out.println();
            computer.getMemory().overclock(500);
            System.out.println(computer.getMemory().toString());
        } catch (TemperatureExceededException e) {
            System.out.println(e.getMessage());
        }


    }
}
