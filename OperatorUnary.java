package com.dicoding.javafundamental.operator;

public class OperatorUnary {
   public static void main(String[]args) {
       System.out.println("Operator Unary Plus");
       int nilaiAwal = 5;
       int hasil = + nilaiAwal;
       System.out.println("Hasil Dari +5 = " + hasil);
       System.out.println("");
       
       System.out.println("Operator Unary Minus");
       int nilaiAwal2 = -5;
       nilaiAwal2 =  -nilaiAwal2;
       System.out.println("Hasil Dari -5 = " + -nilaiAwal2);
       System.out.println("");
       
       System.out.println("Operator Peningkatan Nilai 1 Poin");
       int nilaiAwal3 = 5;
       nilaiAwal3++;
       System.out.println("Hasil Dari 5++ = " + nilaiAwal3++);
       System.out.println("");
       
       System.out.println("Operator Pengurangan Nilai 1 Poin");
       int nilaiAwal4 = 5;
       nilaiAwal4--;
       System.out.println("Hasil Dari 5-- = " + nilaiAwal4);
       System.out.println("");
       
       System.out.println("Operator Komplemen Logika");
       boolean sukses = false;  //nilai sukses adalah false.
       System.out.println("Hasil !False = " + !sukses);
       System.out.println();
   } 
}
