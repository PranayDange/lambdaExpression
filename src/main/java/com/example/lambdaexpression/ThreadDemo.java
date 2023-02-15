package com.example.lambdaexpression;

public class ThreadDemo {
    public static void main(String[] args) {
        //first thread
        Runnable thread1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("the value of i is" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 =new Thread(thread1);
        t1.setName("Pranay");
        t1.start();

        Runnable thread2=()->{
            try {
                for(int i=1;i<=10;i++){
                    System.out.println(i*2);
                    Thread.sleep(2000);
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };
        Thread t2 = new Thread(thread2);
        t2.start();
    }
}
