class Main{
    public static void main(String[] args) {
        Lampu lampu = new Lampu();
        lampu.turnOn();
        lampu.getState();
        lampu.turnOff();
        lampu.getState();
        lampu.turnOn();
        lampu.getState();
    }
}