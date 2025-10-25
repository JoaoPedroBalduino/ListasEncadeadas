package ListaSimples;

public class TestListaSimples {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   TESTE: LISTA ENCADEADA SIMPLES");
        System.out.println("========================================\n");
        
        ListaEncadeadaSimples lista = new ListaEncadeadaSimples();
        
        // Testando inserções
        System.out.println(">>> Inserindo elementos...\n");
        lista.inserirFinal(10);
        lista.inserirFinal(20);
        lista.inserirFinal(30);
        lista.inserirInicio(5);
        lista.inserirPosicao(15, 2);
        
        System.out.println("\n>>> Estado atual da lista:\n");
        lista.listar();
        
        // Testando busca
        System.out.println("\n>>> Testando busca...\n");
        lista.buscar(20);
        lista.buscar(100);
        
        // Testando remoção
        System.out.println("\n>>> Testando remoção...\n");
        lista.remover(15);
        lista.listar();
        
        System.out.println("\n========================================");
    }
}