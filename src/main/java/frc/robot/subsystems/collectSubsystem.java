// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.ExampleCommand;
import frc.util.SuperSystem;
import frc.robot.Constants;


// Yteam Example Subsystem
public class collectSubsystem extends SuperSystem {
  private VictorSP colectMotor = new VictorSP(Constants.PWM_COLLECT_MOTOR);
  


  public collectSubsystem(collectSubsystem colectSubsystem) {
    super("colectSubsystem");
  }

  /** Creates a new ExampleSubsystem. */
  

public void setOutput(double output) {
    
  colectMotor.set(output);
}

}