package C_com.anotherway.example;

public class Demo {

	public static void main(String[] args) {
		Car car = new Car.CarBuilder("MRF Tyre", "Good Steering", "Powerful Engine", "Comfortable seat").setHasAc(true)
				.setSpeakers("Bose Speakers").build();
		System.out.println(car);
	}

}
