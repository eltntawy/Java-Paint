/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paint.shape;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.util.logging.Logger;

/**
 *
 * @author eltntawy
 */
public class Rectangle extends Shape {

    private Point point1;
    private Point point2;
    private static final Logger LOG = Logger.getLogger(Rectangle.class.getName());

    public Rectangle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
        LOG.fine("new Rectangle " +this);
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        Graphics2D g2d = ((Graphics2D) g);
        Stroke Stork = g2d.getStroke();
        g2d.setStroke(new BasicStroke(size));

        if (isSolid()) {
            g.fillRect(point1.getX(), point1.getY(), point2.getX(), point2.getY());
        } else {
            g.drawRect(point1.getX(), point1.getY(), point2.getX(), point2.getY());
        }

        g2d.setStroke(Stork);
        LOG.fine("Draw rectangle " + this);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "point1=" + point1 + ", point2=" + point2 + '}';
    }

    
}
