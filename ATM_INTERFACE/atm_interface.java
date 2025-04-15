package atm_interface;
import java.util.scanner;
public class ATM_MACHINE
{
    private double balance;
    private double depositamount;
    private double withdrawamount;
    private double transfer;
    Map<Double,String> history=new HashMap<>();
    public ATM_MACHINE()
    {

    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public void setTransfer(double transferamount)
    {
        this.transfer=transferamount;
    }
    public double getDepositamount()
    {
        return depositamount;
    }
    public void setDepositamount(doublr depositamount)
    {
        this.depositamount= depositamount;
    }
    public double getWithdrawamount()
    {
        return withdrawamount;
    }
    public void check_balance()
    {
        System.out.println("Available Balance is : "+getBalance());
    }
    public void withdraw(double withdraw)
    {
        if(withdraw > getBalance())
        {
            System.out.println("Insufficient Balance..");
        }
        else
        {
            history.put(withdraw,"Amount withdrawn");
            System.out.println(withdraw + " Amount withdraw successfully...!");
            setBalance(getBalance()-withdraw);
            check_balance();
        }
    }
    public void deposit(double deposit){
        history.put(deposit, "Amount Deposited");
        System.out.println(depost + "Deposited Successfully...!");
        setBalance(getBalance()+deposit);
        check_balance();
    }
    public void transfer(double transfer)
    {
        if(transfer > getBalance())
        {
            System.out.println("Insufficient Balance");
        }
        else{
            history.put(transfer,"Amount Transfer");
            System.out.println("Transfer Successfully ..!");
            setBalance(getBalance()-transfer);
            check_balance();
        }
    }
    public void history()
    {
        for(Map.Entry<Double,String>=:history.entryset())
        {
            System.out.println(m.getKey()+ m.getValue())
        }
    }
    public ststic void main(String[] args)
    {
        int number=12345;
        int atmpin=123;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Enter ATM number:");
        int atmnumber=sc.nextInt();
        System.out.println("Enter Pin :");
        int pin=sc.nextInt();
        ATM_MACHINE atm=new ATM_MACHINE();
        if((atmnumber==atmnumber)&&(pin==atmpin))
        {
            while(true)
            {
                System.out.println("1.Check Balance\n 2.Withdraw\n3.Deposit\n4.Transfer\n5.Transaction History\n6.Exit");
                System.out.println("Enter the Choice :");
                int ch=sc.nextInt();
                if(ch==1){
                    atm.check_balance();
                }
                else if(ch==2){
                    System.out,println("Enter the amount which you want to Withdraw:");
                    double with=sc.nextDouble();
                    atm.withdraw(with);
                }
                else if(ch==3){
                    System.out.println("Enter the amount which you want to deposit:");
                    double depo=sc.nextDouble();
                    atm.depost(depo);
                }
                else if(ch==4){
                    System.out.println("Enter the recipients account number :");
                    int no=sc.nextInt();
                    System.out.println("Enter the amount which you want to transfer:");
                    double trans=sc.nextDouble();
                    atm.transfer(trans);
                }
                else if(ch==5){
                    atm.history();
                }
                else if(ch==6){
                    System.out.println("Collect your Atm card\n Thank you for using ATM MAchine");
                    System.exit(0);
                }
                else{
                    System.out.println("Please , Enter correct choice..")
                }
                }
            }
            else{
                System.out.println("Incorrect Atm Number or Pin ");
                System.exit(0);
            }
        }
    }
}