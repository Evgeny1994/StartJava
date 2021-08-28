public class Variable {
    public static void main(String[] args) {
        byte numProcessor = 2;
        short runServices = 659;
        int virtualMemory = 9362;
        long availableMemory = 3274;
        float totalMemory = 3.7f;
        double physicalMemory = 100.78;
        char networkAdapter = 'A';
        boolean networkBridge = false;
        System.out.println("Количество процессоров:" + numProcessor);
        System.out.println("Запущенные службы:" + runServices);
        System.out.println("Виртуальная память:" + virtualMemory);
        System.out.println("Виртуальная память, Доступная:" + availableMemory);
        System.out.println("Виртуальная память Всего:" + totalMemory);
        System.out.println("Полный объём физической памяти:" + physicalMemory);
        System.out.println("Буква сетевого адаптера:" + networkAdapter);
        System.out.println("Подключен ли компьютер через сетевой мост:" + networkBridge);
    }
}