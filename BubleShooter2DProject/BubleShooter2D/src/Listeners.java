import java.awt.event.*;


public class Listeners implements KeyListener, MouseListener, MouseMotionListener {

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_W){
            Player.up = true;
        }
        if(key == KeyEvent.VK_S){
            Player.down = true;
        }
        if(key == KeyEvent.VK_A){
            Player.left = true;
        }
        if(key == KeyEvent.VK_D){
            Player.right = true;
        }
        if(key == KeyEvent.VK_SPACE){
            Player.isFiring = true;
        }
        if(key == KeyEvent.VK_ESCAPE){
            GamePanel.state = GamePanel.STATES.MENUE;
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();
        if(key == KeyEvent.VK_W){
            Player.up = false;
        }
        if(key == KeyEvent.VK_S){
            Player.down = false;
        }
        if(key == KeyEvent.VK_A){
            Player.left = false;
        }
        if(key == KeyEvent.VK_D){
            Player.right = false;
        }
        if(key == KeyEvent.VK_SPACE){
            Player.isFiring = false;
        }

    }
    @Override
    public void keyTyped(KeyEvent e) {


    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }


    public void mousePressed(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1){
    GamePanel.player.isFiring = true;
    GamePanel.leftMouse = true;
        }

    }


    public void mouseReleased(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1) {
            GamePanel.player.isFiring = false;
            GamePanel.leftMouse = false;
        }

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    public void mouseDragged(MouseEvent e) {
        GamePanel.mouseX = e.getX();
        GamePanel.mouseY = e.getY();

    }


    public void mouseMoved(MouseEvent e) {
        GamePanel.mouseX = e.getX();
        GamePanel.mouseY = e.getY();

    }
}
