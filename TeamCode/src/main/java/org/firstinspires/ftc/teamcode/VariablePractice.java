package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
@Disabled
public class VariablePractice extends OpMode {

    @Override
    public void init() {
        int teamNumber = 9215;
        double motorSpeed = .75;
        boolean clawClosed = true;
        String name = "Nick Gudenkauf";
        int motorAngle = 90;

        telemetry.addData("Name",name);
        telemetry.addData("Team Number",teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Claw State", clawClosed);
        telemetry.addData("Motor Angle",motorAngle);
    }

    @Override
    public void loop() {

        /*
        1. change the String variable "name" to your team name.
        2.create an int called "motorAngle" and store an angle between 1-180. display this in your init method.
         */
    }
}
