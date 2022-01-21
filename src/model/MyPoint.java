/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author lomana.markel
 */
public class MyPoint {

    int y;
    int x;
 

    public MyPoint() {
    }
    /**
     * 
     * @param y
     * @param x 
     */
    public MyPoint(int y, int x) {
        this.y = y;
        this.x = x;
    }
    /**
     * Puntuen arteko distantzia.
     * @return 
     */
    public double distance() {
        double d;
        d = Math.sqrt((0 - x) * (0 - x) + (0 - y) * (0 - y));
        return d;
    }
    /**
     * Puentuen arteko ditantzia another.
     * @param another
     * @return 
     */
    public double distance(MyPoint another) {
        double d;
        d = Math.sqrt((x - another.x) * (x - another.x) + (y - another.y) * (y - another.y));
        return d;

    }
    /**
     * Puntu bera diren
     * @param another
     * @return 
     */
    public boolean equals(MyPoint another) {
        if (this == another) {
            return true;
        }
        if (another == null) {
            return false;
        }
        if (getClass() != another.getClass()) {
            return false;
        }
        final MyPoint other = (MyPoint) another;
        if (this.y != other.y) {
            return false;
        }
        if (this.x != other.x) {
            return false;
        }
        return true;
    }

    public double distance(int x, int y) {
        return 0;

    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getXY() {
        return 0;

    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int setXY(int x, int y) {
        return 0;

    }

    @Override
    public String toString() {
        return "(" + y +", " + x + ')';
    }

}
