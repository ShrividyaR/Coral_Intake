package frc.robot.subsystems.arm;

public interface ArmIO {
    public void getEncoderSpeed();

    public void getEncoderPosition();

    public void getSpeed();

    public void periodicUpdate();

    public void setSpeed(double speed);

    public void setPosition(position);
}
