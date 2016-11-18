/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/********************************************************************************
 * Program Filename: Mythical.java
 * Author: Luong, Micheal
 * Date: 10/5/16
 * Description: 
 * Input: User Input, Animal.java, ZooAnimal,java
 * Output: zoo.java
 ********************************************************************************/

package cryptozooexplorer_nelson_jude;

/**
 *
 * @author micheal
 */
public class Mythical extends Animal {
    
    String FoodType;
    int Foodamt;
    
    public Mythical(String name, String origin, int dangerRate, boolean onTour, String Foodtype, int FoodAmt) {
        super(name, origin, dangerRate, onTour);
        this.FoodType = Foodtype;
        this.Foodamt = FoodAmt;
    }
    
    @Override
    public String getFoodType() {
        return FoodType;
    }
    
    @Override
    public void setFoodType(String food) {
        this.FoodType = food;
    }
    
    @Override
    public int getFoodamt() {
        return Foodamt;
    }
    
    @Override 
    public void setFoodamt(int foodtype) {
        this.Foodamt = foodtype;
    }
    
    @Override
    public int FoodperWeek() {
        return 1;
    }
}
