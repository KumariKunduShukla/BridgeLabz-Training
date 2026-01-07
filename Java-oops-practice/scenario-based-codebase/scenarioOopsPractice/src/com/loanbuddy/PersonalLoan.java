package com.loanbuddy;

public class PersonalLoan  extends LoanApplication {

	public PersonalLoan(Applicant applicant, int term) {
        super(applicant, term, 6.0);
    }

    @Override
    public boolean approveLoan() {
        boolean status = applicant.getCreditScore() >= 1200;
        setApproved(status);
        return status;
    }
}