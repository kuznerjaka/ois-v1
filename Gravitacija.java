import java.util.*;
public class Gravitacija {

    public static void main(String[] args) {
        System.out.println("OIS je zakon!");

        izpisiGravitacijskiPospesek();
    }

    private static void izpisiGravitacijskiPospesek(){
        Scanner sc = new Scanner(System.in);

        int nadmorska = sc.nextInt();

        double pospesek = (6.674 * Math.pow(10, -11) * 5.972 * Math.pow(10, 24))/
        Math.pow((6.371 * Math.pow(10, 6) + nadmorska * 1000), 2);
        System.out.printf("%.2d m%n", pospesek);
    }
	
	public static void izpis(double v) {
		double a = izracun(v);
		System.out.printf("Nadmorska višina: %.2f m, gravitacijski pospešek: %.2f m/s^2.%n", v, a);
	}
}