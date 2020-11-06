package com.dicoding.javafundamental.operator;

public class OperatorConditional {
    public static void main(String[]args) {
        int value = 5;
        int anotherValue = 10;
        
        System.out.println("Conditional AND");
        boolean result = value == 4 && anotherValue == 10;
        boolean anotherResult = value != 4 && anotherValue == 10;
        
        System.out.println("Hasil Operator AND Pada Syarat Value == 4 Dan AnotherValue == 10 Adalah " + result);
        System.out.println("Hasil Operator AND Pada Syarat Value != 4 Dan AnotherValue == 10 Adalah " + anotherResult);
        System.out.println();
        
        System.out.println("Conditional OR");
        result = value == 4 || anotherValue == 10;
        anotherResult = value != 4 && anotherValue == 10;
        
        System.out.println("Hasil Operator OR Pada Syarat Value == 4 Dan AnotherValue == 10 Adalah " + result);
        System.out.println("Hasil Operator OR Pada Syarat Value != 4 Dan AnotherValue == 10 Adalah " + anotherResult);
        System.out.println();
    }
}
