int x1 = 250;
int x2 = 1250;
int speed = 5;
void setup(){
  size(1500,500);
  background(255,255,255);
  
  
  
  
  
}
void draw(){
  background(255,255,255);
  for(int a = 0; a < 500; a+=10){
  noFill();
 
    
    ellipse(x1,250,a,a);
  } if(x1 >= width || x1<=0){
  speed*=-1;
  }
  for(int a = 0; a < 500; a+=10){
  
    ellipse(x2,250,a,a);
  }
  x2-=speed;
  x1+=speed;
  }