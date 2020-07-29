int randomNumber = (int) random(width);
float y=7.5;
int x;
int score = 0;
void setup() {
  size(600, 600);
   textSize(16);
}

void draw() {
    background(100,0, 0);
    fill(0, 100, 0);
     text("Score: " + score, 20, 20);
    fill(0,0,100);
    stroke(0,0,100);
    ellipse(randomNumber, y, 10, 15);
    y = y+ 3;
    if(y>height){
      y=7.5;
      checkCatch(randomNumber);
      randomNumber = (int) random(width);
    }
    fill(0,100,0);
    stroke(0,100,0);
    rect(mouseX, 540, 60, 60);
}

 void checkCatch(int x){
         if (x > mouseX && x < mouseX+60){
            score++;
         }
         else if (score > 0) {
            score--;
         }
        println("Your score is now: " + score);
  }
