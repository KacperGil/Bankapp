package org.example;

public class User {
    private String name;
    private String surname;
    private String nickname;
    private int pesel;
    private int accountNumber;
    private double saldo;

    public User(String name, String surname, int pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.nickname=nicknameGenerator(name,surname);
        this.saldo=100;
        this.accountNumber=1;
    }
    public String nicknameGenerator(String name, String surname){
        return (name.substring(0,3)+surname.substring(0,3));
    }
    public void userDetails(){
        System.out.println("Numer konta: "+accountNumber+"\nImię: "+name+"\nNazwisko: "+surname+"\nNick: "+nickname+"\nPesel: "+pesel+"\nSaldo: "+saldo);
    }
    public double deposit(double money){
        return saldo=saldo+money;
    }

    public double getSaldo() {
        return saldo;
    }
    public double withdraw(double money){
        if (money>saldo) {
            System.out.println("Nie masz tyle na koncie");
        }else{
            saldo=saldo-money;
        }
        return saldo;

    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
