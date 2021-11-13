import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Projeto desenvolvido para a participação no processo seletivo da DTI
    // Powered by Italo Costa
    public static void main(String[] args) throws Exception {
        ArrayList<Album> objAlbum = new ArrayList<Album>();
        boolean sair=false;
        Scanner Leitura = new Scanner(System.in);
        limparTela();
        while(!sair)
        {
            
            mostrarMenu();
            int teste =lerOpcaoMenu(Leitura);
            switch(teste)
            {
                case 1:
                    limparTela();
                    cadastrarAlbum(Leitura, objAlbum);
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
                    for(int i=0;i<objAlbum.size();i++)
                    {   
                        System.out.printf("******Album %d *****\n",i+1);
                        System.out.println(objAlbum.get(i).tituloAlbum);
                        System.out.println(objAlbum.get(i).anoLancamento);
                        System.out.println(objAlbum.get(i).nomeBanda);
                    }
                   
                    break;
                default:
                    limparTela();
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
        System.out.println("Digite a opcao desejada");
        System.out.print(">> ");
        int opcaoEscolhida = scan.nextInt();
        scan.nextLine();
        return opcaoEscolhida;
    }

    public static String lerStringTeclado(Scanner scan)
    {
        System.out.print(">> ");
        String opcaoEscolhida = scan.nextLine();
        return opcaoEscolhida;
    }

    public static void cadastrarAlbum(Scanner scan, ArrayList<Album> objAlbum)
    {
        objAlbum.add(new Album());
        System.out.println(" Digite o titulo do Album");
        objAlbum.get(objAlbum.size()-1).tituloAlbum=lerStringTeclado(scan); 
        System.out.println(" Digite o Ano de lancamento do Album");
        objAlbum.get(objAlbum.size()-1).anoLancamento=Integer.parseInt(lerStringTeclado(scan));
        System.out.println(" Digite o nome da banda do album");
        objAlbum.get(objAlbum.size()-1).nomeBanda=lerStringTeclado(scan);  
    }

    public static void cadastrarMusica()
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
