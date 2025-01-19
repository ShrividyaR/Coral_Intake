package frc.robot.subsystems.arm;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkBaseConfig;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Constants;
import frc.robot.Constants.MotorConstants;

public class ArmReal implements ArmIO {

    private static SparkMax armSparkMax;
    private static SparkMaxConfig sparkMaxConfigArm;
    public static RelativeEncoder armEncoder;
    
    //change!!
    public static final int ARM_SPARK_MAX_CAN_ID = 0;
    public static final boolean ARM_ENCODER_INVERTED = false;
    public static final IdleMode ARM_ENCODER_IDLE_MODE = ;
    public static final double ARM_POSITION_CONVERSION_FACTOR = 0;
    public static final double ARM_VELOCITY_CONVERSION_FACTOR = 0;

    public ArmReal() {

        armSparkMax = new SparkMax(ARM_SPARK_MAX_CAN_ID, MotorType.kBrushless);

        sparkMaxConfigArm = new SparkMaxConfig();

        sparkMaxConfigArm.inverted(ARM_ENCODER_INVERTED).idleMode(ARM_ENCODER_IDLE_MODE)
        .smartCurrentLimit(MotorConstants.NEO550_CURRENT_LIMIT);
        
        armEncoder = armSparkMax.getEncoder();

        sparkMaxConfigArm.encoder.positionConversionFactor(ARM_POSITION_CONVERSION_FACTOR).velocityConversionFactor(ARM_VELOCITY_CONVERSION_FACTOR);

        armSparkMax.configure(sparkMaxConfigArm, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    }

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
        armEncoder.setSpeed(speed);
    }

    public double getArmCurrent() {
        armEncoder.getArmCurrent();
    }

    public void setPosition(double position) {
        armEncoder.setPosition(position);
    }

    @Override
    public void periodicUpdate() {
    
    }
    
}
