public class CadastroPagamento {
    private Pagamento[] pagamentos;
    private int qtde;
    private int capacidade;
    
    
    public CadastroPagamento() {
        this.capacidade = 5; 
        this.pagamentos = new Pagamento[capacidade]; 
        this.qtde = 0;
    }
    
    public void adicionar(Pagamento pagamento) {
        if(qtde >= capacidade) {
            capacidade *= 2;
            Pagamento[] novoVetor = new Pagamento[capacidade];
            for(int i = 0; i < qtde; i++) {
                novoVetor[i] = pagamentos[i];
            }
            pagamentos = novoVetor;
        }
        pagamentos[qtde] = pagamento;
        qtde++;
    }
    
    // Métodos
    public double calcularTotal() {
        double total = 0.0;
        for(int i = 0; i < qtde; i++) {
            total += pagamentos[i].processarPagamento();
        }
        return total;
    }
    
    public void imprimirPagamentos() {
        System.out.println("=== RELATÓRIO DE PAGAMENTOS ===");
        for(int i = 0; i < qtde; i++) {
            Pagamento p = pagamentos[i];
            System.out.println("Cliente: " + p.nomeCliente);
            System.out.println("Valor Original: R$ " + p.valor);
            System.out.println("Valor a Pagar: R$ " + p.processarPagamento());
            System.out.println("Tipo: " + p.getClass().getSimpleName());
            System.out.println("---------------------------");
        }
        System.out.println("TOTAL GERAL: R$ " + calcularTotal());
    }
}