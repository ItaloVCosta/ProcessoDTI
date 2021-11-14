public class Musica {
    
    private String tituloMusica;
    private String duracaoMusica;
    private String favorita;
    private int idAlbum;
    private int duracaoSegundos;

    public String getTituloMusica()
    {
        return this.tituloMusica;
    }

    public String getDuracaoMusica()
    {
        return this.duracaoMusica;
    }

    public String getFavorita()
    {
        return this.favorita;
    }

    public int getIdAlbum()
    {
        return this.idAlbum;
    }

    public int getDuracaoSegundos()
    {
        return this.duracaoSegundos;
    }
    
    public void setTituloMusica(String tituloRecebido)
    {
        this.tituloMusica=tituloRecebido;
    }

    public void setDuracaoMusica(String duracaoRecebida)
    {
        this.duracaoMusica=duracaoRecebida;
    }

    public void setFavorita(String favoritaRecebida)
    {
        this.favorita=favoritaRecebida;
    }

    public void setIdAlbum(int idRecebido)
    {
        this.idAlbum=idRecebido;
    }

    public void setDuracaoSegundos(int segundosRecebidos)
    {
        this.duracaoSegundos=segundosRecebidos;
    }
 }

