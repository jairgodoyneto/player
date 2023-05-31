package br.edu.up.front;
public class Principal {
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
					new AppUsuario();
					break;
				case 2:
					new AppAutor();
					break;
			}
		}while(opc != 3);
	}
}
