import org.code.neighborhood.*;

public class sunPainter extends PainterPlus {

  public void paintSun() {
    //Gets to starting point
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    move();
    turnLeft();

    //Moves the painter foward and paints, and then comes back and then goes to the next row
    while (hasPaint()) {
      paint("yellow");
      move();
      paint("yellow");
      move();
      paint("yellow");
      move();
      paint("yellow");
      turnLeft();
      turnLeft();
      move();
      move();
      move();
      turnLeft();
      move();
      turnLeft();
    }
  }
}