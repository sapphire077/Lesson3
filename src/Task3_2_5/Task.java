package Task3_2_5;

public   class Task {

    public static class Car implements AutoCloseable {
        String name;
        public Car(String name) {
            this.name = name;
        }
        @Override
        public void close() throws Exception {
            System.out.println("машина закрывается");
        }
        public static void main(String[] args) throws Exception {
            try (Car car = new Car("Mazda")) {
                drive();
            }
        }
        private static void drive() {
            System.out.println("машина поехала");
        }

    }
}
