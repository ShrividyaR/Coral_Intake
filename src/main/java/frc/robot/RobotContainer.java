// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.arm.Arm;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.ConditionalCommand;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  // Replace with CommandPS4Controller or CommandJoystick if needed
  private final CommandXboxController m_driverController =
      new CommandXboxController(OperatorConstants.kDriverControllerPort);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    public static Command makeSetPositionCommand(Arm arm,
                        double target) {
                return new SequentialCommandGroup(
                                new ConditionalCommand(new InstantCommand(() -> {
                                }), new InstantCommand(() -> arm.enable(), arm), () -> arm.isEnabled()),
                                new RunCommand(() -> arm.setGoal(target), arm));
        }

        private Command makeSetPositionCommandVision(Arm arm) {
                DoubleSupplier target = () -> (arm.getDesiredArmAngle(robotDrive.robotPose,
                                robotDrive.getSpeakerPose()));
                return new SequentialCommandGroup(
                                new ConditionalCommand(new InstantCommand(() -> {
                                }), new InstantCommand(() -> arm.enable(), arm), () -> arm.isEnabled()),
                                new RunCommand(() -> arm.setGoal(target.getAsDouble()), arm));
        }

        public static Command makeSetPositionCommandAuton(Arm arm,
                        double target) {
                return new SequentialCommandGroup(
                                new ConditionalCommand(new InstantCommand(() -> {
                                }), new InstantCommand(() -> arm.enable(), arm), () -> arm.isEnabled()),
                                new InstantCommand(() -> arm.setGoal(target), arm),
                                new WaitCommand(0.5));
        }

        private Command makeSetSpeedGravityCompensationCommand(Arm a, double speed) {
                return new SequentialCommandGroup(
                                new InstantCommand(() -> a.disable(), a),
                                new RunCommand(() -> a.setSpeedGravityCompensation(speed), a));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return Autos.exampleAuto(m_exampleSubsystem);
  }
}
