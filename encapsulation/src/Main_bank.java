class BankAccount{
    private double balance;

    void setBalance(double balance){
        if(balance>=0){
            this.balance=balance;
        }
        else{
            System.out.println("Invalid Balance");
        }
    }

    double getBalance(){
        return balance;
    }
}

public class Main_bank{
    public static void main(String[] args){
        BankAccount person1 = new BankAccount();
        person1.setBalance(50000);
        System.out.print(person1.getBalance());

        System.out.println();

        BankAccount person2 = new BankAccount();
        person2.setBalance(-50000);
        System.out.print(person2.getBalance());
    }
}