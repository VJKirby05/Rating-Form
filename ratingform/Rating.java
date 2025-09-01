/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ratingform;

/**
 *
 * @author james
 */
public class Rating
{
    private int plot;
    private int characters;
    private int humour;
    private int visuals;
    private int soundtrack;
    
    public Rating(int plot, int characters, int humour, int visuals, int soundtrack)
    {
        this.plot = plot;
        this.characters = characters;
        this.humour = humour;
        this.visuals = visuals;
        this.soundtrack = soundtrack;
    }
    
    public int getPlot()
    {
        return plot;
    }
    
    public int getCharacters()
    {
        return characters;
    }
    
    public int getHumour()
    {
        return humour;
    }
    
    public int getVisuals()
    {
        return visuals;
    }
    
    public int getSoundtrack()
    {
        return soundtrack;
    }
    
    public int getTotalRatingScore()
    {
        int score = plot + characters + humour + visuals + soundtrack;
        return score;
    }
}
