package com.DIP;

public class Main 
{
    public static void main(String[] args) 
    {
        // creates restaurant object with email notification service
        NotificationService emailNotificationService = new EmailNotificationService();
        Restaurant restaurant = new Restaurant(emailNotificationService);
        restaurant.prepareFood();

        // creates restaurant object with SMS notification service
        NotificationService smsNotificationService = new SMSNotificationService();
        restaurant = new Restaurant(smsNotificationService);
        restaurant.prepareFood();

        // creates restaurant object with push notification service
        NotificationService pushNotificationService = new PushNotificationService();
        restaurant = new Restaurant(pushNotificationService);
        restaurant.prepareFood();
    }
}

