package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao Almoxafirado!!");
        System.out.println("RESISTOR | CAPACITOR | PROTOBOARD");
        System.out.println("Faça sua requisição!");

        Scanner in = new Scanner(System.in);
        String componente = in.nextLine();

        switch (componente) {
            case "RESISTOR":
                System.out.println("Requisitou um RESISTOR!");
                break;

            case "CAPACITOR":
                System.out.println("Requisitou um CAPACITOR!");
                break;

            case "PROTOBOARD":
                System.out.println("Requisitou um PROTOBOARD!");
                break;

            default:
                System.out.println("Requisicao INVALIDA");
                break;
        }
    }
}