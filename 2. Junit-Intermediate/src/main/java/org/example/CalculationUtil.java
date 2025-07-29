package org.example;

public class CalculationUtil {

    public int add(int a, int b){
        return a+b;
    }

    public int mul(int a, int b){
        return a*b;
    }

    public String parseString(String str){
        return str;
    }

    public int div(int a, int b){
        return a/b;
    }

    public boolean isEven(int a){

        return (a%2==0);
    }

    public boolean isOdd(int a)
    {
        return a % 2 != 0;
    }
}
