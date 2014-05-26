package tmethoddemo2;
public class TMethodDemo2 {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        Arrmethod(A);
        System.out.println("呼叫ArrMethod之後");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] +" ");
        }
    }
    public static void Arrmethod(int[] A) {
        int i;
        for (i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
    }
}
