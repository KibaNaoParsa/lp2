class No {
		public

			void inseriritem(int y) {
				this.x = y;
			}

			void ligarcomprox(No aux){
				this.prox = aux;
			}

			void ligarcomant(No aux) {
				this.ant = aux;
			}

			int retorno() {
				return this.x;
			}

		private
			int x;
			No prox = null;
			No ant = null;
}

public class Lista {


	public

		void preencher() {
			No n1 = new No();
			No n2 = new No();
			No n3 = new No();
			n1.inseriritem(11);
			n2.inseriritem(22);
			n3.inseriritem(33);
			n1.ligarcomprox(n2);
			n2.ligarcomprox(n3);
			n2.ligarcomant(n1);
			n3.ligarcomant(n2);
			this.primeiro = n1;
		}

		void exibir() {
			No cursor = primeiro;
			while (cursor.prox !=  null) {
				System.out.println(cursor.retorno());
				cursor = cursor.prox;
			}
			System.out.println(cursor.retorno());

		}

	private

		No primeiro = null;

}