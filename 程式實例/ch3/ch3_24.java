public class ch3_24 {
	public static void main(String[] args) {
		final int hourly_salary = 120;						// �]�w���~
		int monthly_fee = 9000;								// �]�w�C���O
		int annual_salary, annual_fee, annual_savings;								
																
		annual_salary = hourly_salary * 8 * 300;			// �p��~�~								
		annual_fee = monthly_fee * 12;						// �p��C�~��O						
		annual_savings = annual_salary - annual_fee;		// �p��C�~�x�s���B
		System.out.println("�@�~�i�H�x�s : " + annual_savings);
	}
}

