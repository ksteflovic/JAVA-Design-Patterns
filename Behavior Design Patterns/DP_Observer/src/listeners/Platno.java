/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package listeners;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author KI
 */
public class Platno extends JComponent implements MouseListener {

    private int x = -1;
    private int y = -1;
    private Color farba = Color.RED;

    public Platno() {
        setBounds(10, 10, 250, 250);
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, getWidth()-1, getHeight()-1);
        g.setColor(farba);
        if (x != -1) {
            g.fillOval(x-10, y-10, 20, 20);
        }
    }

    public void setFarba(Color farba) {
        this.farba = farba;
        repaint();
    }


    public void vymaz() {
        x = y = - 1;
        repaint();
    }

    public void mouseClicked(MouseEvent e) {
 
    }

    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        repaint();

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {
       
    }
}
