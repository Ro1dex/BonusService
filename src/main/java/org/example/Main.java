package org.example;public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        long result = service.calculate(5000, true);
        System.out.println(result);
    }
}