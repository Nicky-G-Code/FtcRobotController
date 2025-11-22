package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
@Disabled
public class GamepadPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double speedForward = gamepad1.left_stick_y/2.0;
        double diffXJoysticks = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sumTriggers = gamepad1.left_trigger + gamepad1.right_trigger;

        telemetry.addData("Left x",gamepad1.left_stick_x);
        telemetry.addData("Left y",speedForward);
        telemetry.addData("Right x",gamepad1.right_stick_x);
        telemetry.addData("Right y",gamepad1.right_stick_y);
        telemetry.addData("difference in x",diffXJoysticks);

        telemetry.addData("a button",gamepad1.a);
        telemetry.addData("b button",gamepad1.b);

        telemetry.addData("sum of triggers", sumTriggers);


    }
}
