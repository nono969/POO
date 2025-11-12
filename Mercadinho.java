public class Mercadinho{
    private Cliente[] clientes = new Cliente[5];
    private int qtde = 0;
    


//metodos
    public void adicionarCliente(Cliente c){
        if(qtde < this.clientes.length)
            clientes[qtde] = c;
            qtde++;
        }else{
            System.out.println("Cheio!");
    }
    
    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < qtde; i++){
            total += clientes[i].calcularPagamento();
    }

    public void imprimirClientes(){
        for(int i = 0; i < qtde; i++){
            Cliente c = clientes[i];
        System.out.println(clientes[i].getNome());

        } 
    }
}
}
