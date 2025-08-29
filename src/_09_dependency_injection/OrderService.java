package _09_dependency_injection;

public class OrderService {
    //생성자
    private  NotificationService service;
    public OrderService(NotificationService service){
        this.service = service;
    }
    public void processOrder() {
        service.processOrder();
    }

    public OrderService(){

    }

    //setter
    private NotificationService setterService;
    public void setNotificationService(NotificationService setterService){
        this.setterService = setterService;
    }

    public void send(){service.send();}
}
