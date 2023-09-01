package Task3_1_6;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        try {
            StackTraceElement[] elements = Thread.currentThread().getStackTrace();
            if (elements.length <= 3) {
                return null;
            } else return elements[3].getClassName() + "#" + elements[3].getMethodName();
        } catch (Exception e) {
            e.printStackTrace();
                    }
        return null;
    }
}

