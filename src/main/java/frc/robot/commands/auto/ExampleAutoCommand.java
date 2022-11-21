package frc.robot.commands.auto;

import frc.robot.commands.ExampleCommand;
import frc.util.SuperNavX;
import frc.util.PID.Gains;
import frc.util.pathGenerator.commandAuto.AutoGenerator;

public class ExampleAutoCommand extends AutoGenerator{

    public ExampleAutoCommand(DriveSystem driveSystem, SuperNavX navX) {
        super("ExampleAutoCommand", driveSystem.getAutoGains(), driveSystem, navX, 0);
        addCommands(new ExampleCommand(driveSystem));
}
    
}
