float x;
float y;
void setup(){
  size(500,500);
  background(0,0,0);
}
void draw(){
  for(int i = 0; i < 300; i++){
    fill(random(255), random(255), random(255));
    ellipse(x, y, 20, 20);
    x = random(width);
    y = random(height);
  }
}