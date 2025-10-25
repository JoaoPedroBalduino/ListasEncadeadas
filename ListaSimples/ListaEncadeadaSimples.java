package ListaSimples;

public class ListaEncadeadaSimples {
    private Node inicio;
    
    public ListaEncadeadaSimples() {
        this.inicio = null;
    }
    
    // Inserir no início
    public void inserirInicio(int dado) {
        Node novoNode = new Node(dado);
        novoNode.proximo = inicio;
        inicio = novoNode;
        System.out.println("Elemento " + dado + " inserido no início.");
    }
    
    // Inserir no final
    public void inserirFinal(int dado) {
        Node novoNode = new Node(dado);
        
        if (inicio == null) {
            inicio = novoNode;
            System.out.println("Elemento " + dado + " inserido no final.");
            return;
        }
        
        Node atual = inicio;
        while (atual.proximo != null) {
            atual = atual.proximo;
        }
        atual.proximo = novoNode;
        System.out.println("Elemento " + dado + " inserido no final.");
    }
    
    // Inserir em posição específica
    public void inserirPosicao(int dado, int posicao) {
        if (posicao == 0) {
            inserirInicio(dado);
            return;
        }
        
        Node novoNode = new Node(dado);
        Node atual = inicio;
        
        for (int i = 0; i < posicao - 1 && atual != null; i++) {
            atual = atual.proximo;
        }
        
        if (atual == null) {
            System.out.println("Posição inválida!");
            return;
        }
        
        novoNode.proximo = atual.proximo;
        atual.proximo = novoNode;
        System.out.println("Elemento " + dado + " inserido na posição " + posicao);
    }
    
    // Buscar elemento
    public boolean buscar(int dado) {
        Node atual = inicio;
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
        
        if (inicio.dado == dado) {
            inicio = inicio.proximo;
            System.out.println("Elemento " + dado + " removido.");
            return;
        }
        
        Node atual = inicio;
        while (atual.proximo != null && atual.proximo.dado != dado) {
            atual = atual.proximo;
        }
        
        if (atual.proximo == null) {
            System.out.println("Elemento " + dado + " não encontrado.");
            return;
        }
        
        atual.proximo = atual.proximo.proximo;
        System.out.println("Elemento " + dado + " removido.");
    }
    
    // Listar todos os elementos
    public void listar() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }
        
        System.out.print("Lista: ");
        Node atual = inicio;
        while (atual != null) {
            System.out.print(atual.dado);
            if (atual.proximo != null) {
                System.out.print(" -> ");
            }
            atual = atual.proximo;
        }
        System.out.println(" -> null");
    }
    
    // Obter representação visual
    public String getRepresentacao() {
        if (inicio == null) return "Lista vazia";
        
        StringBuilder sb = new StringBuilder();
        Node atual = inicio;
        while (atual != null) {
            sb.append("[").append(atual.dado).append("]");
            if (atual.proximo != null) {
                sb.append(" -> ");
            }
            atual = atual.proximo;
        }
        sb.append(" -> null");
        return sb.toString();
    }
}