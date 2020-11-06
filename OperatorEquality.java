package com.dicoding.javafundamental.operator;

public class OperatorEquality {
    public static void main(String[]args) {
        int value = 10;
        int anotherValue = 5;
        boolean result;
        result = value == anotherValue;
        
        System.out.println("Hasil Dari 'value == anotherValue' Adalah " + result);
        System.out.println("");
        
        System.out.println("Tidak Sama Dengan...");
        result = value != anotherValue;
        System.out.println("Hasil Dari 'value != anotherValue' Adalah " + result);
        System.out.println("");
        
        System.out.println("Lebih Besar Dari...");
        result = value > anotherValue;
        System.out.println("Hasil Dari 'value > anotherValue' Adalah " + result);
        System.out.println("");
        
        System.out.println("Sama Atau Lebih Besar Dari...");
        result = value >= anotherValue;
        System.out.println("Hasil Dari 'value >= anotherValue' Adalah " + result);
        System.out.println("");
        
        System.out.println("Lebih Kecil Dari...");
        result = value < anotherValue;
        System.out.println("Hasil Dari 'value < anotherValue' Adalah " + result);
        System.out.println("");
        
        System.out.println("Sama Atau Lebih Kecil Dari...");
        result = value <= anotherValue;
        System.out.println("Hasil Dari 'value <= anotherValue' Adalah " + result);
        System.out.println("");
    }
}
