package demo.service;

import demo.domain.Order;

public class EmailService {

    private static EmailService instance;

    public EmailService() {}

    public static EmailService getInstance() {
        if(instance == null) {
            instance = new EmailService();
        }
        return instance;
    }

     public void sendEmail(Order order) {
        // implementation goes here
        throw new RuntimeException("Runtime exception");
    }

    public  boolean sendEmail(Order order, String cc) {
        // implementation goes here
        return true;
    }
}