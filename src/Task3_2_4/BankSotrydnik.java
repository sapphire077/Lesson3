package Task3_2_4;

public class BankSotrydnik  implements BankWoker{
    public static void main(String[] args) {
        BankClient client1=new BankClient("Vitya",20,true,true);
       client1.checkClientForCredit(client1);
      BankClient client2= new BankClient("Kostya",25,false,false);
      client2.checkClientForCredit(client2);
      BankClient client3=new BankClient("serega",15,false,true);
      client3.checkClientForCredit(client3);
      BankClient client4=new BankClient("Vasya",20,false,true);
      client4.checkClientForCredit(client4);
    }

    public  boolean checkClientForCredit(BankClient p) {
        try {

            if (p.age >= 20 && p.age <= 70) {
                if (p.creditHistory == true && p.age >= 20 && p.age <= 70 && p.problemWithLaw == false) {
                    System.out.print(p.name + " ");
                    getOdobrenie();
                } else if
                (p.creditHistory == false & p.problemWithLaw == false) {
                    System.out.println(p.name + " Вам отказанно в кредите в связи с плохой кредитной историей");
                    vKrediteOtkazano();
                } else if (p.problemWithLaw == true) {
                    System.out.println(p.name + " В кредите отказано");
                    vKrediteOtkazano();
                }
            } else System.out.println(p.name + " вам нет 20 лет");
        }catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }
   @Override
    public  boolean  getOdobrenie() {
        System.out.println(" Вам выдан кредит");
        return true;
    }

    @Override
    public  boolean vKrediteOtkazano() {
        return false;
    }
}
