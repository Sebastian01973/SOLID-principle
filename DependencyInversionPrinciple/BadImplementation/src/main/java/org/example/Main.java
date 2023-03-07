package org.example;

public class Main {
    public static void main(String[] args) {
        ConfirmOrderUseCase confirmOrderUseCase = new ConfirmOrderUseCase();
        confirmOrderUseCase.execute(new Order());
    }
}