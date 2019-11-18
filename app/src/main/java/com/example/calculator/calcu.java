package com.example.calculator;


public class calcu {
    int value1, value2;
    public calcu(int a, int b){
        this.value1=a;
        this.value2=b;

    }
    public int Add(){
        return value1+value2;
    }
    public int Sub(){
        return value1-value2;
    }
    public int Multiply(){
        return value1*value2;
    }
    public int Divide(){
        return value1/value2;
    }
}
