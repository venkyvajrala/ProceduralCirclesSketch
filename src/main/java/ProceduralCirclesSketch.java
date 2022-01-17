import processing.core.PApplet;

public class ProceduralCirclesSketch  extends  PApplet{

    public static final int HEIGHT = 348;
    public static final int WIDTH = 640;
    public static final int Diameter = 10;
    int ball1HorizontalPosition=0;
    int ball2HorizontalPosition=0;
    int ball3HorizontalPosition=0;
    int ball4HorizontalPosition=0;
    int ball1VerticalPosition = HEIGHT / 5;
    int ball2VerticalPosition = HEIGHT*2 / 5;
    int ball3VerticalPosition = HEIGHT*3 / 5;
    int ball4VerticalPosition = HEIGHT*4 / 5;
    public static void main(String[] args) {
        PApplet.main(new String[] { "--present", "ProceduralCirclesSketch" });
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();


        ellipse(ball1HorizontalPosition, ball1VerticalPosition,Diameter, Diameter);
        ellipse(ball2HorizontalPosition,ball2VerticalPosition,Diameter, Diameter);
        ellipse(ball3HorizontalPosition,ball3VerticalPosition,Diameter, Diameter);
        ellipse(ball4HorizontalPosition,ball4VerticalPosition,Diameter, Diameter);
    }

    @Override
    public void draw() {

        ball1HorizontalPosition+=1;
        ball2HorizontalPosition+=2;
        ball3HorizontalPosition+=3;
        ball4HorizontalPosition+=4;
        ellipse(ball1HorizontalPosition,ball1VerticalPosition,Diameter, Diameter);
        ellipse(ball2HorizontalPosition,ball2VerticalPosition,Diameter, Diameter);
        ellipse(ball3HorizontalPosition,ball3VerticalPosition,Diameter, Diameter);
        ellipse(ball4HorizontalPosition,ball4VerticalPosition,Diameter, Diameter);

    }
}
