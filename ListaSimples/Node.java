package ListaSimples;

/**
 * Classe Node representa um nó da lista encadeada simples
 */
public class Node {
    int dado;
    Node proximo;
    
    public Node(int dado) {
        this.dado = dado;
        this.proximo = null;
    }
}