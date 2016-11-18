
/********************************************************************************
 * Program Filename: Paranormal.java
 * Author: Nelson, Jude
 * Date: 11/7/16
 * Description: 
 * Input: User Input, Animal.java, ZooAnimal.java
 * Output: Zoo.java
 ********************************************************************************/

package cryptozooexplorer_nelson_jude;

public class Paranormal extends Animal {
    
    private String FoodType;
    private int Foodamt;
    
    public Paranormal(String name, String origin, int dangerRate, boolean onTour) {
        super(name, origin, dangerRate, onTour);
        FoodType = "meat";
        Foodamt = 5;
    }

    
    @Override
    public String getFoodType() {
        return FoodType;
    }
    
    @Override
    public void setFoodType(String FoodType) {
        this.FoodType = FoodType;
    }

    @Override
    public int getFoodamt() {
        return Foodamt;
    }

    @Override
    public void setFoodamt(int Foodamt) {
        this.Foodamt = Foodamt;
    }
    
    //relook at this to see if class constructor better suits it 
    @Override
    public int FoodperWeek() {
        return 1;
    }
}
