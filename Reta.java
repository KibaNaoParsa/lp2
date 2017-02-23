public class Reta {
	private Ponto p1, p2;

	public void setP1(Ponto p) {
		this.p1 = p;
	}

	public Ponto getP1() {
		return this.p1;
	}

	public void setP2(Ponto p) {
		this.p2 = p;
	}

	public Ponto getP2() {
		return this.p2;
	}

	public double Area() {
		
		double baseme = this.getP2().getY();
		double basema = this.getP1().getY();
		double height = this.getP2().getX() - this.getP1().getX();
		double area = ((baseme + basema) * height)/2;
		area = Math.abs(area);
		return area;
	}
}
