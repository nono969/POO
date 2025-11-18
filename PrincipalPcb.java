public class PrincipalPcb {
    public static void main(String[] args) {
        //Crie um objeto da classe CadastroPagamento;
        CadastroPagamento cadastro = new CadastroPagamento();
        
        //Adicione vários pagamentos ao cadastro;
        System.out.println("=== ADICIONANDO PAGAMENTOS ===");
        
        // Pagamentos PIX (sem taxa)
        cadastro.adicionar(new PIX("Joana", 150.0, "joana@email.com"));
        cadastro.adicionar(new PIX("Maria", 200.0, "11999998888"));
        
        // Pagamentos Boleto (taxa de 1.5%)
        cadastro.adicionar(new Boleto("Pedro", 300.0, "23793381286008385381054090008825851120122010"));
        cadastro.adicionar(new Boleto("Ana Oliveira", 450.0, "34191767876004135245952945573305735870000000"));
        
        // Pagamentos Cartão de Crédito (taxa de 2% por parcela)
        cadastro.adicionar(new CartaoDeCredito("KAMYLA FELIX", 500.0, 1));  // 1 parcela
        cadastro.adicionar(new CartaoDeCredito("rhilary alves", 800.0, 3)); // 3 parcelas
        cadastro.adicionar(new CartaoDeCredito("Roberto Alves Filho", 1000.0, 6)); // 6 parcelas
        
        System.out.println("Pagamentos adicionados com sucesso!\n");
        
        // Mostre todos os pagamentos adicionados;
        System.out.println("=== LISTANDO TODOS OS PAGAMENTOS ===");
        cadastro.imprimirPagamentos();
        
        // Mostre o valor total de todos os pagamentos.
        System.out.println("\n=== VALOR TOTAL CONSOLIDADO ===");
        double total = cadastro.calcularTotal();
        System.out.printf("TOTAL GERAL DOS PAGAMENTOS: R$ %.2f%n", total);
    }
}