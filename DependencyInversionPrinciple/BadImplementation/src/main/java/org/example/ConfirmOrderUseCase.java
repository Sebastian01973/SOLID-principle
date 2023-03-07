package org.example;

public class ConfirmOrderUseCase {

    private EmailSender emailSender;

    public ConfirmOrderUseCase() {
        emailSender = new EmailSender();
    }

    public void execute(Order order) {
        // Lógica para confirmar el pedido
        emailSender.sendEmail(order.getCustomerEmail(),
                "Confirmación de Pedido",
                "Gracias por su compra");
    }
}
