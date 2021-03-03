import java.util.ArrayList; // import the ArrayList class

public class point {
  //instance variables
  private int x;
  private int y;

  // constructor
  public point(int x, int y) {
    setLocation(x, y);
  }//End constructor

  public point() {
    this(0,0);
  }

  // sets this point's (x, y) location to the given values
  public void setLocation(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // returns the x-coordinate of this point
  public int getX() {
    return x;
  }
  // returns the y-coordinate of this point
  public int getY() {
    return y;
  }

  // set x coordinate
  public void setX(int x) {
    this.x = x;
  }// close setX

  // set y coordinate
  public void setY(int y) {
    this.y = y;
  }// setY

  public String toString() {
    return "(" + x + ", " + y + ")";
  }

  public void translate(int dx, int dy) {
    setLocation(x + dx, y + dy);
  }

  // returns the distance between this Point and (0, 0)
  public double distanceFromOrigin() {
    return Math.sqrt(x * x + y * y);
  }

  public int midPoint(Point point){
    int mid=((this.x + point.getX())/2);
    int vid=((this.y + point.getY())/2);
    return new Point(mid,vid);
  }

  public int distance(Point point){
    return Math.sqrt(Math.pow(this.x - point.getX(), 2) + Math.pow(this.y - point.getY(), 2));
  }

  public int slope(Point point){
    return ((point.getY() - this.y) / (point.getX() - this.x));
  }

  public int isCollinear(Point point, Point point2){
    if (this.slope(point) == this.slope(point2)){
      return true;
    }
    return false;
  }

}//end main
