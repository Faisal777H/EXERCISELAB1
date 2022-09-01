public class Exercise4 {
    public static void main(String[] args) {
        double balance=1000;
        double insRate=0.05;
        double ins;
        System.out.println("Initial balance is "+balance );
        ins=balance+insRate;
        balance=balance+ins;
        System.out.println("After 1st year balance is "+balance);
        ins=balance+insRate;
        balance=balance+ins;
        System.out.println("After 2nd year balance is "+balance);
        ins=balance+insRate;
        balance=balance+ins;
        System.out.println("After 3rd year balance is "+balance);
    }
}
