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
public class MyCircle {
   
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;
   
    public MyCircle() {
    }
    /**
     * 
     * @param x
     * @param y
     * @param radius 
     */
    public MyCircle(int x, int y, int radius) {
      center = new MyPoint(x,y);
      this.radius = radius;
       
    }
    /**
     * 
     * @param center
     * @param radius 
     */
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }
    /**
     * Math.sqrt erabiliz, eta bi zirkuluen zentroa jakinik, 
     * distantzia kalkulatzen da.
     * @param another
     * @return 
     */
    public double distance(MyCircle another) {
        double distantzia = Math.sqrt((center.x - another.center.x) * (center.x - another.center.x) + ((center.y - another.center.y) * (center.y - another.center.y)));
        return distantzia;
    }
    /**
     * puntua Zirkuluaren barruan dagoen kalkulatzen da.
     * @param puntua
     * @return boolean 
     */
    public boolean isInside(MyPoint puntua) {
        int xPuntua = this.center.getX() - puntua.getX();
        int yPuntua = this.center.getY() - puntua.getY();
        if (Math.sqrt((xPuntua*xPuntua) + (yPuntua*yPuntua)) <= radius){
            return true;
        }
        return false;
    }
    /**
     * Azaleraren kalkulua
     * @return 
     */
    public double getArea() {
        double area = Math.PI * (radius * radius);
        return area;
    }
    /**
     * 
     * @return 
     */
    public MyPoint getCenter() {
        return center;
    }
    
    public void getCenterX() {
    }
    public void getCenterY() {  
    }

    public int[] getCenterXY() {
        return null;
    }
    /**
     * Zirkunferentziaren kalkulua.
     * @return 
     */
    public double getCircunference() {
        double circumference = 2 * Math.PI * radius;
        return circumference;

    }
    /**
     * 
     * @return 
     */
    public int getRadius() {
        return radius;
    }

    public void setCenter(MyPoint center) {

    }

    public void setCenterX(int x) {

    }

    public void setCenterXY(int x, int y) {

    }

    public void setCenterY(int Y) {

    }

    public void setRadius(int radius) {

    }

    @Override
    public String toString() {
        return "MyCircle{" + "center=" + center + ", radius=" + radius + '}';
    }

}
