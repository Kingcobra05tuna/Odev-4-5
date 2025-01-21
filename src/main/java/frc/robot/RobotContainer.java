package frc.robot;

import frc.robot.commands.intakeAndFeederCmd;
import frc.robot.subsystems.feeder;
import frc.robot.subsystems.intake;
import edu.wpi.first.wpilibj.PS5Controller;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {
  // Robot's subsystems and commands:
  private final PS5Controller ps5Controller = new PS5Controller(0);
  intake intake = new intake();
  feeder feeder = new feeder();

  public RobotContainer() {
    configureBindings();
  }

private void configureBindings() {
    new JoystickButton(ps5Controller, 1).whileTrue(new intakeAndFeederCmd(intake, 1, feeder, 0.7));
    new JoystickButton(ps5Controller, 2).whileTrue(new intakeAndFeederCmd(intake, -1, feeder, -0.7));
  }
}