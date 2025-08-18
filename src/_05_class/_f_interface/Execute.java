package _05_class._f_interface;

public class Execute {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = null;
        System.out.println(rc); //null

        System.out.println("====television====");
        rc = new Television(); //RemoterControl rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        System.out.println("====audio====");
        rc = new Audio(); //RemoterControl rc = new Television();
        rc.turnOn();
        rc.setVolume(112);
        rc.turnOff();
    }
}
