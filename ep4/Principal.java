class Principal {
	public static void main(String []v) {
		Lista l1 = Lista.getInstancia();
		l1.setJogadoresBattlefield(10);
		l1.setJogadoresCounterStrike(8);
		l1.setJogadoresCallOfDuty(5);
		System.out.println("l1.setJogadoresBattlefield(10) / l1.setJogadoresCounterStrike(8) / l1.setJogadoresCallOfDuty(5)");
		Lista l2 = Lista.getInstancia();
		System.out.println("");		
		System.out.println("Lista l2 = Lista.getInstancia()");
		System.out.println("");
		System.out.println("l2 - Battlefield: " + l2.getJogadoresBattlefield());
		System.out.println("l2 - CoD: " + l2.getJogadoresCallOfDuty());
		System.out.println("l2 - CS: " + l2.getJogadoresCounterStrike());
		System.out.println("");
		
	}
}
