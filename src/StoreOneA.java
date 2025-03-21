public class StoreOneA extends StoreToRent {
    private boolean specialCustomer;
    private double monthlyPayment;
    private static final double DISCOUNT_RATE = 0.1;
    
     public StoreOneA(boolean loanRequired, double loanAmount, int loanPaymentTerm, boolean specialCustomer) {
        super(loanRequired, loanAmount, loanPaymentTerm);
        this.specialCustomer = specialCustomer; 
   }
    
    public double getMonthlyPayment() {
     return monthlyPayment;
     }
   
    public void showStoreInfo(){
    System.out.println(toString());
    }
    
     @Override
    public double calculateLoanFinancing() {
     double monthlyPayment = super.calculateLoanFinancing();
     if (specialCustomer) {
     monthlyPayment -= (monthlyPayment * DISCOUNT_RATE);
     }
    return monthlyPayment;
     }
     @Override
    public String toString(){
     return super.toString()+
    "\nLOAN DETAILS (if applicable):"+
     "\n Loan Amount:"+getLoanAmount()+
     "\n Loan Payment Term:"+getLoanPaymentTerm()+
    "\n Interest Rate:"+getInterestRate()+
         "\n Special Customer:"+specialCustomer+
         "\n Monthly Loan Payment:"+calculateLoanFinancing();
         }
    
        }