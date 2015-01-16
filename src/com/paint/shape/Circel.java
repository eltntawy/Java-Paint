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
public class Circel extends Shape {

    private Point point;
    private int radius;

    

    public Circel(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        Graphics2D g2d = ((Graphics2D) g);
        Stroke Stork = g2d.getStroke();
        g2d.setStroke(new BasicStroke(size));

        if (Solid) {
            g.fillOval(point.getX(), point.getY(), radius, radius);
        } else {
            g.drawOval(point.getX(), point.getY(), radius, radius);
        }

        g2d.setStroke(Stork);
    }

    @Override
    public String toString() {
        return "Circel{" + "point=" + point + ", radius=" + radius + '}';
    }

}
