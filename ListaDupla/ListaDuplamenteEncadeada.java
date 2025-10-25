package ListaDupla;

/**
 * Lista Duplamente Encadeada
 * Cada nó aponta para o próximo e para o anterior
 */
public class ListaDuplamenteEncadeada {
    private NodeDuplo inicio;
    private NodeDuplo fim;
    
    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }
    
    // Inserir no início
    public void inserirInicio(int dado) {
        NodeDuplo novoNode = new NodeDuplo(dado);
        
        if (inicio == null) {
            inicio = fim = novoNode;
        } else {
            novoNode.proximo = inicio;
            inicio.anterior = novoNode;
            inicio = novoNode;
        }
        System.out.println("Elemento " + dado + " inserido no início.");
    }
    
    // Inserir no final
    public void inserirFinal(int dado) {
        NodeDuplo novoNode = new NodeDuplo(dado);
        
        if (fim == null) {
            inicio = fim = novoNode;
        } else {
            novoNode.anterior = fim;
            fim.proximo = novoNode;
            fim = novoNode;
        }
        System.out.println("Elemento " + dado + " inserido no final.");
    }
    
    // Buscar elemento
    public boolean buscar(int dado) {
        NodeDuplo atual = inicio;
        int posicao = 0;
        
        while (atual != null) {
            if (atual.dado == dado) {
                System.out.println("Elemento " + dado + " encontrado na posição " + posicao);
                return true;
            }
            atual = atual.proximo;
            posicao++;
        }
        
        System.out.println("Elemento " + dado + " não encontrado.");
        return false;
    }
    
    // Remover elemento
    public void remover(int dado) {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }
        
        NodeDuplo atual = inicio;
        
        while (atual != null && atual.dado != dado) {
            atual = atual.proximo;
        }
        
        if (atual == null) {
            System.out.println("Elemento " + dado + " não encontrado.");
            return;
        }
        
        if (atual.anterior != null) {
            atual.anterior.proximo = atual.proximo;
        } else {
            inicio = atual.proximo;
        }
        
        if (atual.proximo != null) {
            atual.proximo.anterior = atual.anterior;
        } else {
            fim = atual.anterior;
        }
        
        System.out.println("Elemento " + dado + " removido.");
    }
    
    // Listar do início ao fim
    public void listar() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }
        
        System.out.print("Lista (início -> fim): null <- ");
        NodeDuplo atual = inicio;
        while (atual != null) {
            System.out.print(atual.dado);
            if (atual.proximo != null) {
                System.out.print(" <-> ");
            }
            atual = atual.proximo;
        }
        System.out.println(" -> null");
    }
    
    // Listar do fim ao início
    public void listarReverso() {
        if (fim == null) {
            System.out.println("Lista vazia!");
            return;
        }
        
        System.out.print("Lista (fim -> início): null <- ");
        NodeDuplo atual = fim;
        while (atual != null) {
            System.out.print(atual.dado);
            if (atual.anterior != null) {
                System.out.print(" <-> ");
            }
            atual = atual.anterior;
        }
        System.out.println(" -> null");
    }
    
    public String getRepresentacao() {
        if (inicio == null) return "Lista vazia";
        
        StringBuilder sb = new StringBuilder("null <- ");
        NodeDuplo atual = inicio;
        while (atual != null) {
            sb.append("[").append(atual.dado).append("]");
            if (atual.proximo != null) {
                sb.append(" <-> ");
            }
            atual = atual.proximo;
        }
        sb.append(" -> null");
        return sb.toString();
    }
}