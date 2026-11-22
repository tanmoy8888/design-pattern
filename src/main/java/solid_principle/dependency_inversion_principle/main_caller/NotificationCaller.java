package solid_principle.dependency_inversion_principle.main_caller;

import solid_principle.dependency_inversion_principle.notification_service.NotificationService;
import solid_principle.dependency_inversion_principle.notification_types.EmailNotification;

public class NotificationCaller {
    public static void main(String[] args) {
        EmailNotification emailNotification = new EmailNotification();
        NotificationService emailNotificationService = new NotificationService(emailNotification);
        emailNotificationService.send();
    }
}
