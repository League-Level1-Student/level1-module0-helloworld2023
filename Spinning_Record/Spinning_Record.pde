PImage pictureOfRecord;
import ddf.minim.*;
Minim minim;
AudioPlayer song;
int angle = 0;
void setup(){
  size(600,600);
  pictureOfRecord = loadImage ("record.jpg");
  pictureOfRecord.resize(height, width);
  minim = new Minim(this);
  song = minim.loadFile("Post Malone Swae Lee - Sunflower (Spider-Man Into the Spider-Verse).mp3", 512);
  song.play();
}
void draw(){
  rotateImage(pictureOfRecord, angle++);
  image(pictureOfRecord, 0,0);
  if (mousePressed){
    song.play();
    song.pause();
  }
}
void rotateImage(PImage image, int amountToRotate){
  translate(width/2, height/2);
  rotate (amountToRotate*TWO_PI/360);
  translate (-image.width/2, -image.height/2);
}