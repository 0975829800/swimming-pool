package main;

public class Discount {
	public Identity identity;
	public Coach coach;
	public int hour;
	public int min;
	public double discount = 0;
	public int payment = 0;

	public Discount(Identity identity,Coach coach, String dateTime) throws Throwable {

		this.identity = identity;
		this.coach = coach;
		this.hour = InputNormalization.extractHour(dateTime);
		this.min = InputNormalization.extractMin(dateTime);

		checkException();
	}

	public void checkException() throws Throwable {
		if (3 > identity.getAge()) {
			throw new Throwable("Your age is too young.");
		} else if (identity.getAge() > 75) {
			throw new Throwable("Your age doesn't meet the requirements.");
		} else if ((5 > hour || hour > 22) || (hour == 22 && min > 0)) {
			throw new Throwable("Business hours: 05:00-22:00");
		} else if (coach.getStudent() < 0 || coach.getCoach() < 0){
			throw new Throwable("people should more than zero.");
		} else {
			queryDiscount(identity, hour);
		}
	}

	private void queryDiscount(Identity identity,Coach coach, int hour) {
		if(coach.GetCoach() == 0){
			if (identity.isMember()) {
				discount = 0.5;
			} else if (identity.isGroup()) {
				discount = 0.7;
			} else if (12 > identity.getAge() || identity.getAge() >= 60) {
				discount = 0.8;
			} else if (5 <= hour && hour < 7) {
				discount = 0.8;
			} else {
				discount = 1;
			}
		} else{
			if(coach.GetCoach() + coach.GetStudent() <= 10){
				payment = 3000;
				payment *= coach.GetTime().length*2;
			}else{
				payment = coach.GetCoach()*120+coach.GetStudent()*70;
				payment *= coach.GetTime().length*2;
			}
		}

	}

	public double getDiscount() {
		return discount;
	}
	public int getPayment() { return payment; }
}
