package com.wbg.Builderdemo;

public class Client {
    public static void main(String[] args){
        Director director = new Director();
        Product product1 = director.getProductAT();
        product1.printProduct();

        Product product2 = director.getProductBM();
        product2.printProduct();
    }
}
