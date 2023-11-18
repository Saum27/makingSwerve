package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constants.DriveConstants;
import frc.robot.libraries.MAXSwerveModule;
import frc.robot.libraries.Pigeon1038;

public class DriveTrain extends SubsystemBase {
    private static DriveTrain instance;

    private final MAXSwerveModule frontRight = new MAXSwerveModule(
            DriveConstants.kFrontRightDriveCanID,
            DriveConstants.kFrontRightSteerCanID,
            DriveConstants.kFrontRightChassisAngularOffset);

    private final MAXSwerveModule frontLeft = new MAXSwerveModule(
            DriveConstants.kFrontLeftDriveCanID,
            DriveConstants.kFrontLeftSteerCanID,
            DriveConstants.kFrontLeftChassisAngularOffset);

    private final MAXSwerveModule backRight = new MAXSwerveModule(
            DriveConstants.kBackRightDriveCanID,
            DriveConstants.kBackRightSteerCanID,
            DriveConstants.kBackRightChassisAngularOffset);

    private final MAXSwerveModule backLeft = new MAXSwerveModule(
            DriveConstants.kBackLeftDriveCanID,
            DriveConstants.kBackLeftSteerCanID,
            DriveConstants.kBackLeftChassisAngularOffset);

    private final Pigeon1038 gyro = new Pigeon1038(DriveConstants.kPigeonCanID);

    private DriveTrain() {

    }

    public static DriveTrain getInstance() {
        if (instance == null) {
            instance = new DriveTrain();
        }
        return instance;
    }
}
