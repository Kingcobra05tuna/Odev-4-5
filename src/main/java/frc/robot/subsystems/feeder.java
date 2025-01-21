package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class feeder extends SubsystemBase {
  Talon feederTalon = new Talon(2);
  DigitalInput sensor = new DigitalInput(4);

  public feeder() {}

  public void setFeeder(double speed) {
    feederTalon.set(speed);
  }

  public boolean getSensorValue() {
    return sensor.get();
  }

  @Override
  public void periodic() {
    // will be called once per scheduler run
  }
}