public class Date {
	private int month;
	private int day;
	private int year;

	public Date (int month, int day, int year) {
		this.setMonth(month);
		this.setDay(day);
		this.setYear(year);
	}
	public void setMonth(int month) {
		if ((month >= 1) && (month<=12)) {
			this.month = month;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setDay(int day) {
		if ((day >= 1) && (day<=31)) {
			this.day = day;
		}
	}
	public int getDay() {
		return day;
	}
	public void setYear(int year) {
		if (year >= 1) {
			this.year = year;
		}
	}
	public int getYear() {
		return year;
	}
	public String getDate() {
		String date = String.format("the date is %d / %d / %d", month, day, year); 
		return date; 
	}
}
