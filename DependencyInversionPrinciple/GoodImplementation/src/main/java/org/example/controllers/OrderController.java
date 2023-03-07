package org.example.controllers;
import org.example.domain.Order;
import org.example.usecase.ConfirmOrderUseCase;
public class OrderController {

    private ConfirmOrderUseCase confirmOrderUseCase;

    public OrderController(ConfirmOrderUseCase confirmOrderUseCase) {
        this.confirmOrderUseCase = confirmOrderUseCase;
    }

    public void confirmOrder(Order order) {
        confirmOrderUseCase.execute(order);
    }

}
