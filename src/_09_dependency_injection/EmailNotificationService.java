package _09_dependency_injection;

public class EmailNotificationService implements NotificationService{

    @Override
    public void processOrder(){
        System.out.println("Order processed successfully.");
    }
    public void send(){
        System.out.println("Sending email notification:your order has been processed");
    }
}
