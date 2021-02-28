import java.util.ArrayList; // import the ArrayList class

public class point {
  //instance variables
  private int point1;
  private int point2;

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

  public int midPoint(int x1, int x2, int y1, int y2){
    int First = x1 + x2 / 2;
    int second = y1 + y2 /2;

    Ans = First + second;

    return Ans;
  }

  public int distance(int point1, int point2){

  }

  public int slope(int point1, int point2){

  }

  public int isCollinear(int point1, int point2){

  }

}//end main
