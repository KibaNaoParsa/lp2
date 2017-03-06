import java.util.Scanner;

public class Principal {
	public static void main (String []v) {
		Scanner ler = new Scanner(System.in);
      	Lista lista = new Lista();
		lista.preencher();
		int r;
		int insercao;
		do {
			lista.exibir();
			System.out.println();
			System.out.println("1- Inserir ");
			System.out.println("2- Excluir ");
			System.out.println("3- Pesquisar ");
			r = ler.nextInt();
			System.out.println();
			if(r == 1){
				insercao = ler.nextInt();
				lista.inserir(insercao);
			}
			if(r == 2){
				lista.remover();
			}
			if(r == 3){
				insercao = ler.nextInt();
              	lista.pesquisa(insercao);
			}
		} while (r > 0 && r < 4);
	}
}
