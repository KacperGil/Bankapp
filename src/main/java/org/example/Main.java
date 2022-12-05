package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w naszym banku!");
        System.out.println("Podaj swoje imie:");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("Podaj swoje nazwisko:");
        String surname=scanner.nextLine();
        System.out.println("Podaj swój pesel:");
        int pesel=scanner.nextInt();
        String pesel2=String.valueOf(pesel);
        if (pesel2.length()>10||pesel2.length()<9){
            System.out.println("Podałeś źle pesel");
            return;
        }

        User user1=new User(name, surname, pesel);
        System.out.println("Wybierz działanie\n 1.Informacje o koncie\n 2.Wpłata pieniędzy\n 3.Wypłata pieniędzy \n 4.Wyjście");
       int dzialanie=scanner.nextInt();
         switch (dzialanie){
            case 1:
                System.out.println("Informacje o koncie!");
                user1.userDetails();
                break;
             case 2:
                 System.out.println("Ile chcesz wpłacić pieniędzy?: ");
                 double moneytodeposit=scanner.nextDouble();
                 user1.deposit(moneytodeposit);
                 System.out.println("Twoje saldo teraz: "+user1.getSaldo());
                break;
             case 3:
                 System.out.println("Ile chcesz wypłacić pieniędzy?: ");
                 double moneydraw=scanner.nextDouble();
                 user1.withdraw(moneydraw);
                 System.out.println("Twoje saldo teraz: "+ user1.getSaldo());
                 break;
             case 4:
                 break;
         }
    }
}