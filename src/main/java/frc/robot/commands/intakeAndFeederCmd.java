package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.feeder;
import frc.robot.subsystems.intake;

public class intakeAndFeederCmd extends Command {
  intake mIntake;
  double mIntakeSpeed;
  feeder mFeeder;
  double mFeederSpeed;

  public intakeAndFeederCmd(intake intake, double intakeSpeed, feeder feeder, double feederSpeed) {
    this.mIntake = intake;
    this.mIntakeSpeed = intakeSpeed;
    this.mFeeder = feeder;
    this.mIntakeSpeed = feederSpeed;
    addRequirements(mIntake, mFeeder);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    if (mIntake.getSensorValue()) {
      mIntake.setIntake(0);
    } else {
      mIntake.setIntake(mIntakeSpeed);
    }

    if (mFeeder.getSensorValue()) {
      mFeeder.setFeeder(0);
    } else {
      mFeeder.setFeeder(mFeederSpeed);
    }
  }

  @Override
  public void end(boolean interrupted) {
    mIntake.setIntake(0);
    mFeeder.setFeeder(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
