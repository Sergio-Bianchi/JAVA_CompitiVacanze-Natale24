public class ContoCorrente {


    public static void main(String[] args) {
    }


    private double saldo;
    private final int id;
    private String intestatario;
    private static int lastId = 0;

    /**
     * Preleva del denaro dal conto
     * @param importo     soldi da prelevare
     * */
    public void preleva(double importo) {
        assert importo < getSaldo();
        saldo -= importo;
    }

    /**
     * Crea un conto corrente con saldo 0
    * */
    public ContoCorrente() {
        this(0.0);
    }

    /**
     * Crea un conto corrente con un saldo iniziale
     * @param saldoIniziale     Saldo iniziale del CC
     * */
    public ContoCorrente(double saldoIniziale) {
        this("Unknown", saldoIniziale);
    }


    /**
     * Crea un conto corrente con un saldo iniziale e il nome dell'intestatario
     * @param intestatario      Intestatario del CC
     * @param saldoIniziale     Saldo iniziale del CC
     * */
    public ContoCorrente(String intestatario, double saldoIniziale) {
        this.saldo = saldoIniziale;
        this.intestatario = intestatario;
        lastId ++;
        this.id = lastId;
    }

    /**
     * Fornisce il numero del conto bancario
     * @return      numero del conto
     */
    public int getId() {
        return id;
    }

    /**
     * Deposita del denaro nel conto
     * @param importo     soldi da depositare
     * */
    public void deposita(double importo) {
        if (importo < 0)
            throw new IllegalArgumentException();
        saldo += importo;
    }

    /**
     * Ispeziona il valore del saldo attuale del conto bancario
     * @return      il saldo attuale
     * */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Trasferisce un importo ad un altro conto.
     * @param importo   importo da trasferire
     * @param conto     conto corrente su cui inviare i soldi
     * */
    public void bonifico(double importo, ContoCorrente conto) {
        this.preleva(importo);
        conto.deposita(importo);
    }

    /** Aggiunge gli interessi a un conto corrente
     * @param tassoDiInteresse  tasso percentuale di interesse
     *                          Il tasso deve essere positivo o nullo
     * @param conto             conto corrente su cui applicare il tasso
     */
    public static void aggiungiInteressi(double tassoDiInteresse, ContoCorrente conto) {
       double interessi = conto.getSaldo() * tassoDiInteresse / 100;
       conto.deposita(interessi);
    }

}


