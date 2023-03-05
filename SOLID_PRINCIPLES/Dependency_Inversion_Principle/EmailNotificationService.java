package com.DIP;

public class EmailNotificationService implements NotificationService 
{
    @Override
    public void sendNotification(String message) 
    {
        System.out.println("Sending email notification: " + message);
    }
}
