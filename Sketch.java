import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    //declare varaibles for position of rectangles
    int intX = 0;
    int intY = 0;

    //nested for loops to draw the grid
    for(int intRow = 0; intRow < 300; intRow += 10){

      for(int intColumn = 0; intColumn < 300; intColumn += 10){

        intX = 3 + intRow;  
        intY = 300 + 3 + intColumn; 

        fill(255);
        noStroke();

        rect(intX, intY, 5, 5);
      }
    }
  }

  
  public void draw_section2(){

  //declare 
  int intSection2X = 0;
  int intSection2Y = 0;

    for(int intRow = 0; intRow < 300; intRow += 10){

      for(int intColumn = 0; intColumn < 300; intColumn += 10){

        intSection2X = 303 + intRow;  
        intSection2Y = 300 + 3 + intColumn; 

        //if statement for changing the color whenever the row number is divisible evenly by 4
        if ((intRow % 4) == 0) {
          fill(255, 255, 255);
        }
        else {
          fill(0, 0, 0);
        }

        noStroke();
        rect(intSection2X, intSection2Y, 5, 5);

      }
    }
  }

  
  public void draw_section3(){

    //declare variables
    int intSection3X = 0;
    int intSection3Y = 0;
  
    //nested for loops to draw grid
    for(int intRow = 0; intRow < 300; intRow += 10){

      for(int intColumn = 0; intColumn < 300; intColumn += 10){

        //calculating the new row and column values
        intSection3X = 603 + intRow;  
        intSection3Y = 300 + 3 + intColumn; 
  
        //if statement to change colors if the column number is evenly divisible by 4 
        if ((intColumn % 4) == 0) {
          fill(0, 0, 0);
        }
        else {
          fill(255, 255, 255);
        }

        noStroke();
        rect(intSection3X, intSection3Y, 5, 5);
  
      }
    }
  }

  
  public void draw_section4(){

    //declare variables
    int intSection4X = 0;
    int intSection4Y = 0;

    //nested for loops to draw grid
    for(int intRow = 0; intRow < 300; intRow += 10){

      for(int intColumn = 0; intColumn < 300; intColumn += 10){

        intSection4X = 903 + intRow;  
        intSection4Y = 300 + 3 + intColumn; 

        //if statement to change colors if the row is divisible by 4 and the column is not divisble by 4
        if ((intRow % 4) == 0 && (intColumn % 4) != 0)  {
          fill(255, 255, 255);
        }
        else {
          fill(0, 0, 0);
        }

        noStroke();
        rect(intSection4X, intSection4Y, 5, 5);
  
      }
    }
  }

 
  public void draw_section5(){

    fill(255, 255, 255);

    //nested for loops to draw the triangle
    for (int i = 0; i < 300; i += 10) {

      //note that this loop is set to be less than i, not less than or equal to i like the other loops. This is to reflect the given picture.
      for(int j = 0; j < i; j += 10) {
        rect(i + 3, 293 - j, 5,5);
      }
    }
  }

  public void draw_section6(){

    fill(255, 255, 255);

    //nested for loops to draw the triangle
    for (int i = 0; i < 300; i += 10) {

      for(int j = 290; j >= i; j -= 10) {

        rect(i + 303, j + 3, 5,5);
      }
    }
  }

  public void draw_section7(){

    fill(255, 255, 255);

    //nested for loops to draw the triangle
    for (int i = 0; i < 300; i += 10) {

      for(int j = 290; j>= i; j -= 10) {

        rect(i + 603, 293 - j, 5, 5);
      }
    }
  }
  
  public void draw_section8(){

    fill(255, 255, 255);

    //nested for loops to draw the triangle
    for (int i = 0; i < 300; i += 10) {

      for(int j = 0; j <= i; j += 10) {

        rect(i + 903, j + 3, 5,5);
      }
    }

  }






}
