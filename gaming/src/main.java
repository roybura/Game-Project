/**
 * Created by HP on 26/10/2559.
 */
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class main {

    private static int state;
    private static int state2;
    private static int state3;
    private static int state4;
    private static int state5;

    public static int getState(){
        return state;
    }
    public static int getState2(){return state2;}
    public static int getState3(){
        return state3;
    }
    public static int getState4(){return state4;}
    public static int getState5(){return state5;}

    public static void nextState(){
        state++;
    }
    public static void nextState2(){
        state2++;
    }
    public static void nextState3(){
        state3++;
    }
    public static void nextState4(){
        state4++;
    }
    public static void nextState5(){
        state5++;
    }

    public static void main(String[] args) throws IOException, InterruptedException {


        Background frame = new Background();
        frame.setVisible(true);
        state = -1;
        state2 = 0;
        state3 = 0;
        state4 = 0;
        state5 = 0;

        int time = 100;

        Items1 i0 = new Items1(); //startpush
        Items1 i1 = new Items1(); //messeges
        Items2 i2 = new Items2(); //familypic
        //Items3 i3 = new Items3(); //noteLnlivingroom
        Items5 i4 = new Items5(); //clock
        //Items1 i5 = new Items1(); //bottle
        //Items4 i6 = new Items4(); //blood

        i0.setxy(380,260);
        i0.ItemCall0(frame.layeredPane);

        while(state == -1 ){
            TimeUnit.SECONDS.sleep(1);
        }

        i0.removeItem(frame.layeredPane, i0.botton0);
        frame.nextStage();

        state = 0;

        i1.setxy(580,330);
        i1.ItemCall1(frame.layeredPane);

        i2.setxy(300,0);
        i2.ItemCall2(frame.layeredPane);

        i4.setxy(130,10);
        i4.ItemCall4(frame.layeredPane);

        while(state == 0 && time > 0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state : " + state);
        }

        state = 1;

        Items3 i3 = new Items3(); //noteLnlivingroom
        i3.setxy(0,0);
        i3.ItemCall3(frame.layeredPane);

        while(state == 1 && time > 0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state : " + state);
        }

        state = 2;

        i3.removeItem(frame.layeredPane,i3.botton3);
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

        i1.removeItem(frame.layeredPane, i1.botton1);
        i2.removeItem(frame.layeredPane, i2.botton2);
        i4.removeItem(frame.layeredPane, i4.botton4);

        frame.nextStage1();

        Items1 i5 = new Items1(); //bottle
        i5.setxy(400,360);
        i5.ItemCall5(frame.layeredPane);

        Items3 i7 = new Items3(); //note2
        i7.setxy(360,430);
        i7.ItemCall7(frame.layeredPane);

        Items5 i8 = new Items5(); //books
        i8.setxy(245,390);
        i8.ItemCall8(frame.layeredPane);

        while(state == 4 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state : " + state);
        }

        state2 = 1;
        //show blood
        Items4 i6 = new Items4();
        i6.setxy(410,375);
        i6.ItemCall6(frame.layeredPane);

        while(state2 == 1 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state2 : " + state2);
        }

        state2 = 2 ;

        Items1 i9 = new Items1();
        i9.setxy(0,0);
        i9.ItemCall9(frame.layeredPane);

        while(state2 == 2 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state2 : " + state2);
        }

        state2 = 3;
        //letter disapear
        i9.removeItem(frame.layeredPane, i9.botton9);
        frame.layeredPane.setVisible(false);
        frame.layeredPane.setVisible(true);

        while(state2 == 3 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state2 : " + state2);
        }

        state2 = 4;
        //show ghost
        Items4 i10 = new Items4();
        i10.setxy(710,170);
        i10.ItemCall10(frame.layeredPane);

        while(state2 == 4 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state2 : " + state2);
        }

        //push book
        state2 = 5;

        i5.removeItem(frame.layeredPane, i5.botton5);
        i6.removeItem(frame.layeredPane, i6.botton6);
        i7.removeItem(frame.layeredPane, i7.botton7);
        i8.removeItem(frame.layeredPane, i8.botton8);
        i10.removeItem(frame.layeredPane, i10.botton10);

        frame.nextStage2(); //son's room


        //implement
        //robot
        Items1 i11 = new Items1();
        i11.setxy(570,300);
        i11.ItemCall11(frame.layeredPane);
        //car
        Items3 i12 = new Items3();
        i12.setxy(400,400);
        i12.ItemCall12(frame.layeredPane);

        while(state3 == 0 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state3 : " + state3);
        }

        state3 = 1 ;
        i11.ChangePicState4(frame.layeredPane);TimeUnit.SECONDS.sleep(1);

        while(state3 == 1 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state3 : " + state3);
        }

        state3 = 2;
        //show blood
        Items5 i13 = new Items5();
        i13.setxy(400,400);
        i13.ItemCall13(frame.layeredPane);

        while(state3 == 2 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state3 : " + state3);
        }

        state3 = 3;

        //cracked window
        Items4 i14 = new Items4();
        i14.setxy(0,0);
        i14.ItemCall14(frame.layeredPane);

        while(state3 == 3 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state3 : " + state3);
        }

        state3 = 4;

        i11.removeItem(frame.layeredPane, i11.botton11);
        i12.removeItem(frame.layeredPane, i12.botton12);
        i13.removeItem(frame.layeredPane, i13.botton13);
        i14.removeItem(frame.layeredPane, i14.botton14);

        frame.nextStage3();
        //show calender
        Items2 i15 = new Items2();
        i15.setxy(190,140);
        i15.ItemCall15(frame.layeredPane);

        //show chair
        Items6 i16 = new Items6();
        i16.setxy(620,360);
        i16.ItemCall16(frame.layeredPane);

        //showmirrorbase
        Items5 i18 = new Items5();
        i18.setxy(282,135);
        i18.ItemCall18(frame.layeredPane);

        while(state4 == 0 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state4 : " + state4);
        }

        state4 = 1;

        //show doll
        Items1 i17 = new Items1();
        i17.setxy(420,0);
        i17.ItemCall17(frame.layeredPane);

        while(state4 == 1 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state4 : " + state4);
        }

        state4 = 2 ;
        //switch
        i16.ChangePicState5(frame.layeredPane);TimeUnit.SECONDS.sleep(1);

        //show mirror
        Items1 i19 = new Items1();
        i19.setxy(300,147);
        i19.ItemCall19(frame.layeredPane);

        while(state4 == 2 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state4 : " + state4);
        }

        state4 = 3 ;

        //delete doll
        i17.removeItem(frame.layeredPane, i17.botton17);
        //show ghost
        Items3 i20 = new Items3();
        i20.setxy(420,0);
        i20.ItemCall20(frame.layeredPane);

        while(state4 == 3 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state4 : " + state4);
        }

        state4 = 4;
        i15.removeItem(frame.layeredPane, i15.botton15);
        i16.removeItem(frame.layeredPane, i16.botton16);
        i17.removeItem(frame.layeredPane, i17.botton17);
        i18.removeItem(frame.layeredPane, i18.botton18);
        i19.removeItem(frame.layeredPane, i19.botton19);
        i20.removeItem(frame.layeredPane, i20.botton20);

        frame.nextStage4();

        while(state5 == 0 && time>0){
            TimeUnit.SECONDS.sleep(1);
            time--;
            System.out.println("time : " + time);
            System.out.println("state4 : " + state4);
        }

        state5 = 1;


    }

}
