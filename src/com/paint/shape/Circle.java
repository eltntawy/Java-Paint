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

/**
 *
 * @author eltntawy
 */
public class Circle extends Shape {

    private Point point;
    private int radius1;
    private int radius2;
    private Point point2;
    

    public Circle(Point point, Point point2) {
        this.point = point;
        this.point2 = point2;
        
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getRadius() {
        return radius1;
    }

    public void setRadius1(int radius1) {
        this.radius1 = radius1;
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }
    

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        Graphics2D g2d = ((Graphics2D) g);
        Stroke Stork = g2d.getStroke();
        g2d.setStroke(new BasicStroke(size));
        
        radius1 = point.getX() - point2.getX();
        radius2 = point.getY() - point2.getY();

        radius1 = Math.abs(radius1);
        radius2 = Math.abs(radius2);
        
        Point p = new Point(point.getX(), point.getY());
        
        if( point.getX() > point2.getX() ) 
            p.setX(point2.getX());
        
        if( point.getY() > point2.getY() ) 
            p.setY(point2.getY());
        
        
        if (Solid) {
            g.fillOval(p.getX(), p.getY(), radius1, radius2);
        } else {
            g.drawOval(p.getX(), p.getY(), radius1, radius2);
        }

        System.out.println("point"+point.getX() + " - " +point.getX());
        System.out.println("point"+point2.getX() + " - " +point2.getX());
        g2d.setStroke(Stork);
    }

    @Override
    public String toString() {
        return "Circel{" + "point=" + point + ", radius=" + radius1 + '}';
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

}
