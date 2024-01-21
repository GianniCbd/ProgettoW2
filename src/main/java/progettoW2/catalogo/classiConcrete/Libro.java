package progettoW2.catalogo.classiConcrete;

import progettoW2.catalogo.classiBase.Pubblicazione;

public class Libro extends Pubblicazione {
    private String autore;
    private String genere;

    public Libro(String isbn, String titolo, int annoPubblicazione, int numeroPagine,String autore,String genere) {
        super(isbn, titolo, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public String getGenere() {
        return genere;
    }


}
