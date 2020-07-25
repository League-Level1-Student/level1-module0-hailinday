float y=7.5;
void setup() {
  size(600, 600);
   background(100,0, 0);
}

void draw() {
   fill(0,0,100);
    stroke(0,0,100);
    ellipse(300, y, 10, 15);
    y = y+ 3;
}
