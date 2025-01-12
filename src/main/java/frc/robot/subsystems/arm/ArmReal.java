package frc.robot.subsystems.arm;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ArmReal implements ArmIO {

    private static SparkMax armMotorController;
    public static RelativeEncoder armEncoder;
    
    armMotorControllerRight = MotorUtil.createSparkMAX(ArmConstants.ARM_MOTOR_ID_RIGHT, MotorType.kBrushless,
                Constants.NEO_CURRENT_LIMIT,
                true, true, 0);

    armMotorControllerLeft = MotorUtil.createSparkMAX(ArmConstants.ARM_MOTOR_ID_RIGHT, MotorType.kBrushless,
                Constants.NEO_CURRENT_LIMIT,
                true, true, 0);

    public double getEncoderPosition() {
        armEncoder.getEncoderPosition();
    }

    public double getEncoderSpeed() {
       armEncoder.getEncoderSpeed();
    }

    public double getSpeed() {
        armEncoder.getSpeed();
    }

    public double setSpeed(speed) {
        armMotorController.setSpeed(speed);
    }

    public double getArmCurrent() {
        armMotorController.getArmCurrent();
    }

    public void setPosition(double position) {
        armEncoder.setPosition(position);
    }

    public void periodicUpdate() {
    
    }
    
}
