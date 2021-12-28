import src.transactions.java.Transaction;
import java.util.Scanner;

public class Menu extends Transaction {
    private double receive, transfer;
    public int pin, uang;

    public Test(double newTransfer, double newReceive){
        super("Fenny Oktaviani", 123456, 200000);
        this.setTransfer(newTransfer);
        this.setReceive(newReceive);    
    }

    public void setTransfer(double newTransfer){
        this.transfer = newTransfer;
    }

    public void setReceive(double newReceive){
        this.receive = newReceive;
    }

    static void Oint(int newDataInt){
        System.out.println(newDataInt);
    }

    static void Odou(double newDataDou){
        System.out.println(newDataDou);
    }

    static void O(String newDataString){
        System.out.println(newDataString);
    }

    static void Menu(){
        Test fenny = new Test(0,0);
        Scanner sc = new Scanner(System.in);
        O("Selamat datang di atm mpun");
        O("1.Cek Saldo\n2.Transfer\n3.Exit");
        O("Masukkan Pilihan anda : ");
        int a = sc.nextInt();
        if ( a == 1)
        {
            O("Anda Memilih Menu Cek Saldo");
            O("Saldo Anda Tersisa Rp." + fenny.getBalance());
        } else if ( a == 2)
        {
            O("Masukan jumlah transfer : ");
            int pin = sc.nextInt();

        } else if (a == 3){
            O("Terimakasih telah menggunakan program ini :)");
        }
