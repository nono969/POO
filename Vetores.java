public class Vetores {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        
        int[] B = new int[A.length];
        
        for(int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        
        System.out.println("Vetor B:");
        for (int num : B) {
            System.out.print(num + " ");
        }
    }
}