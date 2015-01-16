/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paint.shape;

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Logger;

/**
 *
 * @author eltntawy
 */
public abstract class Shape {

    protected int size;
    protected Color color;
    protected boolean Solid ;
    
    private static final Logger LOG = Logger.getGlobal();
    

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isSolid() {
        return Solid;
    }

    public void setSolid(boolean Solid) {
        this.Solid = Solid;
    }

    
    public abstract void draw(Graphics g);

}
