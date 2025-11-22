package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
@Disabled
public class IfPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        /*boolean aButton = gamepad1.a; // press TRUE, depress FALSE
        //true or false
        if (aButton){
            telemetry.addData("A Button", "Pressed");
        }
            else{
                telemetry.addData("A Button", "Not Pressed");
            }
        telemetry.addData("A Button State", aButton);*/

        double leftY = gamepad1.right_stick_y;

            if(leftY < 0){
                telemetry.addData("Left Stick", "is Negative");
            } else if (leftY > 0) {
                telemetry.addData("Left Stick", "Is Positive");
            }else {
                telemetry.addData("Left Stick", "Is Zero");
            }
            telemetry.addData("Left Stick Value", leftY);
    }
}
