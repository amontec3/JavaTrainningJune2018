package com.company.day21w5_factoryInClassTest;

public class NonVegFood extends FoodDecorator{    
    public NonVegFood(Food newFood) {  
        super(newFood);  
    }  
    @Override
    public String prepareFood(){  
        return super.prepareFood() +" With Roasted Chiken and Chiken Curry  ";   
    }  
    @Override
    public double foodPrice()   {  
        return super.foodPrice()+150.0;  
    }  
}  
