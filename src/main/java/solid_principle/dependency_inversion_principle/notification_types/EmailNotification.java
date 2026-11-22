package solid_principle.dependency_inversion_principle.notification_types;

import solid_principle.dependency_inversion_principle.notification.Notification;

public class EmailNotification implements Notification {
    @Override
    public String message() {
        return "This is from Email-notification";
    }
}
