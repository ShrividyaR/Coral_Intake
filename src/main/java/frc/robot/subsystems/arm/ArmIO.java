package frc.robot.subsystems.arm;

public interface ArmIO {
    public double getEncoderSpeed();

    public double getEncoderPosition();

    public double getSpeed();

    public void periodicUpdate();

    public void setSpeed(double speed);

    public void setPosition(double position);
}
