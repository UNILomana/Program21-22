package model;

/**
 *
 * @author lomana.markel
 */
public class MyRectangle {
    MyPoint topLeft;
    MyPoint bottomRight;
    /**
     * 
     * @param topLeft
     * @param bottomRight 
     */
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    /**
     * Laukizuzenakren azaleraren kalkulua.
     * @return 
     */
    public double getAzalera(){
        /*Eragiketa hau ez dakit ondo dagoen proba bat da*/
        double area = (bottomRight.x - topLeft.x) * (topLeft.y - bottomRight.y);
        return area;  
    }
    /**
     * Laukizuzenaren perimetroaren kalkulua.
     * @return 
     */
    public double getPerimetroa(){
        /*Eragiketa hau ez dakit ondo dagoen proba bat da*/
        double perimetroa = 2*((bottomRight.x - topLeft.x) + (topLeft.y - bottomRight.y));
        return perimetroa;
        
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    @Override
    public String toString() {
        return "Rectangle{" + topLeft + "," + bottomRight + '}';
    }
    
    
}
