public class Lista {
	private

		static Lista instancia;

		Lista() {
		}

		int JogadoresBattlefield;
		int JogadoresCallOfDuty;
		int JogadoresCounterStrike;

	public

		static Lista getInstancia() {
			if (instancia == null)
				instancia = new Lista();
			return instancia;
		}

		void setJogadoresBattlefield(int a) {
			this.JogadoresBattlefield = a;
		}
		
		void setJogadoresCallOfDuty(int a) {
			this.JogadoresCallOfDuty = a;
		}

		void setJogadoresCounterStrike(int a) {
			this.JogadoresCounterStrike = a;
		}

		int getJogadoresBattlefield() {
			return this.JogadoresBattlefield;
		}

		int getJogadoresCallOfDuty() {
			return this.JogadoresCallOfDuty;
		}

		int getJogadoresCounterStrike() {
			return this.JogadoresCounterStrike;
		}
}
