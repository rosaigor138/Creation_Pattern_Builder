package org.example;

public class ProductBuilder {
    private Product product;
    public ProductBuilder(){
        this.product = new Product();
    }

    public Product build(){
        if (product.getId() == 0){
            throw new IllegalArgumentException("Invalid Id");
        }
        if (product.getName().isEmpty()){
            throw new IllegalArgumentException("Invalid Name");
        }
        return product;
    }
    public ProductBuilder setName(String name){
        this.product.setName(name);
        return this;
    }
    public ProductBuilder setId(int id){
        this.product.setId(id);
        return this;
    }
    public ProductBuilder setStock(int stock){
        this.product.setStock(stock);
        return this;
    }

    public ProductBuilder setPrice(float Price){
        this.product.setPrice(Price);
        return this;
    }

    public ProductBuilder setCategory(String category){
        this.product.setCategory(category);
        return this;
    }
    public ProductBuilder setManufacturer(String manufacturer){
        this.product.setManufacturer(manufacturer);
        return this;
    }

}
