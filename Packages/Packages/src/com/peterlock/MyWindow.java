package com.peterlock;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MyWindow extends JFrame {

    public MyWindow(String title) {
        super(title);
        setSize(500, 140);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                super.windowOpened(e);
            }


            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });

    }
        @Override
        public void paint(Graphics g){
            super.paint(g);
            Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
            Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
            g.setFont(sansSerifLarge);
            g.drawString("The Complete Java Developer Course", 60,60);
            g.drawString("by Peter Lock", 60, 100);
        }

}
