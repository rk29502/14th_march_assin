package march_14;

public class bike {
	String model;
	int avg;
	int warrentyYears;
	String cost;

	bike() {

	}

	public String toString() {
		return ("Name of model::" + this.model + "\n" + "avarage km per hr::" + this.avg + "\n" + "warrenty in years::"
				+ this.warrentyYears + "\n" + "cost of vehicle::" + this.cost);
	}

	public static void main(String argd[]) {
		bike b1 = new bike();
		System.out.println(b1);
	}

}
