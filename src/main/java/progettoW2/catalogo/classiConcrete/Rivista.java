package progettoW2.catalogo.classiConcrete;

import progettoW2.catalogo.classiBase.Pubblicazione;
import progettoW2.catalogo.periodicita.Periodicita;

public class Rivista extends Pubblicazione {
    private Periodicita periodicita;

    public Rivista(String isbn, String titolo, int annoPubblicazione, int numeroPagine,Periodicita periodicita) {
        super(isbn, titolo, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }
}
