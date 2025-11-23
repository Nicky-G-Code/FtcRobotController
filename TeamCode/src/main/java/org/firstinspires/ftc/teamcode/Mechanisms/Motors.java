package org.firstinspires.ftc.teamcode.Mechanisms;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Motors {
    private DcMotor LF;
    private double ticksPerRev;
    public void init(HardwareMap hwMap){
        LF = hwMap.get(DcMotor.class, "Left Front");
        LF.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev = LF.getMotorType().getTicksPerRev();
    }

    public void setMotorSpeed(double speed){
        LF.setPower(speed);
    }

    public double getMotorRevs(){
        return LF.getCurrentPosition()/ticksPerRev*2;
    }
}
