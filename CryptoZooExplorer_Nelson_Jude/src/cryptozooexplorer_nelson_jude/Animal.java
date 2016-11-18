
/********************************************************************************
 * Program Filename: Animal.java
 * Author: Luong, Micheal
 * Date: 11/3/16
 * Description: 
 * Input: Keyboard, ZooAnimal.java
 * Output: Zoo.java, LingLing.java, Mythical.java, FossilRelative.java, and
 *         Paranormal.java
 ********************************************************************************/

package cryptozooexplorer_nelson_jude;

public abstract class Animal implements ZooAnimal{
    String name;
    String origin;
    int dangerRating;
    boolean ontour;
    
    public Animal(String Name, String Origin, int DangerRating, boolean onTour) {
        this.name = Name;
        this.origin = Origin;
        this.dangerRating = DangerRating;
        this.ontour = onTour;
    }
    
    @Override
    public String toString() {
        return "Name: " + this.name + "\n" +
                "Origin: " + this.origin + "\n" +
                "Danger Rating: " + this.dangerRating + "\n";
    }
    
    abstract int FoodperWeek();
}
