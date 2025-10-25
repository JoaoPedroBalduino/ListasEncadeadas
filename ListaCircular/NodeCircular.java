package ListaCircular;

/**
 * Classe NodeCircular representa um nó da lista circular
 */
public class NodeCircular {
    int dado;
    NodeCircular proximo;
    
    public NodeCircular(int dado) {
        this.dado = dado;
        this.proximo = null;
    }
}