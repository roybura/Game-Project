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
        state = 0;
        Items i1 = new Items();
        TimeUnit.SECONDS.sleep(2);
        i1.Item1(frame.layeredPane);
        int time = 100;
        while(state == 0 && time > 0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state : " + state);
        }
        if(time > 0) {
            state = 1;
            i1.removeItem(frame.layeredPane, i1.botton);
            frame.nextStage();
        }
        while(state ==1 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state : " + state);
        }
    }
}
