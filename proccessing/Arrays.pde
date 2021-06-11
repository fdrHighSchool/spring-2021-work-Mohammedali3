float circle;


void setup() {
  size(1000, 1000);
  background(255);
  noStroke();
}
//Not sure why its only drawing circles on the top of the screen
int nums[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

void draw() {
  if (mousePressed) {
    int color1 = (int)(Math.random()*254)+1;
    int color2 = (int)(Math.random()*254)+1;
    int RanPick1 = (int)(Math.random()*10);
    int Ranpick2 = (int)(Math.random()*10);
    
    fill(color1,color2);
    ellipse(RanPick1,Ranpick2,nums[RanPick1]*5,nums[Ranpick2]*5);
  }
}
