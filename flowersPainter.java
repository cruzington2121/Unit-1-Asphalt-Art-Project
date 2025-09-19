import org.code.neighborhood.*;

public class flowersPainter extends PainterPlus {

  public void paintFlowers() {
    //Painting the grass
    turnRight();
    while (canMove()) {
      move();
    }
    turnLeft();
    move();
    turnLeft();
    move();
    turnRight();

    while (canMove()){
      paint("green");
      move();

    }
    if (!canMove()) {
      turnLeft();
      move();
      turnLeft();
      move();
    }

    while (canMove()) {
      paint("green");
      move();
    }
    //Paints first flower red
    turnRight();
    move();
    turnRight();
    move();
    move();
    paint("green");
    move();
    move();
    paint("green");
    turnLeft();
    move();
    paint("green");
    move();
    paint("red");
    move();
    paint("yellow");
    turnLeft();
    move();
    paint("red");
    turnLeft();
    turnLeft();
    move();
    move();
    paint("red");
    turnLeft();
    turnLeft();
    move();
    turnRight();
    move();
    paint("red");
    turnLeft();
    turnLeft();

    //Paints second flower blue starting from top of red flower
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    paint("green");
    move();
    move();
    move();
    paint("green");
    turnLeft();
    move();
    paint("green");
    move();
    paint("blue");
    move();
    paint("yellow");
    turnLeft();
    move();
    paint("blue");
    turnLeft();
    turnLeft();
    move();
    move();
    paint("blue");
    turnLeft();
    turnLeft();
    move();
    turnRight();
    move();
    paint("blue");
    turnLeft();
    turnLeft();

    //Paints third flower pink starting from top of blue flower
    move();
    move();
    move();
    move();
    turnLeft();
    move();
    move();
    move();
    paint("green");
    move();
    paint("green");
    move();
    paint("green");
    turnLeft();
    turnLeft();
    move();
    turnRight();
    move();
    paint("green");
    move();
    paint("green");
    move();
    paint("pink");
    move();
    paint("yellow");
    turnLeft();
    move();
    paint("pink");
    turnLeft();
    turnLeft();
    move();
    move();
    paint("pink");
    turnLeft();
    turnLeft();
    move();
    turnRight();
    move();
    paint("pink");
  
  }

}