package entities;

public class Individual extends TaxPayer{
	
	public Double healthExpenditures;
	
	public Individual(){
		super();
	}
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Double getHeathExpenditures() {
		return healthExpenditures;
	}

	public void setHeathExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		if(anualIncome <= 20000.00) {
			return getAnualIncome() * 0.15 - healthExpenditures * 0.5;
		}else {
			return getAnualIncome() * 0.25 - healthExpenditures * 0.5;
		}
	}

}
