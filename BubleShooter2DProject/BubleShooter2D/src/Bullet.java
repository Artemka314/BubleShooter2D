import java.awt.*;

public class Bullet {
    //Field
    private double x;
    private double y;
    private double bulletDX;
    private double bulletDY;
    private double distX;
    private double distY;
    private double dist;
    private int r;

    private double speed;
    private Color color;

    //Constructor
    public Bullet(){
        x = GamePanel.player.getX();
        y = GamePanel.player.getY();
        r = 2;
        speed = 10;

        distX = GamePanel.mouseX - x;
        distY = GamePanel.mouseY - y;
        dist = Math.sqrt(distX * distX + distY * distY);

        bulletDX = (distX / dist) * speed;
        bulletDY = (distY / dist) * speed;


        color = Color.WHITE;
    }

    //Function
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public int getR(){
        return r;
    }
    public boolean remove(){
        if(y < 0 && y > GamePanel.HEIGHT && x < 0 && x > GamePanel.WIDTH){
            return true;
        }
        return false;
    }
    public void  update(){
        y += bulletDY;
        x += bulletDX;

        //y += distY;
        //x += distX;

    }
    public void draw(Graphics2D g){
        g.setColor(color);
        g.fillOval((int)x,(int)y,r,2 * r);
    }
}
