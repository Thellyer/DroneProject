/**
 * Created by Raymond on 29.05.2017.
 */

import com.leapmotion.leap.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

import static com.leapmotion.leap.Bone.Type.TYPE_DISTAL;
import static com.leapmotion.leap.Bone.*;
import static com.leapmotion.leap.Finger.Type.TYPE_INDEX;
import static com.leapmotion.leap.Finger.Type.TYPE_THUMB;


public class GetStarted {
    public GetStarted(){
        SampleListener sampleListener = new SampleListener();
        Controller controller = new Controller();
        controller.addListener(sampleListener);

        System.out.println("Press Enter to quit...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        controller.removeListener(sampleListener);

    }

}


class SampleListener extends Listener {

    float error = 0.05F;
    BashCommand bashCommand = new BashCommand();

    public void onConnect(Controller controller) {
        System.out.println("Connected");
    }

    public void onFrame(Controller controller) {
        //System.out.println("Frame available");
        Frame frame = controller.frame();
        HandList hands = frame.hands();
        Hand hand = hands.get(0);
        FingerList fingers = hand.fingers();

        System.out.println(hand.translation(controller.frame(1)));
        if(hand.translation(controller.frame(1)).getX() + error < 0)
            System.out.println("going LEFT");
        else if(hand.translation(controller.frame(1)).getX() - error > 0)
                System.out.println("going RIGHT");
            else System.out.println("stay");


        if(hand.translation(controller.frame(1)).getY() + error < 0)
        {
            System.out.println("going DOWN");
            bashCommand.land();
        }

        else if(hand.translation(controller.frame(1)).getY() - error  > 0)
        {
            System.out.println("going UP");
            bashCommand.takeOff();
        }

        else System.out.println("stay");



        if(hand.translation(controller.frame(1)).getZ() + error < 0)
            System.out.println("going FORWARD");
        else if(hand.translation(controller.frame(1)).getZ() - error  > 0)
            System.out.println("going BACKWARD");
        else System.out.println("stay");






        try{TimeUnit.MILLISECONDS.sleep(500);}
        catch(Exception e){System.out.println("Cant sleep");}


    }
}