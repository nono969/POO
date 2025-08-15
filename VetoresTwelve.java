public class VetoresTwelve {
    public static void main(String[] args) {
        
        int[] A = {16, 7, 20, 4, 11, 6, 7, 8, 9, 1};
        
        int soma = 0;
       
        for (int i = 0; i < A.length; i++) {
            soma = soma + A[i];
             
        }
    
        System.out.println("O vetor A possui " + soma + " elementos.");  
    }
}