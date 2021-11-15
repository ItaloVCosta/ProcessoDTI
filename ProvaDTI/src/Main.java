import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
    // Projeto desenvolvido para a participação no processo seletivo da DTI
    // Powered by Italo Costa
    public static void main(String[] args) throws Exception {
        ArrayList<Album> objAlbum = new ArrayList<Album>();
        ArrayList<Musica> objMusica = new ArrayList<Musica>();
        boolean sair=false;
        Scanner Leitura = new Scanner(System.in);
        int idAlbum;
          // Setando o banco de dados para teste
          {
            objAlbum.add(new Album());
            objAlbum.get(objAlbum.size()-1).setIdAlbum(objAlbum.size());
            objAlbum.get(objAlbum.size()-1).setTituloAlbum("Help!"); 
            objAlbum.get(objAlbum.size()-1).setAnoLacamento(1965);
            objAlbum.get(objAlbum.size()-1).setNomeBanda("The Beatles");
            // Adicionando musicas
            objMusica.add(new Musica());
            objMusica.get(objMusica.size()-1).setIdAlbum(objAlbum.size());
            objMusica.get(objMusica.size()-1).setTituloMusica("Help!");
            objMusica.get(objMusica.size()-1).setDuracaoMusica("2:18");
            objMusica.get(objMusica.size()-1).setDuracaoSegundos(converteTempoParaSegundos(objMusica.get(objMusica.size()-1).getDuracaoMusica()));;
            objMusica.get(objMusica.size()-1).setFavorita("s");

            objMusica.add(new Musica());
            objMusica.get(objMusica.size()-1).setIdAlbum(objAlbum.size());
            objMusica.get(objMusica.size()-1).setTituloMusica("The Night Before");
            objMusica.get(objMusica.size()-1).setDuracaoMusica("2:33");
            objMusica.get(objMusica.size()-1).setDuracaoSegundos(converteTempoParaSegundos(objMusica.get(objMusica.size()-1).getDuracaoMusica()));;
            objMusica.get(objMusica.size()-1).setFavorita("s");

            objMusica.add(new Musica());
            objMusica.get(objMusica.size()-1).setIdAlbum(objAlbum.size());
            objMusica.get(objMusica.size()-1).setTituloMusica("You've Got to Hide Your Love Away");
            objMusica.get(objMusica.size()-1).setDuracaoMusica("2:08");
            objMusica.get(objMusica.size()-1).setDuracaoSegundos(converteTempoParaSegundos(objMusica.get(objMusica.size()-1).getDuracaoMusica()));;
            objMusica.get(objMusica.size()-1).setFavorita("s");

            objMusica.add(new Musica());
            objMusica.get(objMusica.size()-1).setIdAlbum(objAlbum.size());
            objMusica.get(objMusica.size()-1).setTituloMusica("Another Girl");
            objMusica.get(objMusica.size()-1).setDuracaoMusica("2:05");
            objMusica.get(objMusica.size()-1).setDuracaoSegundos(converteTempoParaSegundos(objMusica.get(objMusica.size()-1).getDuracaoMusica()));;
            objMusica.get(objMusica.size()-1).setFavorita("n");
            objMusica.add(new Musica());

            objMusica.get(objMusica.size()-1).setIdAlbum(objAlbum.size());
            objMusica.get(objMusica.size()-1).setTituloMusica("You're Going to Lose That Girl");
            objMusica.get(objMusica.size()-1).setDuracaoMusica("2:17");
            objMusica.get(objMusica.size()-1).setDuracaoSegundos(converteTempoParaSegundos(objMusica.get(objMusica.size()-1).getDuracaoMusica()));;
            objMusica.get(objMusica.size()-1).setFavorita("n");

            objMusica.add(new Musica());
            objMusica.get(objMusica.size()-1).setIdAlbum(objAlbum.size());
            objMusica.get(objMusica.size()-1).setTituloMusica("Ticket to Ride");
            objMusica.get(objMusica.size()-1).setDuracaoMusica("3:10");
            objMusica.get(objMusica.size()-1).setDuracaoSegundos(converteTempoParaSegundos(objMusica.get(objMusica.size()-1).getDuracaoMusica()));;
            objMusica.get(objMusica.size()-1).setFavorita("s");

            objMusica.add(new Musica());
            objMusica.get(objMusica.size()-1).setIdAlbum(objAlbum.size());
            objMusica.get(objMusica.size()-1).setTituloMusica("I Need You");
            objMusica.get(objMusica.size()-1).setDuracaoMusica("2:28");
            objMusica.get(objMusica.size()-1).setDuracaoSegundos(converteTempoParaSegundos(objMusica.get(objMusica.size()-1).getDuracaoMusica()));;
            objMusica.get(objMusica.size()-1).setFavorita("n");
            // Novo Album
            objAlbum.add(new Album());
            objAlbum.get(objAlbum.size()-1).setIdAlbum(objAlbum.size());
            objAlbum.get(objAlbum.size()-1).setTituloAlbum("Please Please Me"); 
            objAlbum.get(objAlbum.size()-1).setAnoLacamento(1963);
            objAlbum.get(objAlbum.size()-1).setNomeBanda("The Beatles");
            // Adicionando musicas
            objMusica.add(new Musica());
            objMusica.get(objMusica.size()-1).setIdAlbum(objAlbum.size());
            objMusica.get(objMusica.size()-1).setTituloMusica("I Saw Her Standing There");
            objMusica.get(objMusica.size()-1).setDuracaoMusica("2:55");
            objMusica.get(objMusica.size()-1).setDuracaoSegundos(converteTempoParaSegundos(objMusica.get(objMusica.size()-1).getDuracaoMusica()));;
            objMusica.get(objMusica.size()-1).setFavorita("n");

            objMusica.add(new Musica());
            objMusica.get(objMusica.size()-1).setIdAlbum(objAlbum.size());
            objMusica.get(objMusica.size()-1).setTituloMusica("Misery");
            objMusica.get(objMusica.size()-1).setDuracaoMusica("1:50");
            objMusica.get(objMusica.size()-1).setDuracaoSegundos(converteTempoParaSegundos(objMusica.get(objMusica.size()-1).getDuracaoMusica()));;
            objMusica.get(objMusica.size()-1).setFavorita("s");

            objMusica.add(new Musica());
            objMusica.get(objMusica.size()-1).setIdAlbum(objAlbum.size());
            objMusica.get(objMusica.size()-1).setTituloMusica("Love Me Do");
            objMusica.get(objMusica.size()-1).setDuracaoMusica("2:22");
            objMusica.get(objMusica.size()-1).setDuracaoSegundos(converteTempoParaSegundos(objMusica.get(objMusica.size()-1).getDuracaoMusica()));;
            objMusica.get(objMusica.size()-1).setFavorita("n");

            objMusica.add(new Musica());
            objMusica.get(objMusica.size()-1).setIdAlbum(objAlbum.size());
            objMusica.get(objMusica.size()-1).setTituloMusica("Please Please Me");
            objMusica.get(objMusica.size()-1).setDuracaoMusica("2:03");
            objMusica.get(objMusica.size()-1).setDuracaoSegundos(converteTempoParaSegundos(objMusica.get(objMusica.size()-1).getDuracaoMusica()));;
            objMusica.get(objMusica.size()-1).setFavorita("n");

        }
        limparTela();
        
        while(!sair)
        {
            
            mostrarMenu();
                switch(lerOpcaoMenu(Leitura))
                {
                case 1:
                    limparTela();
                    cadastrarAlbum(Leitura, objAlbum);
                    cadastrarMusica(Leitura,objAlbum,objMusica);
                    break;
                case 2:
                    if(objAlbum.isEmpty())
                        System.out.println("Você ainda não inseriu Albuns");
                    else
                    {
                        idAlbum=pesquisarAlbum(Leitura,objAlbum,objMusica);
                        if(idAlbum==-1)
                            System.out.println("Album nao encontrado, verifique se os parametros de busca foram digitados corretamente \n");
                    }
                        
                    break;
                case 3:
                    if(objMusica.isEmpty())
                        System.out.println("Você ainda não inseriu musicas");
                    else
                    {
                        idAlbum=pesquisarMusica(Leitura,objAlbum,objMusica);
                        if(idAlbum==-1)
                            System.out.println("Album nao encontrado, verifique se os parametros de busca foram digitados corretamente \n");
                    }
                    
                    break;
                case 4:
                    if(objMusica.isEmpty())
                        System.out.println("Você ainda não inseriu musicas");
                    else
                        gerarPlaylist(objMusica);
                    break;
                case 5:
                    sair=true;
                    System.out.println("Finalizando.....");
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
            objMusica.get(objMusica.size()-1).setDuracaoSegundos(converteTempoParaSegundos(objMusica.get(objMusica.size()-1).getDuracaoMusica()));;
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

    public static int pesquisarMusica(Scanner scan, ArrayList<Album> objAlbum, ArrayList<Musica> objMusica)
    {
        System.out.println("Digite o titulo da musica ou nome da banda:");
        String dadoLido =lerStringTeclado(scan);
        int indiceObj=-1;
        //Verificando pelo titulo da musica
        for(int i=0;i<objMusica.size();i++)
        {
            if(objMusica.get(i).getTituloMusica().equalsIgnoreCase(dadoLido))
            {
                objMusica.get(i).getIdAlbum();
                for(int j=0;j<objAlbum.size();j++)
                        {
                            if(objMusica.get(i).getIdAlbum()==objAlbum.get(j).getIdAlbum())
                            {
                                printaInfoAlbum(objAlbum, objMusica,j);
                                indiceObj=0;
                            }
                        }

            }
        }
        //Verificando pela banda
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

    public static void gerarPlaylist( ArrayList<Musica> objMusica)
    {
        Random gerador = new Random();
        ArrayList<Integer> numerosGerados = new ArrayList<Integer>();
        int tempoPlaylist=0;
        int quantidadeFavorito=0;
        boolean condicaoLoop=true;
        int tempoTotalMusicas=0;
        int minutos=0;
        int segundos=0;

        for(int i=0;i<objMusica.size();i++)
            tempoTotalMusicas+=objMusica.get(i).getDuracaoSegundos();

        if(tempoTotalMusicas>=3600)
        {
            do
            {
                // for para gerar numeros aleatorios diferetes
                for (int i = numerosGerados.size(); ((tempoPlaylist <3600) && (objMusica.size()>i)); i++) 
                {
                    numerosGerados.add(gerador.nextInt(objMusica.size()));
                    for(int j=0;j<numerosGerados.size();j++)
                    {
                        if(numerosGerados.get(i)==numerosGerados.get(j) && i!=j)
                        {
                            numerosGerados.remove(j);
                            j--;
                            i--;
                        }
                    }
                    tempoPlaylist=0;
                    for(int z=0; z<numerosGerados.size();z++)// Loop que refaz a soma de todas as musicas selecionadas a cada ciclo
                        tempoPlaylist+=objMusica.get(numerosGerados.get(z)).getDuracaoSegundos();
                }
                //for para saber quantidade de favoritos
                quantidadeFavorito=0;
                for (int i=0;i<numerosGerados.size();i++)
                {
                    //System.out.println(numerosGerados.get(i));
                    if(objMusica.get(numerosGerados.get(i)).getFavorita().equalsIgnoreCase("s"))
                        quantidadeFavorito++;
                }
                //verifica se tem nao favoritos a mais
                    if((numerosGerados.size()-quantidadeFavorito)>quantidadeFavorito)
                {
                    while((numerosGerados.size()-quantidadeFavorito)!=quantidadeFavorito)
                    {
                        for(int i=0;i<numerosGerados.size();i++)
                        {
                            if(objMusica.get(numerosGerados.get(i)).getFavorita().equalsIgnoreCase("n"))
                            {
                                tempoPlaylist-=objMusica.get(numerosGerados.get(i)).getDuracaoSegundos();
                                numerosGerados.remove(i);
                                i=numerosGerados.size()+1;
                            }

                        }
                    }
                }
                // verifica se tem favortos a mais
                else if((numerosGerados.size()-quantidadeFavorito)<quantidadeFavorito)
                {
                    while(((numerosGerados.size()-quantidadeFavorito)!=quantidadeFavorito))
                    {
                        for(int i=0;i<numerosGerados.size();i++)
                        {
                            if(objMusica.get(numerosGerados.get(i)).getFavorita().equalsIgnoreCase("s"))
                            {
                                tempoPlaylist-=objMusica.get(numerosGerados.get(i)).getDuracaoSegundos();
                                numerosGerados.remove(i);
                                i=numerosGerados.size()+1;
                                quantidadeFavorito--;
                            }
                            

                        }
                    }
                }
                condicaoLoop=false;
                if(tempoPlaylist >3600 || tempoPlaylist==0)
                    {                     
                        tempoPlaylist=0;
                        numerosGerados.clear();
                        condicaoLoop=true;
                    } 

            }while(condicaoLoop);
        }
        else
        {
            // for para gerar numeros aleatorios diferetes
            for (int i = numerosGerados.size(); objMusica.size()>i; i++) 
            {
                numerosGerados.add(gerador.nextInt(objMusica.size()));
                for(int j=0;j<numerosGerados.size();j++)
                {
                    if(numerosGerados.get(i)==numerosGerados.get(j) && i!=j)
                    {
                        numerosGerados.remove(j);
                        j--;
                        i--;
                    }                
                }
            }
            for(int i=0;i<numerosGerados.size();i++)
            {
                if(objMusica.get(numerosGerados.get(i)).getFavorita().equalsIgnoreCase("s"))
                    quantidadeFavorito++;
            }
            //verifica se tem nao favoritos a masi
            if((numerosGerados.size()-quantidadeFavorito)>quantidadeFavorito)
            {
                while((numerosGerados.size()-quantidadeFavorito)!=quantidadeFavorito)
                {
                    for(int i=0;i<numerosGerados.size();i++)
                    {
                        if(objMusica.get(numerosGerados.get(i)).getFavorita().equalsIgnoreCase("n"))
                        {
                            numerosGerados.remove(i);
                            i=numerosGerados.size()+1;
                        }

                    }
                }
            }
            // verifica se tem favortos a mais
            else if((numerosGerados.size()-quantidadeFavorito)<quantidadeFavorito)
            {
                while(((numerosGerados.size()-quantidadeFavorito)!=quantidadeFavorito))
                {
                    for(int i=0;i<numerosGerados.size();i++)
                    {
                        if(objMusica.get(numerosGerados.get(i)).getFavorita().equalsIgnoreCase("s"))
                        {
                            numerosGerados.remove(i);
                            i=numerosGerados.size()+1;
                            quantidadeFavorito--;
                        }

                    }
                }
            }
            for(int i=0;i<numerosGerados.size();i++)
            tempoPlaylist+=objMusica.get(numerosGerados.get(i)).getDuracaoSegundos();
            
        }
        minutos=tempoPlaylist/60;
        segundos=tempoPlaylist-(tempoPlaylist/60 *60);
        if((tempoPlaylist!=3600))
        {
            if(segundos>0)
                if(segundos<10)
                    System.out.println("Lista de Musicas geradas para voce: " +"\n Tempo Total: "+ minutos +":0"+ segundos);
                else
                    System.out.println("Lista de Musicas geradas para voce: " +"\n Tempo Total: "+ minutos +":"+ segundos);
            else
            System.out.println("Lista de Musicas geradas para voce: " +"\n Tempo Total: "+ minutos +":" + segundos +"0" );
        }
        else
        {
            System.out.println("Lista de Musicas geradas para voce: " +"\n Tempo Total: 1:00:00 ");
        }
        for (int k = 0; k < numerosGerados.size(); k++)
        {
            System.out.printf("%d--",k+1);
            System.out.print(objMusica.get(numerosGerados.get(k)).getTituloMusica() + " ");
            System.out.println(objMusica.get(numerosGerados.get(k)).getFavorita().equalsIgnoreCase("s")? ("(Favorita)"):"");
        }    
            
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
                //System.out.println("Duracao: " + objMusica.get(j).getDuracaoMusica());
                //System.out.println("Duracao em segundos: " + objMusica.get(j).getDuracaoSegundos());
                i++;
            }
        }
        System.out.println("-------------------------------");
                    
    }
    
    public static int converteTempoParaSegundos(String tempoRecebidoString) {
        
        int tempoConvertido=0;
        int minutos=0;
        int segundos=0;
        switch(tempoRecebidoString.indexOf(":"))
        {
            case 1:
                minutos=Character.getNumericValue(tempoRecebidoString.charAt(0));
                segundos= Character.getNumericValue(tempoRecebidoString.charAt(2))*10 + Character.getNumericValue(tempoRecebidoString.charAt(3));
                break;
            case 2:
                minutos=Character.getNumericValue(tempoRecebidoString.charAt(0))*10 + Character.getNumericValue(tempoRecebidoString.charAt(1));
                segundos= Character.getNumericValue(tempoRecebidoString.charAt(3))*10 + Character.getNumericValue(tempoRecebidoString.charAt(4));
                break;    
        }
        tempoConvertido=minutos*60 + segundos;
        return tempoConvertido;
    }
}   
