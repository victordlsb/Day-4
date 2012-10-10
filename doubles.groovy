double calculateTotalAmount(double cost, double rate){
	double total = cost*(1+rate/100);
	return total;
}

double calculateMoneyPerYear(double total,int years){
	double moneyPerYear = total/years;
	return moneyPerYear;
}

double calculateYearsToPayInterest(double cost, double total, double moneyPerYear){
	double years = (total-cost)/moneyPerYear;
	return years;
}
	
	
print ("Insert the total amount borrowed for the mortgage: ");
double cost = Double.parseDouble(System.console().readLine());
print ("Insert the number of years to pay the the mortgage: ");
int years = Integer.parseInt(System.console().readLine());
print ("Insert the interest rate: ");
double rate = Double.parseDouble(System.console().readLine());

double total = calculateTotalAmount(cost,rate);
double moneyPerYear = calculateMoneyPerYear(total,years);
double yearsPaidInterest = calculateYearsToPayInterest (cost,total,moneyPerYear);

println ("\nThe total amount to be paid is " + total);
println ("The total amount to pay every year is " + moneyPerYear);
println ("The number of years to pay the interest is " + yearsPaidInterest);
