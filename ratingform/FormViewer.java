/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ratingform;

/**
 *
 * @author james
 */
public class FormViewer
{
    public static void main(String[] args)
    {
        MediaRater mr = new MediaRater();
        Media m = mr.getUserInput();
        
        Form f = new Form();
        f.showForm(m);
    }
}
