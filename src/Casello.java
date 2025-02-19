import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Casello {

    List<Veicolo> veicoli;


    static public void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(ricercaBinariaRicorsiva(arr, 10, 0, arr.length-1));

    }


    public Casello() {
        veicoli = new ArrayList<Veicolo>(100);
    }

    public String toString() {
        ListIterator<Veicolo> iterator = veicoli.listIterator();
        StringBuilder output = new StringBuilder();
        output.append("----------\n");
        while (iterator.hasNext()) {
            output.append(iterator.next()).append('\n');
        }
        output.append("----------\n");


        return output.toString();
    }

    public void accoda(String targa) {
        veicoli.add(new Veicolo(targa));
    }

    public void accoda(Veicolo veicolo) {
        veicoli.add(veicolo);
    }

    public Veicolo esciEPaga() {
        if (veicoli.isEmpty()) return new Veicolo("null");
        return veicoli.removeFirst();
    }

    /*
     * @param lista l'array ordinato su cui effettuare la ricerca
     * @param key il valore da cercare
     * @return la posizione del valore trovato, -1 se non l'ha trovato
     */
    static public int ricercaBinariaRicorsiva(int[] lista, int key, int low, int high) {
        int mid;
        mid = (low + high) / 2;
        if (mid < low || high < 0) {
            return -1; //Valore non trovato
        } else if (key < lista[mid]) {
            return ricercaBinariaRicorsiva(lista, key, low, mid - 1);
        } else if (key > lista[mid]) {
            return ricercaBinariaRicorsiva(lista, key, mid + 1, high);
        } else {
            return mid; //Valore trovato nella posizione mid
        }
    }


}
