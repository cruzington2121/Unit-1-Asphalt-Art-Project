import org.code.neighborhood.*;

public class skyPainter extends PainterPlus {

  public void paintSky() {
  
  //Paints the whole canvas blue, returning back to the starting point of the row after painting the whole row  
    while (canMove()) {
      paintAndMove("SkyBlue");

      if (!canMove() & hasPaint()) {
        paint("SkyBlue");
        turnLeft();
        turnLeft();
        moveFast();
        turnLeft();
        move();
        turnLeft();
      }
    }
  }
}