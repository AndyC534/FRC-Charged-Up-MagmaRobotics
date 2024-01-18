package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Test;


public class testMotorsForward extends Command {


    /**
     * an instance of {@link frc.robot.subsystems.Test}
     */
    private final Test testMotor1;
    private final Test testMotor2;

    /**
     * @param testMotor1 an instance of {@link frc.robot.subsystems.Test}
     */
    public testMotorsForward(Test testMotor1, Test testMotor2) {
        this.testMotor1 = testMotor1;
        this.testMotor2 = testMotor2;
        addRequirements(testMotor1);
        addRequirements(testMotor2);
    }


    @Override
    public void initialize() {
    }


    /**
     * method that's being executed
     */
    @Override
    public void execute() {
        this.testMotor1.testMotor1Backward();
        this.testMotor2.testMotor2Forward();
    }


    @Override
    public void end(boolean interrupted) {
    }


    @Override
    public boolean isFinished() {
        return false;
    }


}