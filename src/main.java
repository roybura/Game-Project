
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by oom on 11/30/2016 AD.
 */

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
        while(state == 0){
            TimeUnit.SECONDS.sleep(1);
        }
        TimeUnit.SECONDS.sleep(2);
        frame.nextStage();
        // Stage st = new Stage();
        //TimeUnit.SECONDS.sleep(2);
        //st.ChangeStage2();
        //TimeUnit.SECONDS.sleep(1);

        // Run the GUI construction on the event-dispatching thread for thread safety
/*        javax.swing.SwingUtilities.invokeLater( new Runnable() {
            @Override
            public void run() {
                try {
                    Stage st = new Stage();
                    st.Changing();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
*/
    }
}