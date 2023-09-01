package Task3_2_7;

import Task3_2_6.RobotConnection;
import Task3_2_6.RobotConnectionException;
import Task3_2_6.RobotConnectionManager;

public class Task1 {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int x, int y) {

        for (int i = 0; i < 3; i++) {
            try (RobotConnection connection = robotConnectionManager.getConnection()) {
                connection.moveRobotTo(x, y);
                i = 3;
            } catch (RobotConnectionException e) {
                if (i == 2) throw e;
            }
        }
    }
    }


