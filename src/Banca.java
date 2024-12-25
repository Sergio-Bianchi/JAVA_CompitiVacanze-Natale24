/**
 * Rappresenta una semplice banca composta da dei conti correnti
 *
 * @author Sergio-Bianchi
 * @version 02.12.2024
 * */
public class Banca {
    private String nome;
    private ContoCorrente[] conti; // 1. Dichiarazione


    public static void main(String[] args) {
        Banca b = new Banca("Banca di Sciarborasca");
        b.apriConto("Mario Palladino");
        b.apriConto("Nicola Palmieri");
        b.apriConto("Ernesto Fiammata");
        b.apriConto("Federica Danese");
        System.out.println(b);
    }

    public Banca(String nome) {
        this.nome = nome;
        conti = new ContoCorrente[10]; // 2. allocazione dei puntatori

        /* * Come allocare i puntatori in Java
        * 1.    Conti vale null
        * 2.    Conti diventa un puntatore a un array di puntatori a null
        *           Conti -> [null][null][null][null][null][null][null][null][null][null]
        * 4.
        * */
    }

    /**
     * Apre un nuovo conto corrente con saldo 0 e
     * restituisce l'IBAN del conto creato
     *
     * @param intestatario nome del detentore del conto corrente
     * @return IBAN del conto creato (comprensivo di tutte le parti)
     */
    public String apriConto(String intestatario) {
        int i = 0;
        while (conti[i] != null) i++;
        conti[i] = new ContoCorrente();

        return "AAAA0001"+(i+1);
    }

    /**
     * Crea una rappresentazione della banca
     * @return      una stringa che rappresenta lo stato della banca
     * */
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(this.nome);
        output.append("\nContiCorrenti:\n");
        for (int i = 0; conti[i] != null; i++) {
            output.append(conti[i].getId());
            output.append("     ");
            output.append(conti[i].getSaldo());
            output.append("\n");
        }
        return output.toString();
    }
}








