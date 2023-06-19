package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int mat, fizik, kimya;

       Scanner deger= new Scanner(System.in);
        System.out.print("MATEMATİK Notunu giriniz : ");
        mat=deger.nextInt();

        System.out.print("FİZİK Notunu Giriniz : ");
        fizik=deger.nextInt();

        System.out.print("KİMYA Notunu Giriniz : ");
        kimya=deger.nextInt();




        double ort=(mat+fizik+kimya)/3.0;
        System.out.println(ort);

        String sonuc=(ort<50) ? "KALDI" : "GEÇTİ";
        System.out.print(sonuc);



    }

    }
