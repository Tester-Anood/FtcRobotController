package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Tele")
public class Tele extends LinearOpMode {

    private DcMotor Moter1;

    /**
     * This sample contains the bare minimum Blocks for any regular OpMode. The 3 blue
     * Comment Blocks show where to place Initialization code (runs once, after touching the
     * DS INIT button, and before touching the DS Start arrow), Run code (runs once, after
     * touching Start), and Loop code (runs repeatedly while the OpMode is active, namely not
     * Stopped).
     */
    @Override
    public void runOpMode() {
        Moter1 = hardwareMap.get(DcMotor.class, "Moter1");

        // Put initialization blocks here.
        Moter1.setDirection(DcMotor.Direction.FORWARD);
        Moter1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        Moter1.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        Moter1.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        waitForStart();
        if (opModeIsActive()) {
            // Put run blocks here.
            while (opModeIsActive()) {
                // Put loop blocks here.
                Moter1.setPower(gamepad1.left_stick_y);
                telemetry.update();
            }
        }
    }
}