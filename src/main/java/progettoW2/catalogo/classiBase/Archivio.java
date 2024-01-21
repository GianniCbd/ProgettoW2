package progettoW2.catalogo.classiBase;

import progettoW2.catalogo.classiConcrete.Libro;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Archivio {
    private Map<String, Pubblicazione> listaArchivio = new HashMap<String, Pubblicazione>();


    public void nuovoElemento(Pubblicazione elemento) {
        listaArchivio.put(elemento.getIsbn(), elemento);
    }

    public Pubblicazione eliminaElemento(String isbn) {
        Pubblicazione rimossa = listaArchivio.remove(isbn);
        return rimossa;
    }

    public Pubblicazione cercaConIsbn(String isbn) {
        return listaArchivio.get(isbn);
    }

    public List<Pubblicazione> ricercaPerAnno (int anno){
        Collection<Pubblicazione> x = listaArchivio.values();
        return x.stream().filter(p->p.getAnnoPubblicazione()==anno).collect(Collectors.toList());
    }
    public List<Libro> ricercaPerAutore (String autore){

        return listaArchivio.values().stream().filter(p->p.getClass()== Libro.class).map(p->(Libro)p).filter(p->p.getAutore().equals(autore)).collect(Collectors.toList());
    }

    public void svuota() {
        listaArchivio.clear();
    }

}
