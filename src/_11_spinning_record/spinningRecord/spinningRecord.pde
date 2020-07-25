import ddf.minim.*;  
Minim minim;
AudioPlayer song;
PImage pictureOfRecord;
int spinAngle = 0;
void setup() {
  size(600,600);
  pictureOfRecord= loadImage("record.png");
  pictureOfRecord.resize(600,600);
  image(pictureOfRecord, 0, 0); 
  minim = new Minim(this);  
  song = minim.loadFile("awesomeTrack.mp3", 512);  
}

void draw() {
  if(mousePressed){
    spinAngle += 10;
   rotateImage(pictureOfRecord, spinAngle);
   image(pictureOfRecord, 0, 0); 
   song.play();
  }
 song.pause();
}

void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
