
/********************************************************************************
 * Program Filename: Zoo.java
 * Author: Nelson, Jude
 * Date: 11/9/16
 * Description: 
 * Input: User Input, Animal.java, CryptoZooExplorer_Nelson_Jude.java
 * Output: CryptoZooExplorer_Nelson_Jude.java
 ********************************************************************************/

package cryptozooexplorer_nelson_jude;

import java.util.*;

public class Zoo {
    static ArrayList<Animal> zooList = new ArrayList();    
    static int counter = 0;
    
    public void list() {
        Mythical myth1 = new Mythical("Unicorn", "over the rainbow", 4, false, "hay", 2);
        zooList.add(myth1);
        Mythical myth2 = new Mythical("Reindeer", "the North Pole", 2, false, "berries", 15);
        zooList.add(myth2);
        Mythical myth3 = new Mythical("Dragons", "Mount Etna", 10, false, "raw pork", 50);
        zooList.add(myth3);
        Paranormal para1 = new Paranormal("Yeti", "The Himalyayas", 7, false);
        zooList.add(para1);
        Paranormal para2 = new Paranormal("Three-headed goat", "African Savanna", 2, false);
        zooList.add(para2);
        Paranormal para3 = new Paranormal("Bigfoot", "Dense Forests", 5, false);
        zooList.add(para3);
        LingerLing ling1 = new LingerLing("Woolly Mammoth", "Alaska", 6, false);
        zooList.add(ling1);
        LingerLing ling2 = new LingerLing("Saber-tooth", "Antartica", 10, false);
        zooList.add(ling2);
        LingerLing ling3 = new LingerLing("Tasmanian Tiger", "Tansmania", 8, false);
        zooList.add(ling3);
        FossilRelative fos1 = new FossilRelative("Pelycosaur", "Egypt", 1, false);
        zooList.add(fos1);
        FossilRelative fos2 = new FossilRelative("Tengu", "Japan", 2, false);
        zooList.add(fos2);
    }
    
    public void ShowAll() {
        for(int i = 0; i < zooList.size(); i++) {
            System.out.println(zooList.get(i).toString());
            System.out.println("Food type: " + zooList.get(i).getFoodType());
            System.out.println("Amount of Food: " + zooList.get(i).getFoodamt() + " lbs.");
            System.out.println("______________________________________________________");
        }
    }
    
    public void ShowonTour() {
        for(int i = 0; i < zooList.size(); i++) {
            if(zooList.get(i).ontour) {
                System.out.println(zooList.get(i).toString());
                System.out.println("Food type: " + zooList.get(i).getFoodType());
                System.out.println("Amount of Food: " + zooList.get(i).getFoodamt() + " lbs.");
                System.out.println("______________________________________________________");
            }
        }
    }
    
    public void ShowNotonTour() {
        for(int i = 0; i < zooList.size(); i++) {
            if(!zooList.get(i).ontour) {
                System.out.println(zooList.get(i).toString());
                System.out.println("Food type: " + zooList.get(i).getFoodType());
                System.out.println("Amount of Food: " + zooList.get(i).getFoodamt() + " lbs.");
                System.out.println("______________________________________________________");
            }
        }
    }
    
    public void addnewAnimalsMythical(String name, String origin, int DangerLevel, String foodtype, int amount) {
        zooList.add(new Mythical(name, origin, DangerLevel, false, foodtype, amount));
    }
    
    public void addnewAnimalsParanormal(String name, String origin, int DangerLevel) {
        zooList.add(new Paranormal(name, origin, DangerLevel, false));
    }
    
    public void addnewAnimalsLingerLing(String name, String origin, int DangerLevel) {
        zooList.add(new LingerLing(name, origin, DangerLevel, false));
    }
    
    public void addnewAnimalsFossilRelative(String name, String origin, int DangerLevel) {
        zooList.add(new FossilRelative(name, origin, DangerLevel, false));
    }
    public void MarkOnTour(String response) {
        for(int i = 0; i < zooList.size(); i++) {
            if(zooList.get(i).name.equalsIgnoreCase(response)) {
                zooList.get(i).ontour = true;
                System.out.println(response+" is now on tour!");
            }
        }
    }
    
    public void Remove(String name) {
        boolean looping = true;
        if(zooList.isEmpty()) {
            System.out.println("There is no animal in your catalog to begin with...");
        } else {
            while(looping) {
                counter++;
                if(zooList.get(counter).name.equalsIgnoreCase(name)) {
                    zooList.remove(counter);
                    counter = 0;
                    looping = false;
                    System.out.println("A " + name + " has been removed.");
                }
                if (counter > zooList.size()) {
                    
                }
            }
        }
    }
}
