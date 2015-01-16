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
 * @author eltntawpoint2
 */
public class Line extends Shape{

    
    private Point point1;
    private Point point2;

    

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
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
        
        g.drawLine(point1.getX(),point1.getY(),point2.getX(),point2.getY());
        
        g2d.setStroke(Stork);
    }

    @Override
    public String toString() {
        return "Line{" + "point1=" + point1 + ", point2=" + point2 + '}';
    }
    
    
    
}
