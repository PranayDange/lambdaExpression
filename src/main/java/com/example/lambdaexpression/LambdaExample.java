package com.example.lambdaexpression;

public class LambdaExample {
    public static void main(String[] args) {
        System.out.println("System started....");

//        MyInter myInter = new MyInterImpl();
//        myInter.sayHello();

        //anamous class
        MyInter myInter1 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("This is a anonymous class");
            }
        };

        myInter1.sayHello();

        MyInter myInter2 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("This is second anonymous class😀");
            }
        };
        myInter2.sayHello();

        //using interface by using lambda
        MyInter myInter3 = () -> {
            System.out.println("This is a lambda expression tutorial");
        };

        myInter3.sayHello();

        MyInter myInter4 = () -> System.out.println("This is another way of using lambda expression");
        myInter4.sayHello();


        //way1
        SumInter sumInter = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(sumInter.sumInter(2, 3));
        //way2
        SumInter sumInter1 = (a, b) -> {
            return (a + b);
        };
        System.out.println(sumInter1.sumInter(2, 3));

        //LengthInter
        LengthInter lengthInter = (str) -> {
            return str.length();
        };
        System.out.println("Length of the string is");
        System.out.println(lengthInter.getLength("Pranay"));


    }
}
