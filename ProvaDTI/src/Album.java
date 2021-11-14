public class Album {

    private String tituloAlbum;
    private int anoLancamento;
    private String nomeBanda;
    private int idAlbum;

    public String getTituloAlbum()
    {
        return this.tituloAlbum;
    }

    public int getAnoLacamento()
    {
        return this.anoLancamento;
    }

    public String getNomeBanda()
    {
        return this.nomeBanda;
    }

    public int getIdAlbum()
    {
        return this.idAlbum;
    }

    public void setTituloAlbum( String tituloRecebido)
    {
        this.tituloAlbum=tituloRecebido;
    }

    public void setAnoLacamento( int anoRecebido)
    {
        this.anoLancamento=anoRecebido;
    }

    public void setNomeBanda( String nomeBandaRecebido)
    {
        this.nomeBanda=nomeBandaRecebido;
    }

    public void setIdAlbum(int idRecebido)
    {
        this.idAlbum=idRecebido;
    }
}
