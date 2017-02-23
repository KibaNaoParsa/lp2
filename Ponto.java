public class Ponto {
	private double x, y;

	public Ponto() {
		System.out.println("Construtor 1 - " + this);
	}

	public Ponto(double x, double y) {
 		System.out.println("Construtor 2");
		this.x = x;
		this.y = y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getX() {
		return this.x;
	}

	public void setY(double y) {
                this.y = y;
        }

        public double getY() {
                return this.y;
        }

	public static void main(String[] v) {
		Ponto p1 = new Ponto();
		p1.setX(10);
		p1.setY(15);
		Ponto p2 = new Ponto();
		p2.setX(20);
		p2.setY(30);
		Ponto p4 = new Ponto(4.0, 2.0);
		double disty = p1.getY() - p2.getY();
		double distx = p1.getX() - p2.getX();
		distx = Math.pow(distx, 2);
		disty = Math.pow(disty, 2);
		double hip = distx + disty;
		hip = Math.sqrt(hip);
		System.out.println(hip);
		System.out.println("X: " + p4.getX() + " Y: " + p4.getY());
		Reta r1 = new Reta();
		r1.setP1(p1);
		r1.setP2(p2);
		r1.getP1().setX(30);
		r1.getP2().setY(40);
		System.out.println(" ");
		System.out.println("Reta 1 - Ponto 1 - X: " + r1.getP1().getX());
		System.out.println("Reta 1 - Ponto 1 - Y: " + r1.getP1().getY());
		System.out.println("Reta 1 - Ponto 2 - X: " + r1.getP2().getX());
		System.out.println("Reta 1 - Ponto 2 - Y: " + r1.getP2().getY());
	}
}
