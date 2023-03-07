package org.example;

import org.example.adapters.EmailService;
import org.example.adapters.GmailEmailService;
import org.example.adapters.OutlookEmailService;
import org.example.controllers.OrderController;
import org.example.domain.Order;
import org.example.usecase.ConfirmOrderUseCase;

public class Main {
    public static void main(String[] args) {
        EmailService gmailEmailService = new GmailEmailService();
        EmailService outlookEmailService = new OutlookEmailService();

        ConfirmOrderUseCase confirmOrderUseCase = new ConfirmOrderUseCase(gmailEmailService);

        OrderController orderController = new OrderController(confirmOrderUseCase);
        orderController.confirmOrder(new Order());
    }
}