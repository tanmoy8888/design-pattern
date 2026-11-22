package solid_principle.dependency_inversion_principle.notification_types;

import solid_principle.dependency_inversion_principle.notification.Notification;

public class WhatsappNotification implements Notification {
    @Override
    public String message() {
        return "This is from Whatsapp-notification";
    }
}
