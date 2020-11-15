package arrayofarrays;

public class ArrayOfArrysMain {


    public int [] [] multiplicationTable(int size){
        int [] [] multTable = new int [size] [size];
        for (int i=1; i <= size;i++){
            for (int j=1; j<= size; j++){
                multTable [i-1] [j-1] = i*j;
                System.out.print(multTable [i-1] [j-1]);
            }
            System.out.println();
        }
        return  multTable;
    }

    public int [] [] triangularMatrix(int size){
        int [] [] triangularMatrix = new int [size] [];
        for (int i=0; i < triangularMatrix.length;i++){
            triangularMatrix [i] = new int[i+1];
            for (int j=0; j< i+1; j++){
                triangularMatrix [i] [j] = i;
                System.out.print(triangularMatrix [i] [j]);
            }
            System.out.println();
        }
        return  triangularMatrix;

    }

    public static void main(String[] args) {
        ArrayOfArrysMain arrayOfArrysMain = new ArrayOfArrysMain();
        arrayOfArrysMain.multiplicationTable(3);
        arrayOfArrysMain.triangularMatrix(4);

    }
}
