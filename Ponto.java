public class Ponto {
	private double x, y;

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
		p1.setX(50);
		p1.setY(40);
		Ponto p2 = new Ponto();
		p2.setX(30);
		p2.setY(20);
		double disty = p1.getY() - p2.getY();
		double distx = p1.getX() - p2.getX();
		distx = Math.pow(distx, 2);
		disty = Math.pow(disty, 2);
		double hip = distx + disty;
		hip = Math.sqrt(hip);	
		System.out.println(hip);
	}
}
