package ListaCircular;

/**
 * Lista Encadeada Circular
 * O último nó aponta de volta para o primeiro
 */
public class ListaEncadeadaCircular {
    private NodeCircular inicio;
    
    public ListaEncadeadaCircular() {
        this.inicio = null;
    }
    
    // Inserir no início
    public void inserirInicio(int dado) {
        NodeCircular novoNode = new NodeCircular(dado);
        
        if (inicio == null) {
            inicio = novoNode;
            novoNode.proximo = inicio;
        } else {
            NodeCircular atual = inicio;
            while (atual.proximo != inicio) {
                atual = atual.proximo;
            }
            novoNode.proximo = inicio;
            atual.proximo = novoNode;
            inicio = novoNode;
        }
        System.out.println("Elemento " + dado + " inserido no início.");
    }
    
    // Inserir no final
    public void inserirFinal(int dado) {
        NodeCircular novoNode = new NodeCircular(dado);
        
        if (inicio == null) {
            inicio = novoNode;
            novoNode.proximo = inicio;
        } else {
            NodeCircular atual = inicio;
            while (atual.proximo != inicio) {
                atual = atual.proximo;
            }
            atual.proximo = novoNode;
            novoNode.proximo = inicio;
        }
        System.out.println("Elemento " + dado + " inserido no final.");
    }
    
    // Buscar elemento
    public boolean buscar(int dado) {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return false;
        }
        
        NodeCircular atual = inicio;
        int posicao = 0;
        
        do {
            if (atual.dado == dado) {
                System.out.println("Elemento " + dado + " encontrado na posição " + posicao);
                return true;
            }
            atual = atual.proximo;
            posicao++;
        } while (atual != inicio);
        
        System.out.println("Elemento " + dado + " não encontrado.");
        return false;
    }
    
    // Remover elemento
    public void remover(int dado) {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }
        
        NodeCircular atual = inicio;
        NodeCircular anterior = null;
        
        // Se for o primeiro elemento
        if (inicio.dado == dado) {
            if (inicio.proximo == inicio) {
                inicio = null;
            } else {
                while (atual.proximo != inicio) {
                    atual = atual.proximo;
                }
                atual.proximo = inicio.proximo;
                inicio = inicio.proximo;
            }
            System.out.println("Elemento " + dado + " removido.");
            return;
        }
        
        // Procurar o elemento
        anterior = inicio;
        atual = inicio.proximo;
        
        do {
            if (atual.dado == dado) {
                anterior.proximo = atual.proximo;
                System.out.println("Elemento " + dado + " removido.");
                return;
            }
            anterior = atual;
            atual = atual.proximo;
        } while (atual != inicio);
        
        System.out.println("Elemento " + dado + " não encontrado.");
    }
    
    // Listar todos os elementos
    public void listar() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }
        
        System.out.print("Lista Circular: ");
        NodeCircular atual = inicio;
        do {
            System.out.print(atual.dado);
            atual = atual.proximo;
            if (atual != inicio) {
                System.out.print(" -> ");
            }
        } while (atual != inicio);
        System.out.println(" -> (volta ao início)");
    }
    
    public String getRepresentacao() {
        if (inicio == null) return "Lista vazia";
        
        StringBuilder sb = new StringBuilder();
        NodeCircular atual = inicio;
        do {
            sb.append("[").append(atual.dado).append("]");
            atual = atual.proximo;
            if (atual != inicio) {
                sb.append(" -> ");
            }
        } while (atual != inicio);
        sb.append(" -> [").append(inicio.dado).append("]...");
        return sb.toString();
    }
}