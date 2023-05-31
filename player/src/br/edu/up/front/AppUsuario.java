package br.edu.up.front;

public class AppUsuario {
    public AppUsuario(){
        int opc=0;
        do {
            System.out.println("---Reprodutor---");
            System.out.println("1-Escolher Playlist");
            opc=Console.readInt("digite a opcao desejada");
        } while (opc!=3);
    }
}
