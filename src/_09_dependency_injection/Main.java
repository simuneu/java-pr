package _09_dependency_injection;

public class Main {
    public static void main(String[] args) {
        NotificationService service = new EmailNotificationService();

        OrderService service1 = new OrderService(service);

        SMSNotificationService smsService = new SMSNotificationService();
        OrderService o = new OrderService();
        o.setNotificationService(smsService);

        smsService.processOrder();
        smsService.send();

        service1.processOrder();
        service1.send();

    }
}
