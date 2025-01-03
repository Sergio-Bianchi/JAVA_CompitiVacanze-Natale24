import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Casello {

    List<Veicolo> veicoli;


    static public void main(String[] args) {
        Casello c = new Casello();
        c.accoda("AA000BB");
        c.accoda("CC111DD");
        c.accoda("EE424FF");

        System.out.println(c);
        c.esciEPaga();
        c.esciEPaga();

        System.out.println(c);
        c.accoda("HH945HH");
        System.out.println(c);
        c.esciEPaga();
        System.out.println(c);
        System.out.println(c.esciEPaga());
        System.out.println(c.esciEPaga());
        System.out.println(c);


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
        if(veicoli.isEmpty()) return new Veicolo("null");
        return veicoli.removeFirst();
    }



}
