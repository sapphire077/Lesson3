package Task3_1_5;

public class Task3_1_5 {
    public static void main(String[] args) {
        try {
            textExp();
        } catch (MyNewException e) {
            System.out.println("сработал блок catch");
            e.printStackTrace();
        }
    }
public static void textExp() throws MyNewException {

        throw new MyNewException();

    }
}



