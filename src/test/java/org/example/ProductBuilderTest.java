package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductBuilderTest {
    @Test
    public void shouldReturnExceptionInvalidName(){
        try{
            ProductBuilder productBuilder = new ProductBuilder().setId(1).setStock(2);
        }catch(IllegalArgumentException e){
            assertEquals("Invalid Name", e.getMessage());
        }
    }

    @Test
    public void shouldReturnExceptionInvalidId(){
        try{
            ProductBuilder productBuilder = new ProductBuilder().setName("Shoes").setStock(1);
        }catch(IllegalArgumentException e){
            assertEquals("Invalid Id", e.getMessage());
        }
    }

    @Test
    public void shouldReturnValidProduct(){
        ProductBuilder productBuilder = new ProductBuilder();
        Product product = productBuilder
                .setId(1)
                .setName("Jacket")
                .setStock(1)
                .build();

        assertNotNull(product);
    }


}