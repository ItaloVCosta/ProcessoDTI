import java.io.IOException;
import java.util.Scanner;

public class Main {
    // Projeto desenvolvido para a particiáção no processo seletivo da DTI
    // Powered by Italo Costa
    public static void main(String[] args) throws Exception {
        boolean sair=false;
        while(!sair)
        {
            //limparTela();
            mostrarMenu();
            Scanner Leitura = new Scanner(System.in);;
            int dadoDigitado=lerOpcaoMenu(Leitura);

            switch(dadoDigitado)
            {
                case 1:
                    cadastrarAlbum();
                    break;
                case 2:
                    pesquisarAlbum();
                    break;
                case 3:
                    pesquisarMusica();
                    break;
                case 4:
                    gerarPlaylist();
                    break;
                case 5:
                    sair=true;
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
    }

    public static void mostrarMenu()
    {
        System.out.println("                   Pesquisador de Musicas  ");
        System.out.println("                  ***************************");
		System.out.println("                  |   1 - Cadastrar Album   |");
		System.out.println("                  |   2 - Pesquisar Album   |");
		System.out.println("                  |   3 - Pesquisar Musica  |");
		System.out.println("                  |   4 - Gerar Playlist    |");
		System.out.println("                  |   5 - Sair              |");
		System.out.println("                  ***************************");
    }

    public static int lerOpcaoMenu(Scanner scan)
    {
        System.out.println(">>Digite a opcao desejada");
        int opcaoEscolhida = scan.nextInt();
        scan.nextLine();
        return opcaoEscolhida;
    }

    public static void cadastrarAlbum()
    {

    }
    
    public static void pesquisarAlbum()
    {

    }

    public static void pesquisarMusica()
    {

    }

    public static void gerarPlaylist()
    {

    }

    public static void limparTela() throws IOException, InterruptedException{
        new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
    }
}   
