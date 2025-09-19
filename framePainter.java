import org.code.neighborhood.*;

public class framePainter extends PainterPlus {

  //Paints the frame, turns right if it can't move
  public void paintFrame() {
      while (hasPaint()) {
        moveAndPaint("brown");
      
      if (!canMove()) {
        turnRight();
      }
    }
  }
}