public class VetoresEleven {
    public static void main(String[] args) {
        
        int[] A = {16, 7, 20, 4, 11, 6, 7, 8, 9, 1};
        
        int contadorPares = 0;
       
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) { 
                contadorPares++; // Incrementa o contador
            }
        }

    
        System.out.println("O vetor A possui " + contadorPares + " elementos pares.");
        
        System.out.print("Elementos pares: ");
        for (int num : A) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}