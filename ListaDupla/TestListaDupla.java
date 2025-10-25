package ListaDupla;

public class TestListaDupla {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  TESTE: LISTA DUPLAMENTE ENCADEADA");
        System.out.println("========================================\n");
        
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
        
        // Testando inserções
        System.out.println(">>> Inserindo elementos...\n");
        lista.inserirFinal(10);
        lista.inserirFinal(20);
        lista.inserirFinal(30);
        lista.inserirInicio(5);
        
        System.out.println("\n>>> Estado atual da lista:\n");
        lista.listar();
        
        System.out.println("\n>>> Lista em ordem reversa:\n");
        lista.listarReverso();
        
        // Testando busca
        System.out.println("\n>>> Testando busca...\n");
        lista.buscar(20);
        lista.buscar(100);
        
        // Testando remoção
        System.out.println("\n>>> Testando remoção...\n");
        lista.remover(20);
        lista.listar();
        
        System.out.println("\n========================================");
    }
}