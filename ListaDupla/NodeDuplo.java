package ListaDupla;

/**
 * Classe NodeDuplo representa um nó da lista duplamente encadeada
 */
public class NodeDuplo {
    int dado;
    NodeDuplo proximo;
    NodeDuplo anterior;
    
    public NodeDuplo(int dado) {
        this.dado = dado;
        this.proximo = null;
        this.anterior = null;
    }
}