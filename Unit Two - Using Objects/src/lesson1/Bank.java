package lesson1;

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Mobin",10549080.98, 000001);
        BankAccount account2 = new BankAccount("David",10924.24, 000002);

        //The state of the accounts :
        /*
         * account1;
         * accountholder = "Mobin"
         * accountballance = 10549080.98
         * accountnumber = 000001
         * 
         * account2;
         * accountholder = "David"
         * accountballance = 10924.24
         * accountnumber = 000002
         * 
         */

         account2.deposit(2500.50);

        /* account2;
         * accountholder = "David"
         * accountballance = 10924.24+2500.50
         * accountnumber = 000002
         * 
         */ 

         account1.withdraw(1000000);
         /*
            * 
            * account1;
            * accountholder = "Mobin"
            * accountballance = 9549080.98
            * accountnumber = 000001
          */

    }
    
}
