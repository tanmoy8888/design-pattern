package solid_principle.dependency_inversion_principle.notification_service;

import solid_principle.dependency_inversion_principle.notification.Notification;

public class NotificationService {
    Notification notification;
    NotificationService(Notification notification){
        this.notification= notification;
    }
    private void send(){
        System.out.println(notification.message());
    }
}
