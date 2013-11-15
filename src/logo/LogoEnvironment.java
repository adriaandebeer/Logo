/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logo;

import environment.Environment;
import image.ResourceTools;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author it
 */
public class LogoEnvironment extends Environment {
    private Image logo;
    
    @Override
    public void initializeEnvironment() {
        this.setBackground(Color.WHITE);
        logo = ResourceTools.loadImageFromResource("resources/Apple_Logo_Blue.png");
    }

    @Override
    public void timerTaskHandler() {

    }

    @Override
    public void keyPressedHandler(KeyEvent e) {

    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {

    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {

    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        graphics.setColor(Color.red);
        graphics.fillOval(100, 100, 100, 50);


        graphics.setColor(new Color(25, 255, 255));
        graphics.fillOval(300, 237, 100, 100);
        
        graphics.setColor(new Color(255, 0, 255, 134));
        graphics.fillOval(275, 100, 100, 100);
        
        graphics.setColor(new Color(130, 0, 255));
        graphics.fillOval(123, 34, 100, 100);
        
        graphics.setColor(Color.cyan);
        graphics.fillOval(432, 400, 100, 100);
        
        graphics.setColor(new Color(255, 100, 55, 132));
        graphics.fillOval(142, 150, 100, 100);
        
        graphics.setColor(new Color(0, 255, 125, 44));
        graphics.fillOval(410, 380, 100, 100);
        
        graphics.setColor(new Color(232, 255, 0, 167));
        graphics.fillOval(230, 180, 100, 100);      
        
        graphics.setColor(Color.pink);
        graphics.fillOval(150, 320, 100, 100);
        
        graphics.setColor(new Color(150, 230, 0, 113));
        graphics.fillOval(342, 123, 100, 100);
        
        graphics.setColor(new Color(135, 210, 200));
        graphics.fillOval(257, 412, 100, 100);
        
        graphics.setColor(Color.red);
        graphics.fillOval(212, 132, 100, 100);
        
        graphics.setColor(new Color(114, 255, 37, 13));
        graphics.fillOval(300, 300, 100, 100);
        
        graphics.setColor(new Color(0, 235, 212, 17));
        graphics.fillOval(165, 412, 100, 100);

        graphics.setColor(new Color(50, 205, 50, 117));
        graphics.fillOval(265, 412, 200, 200);

    
        graphics.setFont(new Font("Calibri", Font.PLAIN, 36));
        graphics.setColor(Color.BLACK);
        graphics.drawString("This should brighten everyone's day", 130, 440);
        
        graphics.drawImage(logo, 250, 200, 125, 150, this);
    }  

}
