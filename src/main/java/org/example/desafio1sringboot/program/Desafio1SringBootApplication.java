package org.example.desafio1sringboot.program;

import org.example.desafio1sringboot.entities.Order;
import org.example.desafio1sringboot.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
@ComponentScan({"org.example.desafio1sringboot"})
public class Desafio1SringBootApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;


    public static void main(String[] args) {
        SpringApplication.run(Desafio1SringBootApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite o código: ");
            int code = sc.nextInt();

            System.out.print("Digite o valor do produto: ");
            double basic = sc.nextDouble();

            System.out.print("Digite a percentagem de desconto: ");
            double discount = sc.nextDouble();

            Order order = new Order(basic, discount);
            double total = orderService.total(order);

            System.out.println("Pedido código: " + code);
            System.out.printf("Valor total: %.2f%n", total);
        }
    }
}

