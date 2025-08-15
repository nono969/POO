public class VetoresTen {
    public static void main (String[] args){
       int[] A = {1, 200, 322, 4, 35, 6, 7, 8, 9, 99};
       
       int[] B = new int[A.length];

       for(int i = 0; i < A.length; i++){
             B[i] = A[i] % 2;
       }
       
       System.out.println("VETOR B: ");
       for (int num: B){
           System.out.print(num + " ");
       }
    }
}
    
