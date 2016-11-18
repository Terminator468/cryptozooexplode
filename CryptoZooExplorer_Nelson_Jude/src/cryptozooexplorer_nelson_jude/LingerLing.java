
/********************************************************************************
 * Program Filename: LingerLing.java
 * Author: Nelson, Jude
 * Date: 11/4/16
 * Description: 
 * Input: Keyboard, Animal.java, ZooAnimal.java
 * Output: Zoo.java, FossilRelative.java
 ********************************************************************************/

package cryptozooexplorer_nelson_jude;

public class LingerLing extends Animal {
    
    public LingerLing(String name, String origin, int dangerRate, boolean onTour) {
        super(name, origin, dangerRate, onTour);
    }
    
    @Override
    public String getFoodType() {
        return "none";
    }
    
    @Override
    public void setFoodType(String food) {
        
    }
    
    @Override
    public int getFoodamt() {
        return 0;
    }
    
    @Override 
    public void setFoodamt(int foodtype) {
        
    }
    
    @Override
    public int FoodperWeek() {
        return 1;
    }
    
}
