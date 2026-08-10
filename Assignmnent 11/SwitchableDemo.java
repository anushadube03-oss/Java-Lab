// Interface
interface Switchable {
    void turnOn();
}

// Light class
class Light implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Light is ON");
    }
}

// Fan class
class Fan implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Fan is ON");
    }
}

// Main class
public class SwitchableDemo {

    public static void main(String[] args) {

        Light light = new Light();
        Fan fan = new Fan();

        // Turn on the devices
        light.turnOn();
        fan.turnOn();
    }
}