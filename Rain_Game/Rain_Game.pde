int x = 0;
int y = 0;
int randomNumber = (int)random(500);
int score = 0;
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100 && y > 485){
          score++;
          y = 0;
        randomNumber = (int)random(500);
     }
}
void setup(){
  size (500,500);
}
void draw(){
  background(166, 166, 166);
   fill (0, 232, 255);
   stroke (7, 4, 214);
   ellipse (randomNumber, y++, 10, 10);
  if (y == 500){
    y = 0;
    if (score > 0){
    score--;
    }
    randomNumber = (int)random(500);
  }
  fill (106, 106, 106);
  noStroke();
  rect(mouseX, 485, 15, 15);
  checkCatch(randomNumber);
      fill(0, 0, 0);
      textSize(16);
      text("Score: " + score, 20, 20);
}