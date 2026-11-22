package solid_principle.dependency_inversion_principle.notification_service;

import solid_principle.dependency_inversion_principle.notification.Notification;

public class NotificationService {
    Notification notification;
    public NotificationService(Notification notification){
        this.notification= notification;
    }
    public void send(){
        System.out.println(notification.message());
    }
}
