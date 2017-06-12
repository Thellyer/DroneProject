import java.io.IOException;

/**
 * Created by vladimir on 12.06.17.
 */
public class BashCommand {
    String[] cmd = new String[]{"/bin/sh", "path/to/script.sh"};
    Process p;


    public void drone(){
        try {
            p = new ProcessBuilder("curl", "localhost:7777/drone-api/drone").start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void takeOff(){
        try {
            p = new ProcessBuilder("curl", "localhost:7777/drone-api/drone/takeOff").start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void land(){
        try {
            p = new ProcessBuilder("curl", "localhost:7777/drone-api/drone/land").start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void up(){
        try {
            p = new ProcessBuilder("curl", "localhost:7777/drone-api/drone/up").start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void down(){
        try {
            p = new ProcessBuilder("curl", "localhost:7777/drone-api/drone/down").start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void forward(){
        try {
            p = new ProcessBuilder("curl", "localhost:7777/drone-api/drone/forward").start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void backward(){
        try {
            p = new ProcessBuilder("curl", "localhost:7777/drone-api/drone/backward").start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void right(){
        try {
            p = new ProcessBuilder("curl", "localhost:7777/drone-api/drone/right").start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void left(){
        try {
            p = new ProcessBuilder("curl", "localhost:7777/drone-api/drone/left").start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void tiltRight(){
        try {
            p = new ProcessBuilder("curl", "localhost:7777/drone-api/drone/tiltRight").start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void tiltLeft(){
        try {
            p = new ProcessBuilder("curl", "localhost:7777/drone-api/drone/tiltLeft").start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void turnRight(){
        try {
            p = new ProcessBuilder("curl", "localhost:7777/drone-api/drone/turnRight").start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void turnLeft(){
        try {
            p = new ProcessBuilder("curl", "localhost:7777/drone-api/drone/turnLeft").start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void emergency(){
        try {
            p = new ProcessBuilder("curl", "localhost:7777/drone-api/drone/emergency").start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
