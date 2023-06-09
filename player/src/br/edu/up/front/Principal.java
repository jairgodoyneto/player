package br.edu.up.front;
import br.edu.up.entidades.Usuario;
import br.edu.up.persistencia.UsuarioPersistencia;
public class Prin1cipal {
	public static void main(String[] args) {
		int opc;
		do{
			System.out.println("\n\n");
			System.out.println("*** MENU PRINCIPAL ***");
			System.out.println("1 - Usuario");
			System.out.println("2 - Musico");
			System.out.println("3 - Sair");
			opc = Console.readInt("Opção: ");
			switch(opc){
				case 1:
					
					Usuario usuario = new Usuario("11866838997","jair");
					if (UsuarioPersistencia.incluir(usuario)) {
						System.out.println("Deu bom.");
					}
					else{
						System.out.println("deu ruim");
					}
					break;
				/*case 2:
					new AppAutor();
					break;
				*/
				default:
					System.out.println("escolha outra opcao");
			}
		}while(opc != 3);
	}
}
