package org.example.usecase;

import org.example.adapters.EmailService;
import org.example.domain.Order;

public class ConfirmOrderUseCase {
    private EmailService emailService;

    public ConfirmOrderUseCase(EmailService emailService) {
        this.emailService = emailService;
    }

    public void execute(Order order) {
        // Lógica para confirmar el pedido
        emailService.sendEmail(
                order.getCustomerEmail(),
                "Confirmación de Pedido",
                "Gracias por su compra");
    }
}
