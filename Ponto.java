public class Ponto {
	private double x, y;

	public Ponto() {

	}

	public Ponto(double x, double y) {
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
		p1.setX(20);
		p1.setY(15);
		Ponto p2 = new Ponto();
		p2.setX(30);
		p2.setY(10);
		Reta r1 = new Reta();
		r1.setP1(p1);
		r1.setP2(p2);
		double baseme = r1.getP2().getY();
		double basema = r1.getP1().getY();
		double height = r1.getP2().getX() - r1.getP1().getX();
		double area = ((baseme + basema) * height)/2;
		area = Math.abs(area);
		System.out.println(area); 
	}
}
