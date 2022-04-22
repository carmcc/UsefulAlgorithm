package pa2022.tutorato.esercizi.es2;

import java.util.Collection;

public class UsefulAlgorithm {
    /*Scrivere un metodo generico che conta i numeri degli elementi
     * in una collezione che soddisfano una certa proprietà
     * (es, essere dispari, pari, primi, etc)*/

    //collezione e proprietà sono i due elementi chiave
    public <T> int countIf(Collection<T> collection, Property<T> property) {
        int counter = 0;
        for (T element : collection) {
            if (property.checkProperty(element))
                counter++;
        }
        return counter;
    }

    /*
     * Scrivere un metodo generico che scambia la posizione
     * di due elementi differenti in un array*/
    public <T> void swapArrayElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
