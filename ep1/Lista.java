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
			this.ultimo = n3;
			this.tam = 3;
		}

		void exibir() {
			No cursor = primeiro;
			while (cursor.prox !=  null) {
				System.out.println(cursor.retorno());
				cursor = cursor.prox;
			}
			System.out.println(cursor.retorno());

		}
		
		void inserir(int valor) {
			No aux = new No();
			aux.inseriritem(valor);
			aux.ligarcomant(ultimo);
			No cursor = ultimo;
			cursor.ligarcomprox(aux);
			this.ultimo = aux;		
			this.tam += 1;
		}

		void remover() {
			No cursor = this.ultimo;
			this.ultimo = cursor.ant;
			this.ultimo.prox = null;
			this.tam -= 1;
		}

		void pesquisa(int indice) {
			No cursor = primeiro;
			for (int i = 0; i < (indice-1); i++) {
				cursor = cursor.prox;
			}
			System.out.println(cursor.retorno());
		}

		void limpatela() {
			for (int i = 0; i < 100; i++) {
				System.out.println();
			}
		}

	private
		int tam = 0;
		No primeiro = null;
		No ultimo = null;

}
