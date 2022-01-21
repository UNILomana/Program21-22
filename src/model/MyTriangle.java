package model;

/**
 *
 * @author lomana.markel
 */
public class MyTriangle {

    MyPoint v1;
    MyPoint v2;
    MyPoint v3;
    /**
     * 
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @param x3
     * @param y3 
     */
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }
    /**
     * 
     * @param v1
     * @param v2
     * @param v3 
     */
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    /**
     * Triangeluaren perimetroaren kalkulua.
     * @return 
     */
    public double getPerimeter() {
        double dAB = Math.sqrt((v1.x - v2.x) * (v1.x - v2.x) + (v1.y - v2.y) * (v1.y - v2.y));
        double dBC = Math.sqrt((v2.x - v3.x) * (v2.x - v3.x) + (v2.y - v3.y) * (v2.y - v3.y));
        double dCA = Math.sqrt((v3.x - v1.x) * (v3.x - v1.x) + (v3.y - v1.y) * (v3.y - v1.y));

        double perimetroa = dAB + dBC + dCA;
        return perimetroa;
    }
    /**
     * Zein motatako triangelua den. aldekidea|isoszelea|eskalenoa
     * @return 
     */
    public String getType() {
        double dAB = v1.distance(v2);
        double dBC = v2.distance(v3);
        double dCA = v3.distance(v1);
        String tipo = null;
        
        if ((dAB == dBC) && (dBC == dCA) && (dCA == dAB)) {
            tipo = "aldekidea";
        } else if (((dAB == dBC) && (dBC != dCA) && (dCA != dAB) )  ||
                    ((dAB != dBC) && (dBC != dCA) && (dCA == dAB) ) ||
                    ((dAB != dBC) && (dBC == dCA) && (dCA != dAB) ) ){
            tipo = "isoszelea";
        } else if(((dAB != dBC) && (dBC != dCA) && (dCA != dAB) )){
            tipo = "eskalenoa";
        }
        return tipo;
    }

    public MyPoint getV1() {
        return v1;
    }

    public MyPoint getV2() {
        return v2;
    }

    public MyPoint getV3() {
        return v3;
    }

    public void setV1(MyPoint v1) {
        this.v1 = v1;
    }

    public void setV2(MyPoint v2) {
        this.v2 = v2;
    }

    public void setV3(MyPoint v3) {
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle{" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + '}';
    }

}
