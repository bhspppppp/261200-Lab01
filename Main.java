import java.awt.*;

public class Main {
   public static void main(String[] args) {
       Turtle bh = new Turtle();
       bh.speed(0);

       // ลำต้นหลัก
       bh.penColor(Color.GREEN);
       bh.width(3);
       bh.up();
       bh.setPosition(0, -150);
       bh.setDirection(90);
       bh.down();
       bh.forward(150);

       // ใบไม้ 2 ใบ
       bh.width(2);
       bh.up();
       bh.setPosition(0, -80);
       bh.setDirection(130);
       bh.down();
       for (int i = 0; i < 30; i++) {
           bh.forward(3);
           bh.left(3);
       }

       bh.up();
       bh.setPosition(0, -50);
       bh.setDirection(50);
       bh.down();
       for (int i = 0; i < 30; i++) {
           bh.forward(3);
           bh.right(3);
       }

       // กิ่งซ้าย + ดอกฟ้า
       bh.penColor(Color.GREEN);
       bh.up();
       bh.setPosition(0, 0);
       bh.setDirection(120);
       bh.down();
       bh.forward(60);

       // วาดดอกที่ 1
       bh.penColor(Color.BLUE);
       bh.fillColor(Color.BLUE);
       for (int i = 0; i < 5; i++) {
           for (int j = 0; j < 20; j++) {
               bh.forward(2);
               bh.left(4);
           }
           bh.left(52);
       }
       bh.dot(Color.YELLOW, 6);

       // กิ่งขวา + ดอกชมพู
       bh.penColor(Color.GREEN);
       bh.up();
       bh.setPosition(0, 20);
       bh.setDirection(60);
       bh.down();
       bh.forward(60);

       // วาดดอกที่ 2
       bh.penColor(Color.MAGENTA);
       bh.fillColor(Color.MAGENTA);
       for (int i = 0; i < 5; i++) {
           for (int j = 0; j < 20; j++) {
               bh.forward(2);
               bh.left(4);
           }
           bh.left(52);
       }
       bh.dot(Color.YELLOW, 6);

       try { Thread.sleep(3000); } catch(Exception e) {}
       bh.hide();
   }
}
