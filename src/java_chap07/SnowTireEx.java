package java_chap07;

public class SnowTireEx {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		TireS tire = snowTire;

		snowTire.run();
		tire.run();
	}

}
