import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    // Projeto desenvolvido para a participação no processo seletivo da DTI
    // Powered by Italo Costa
    public static void main(String[] args) throws Exception {
        ArrayList<Album> objAlbum = new ArrayList<Album>();
        ArrayList<Musica> objMusica = new ArrayList<Musica>();
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
                    cadastrarMusica(Leitura,objAlbum,objMusica);
                    break;
                case 2:
                    int idAlbum=pesquisarAlbum(Leitura,objAlbum,objMusica);
                    if(idAlbum==-1)
                        System.out.println("Album nao encontrado, verifique se os parametros de busca foram digitados corretamente \n");
                        
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
                        System.out.println(objAlbum.get(i).getTituloAlbum());
                        System.out.println(objAlbum.get(i).getAnoLacamento());
                        System.out.println(objAlbum.get(i).getNomeBanda());
                        //System.out.println(objAlbum.get(i).getIdAlbum());
                        System.out.printf("******Musicas do Album %d *****\n",i+1);
                        for(int j=0;j<objMusica.size();j++)
                        {
                            if(objMusica.get(j).getIdAlbum()==objAlbum.get(i).getIdAlbum())
                            {
                                System.out.println(objMusica.get(j).getTituloMusica());
                                System.out.println(objMusica.get(j).getDuracaoMusica());
                                System.out.println(objMusica.get(j).getFavorita());
                                System.out.println("****************************");
                            }
                        }
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
        objAlbum.get(objAlbum.size()-1).setIdAlbum(objAlbum.size());
        System.out.println(" Digite o titulo do Album");
        objAlbum.get(objAlbum.size()-1).setTituloAlbum(lerStringTeclado(scan)); 
        System.out.println(" Digite o Ano de lancamento do Album");
        objAlbum.get(objAlbum.size()-1).setAnoLacamento(Integer.parseInt(lerStringTeclado(scan)));
        System.out.println(" Digite o nome da banda do album");
        objAlbum.get(objAlbum.size()-1).setNomeBanda(lerStringTeclado(scan));  
        
    }

    public static void cadastrarMusica(Scanner scan, ArrayList<Album> objAlbum, ArrayList<Musica> objMusica)
    {
        String controleLoop="S";
        do
        {
            objMusica.add(new Musica());
            objMusica.get(objMusica.size()-1).setIdAlbum(objAlbum.size());
            System.out.println(" Digite o titulo da musica");
            objMusica.get(objMusica.size()-1).setTituloMusica(lerStringTeclado(scan));
            System.out.println(" Digite a duracao da musica (MM:SS)");
            objMusica.get(objMusica.size()-1).setDuracaoMusica(lerStringTeclado(scan));
            System.out.println(" Digite se essa é uma música favorita (S ou N)");
            objMusica.get(objMusica.size()-1).setFavorita(lerStringTeclado(scan));
            System.out.println(" Deseja inserir mais musicas ? (S ou N)");

        }while(controleLoop.equalsIgnoreCase(lerStringTeclado(scan)));



    }
    
    public static int pesquisarAlbum(Scanner scan, ArrayList<Album> objAlbum, ArrayList<Musica> objMusica)
    {
        System.out.println("Digite o titulo do album, ano de lancamento ou nome da banda:");
        String dadoLido =lerStringTeclado(scan);
        int indiceObj=-1;
        // Verificando pelo Titulo
        for(int i=0;i<objAlbum.size();i++)
        {
            if(objAlbum.get(i).getTituloAlbum().equalsIgnoreCase(dadoLido))
            {
                printaInfoAlbum(objAlbum, objMusica,i);
                indiceObj=0;
            }
        }
        // Verificando pelo ano de lacamento
        for(int j=0;j<objAlbum.size();j++)
        {
            try
            {
                if(objAlbum.get(j).getAnoLacamento()==Integer.parseInt(dadoLido))
                {
                    printaInfoAlbum(objAlbum, objMusica,j);
                    indiceObj=0;
                }
            }
            catch(NumberFormatException nfe)
            {

            }
            
        }
        // Verificando pelo nome da banda
        for(int k=0;k<objAlbum.size();k++)
        {
            if(objAlbum.get(k).getNomeBanda().equalsIgnoreCase(dadoLido))
            {
                printaInfoAlbum(objAlbum, objMusica,k);
                indiceObj=0;
            }
        }
        return indiceObj;
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

    public  static void printaInfoAlbum(ArrayList<Album> objAlbum, ArrayList<Musica> objMusica, int indice)
    {
        int i=1;
        System.out.printf("-----------Album %d -----------\n",indice+1);
        System.out.println("Titulo do album: " + objAlbum.get(indice).getTituloAlbum());
        System.out.println("Ano de lancamento: " + objAlbum.get(indice).getAnoLacamento());
        System.out.println("Nome da banda: " + objAlbum.get(indice).getNomeBanda());
        //System.out.println(objAlbum.get(i).getIdAlbum());
        System.out.printf("--Musicas do Album %d--\n",indice+1);
        for(int j=0;j<objMusica.size();j++)
        {
            if(objMusica.get(j).getIdAlbum()==objAlbum.get(indice).getIdAlbum())
            {
                System.out.printf("%d-- " + objMusica.get(j).getTituloMusica()+"\n",i);
                i++;
            }
        }
        System.out.println("-------------------------------");
                    
    }
}   
