import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

  skyPainter mo = new skyPainter();
    mo.setPaint(255);
    mo.paintSky();
    
  framePainter ken = new framePainter();
    ken.setPaint(64);
    ken.paintFrame();

  flowersPainter bobby = new flowersPainter();
    bobby.setPaint(54);
    bobby.paintFlowers();

  sunPainter dim = new sunPainter();
    dim.setPaint(16);
    dim.paintSun();

  cloudPainter alex = new cloudPainter();
    alex.setPaint(16);
    alex.paintCloud();

  }
}