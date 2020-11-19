/** MAKE SURE TO READ THE README CAREFULLY BEFORE YOU BEGIN EDITING THIS CODE */
import processing.core.PApplet;
//import sun.jvm.hotspot.code.BufferBlob;

public class Sketch extends PApplet {

    /*
     * SUMMATIVE REQUIRED Declare at least four balls, four bubbles, and four
     * snowflakes as instance variables. I have made the first ball for you.
     * 
     * SUMMATIVE OPTIONAL Use *arrays* to store the elements, rather than individual
     * variables.
     */
    Ball[] b;
    Bubble[] bb;
    Snowflake[] s;



    public void settings() {
        size(500, 500);
    }

    /*
     * SUMMATIVE REQUIRED Initialize the balls, bubbles, and snowflakes using your
     * constructors inside of setup(). You must use a non-default-constructor at
     * least once and a default constructor at least once for each type.
     * 
     * I have done the first ball for you.
     */
    public void setup() {
        frameRate(30);

        b = new Ball[]{new Ball(this), new Ball(this), new Ball(this), new Ball(this, 100, 100, 120, 0, 255, 4, 5), new Ball(this, 250, 250, 100, 255, 0, 5, 7)};

        bb = new Bubble[]{new Bubble(this), new Bubble(this), new Bubble(this, 60, 4, -1), new Bubble(this, 55, 300, 150, color(255, 150), 0, 2, -6), new Bubble(this, 55, 150, 300, color(255, 150), 0, 6, -2)};

        s = new Snowflake[]{new Snowflake(this), new Snowflake(this), new Snowflake(this), new Snowflake(this, 60, 100, 100, color(255, 150), 0, 2), new Snowflake(this, 70, 400, 100, color(255, 150), 1, 2)};

    }

    public void draw() {
        background(100);

        /* SUMMATIVE REQUIRED Draw and move all balls, snowflakes, and bubbles */
        b[0].drawBall();
        b[0].moveBall();
        b[1].drawBall();
        b[1].moveBall();
        b[2].drawBall();
        b[2].moveBall();
        b[3].drawBall();
        b[3].moveBall();
        b[4].drawBall();
        b[4].moveBall();

        bb[0].drawBubble();
        bb[0].moveBubble();
        bb[1].drawBubble();
        bb[1].moveBubble();
        bb[2].drawBubble();
        bb[2].moveBubble();
        bb[3].drawBubble();
        bb[3].moveBubble();
        bb[4].drawBubble();
        bb[4].moveBubble();

        s[0].drawSnowflake();
        s[0].moveSnowflake();
        s[1].drawSnowflake();
        s[1].moveSnowflake();
        s[2].drawSnowflake();
        s[2].moveSnowflake();
        s[3].drawSnowflake();
        s[3].moveSnowflake();
        s[4].drawSnowflake();
        s[4].moveSnowflake();
    }

    /**
     * Convenience method to return a random color
     * 
     * @param transluscent if true, make the color transluscent, otherwise solid
     */
    public int randomColor(boolean transluscent) {
        int alpha;
        if (transluscent) {
            alpha = 125;
        } 
        else {
            alpha = 255;
        }
        return color(random(0, 255), random(0, 255), random(0, 255), alpha);
    }

    

    public void mousePressed(){
      b[0].stop();
      b[1].stop();
      b[2].stop();
      b[3].stop();
      b[4].stop();
      
    }

    public void mouseReleased(){
      b[0].start();
      b[1].start();
      b[2].start();
      b[3].start();
      b[4].start();
    }


    /*  
  
     * SUMMATIVE OPTIONAL Add a void method called mousePressed() that stops some or
     * all of the balls from moving when you click the mouse. (it will run
     * automatically when you click if the name is correct)
     * 
     * EXTRA CHALLENGE - can you make it so that only the ball you actually CLICKED
     * stops? (this is a major challenge - you can use the variables mouseX and
     * mouseY to see where the mouse was clicked.)
     */

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}