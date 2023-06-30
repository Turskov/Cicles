package ru.netology.services.Cicles.services;

public class Main {
    public static void main(String[] args) {
        RestService service = new RestService();
        int count = service.calculateRestMonths(10000, 3000, 20000);
        System.out.println(count);


    }
}