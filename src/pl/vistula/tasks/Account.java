package pl.vistula.tasks;

public class Account {
    

        String owner;
        int balance, accountNumber;


        public Account(String owner, int balance, int accountNumber) {
            this.owner = owner;
            this.balance = balance;
            this.accountNumber = accountNumber;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public int getBalance() {

            return balance;
        }

        public int setBalance(int balance) {
            return this.balance = balance;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }
        public String methodPrint(){
            String result  = "Owner:" + getOwner();
            result += "\nBalance: " + getBalance();
            result += "\nAccountNumber: " + getAccountNumber();
            return result;
        }
        // public void transfer(double amount){
        //    if(balance >= amount){
        //       balance -= amount;
        ///       balance += amount;
        //        System.out.println( "Amount has successfully been transfered!");
        //    }
        //   else{
        //     System.out.println( "There is insufficient amount in the account " + accountNumber);
        //}
        //}
        public double methodTransfeFabrine(double amount){
            return balance -= amount;
        }


        public static void main(String[] args) {
            //Exception catching
            try{
                //Creating account object with parameters
                Account ac = new Account("Fabrine",500,57098);

                // Printing the user data
                System.out.println( ac.methodPrint());
                //Calling the method transfer
                ac.methodTransferMigisha(500);

                throw new NotEnoughMoneyException("There is insufficient money in the account!!!");

            }
            catch (NotEnoughMoneyException ex){
                System.out.println(ex.getMessage());
                ex.printStackTrace();
                System.out.println( ex);
            }
            finally{
                // System.out.println( "The Balance left is" + Account.current);
            }
        }

    private void methodTransferMigisha(int i) {
    }


}
