package progettoW2;

import progettoW2.catalogo.classiBase.Archivio;
import progettoW2.catalogo.classiBase.Pubblicazione;
import progettoW2.catalogo.classiConcrete.Libro;
import progettoW2.catalogo.classiConcrete.Rivista;
import progettoW2.catalogo.periodicita.Periodicita;

public class Application {

    public static void main(String[] args) {

        Libro l1 = new Libro("prova1", "Harry Potter", 2020, 200, "Mariotide", "Informazione");
        Libro l2 = new Libro("prova2", "GoT", 2021, 199, "Anna", "Informazione");
        Libro l3 = new Libro("prova3", "Imparare a riconoscere le stelle da ubriaco", 2021, 250, "Mariotide", "Informazione");
        Rivista r1 = new Rivista("prova4", "A cosa serve la parte sinistra del corpo", 2020, 80, Periodicita.MENSILE);
        Rivista r2 = new Rivista("prova5", "Cucina con Benedetta Rossi: ", 2021, 75, Periodicita.MENSILE);
        Rivista r3 = new Rivista("prova6", "Simulare efficacemente il silenzio ecco come: ", 2020, 60, Periodicita.MENSILE);
        Archivio libreria = new Archivio();
        libreria.nuovoElemento(l1);
        libreria.nuovoElemento(l2);
        libreria.nuovoElemento(l3);
        libreria.nuovoElemento(r1);
        libreria.nuovoElemento(r2);
        libreria.nuovoElemento(r3);

        System.out.println("Libri");
        System.out.println(l1.getTitolo()+ ", " + l2.getTitolo() + ", " + l3.getTitolo());

        System.out.println("*********************");

        System.out.println("Riviste");
        System.out.println(r1.getTitolo()+ ", " + r2.getTitolo() + ", " + r3.getTitolo());

        System.out.println("*********************");

        // Stampa tutti i libri pubblicati nel 2021
        System.out.println("Libri pubblicati nel 2021:");
        for (Pubblicazione pubblicazione : libreria.ricercaPerAnno(2021)) {
            if (pubblicazione instanceof Libro) {
                System.out.println(pubblicazione.getTitolo());
            }
        }
        System.out.println("*********************");

        // Stampa tutti i libri di Mariotide
        System.out.println("Libri di Mariotide:");
        for (Pubblicazione pubblicazione : libreria.ricercaPerAutore("Mariotide")) {
            if (pubblicazione instanceof Libro) {
                System.out.println(pubblicazione.getTitolo());
            }
        }
        System.out.println("*********************");

        // Stampa tutti i libri di Anna
        System.out.println("Libri di Anna Paffuto:");
        for (Pubblicazione pubblicazione : libreria.ricercaPerAutore("Anna")) {
            if (pubblicazione instanceof Libro) {
                System.out.println(pubblicazione.getTitolo());
            }
        }
        System.out.println("*********************");

        //elimina con Isbn
        Pubblicazione libroRimosso = libreria.eliminaElemento("prova1");
        System.out.println("Libro rimosso:");
        System.out.println(libroRimosso.getTitolo());


        //cerca con isbn
        Pubblicazione cerca = libreria.cercaConIsbn("prova2");
        System.out.println("Cerca Isbn");
        System.out.println(cerca.getTitolo());

    }
    }


