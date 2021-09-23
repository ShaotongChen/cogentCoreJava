package day3_assignment;

public class IncrementCalculation {

	private float income;
	public IncrementCalculation(float income2) {
		// TODO Auto-generated constructor stub


		this.income=income2;
	}
	public float CalIncome(float rate) {
		
		if((rate<=0||rate>5) || this.income<0) {
			return -1;
		}else if (rate>0 && rate<1) {
			return this.income;
		}else if(rate>=1 && rate <=3) {
			return (float) (this.income+(this.income*0.1));
		}else if(rate>3 && rate <=4) {
			return (float) (this.income+(this.income*0.25));
		}else
			return (float) (this.income+(this.income*0.3));
	}
}
