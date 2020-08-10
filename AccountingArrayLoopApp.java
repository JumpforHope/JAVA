
public class AccountingArrayLoopApp {

	public static void main(String[] args) {
		
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double expense = valueOfSupply*expenseRate;
		double vat = valueOfSupply*vatRate;
		double income = valueOfSupply-expense;
		
		double[] dividendRate = new double[3];
		dividendRate[0]=0.5;
		dividendRate[1]=0.3;
		dividendRate[2]=0.2;
		
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+ vat );
		System.out.println("Total : "+ (valueOfSupply+ vat) );
		System.out.println("Expense : "+ expense);
		System.out.println("Income : "+ income);
		
		int i = 0;
		while(i<dividendRate.length) {
			System.out.println("Dividend : " + income*dividendRate[i]);
			i++;
		}
		
		//System.out.println("Dividend 1 : "+ dividend1);
		//System.out.println("Dividend 2 : "+ dividend2);
		//System.out.println("Dividend 3 : "+ dividend3);

	}

}
