package ListaCircular;

public class TestListaCircular {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   TESTE: LISTA ENCADEADA CIRCULAR");
        System.out.println("========================================\n");
        
        ListaEncadeadaCircular lista = new ListaEncadeadaCircular();
        
        // Testando inserções
        System.out.println(">>> Inserindo elementos...\n");
        lista.inserirFinal(10);
        lista.inserirFinal(20);
        lista.inserirFinal(30);
        lista.inserirInicio(5);
        
        System.out.println("\n>>> Estado atual da lista:\n");
        lista.listar();
        
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