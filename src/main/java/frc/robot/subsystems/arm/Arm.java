package frc.robot.subsystems.arm;

import edu.wpi.first.math.controller.ProfiledPIDController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {
    public ArmIO armIO;

    public Arm(ArmIO io) {
        armIO = io;
    }

    public double getEncoderPosition() {
       return armIO.getEncoderPosition();
    }

    public double getEncoderSpeed() {
        return armIO.getEncoderSpeed();
    }

    public double getSpeed() {
        return armIO.getSpeed();
    }

    public void setSpeed(double speed) {
        armIO.setSpeed(speed);
    }

    public void setPosition(double position) {
        armIO.setPosition(position);
    }

    @Override
    public void periodic() {
        armIO.periodicUpdate();
    }

    @Override
    public void simulationPeriodic() {

    }
}
