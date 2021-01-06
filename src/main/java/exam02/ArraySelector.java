package exam02;

//Írj egy olyan metódust az ArraySelector osztályban, mely egy kapott tömbből minden második elemet kiválogat,
// és egy szövegként összerak, szögletes zárójelek között!A páros megállapítása index szerint működik.
// Azaz az első, nulla indexű elem páros, a második, azaz egyes indexű elem páratlan, stb.Ha nulla elemű a tömb,
// akkor üres stringet adjon vissza!

public class ArraySelector {

    private int[] numbers = new int[20];

    public ArraySelector(int[] numbers) {
        this.numbers = numbers;
    }

    public ArraySelector() {
    }

    public int[] getNumbers() {
        return numbers;
    }

    public String selectEvens(int[] numbers){
        String s= "";
        if(numbers.length == 0) return s;
        for(int i=0; i< numbers.length; i += 2){
            if(numbers.length <= 2){
                s = s.concat(String.valueOf(numbers[i]));
            }else
                s = s.concat(String.valueOf(numbers[i]))+",";

        }return "[" + s + "]";
    }
}
