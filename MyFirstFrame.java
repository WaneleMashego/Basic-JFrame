/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author nhlan
 */
public class MyFirstFrame extends JFrame {

    public MyFirstFrame() {
        
        setTitle("My First GUI");
        setSize(200,250);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setForeground(Color.BLUE);
        setVisible(true);
    }
    
    
    
}
