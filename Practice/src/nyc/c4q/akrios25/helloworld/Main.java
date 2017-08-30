package nyc.c4q.akrios25.helloworld;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {
    public class Patron{
       String name;
       BankAccount account;
       int pocket;

       Patron(String name, int dollars) {
           this.name = name;
           this.pocket = dollars;
       }
       public void depositFromPocket(int dollars) {
           pocket -= dollars;
           account.deposit(dollars);
       }
        static public class BankAccount {
            int balance = 0;
            public void deposit(int dollars) {
                balance += dollars;
            }
        }
        public void deposit(int dollars){
           balance += dollars;
        }
        public void withdraw(int dollars) {
           if (balance < dollars) {
               System.out.println("you broke");
               return;
           }
        }

    }

    public static void main(String[] args) {

      Patron joe = new Patron("joe", 100);

    }
    void withdrawFromBankAccount(int dollars) {
        account.withdraw(dollars);

    }
}
