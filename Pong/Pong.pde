PImage backgroundImage;
import ddf.minim.*;
Minim minim;
AudioSample sound;
int x = 0;
int velocity = 2;
int y = 0;
int velocity2 = 2;
void setup(){
  backgroundImage = loadImage("Aesthetic_Background.jpg");
  size(500,500);
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
}
void draw(){
  image (backgroundImage, 0, 0);
  image (backgroundImage, 0, 0, width, height);
  fill(0, 0, 255);
  ellipse(x, y, 15, 15);
  x+=velocity;
  if(x==width){
    velocity = -2;
  }
  if(x==0){
    velocity = 2;
  }
  y+=velocity2;
  if(y==0){
    velocity2 = 2;
  }
  if(y==height){
    sound.trigger();
  }
  fill (118, 118, 118);
  rect (mouseX, 490, 40, 20);
  intersects (x, y, mouseX, 490, 40);
  if(){
    
  }
}   
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else 
          return false;
}