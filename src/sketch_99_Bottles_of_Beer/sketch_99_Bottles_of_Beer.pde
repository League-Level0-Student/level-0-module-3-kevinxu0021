void setup(){
int number = 99;
for(int i = 99; i > 0; i--){
println(number + " bottles of beer on the wall, " + number + " bottles of beer" + "\n" + " Take one down and pass it around, " + (number-1) + " bottles of beer on the wall.");
number-=1;
}
}