public class Main {
    public static void main(String[] args) {

        CheckingAccount ca = new CheckingAccount();
        ca.account = 1;
        ca.balance = 10;
        System.out.println(ca.account + " " + ca.balance);

        SavingsAccount sa = new SavingsAccount();
        sa.account= 2;
        sa.balance = 20;
        System.out.println(sa.account + " " + sa.balance);

        CertificateOfDeposit cod = new CertificateOfDeposit();
        cod.account = 3;
        cod.balance = 30;
        System.out.println(cod.account + " " + cod.balance);
    }
}