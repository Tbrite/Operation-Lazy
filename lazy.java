import java.awt.Robot;
import java.awt.*;
public class lazy{
  public static void main(String[] args){
    try {
      Robot robot = new Robot();
      robot.mouseMove(0, 500);
    } catch (Exception e) {
    }
    PointerInfo mouse = MouseInfo.getPointerInfo();
    Point mousePos = mouse.getLocation();
    int trueY = (int) mousePos.getY();
    int Y = trueY;
    long time1 = System.currentTimeMillis();
    long time2 = System.currentTimeMillis();
    int count = 0;
    while(Y==trueY){
      time2 = System.currentTimeMillis();
      if(time2-time1>300){
        count=count+10;
        count = count%1000;
        time1 = System.currentTimeMillis();
        try{
          Robot robot = new Robot();
          robot.mouseMove(count, trueY);
        }catch (Exception e) {

        }
        }
        mouse = MouseInfo.getPointerInfo();
        mousePos = mouse.getLocation();
        Y = (int) mousePos.getY();
      }
    }

  }
