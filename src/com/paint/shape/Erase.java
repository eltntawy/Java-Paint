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

/**
 *
 * @author eltntawy
 */
public class Erase extends Shape {

    private Point point;

    public Erase(Point point) {
        this.point = point;

        setSize(10);
        setColor(Color.white);
    }

    public Erase(int x, int y) {
        this(new Point(x, y));
        
    }
    

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        Graphics2D g2d = ((Graphics2D) g);
        Stroke Stork = g2d.getStroke();
        g2d.setStroke(new BasicStroke(size));

        g.fillRect(point.getX() - 5, point.getY() - 5, point.getX() + 5, point.getY() + 5);

        g2d.setStroke(Stork);
        LOG.fine("Draw rectangle " + this);
    }

}
