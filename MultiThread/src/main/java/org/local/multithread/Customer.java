package org.local.multithread;

public class Customer implements Runnable {

    private int i =0;
    private String value;

    public Customer(String value){
        this.value = value;
    }

    @Override
    public void run() {
        System.out.println("id :"+this.value);
    }
}
