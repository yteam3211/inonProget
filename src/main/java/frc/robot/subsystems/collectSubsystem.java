// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

import frc.util.SuperSystem;
import frc.robot.Constants;


// Yteam Example Subsystem
public class collectSubsystem extends SuperSystem {
  private VictorSP colectMotor = new VictorSP(Constants.PWM_COLLECT_MOTOR);
  


  public collectSubsystem() {
    super("colectSubsystem");
  }

  /** Creates a new ExampleSubsystem. */
  

public void setOutput(double output) {
    
  colectMotor.set(output);
}

}