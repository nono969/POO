public class VetoresSix {
    public static void main (String[] args){
       int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
       int[] B = {1, 12, 3, 4, 50, 6, 7, 8, 9, 1};

       int[] C = new int[A.length];

       for(int i = 0; i < A.length; i++){
            C[i] = A[i] + B[i];

       }
       
       System.out.println("VETOR c: ");
       for (int num: C){
           System.out.print(num + " ");
       }
    }
}
    
