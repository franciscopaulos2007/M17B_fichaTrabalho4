package psi_11_o.m17b_fichatrabalho4;

public class Ponto2D {
    private int x;
    private int y;
    
    public Ponto2D(){
        x = 0;
        y = 0;        
    }
    /**
     * 
     * @param x
     * @param y 
     */
    
    public Ponto2D(int x, int y){
        this.x = x;
        this.y = y;        
    }
    /**
     * 
     * @param a
     * @return 
     */
    
    public double distancia(Ponto2D a){
        return Math.abs(Math.sqrt(Math.pow((getX()-a.getX()),2)+Math.pow((getY()-a.getY()),2)));
    }
    /**
     * 
     * @return 
     */

    @Override
    public String toString() {
        return "Ponto2D[" + getX() + "," + getY() + "]";
    }    

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }
}
