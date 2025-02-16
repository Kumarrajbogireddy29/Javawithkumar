public class fibbonacciser {
    public static void main(String[] args) {
        int n=20, firstTerm=0, secondTerm=1;
        System.out.println("The Fibonacci seires till "+n+" Terms:");
        for(int i=0;i<=n;i++){
            System.out.println(firstTerm);
            int nextTerm =firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }
    
}
