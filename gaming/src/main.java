/**
 * Created by HP on 26/10/2559.
 */
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class main {

    private static int state;

    public static int getState(){
        return state;
    }

    public static void nextState(){
        state++;
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        Background frame = new Background();
        frame.setVisible(true);
        state = -1;
        int time = 100;

        Items1 i0 = new Items1(); //startpush
        Items1 i1 = new Items1(); //messeges
        Items2 i2 = new Items2(); //familypic
        Items1 i3 = new Items1(); //clock

        i0.setxy(380,260);
        i0.ItemCall(frame.layeredPane);

        while(state == -1 ){
            TimeUnit.SECONDS.sleep(1);
        }

        i0.removeItem(frame.layeredPane, i0.botton);
        frame.nextStage();

        state = 0;

        i1.setxy(580,330);
        i1.ItemCall3(frame.layeredPane);

        i2.setxy(300,0);
        i2.ItemCall(frame.layeredPane);

        i3.setxy(130,10);
        i3.ItemCall2(frame.layeredPane);

        while(state == 0 && time > 0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state : " + state);
        }

        state = 1;

        Items3 i4 = new Items3(); //noteLnlivingroom
        i4.setxy(0,0);
        i4.ItemCall(frame.layeredPane);

        while(state == 1 && time > 0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state : " + state);
        }

        state = 2;
        i4.removeItem(frame.layeredPane,i4.botton);
        frame.layeredPane.setVisible(false);
        frame.layeredPane.setVisible(true);

        while(state == 2 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state : " + state);
        }

        state = 3;

        i2.ChangePicState2(frame.layeredPane);
        TimeUnit.SECONDS.sleep(1);
        i2.ChangePicState3(frame.layeredPane);
        TimeUnit.SECONDS.sleep(2);

        while(state == 3 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state : " + state);
        }

        state = 4;
        i1.removeItem(frame.layeredPane, i1.botton3);
        i2.removeItem(frame.layeredPane, i2.botton);
        i3.removeItem(frame.layeredPane, i3.botton2);

        frame.nextStage1();

        while(state == 4 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state : " + state);
        }

    }

}
