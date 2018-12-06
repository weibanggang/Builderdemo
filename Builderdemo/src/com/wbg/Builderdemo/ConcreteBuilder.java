package com.wbg.Builderdemo;

public class ConcreteBuilder extends Builder  {
    private Product product=new Product();
    @Override
    public void setProduct(String name, String type) {
        product.setName(name);
        product.setType(type);
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
