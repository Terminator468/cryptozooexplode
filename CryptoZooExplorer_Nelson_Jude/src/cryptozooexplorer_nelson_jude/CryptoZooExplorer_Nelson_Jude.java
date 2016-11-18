/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptozooexplorer_nelson_jude;
    import java.util.*;
/**
 *
 * @author micheal
 */
public class CryptoZooExplorer_Nelson_Jude {
    public static Zoo menagerie = new Zoo();
    public static int answeradd;
    public static String answername;
    public static String answerString;
    public static int answerDangerRating;
    public static String typeofFoodanswer;
    public static int amounAnswer;
    static Scanner scan = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean gameplay = true;
        int response;
        menagerie.list();
        /*response = scan.nextInt();
        menagerie.list();
        menagerie.ShowAll();*/
        while(gameplay) {
            //menagerie.ShowAll();
            intro();
            response = scan.nextInt();
            if(response == 1) {
                System.out.println("What new type of animal do you want to add?");
                add();
            } else if(response == 2) {
                System.out.println("What animal do you want to remove?");
                scan.nextLine();
                answerString = scan.nextLine();
                menagerie.Remove(answerString);
            } else if(response == 3) {
                System.out.println("What animal do you want to mark out on tour?");
                answerString = scan.next();
                menagerie.MarkOnTour(answerString);
            } else if(response == 4) {
                System.out.println("Here are the animals on tour...");
                menagerie.ShowonTour();
            } else if(response == 5) {
                System.out.println("Here are the animals not on tour...");
                menagerie.ShowNotonTour();
            } else if(response == 6) {
                gameplay = false;
            } else {
                System.out.println("I did not understand what you just said...");
            }
        }
    }
    
    static void intro() {
        System.out.println("Welcome to the CryptoZoo.");
        System.out.println("How may we help you?\n");
        
        System.out.println("(1) Add an Animal to your catalog");
        System.out.println("(2) Remove an Animal from your catalog");
        System.out.println("(3) Mark an animal as out of tour");
        System.out.println("(4) Show all animals on tour");
        System.out.println("(5) Show all animals not on tour");
        System.out.println("(6) To quit");
    }
    
    public static void add() {
        System.out.println("(1) Mythical");
        System.out.println("(2) Paranormal");
        System.out.println("(3) LingerLing");
        System.out.println("(4) Fossil Relative");
        answeradd = scan.nextInt();
        System.out.println("What is the animal called?");
        answername = scan.next();
        System.out.println("Where does this creature live?");
        answerString = scan.next();
        System.out.println("What is it's danger rating from 0 to 10?");
        answerDangerRating = scan.nextInt();
        if(answeradd == 1) {
            System.out.println("What type of food does it eat?");
            typeofFoodanswer = scan.next();
            System.out.println("What is the amount?");
            amounAnswer = scan.nextInt();
            menagerie.addnewAnimalsMythical(answername, answerString, answerDangerRating, typeofFoodanswer, amounAnswer);
        } else {
            if(answeradd == 2) {
                menagerie.addnewAnimalsParanormal(answername, answerString, answerDangerRating);
            } else if(answeradd == 3) {
                menagerie.addnewAnimalsLingerLing(answername, answerString, answerDangerRating);
            } else {
                menagerie.addnewAnimalsFossilRelative(answername, answerString, answerDangerRating);
            }
        }
    }
}