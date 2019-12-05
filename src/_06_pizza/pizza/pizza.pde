
void setup() {
size(1000,1000);
fill(#E06324);
ellipse(500, 500, 500, 500);
fill(#FC0000);
ellipse(500,500,400,400);
fill(#FFDC0F);
ellipse(500,500,375,375);
}
void draw() {
 PImage pepperoni = loadImage("pepperoni1.png");
 pepperoni.resize(300, 300);
 image(pepperoni, 375, 425);

}
}
