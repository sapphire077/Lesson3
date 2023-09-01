package Task3_2_6;

public interface RobotConnection extends AutoCloseable, RobotConnectionManager {
    RobotConnection moveRobotTo(int x, int y);
    @Override
    void close();
}
