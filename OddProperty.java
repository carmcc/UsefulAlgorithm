package pa2022.tutorato.esercizi.es2;

public class OddProperty implements Property<Integer> {
    /**
     * @param number
     * @return number
     */
    @Override
    public boolean checkProperty(Integer number) {
        //verifico se un nr è dispari
        return number % 2 != 0;
    }
}
