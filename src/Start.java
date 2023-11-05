
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import javax.swing.JFrame;
import view.MainWindow;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Runelord
 */
public class Start {
    
        
   
    public static void main(String[] args) throws IOException {
        
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice vc=env.getDefaultScreenDevice();
        
        MainWindow mw=new MainWindow();
        
        for(int i=0; i<vc.getDisplayModes().length; i++)
        {
            System.out.println("Mode "+i+".");
            System.out.println(vc.getDisplayModes()[i].getHeight());
            System.out.println(vc.getDisplayModes()[i].getWidth());
            System.out.println(vc.getDisplayModes()[i].getBitDepth());
            System.out.println(vc.getDisplayModes()[i].getRefreshRate()+"\n");
        }
        
        
        
        /*DisplayMode dm=new DisplayMode(800, 600, 8, 60);
        vc.setFullScreenWindow(mw);
        vc.setDisplayMode(dm);*/
        
        
        
        System.out.println("Is FullScreen supported: "+vc.isFullScreenSupported());
        System.out.println("Is Display change supported: "+vc.isDisplayChangeSupported());
        
       
       
        
        mw.activate();
        
        
    }
}
