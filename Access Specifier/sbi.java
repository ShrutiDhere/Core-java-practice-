package Access_Specifier1;
import Access_Specifier.Bank;


public class sbi extends Bank {

	public static void main(String[] args) {
	
	sbi s=new sbi();
	System.out.println("Bank id is = " + (s.id=123));
	System.out.println("Bank Account name is  = " + (s.Account="Bnk Of Maharashtra "));
    s.balance();
}
}
