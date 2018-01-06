int i = 500;
void setup(){
  size(500,500);
  
  
  
  
  
  
}
void draw(){
  
  if((i / 10) % 2 == 0){
    fill(255,0,0);
  }else{
  fill(255,255,255);
  }
  if(i > 0){
    
    ellipse(250,250,i,i);
   
  }
  
  i -= 10;
  
 
}