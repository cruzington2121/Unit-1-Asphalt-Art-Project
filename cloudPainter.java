import org.code.neighborhood.*;

public class cloudPainter extends PainterPlus {

  public void paintCloud() {

    //Starting position to paint the cloud, top left of the cloud
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    turnLeft();

    //Painting the cloud
    paint("white");
    moveAndPaint("white");
    turnRight();
    move();
    turnLeft();
    moveAndPaint("white");
    turnLeft();
    turnLeft();
    moveAndPaint("white");
    moveAndPaint("white");
    moveAndPaint("white");
    move();
    turnLeft();
    move();
    turnLeft();
    paint("white");
    moveAndPaint("white");
    moveAndPaint("white");
    moveAndPaint("white");
    moveAndPaint("white");
    moveAndPaint("white");
    turnRight();
    move();
    turnRight();
    moveAndPaint("white");
    moveAndPaint("white");
    moveAndPaint("white");
    moveAndPaint("white");
  }
}