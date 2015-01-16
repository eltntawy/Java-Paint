/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paint.shape;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.util.logging.Logger;

/**
 *
 * @author eltntawy
 */
public class Point extends Shape {

    private int x;
    private int y;
    

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        Graphics2D g2d = ((Graphics2D) g);
        Stroke Stork = g2d.getStroke();
        g2d.setStroke(new BasicStroke(size));

        g.drawLine(x, y, x, y);

        g2d.setStroke(Stork);
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

    
}
