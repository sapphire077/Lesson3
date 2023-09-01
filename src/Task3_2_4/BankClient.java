package Task3_2_4;

public class BankClient extends BankSotrydnik{
    String name;
    int age;

    boolean problemWithLaw;
    boolean creditHistory;

    public BankClient(String name, int age, boolean problemWithLaw, boolean creditHistory) {
        this.name = name;
        this.age = age;

        this.problemWithLaw = problemWithLaw;
        this.creditHistory = creditHistory;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public boolean isProblemWithLaw() {
        return problemWithLaw;
    }

    public void setProblemWithLaw(boolean problemWithLaw) {
        this.problemWithLaw = problemWithLaw;
    }

    public boolean isCreditHistory() {
        return creditHistory;
    }

    public void setCreditHistory(boolean creditHistory) {
        this.creditHistory = creditHistory;
    }
}
