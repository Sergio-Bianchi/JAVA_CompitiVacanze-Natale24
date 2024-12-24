public class InsiemeDiNumeri {

    private int[] array;



    public boolean contains(int n) {
        for(int i : array) {
            if(i==n) return true;
        }
        return false;
    }

    

}
