import java.util.Scanner;
public class class1 {
	public static void main(String args []){
		double a, b, c;
		System.out.println("Программа решает квадратное уравнение вида:");
		System.out.println("ax^2 + bx +c = 0");
		System.out.println("Введите a, b и c:");
		Scanner in = new Scanner(System.in);
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		in.close();
		d (a, b, c);
		korni (a, b, c, d(a, b, c));
	}
	
	public static double d (double a, double b, double c){
		double D = b * b - 4 * a * c;
		System.out.println(D);
		return(D);
	}
	public static void korni (double a, double b, double c, double D){
		double x1, x2;
		if (D > 0) {
	    	x1 = (-b - Math.sqrt(D)) / (2 * a);
	    	x2 = (-b + Math.sqrt(D)) / (2 * a);
	    	System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
	    }
	    else if (D == 0) {
	    	double x;
	    	x = -b / (2 * a);
	    	System.out.println("Уравнение имеет единственный корень: x = " + x);
	    }
	    else{
	    	System.out.println("Уравнение не имеет действительных корней!");
	   }
	}
}