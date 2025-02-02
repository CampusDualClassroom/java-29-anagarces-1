package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {

        int a = 20;
        int b = 0;

        try {
            int result = dividir(a, b);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir por 0");
        }
    }

    public static int dividir(int a, int b){
        return a / b;
    }
}
