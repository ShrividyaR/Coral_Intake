package frc.robot.subsystems.arm;

public class ArmPlacebo implements ArmIO {

    @Override
    public double getEncoderSpeed(){
        return 0;
    }

    @Override
    public double getEncoderPosition(){
        return 0;
    }

    @Override
    public double getSpeed(){
        return 0;
    }

    @Override
    public void periodicUpdate(){

    }

    @Override
    public void setSpeed(double speed){
        
    }

    @Override
    public void setPosition(double position){
       
    }
    
}
