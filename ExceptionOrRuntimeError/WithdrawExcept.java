class WithdrawException extends Exception{
	WithdrawException(String msg){
		super(msg);
	}
	WithdrawException(){}
}
class Account {
	public void withdraw(double amount, double balance)throws WithdrawException {
		if (amount > balance)
			throw new WithdrawException("Insufficient Balance");
		else {
			double currentBal = balance - amount;
			System.out.println("WIthdraw successful! Current balance: " +currentBal);
		}
	}
}
public class WithdrawExcept {
	public static void main(String[] args) {
		Account A = new Account();
		try {
			A.withdraw(7, 1000);
		} catch (WithdrawException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
