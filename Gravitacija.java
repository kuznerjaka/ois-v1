public class Gravitacija {
    public static void main(String []args) {
        System.out.print("OIS je zakon!");
    }
	
	public static void izpis(double v) {
		double a = izracun(v);
		System.out.printf("Nadmorska višina: %.2f m, gravitacijski pospešek: %.2f m/s^2.%n", v, a);
	}
}