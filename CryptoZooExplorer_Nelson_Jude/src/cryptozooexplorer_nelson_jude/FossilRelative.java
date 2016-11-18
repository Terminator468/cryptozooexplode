
/********************************************************************************
 * Program Filename: FossilRelative.java
 * Author: Nelson, Jude
 * Date: 11/8/16
 * Description: 
 * Input: User Input, ZooAnimal.java, Animal.java, LingerLing.java
 * Output: Zoo.java
 ********************************************************************************/

package cryptozooexplorer_nelson_jude;

public class FossilRelative extends LingerLing {
    
    public FossilRelative(String name, String origin, int dangerRate, boolean onTour) {
        super(name, origin, dangerRate, onTour);
    }
    
    public int FoodperWeek() {
        return 1;
    }
    
}
