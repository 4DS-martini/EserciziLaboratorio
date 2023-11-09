package opereDarte;

public abstract class OperaDarte {
    protected String titolo;
    protected String artista;

    public OperaDarte(String t, String a){
        setTitolo(t);
        setArtista(a);
    }

    public OperaDarte(OperaDarte od1){
        setTitolo(od1.getTitolo());
        setArtista(od1.getArtista());
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getArtista() {
        return artista;
    }

    public abstract double printIngombro();
}
