package entities;

public class BusinessAcount extends Account {
	
	private Double loanLimet;

	public BusinessAcount() {
		super();
	}

	public BusinessAcount(Integer number, String holder, Double balance, Double loanLimet) {
		super(number, holder, balance);
		this.loanLimet = loanLimet;
	}

	public Double getLoanLimet() {
		return loanLimet;
	}

	public void setLoanLimet(Double loanLimet) {
		this.loanLimet = loanLimet;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimet) {
			deposit(amount);
		}
		
	}

}
