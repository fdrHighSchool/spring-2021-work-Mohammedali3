float circle;
float color1;
float circle2;

void setup(){
size(500,500);
background(50);
}

void draw(){
fill(color1);
}

void mousePressed(){
 ellipse(circle,circle2,30,30);
 color1 = random(0,700);
 circle = random(width);
 circle2 = random(height);
}

void keyPressed(){
 background(50); 
}
