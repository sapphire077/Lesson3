package Task3_2_6;

import java.io.IOException;

public class Robot extends RobotConnectionException implements RobotConnection,RobotConnectionManager {

    public Robot(String message) {
        super(message);
    }
    public Robot(String message, Throwable cause) {
        super(message, cause);
    }
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int x, int y) {
        for (int i=0; i<3; i++) {
            RobotConnection connection = null;
            try {
                connection = robotConnectionManager.getConnection();
                connection.moveRobotTo(x,y);
                i = 3;


            } catch (RobotConnectionException e) {
                if (i == 2) {
                    throw new RobotConnectionException("ERROR", e);
                }
            } catch (Exception e) {
                throw e;
            }finally {
                if (connection != null) {
                    try {
                    connection.close();
                                }catch(Exception e){
                }
            }

        }

        }

    }
    @Override
    public RobotConnection moveRobotTo(int x, int y) {

        System.out.println("Робот переместился в точку х: "+ x +" и точку у: "+ y );
return null;

    }

    @Override
    public void close() {
        System.out.println("ресурс закрыт");
    }

    @Override
    public RobotConnection getConnection() {
        System.out.println("получено соединение с  роботом");

        return moveRobotTo(10,22);
    }
    public static void main(String[] args) {
Robot robot=new Robot("fff");
moveRobot(robot.getConnection(), 10,22);
}




}

