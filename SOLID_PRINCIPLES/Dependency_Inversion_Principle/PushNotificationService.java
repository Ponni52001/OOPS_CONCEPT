package com.DIP;


public class PushNotificationService implements NotificationService 
{
    @Override
    public void sendNotification(String message) 
    {
        
        System.out.println("Sending push notification: " + message);
    }
}
