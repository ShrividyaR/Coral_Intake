package frc.robot.subsystems.arm;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {
    public ArmIO armIO;

    public Arm(ArmIO) {
    private ArmIO armIO;
    }

    public double getEncoderPosition() {
        armIO.getEncoderPosition();
    }

    public double getEncoderSpeed() {
        armIO.getEncoderSpeed();
    }

    public double getSpeed() {
        armIO.getSpeed();
    }

    public double setSpeed(speed) {
        armIO.setSpeed(speed);
    }

    public double getArmCurrent() {
        return armIO.getArmCurrent();
    }

    public void setPosition(double position) {
        armEncoder.setPosition(position);
    }

    @Override
    public void periodic() {
        armIO.periodicUpdate();
    }

    @Override
    public void simulationPeriodic() {

    }
}
