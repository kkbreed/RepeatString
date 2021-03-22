/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeatstring;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class RepeatString {

    /**
     * @param args the command line arguments
     */
    
    /*
    Create a Java application called RepeatString to prompt a user for a string 
    (can be multiple words).  Next, ask the user how many times they would like 
    the string to be repeated.  Pass these values as parameters in a separate 
    repetition method.  Use this method to output the repeated string the number
    of times requested by the user.
    */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        //String y;
        String x;
        int y;
        
        getWelcome();
        getLines();
        
        System.out.println("Please enter a string... ");
        String x = scnr.nextLine();
        
        System.out.println("How many times do you want to repeat the string?");
        int y= scnr.nextInt();
        
        System.out.println("Your repeated code will show below: ");
        getLines();
        
        getStrings(x, y);
              
}
    
    public static void getWelcome(){
        System.out.println("Welcome to the program");
    }
    
    public static void getLines(){
        System.out.println("-----------------------------------------------------");
    }
       
    public static void getStrings(String x,int y) {
    for(int i=0;i<y;i++){
        System.out.println(x);
   
    }
    

