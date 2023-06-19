package org.example;

import java.util.Scanner;

public class KdvHesap {
    public static void main(String[] args){
        double tutar, kdvOran = 0.18, kdvyuksek=0.8, kdvTutar, kdvyuksekTutar, kdvYuksekliTutar, kdvliTutar;


        Scanner input = new Scanner(System.in);
        System.out.print("Ücretinizi giriniz");
        tutar= input.nextDouble();
        kdvTutar=tutar*kdvOran;
        kdvyuksekTutar=tutar*kdvyuksek;
        kdvYuksekliTutar=tutar+kdvyuksekTutar;
        kdvliTutar=tutar+kdvTutar;

        System.out.println("kdvsiz tutar :" +tutar);
        System.out.println("kdv'li tutar:" +kdvliTutar);

        if (tutar<=1000)
        {
            System.out.println("KDV oranı 0.18:  " + kdvliTutar);
        }
        else {
            System.out.println("Kdv oranı 0.8:  "+ kdvYuksekliTutar);
        }





    }
}
