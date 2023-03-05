package com.DIP;

public class Restaurant
{
    NotificationService notificationService;

    public Restaurant(NotificationService notificationService) 
    {
        this.notificationService = notificationService;
    }

    public void prepareFood() {

        notificationService.sendNotification("Food is ready!");
    }
}
