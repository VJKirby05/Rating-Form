/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ratingform;

/**
 *
 * @author james
 */
public class Media
{
    private String title;
    private String type;
    private Rating rating;
    
    public Media(String title, String type, Rating rating)
    {
        this.title = title;
        this.type = type;
        this.rating = rating;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getType()
    {
        return type;
    }
    
    public Rating getRating()
    {
        return rating;
    }
    
    public int getTotalScore() 
    {
        return rating.getTotalRatingScore();
    }
}
