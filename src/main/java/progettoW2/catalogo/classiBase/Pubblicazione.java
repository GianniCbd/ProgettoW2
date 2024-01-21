package progettoW2.catalogo.classiBase;


public abstract class Pubblicazione {
        private String isbn;
        private String titolo;
        private int annoPubblicazione;
        private int numeroPagine;

        public Pubblicazione(String isbn, String titolo, int annoPubblicazione, int numoeroPagine) {
            this.isbn = isbn;
            this.titolo = titolo;
            this.annoPubblicazione = annoPubblicazione;
            this.numeroPagine = numoeroPagine;
        }

        public String getIsbn() {
            return isbn;
        }

        public String getTitolo() {
            return titolo;
        }

        public int getAnnoPubblicazione() {
            return annoPubblicazione;
        }

        public int getNumoeroPagine() {
            return numeroPagine;
        }


    }

