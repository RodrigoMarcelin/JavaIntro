package entities;

public class Triangle {
	
	public double a, b, c;
	
	public double area() {
		double p = (this.a + this.b + this.c) / 2.0;
		double ax = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
		return ax;
	}

}
