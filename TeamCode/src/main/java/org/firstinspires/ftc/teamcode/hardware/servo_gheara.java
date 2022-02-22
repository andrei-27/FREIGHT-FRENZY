package org.firstinspires.ftc.teamcode.hardware;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class servo_gheara {
    public Servo servo = null;

    public static double POS_SUS = 0.8;
    public static double POS_JOS = 0.3;

    public servo_gheara(HardwareMap hwMap) {
        servo = hwMap.get(Servo.class, "servoGheara");
        jos();
    }

    public void setServoPositions(double pos1) {
        if(pos1 > -1.0) {
            servo.setPosition(pos1);
        }
    }

    public void sus() { setServoPositions(POS_SUS);}
    public void jos() { setServoPositions(POS_JOS);}

}