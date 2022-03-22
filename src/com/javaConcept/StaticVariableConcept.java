    package com.javaConcept;

public class StaticVariableConcept {


    static int g;


    public static void main(String[] args) {
        // write your code here
        int a = 2;
        int b = 2;

        System.out.println("a value is: "+a);
        System.out.println("b value is: "+b);
        System.out.println("g value is: " + g);

        System.out.println("============StaticVariable Object value =========");

        StaticVariable s = new StaticVariable();
        System.out.println(++s.a1);
        System.out.println(StaticVariable.b1++);

        StaticVariable s1 = new StaticVariable();
        System.out.println("StaticVariable s1: a1  " + ++s1.a1);
        System.out.println("StaticVariable s1: b1  "+StaticVariable.b1++);




    }

 }
class StaticVariable {
    StaticVariable() {

    }

    int a1 = 0;
    static int b1 = 1;


}
