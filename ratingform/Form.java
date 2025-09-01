/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ratingform;

/**
 *
 * @author james
 */
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Form
{
    public void showForm(Media m)
    {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Media Rating Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // Set the window size
        
        // Create a JTextArea to display the strings
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false); // Make the text area non-editable
        
        textArea.setFont(new Font("Arial", Font.BOLD, 26));
        textArea.append(m.getTitle() + "\n");
        
        textArea.setFont(new Font("Arial", Font.PLAIN, 12));
        
        Rating rt = m.getRating();
        textArea.append("Media Type: " + m.getType() + "\n" + "\n");
        textArea.append("Plot:     " + rt.getPlot() + "/20" + "\n");
        textArea.append("Characters:     " + rt.getCharacters() + "/20" + "\n");
        textArea.append("Humour:     " + rt.getHumour() + "/20" + "\n");
        textArea.append("Visuals:     " + rt.getVisuals() + "/20" + "\n");
        textArea.append("Soundtrack:     " + rt.getSoundtrack() + "/20" + "\n" + "\n");
        
        textArea.setFont(new Font("Arial", Font.BOLD, 16)); // Set font for readability
        textArea.append("Rating Score: " + m.getTotalScore() + "/100");
        
        // Add the JTextArea to a JScrollPane for scrolling
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Make the window visible
        frame.setVisible(true);
    }
}
