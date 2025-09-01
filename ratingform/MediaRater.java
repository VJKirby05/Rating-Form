/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ratingform;

/**
 *
 * @author james
 */

import java.util.Scanner;

public class MediaRater
{
    public Media getUserInput()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is the name of this media?");
        String title = scan.nextLine();
        System.out.println("What type of media is this[movie,series etc.]?");
        String type = scan.nextLine();
        
        System.out.println("Enter Digits[0-20] For the Following:");
        System.out.println("---");
        
        System.out.println("Rate the Characters in " + title + ":");
        int in1 = scan.nextInt();
        
        System.out.println("Rate the Plot in " + title + ":");
        int in2 = scan.nextInt();
        
        System.out.println("Rate the Visuals in " + title + ":");
        int in3 = scan.nextInt();
        
        System.out.println("Rate the Humour in " + title + ":");
        int in4 = scan.nextInt();
        
        System.out.println("Rate the Soundtrack of " + title + ":");
        int in5 = scan.nextInt();
        
        Rating rating = new Rating(in1, in1, in3, in4, in5);
        return new Media(title, type, rating);
    }
}
