/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package done.s.p0127;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author DoanNC
 */
public class PositionBoxColor extends JFrame {

    private int x, y;
    private int size = 0;
    private int edge = 0;

    PositionBoxColor(int size, int edge) {
        this.size = size;
        this.edge = edge;
        this.x = edge / 2 - size / 2;
        this.y = edge / 2 - size / 2;
        this.setTitle("Box Color");
        this.setSize(edge, edge);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void setX(int x) {
        if (x < edge - size && x > 28) {
            this.x = x;
        }
    }

    public void setY(int y) {
        if (y < edge - size && y > 0) {
            this.y = y;
        }
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public void paint(Graphics g) {
        g.clearRect(0, 0, edge, edge);
        g.setColor(new Color(153, 255, 204));
        g.fillRect(this.y, this.x, size, size);
        g.setColor(Color.red);
        g.drawRect(this.y, this.x, size, size);
    }

    public static void main(String[] args) {
        PositionBoxColor MainFrame = new PositionBoxColor(50, 500);
        MainFrame.setLocationRelativeTo(null);
        MainFrame.paint(MainFrame.getGraphics());
        int spacing = 5;
        MainFrame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        MainFrame.setX(MainFrame.getX() - spacing);
                        break;
                    case KeyEvent.VK_DOWN:
                        MainFrame.setX(MainFrame.getX() + spacing);
                        break;
                    case KeyEvent.VK_LEFT:
                        MainFrame.setY(MainFrame.getY() - spacing);
                        break;
                    case KeyEvent.VK_RIGHT:
                        MainFrame.setY(MainFrame.getY() + spacing);
                        break;
                }
                MainFrame.paint(MainFrame.getGraphics());

            }
        });
    }
}
