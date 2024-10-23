package ru.ivan;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Crud user1 = new UserCrud("Иван", "Александрович", "ivan@gmail.com", "dede2323!#");
        Crud user2 = new UserCrud("Светлана", "Геннадьевна", "efe@eve.ru", "evwv34##");
        Crud user3 = new UserCrud("Михаил", "Иванович", "mih@gmail.com", "rehGE@#");

        Repository repo = new Repository();

        System.out.println(user1 + "\n" + user2 + "\n" + user3);

    }

}