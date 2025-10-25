package GUI;

import ListaCircular.ListaEncadeadaCircular;
import ListaDupla.ListaDuplamenteEncadeada;
import ListaSimples.ListaEncadeadaSimples;
import java.awt.*;
import javax.swing.*;

public class ListaGUI extends JFrame {
    private JTextArea displayArea;
    private JTextField inputField;
    private JComboBox<String> tipoListaCombo;
    
    private ListaEncadeadaSimples listaSimples;
    private ListaDuplamenteEncadeada listaDupla;
    private ListaEncadeadaCircular listaCircular;
    private String tipoLista = "Simples";
    
    public ListaGUI() {
        listaSimples = new ListaEncadeadaSimples();
        listaDupla = new ListaDuplamenteEncadeada();
        listaCircular = new ListaEncadeadaCircular();
        
        setTitle("Visualizador de Listas - UNIFSA");
        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Container principal
        Container container = getContentPane();
        container.setLayout(new BorderLayout(10, 10));
        
        // TOPO
        JPanel topPanel = new JPanel();
        topPanel.setBackground(new Color(52, 73, 94));
        JLabel label = new JLabel("Tipo de Lista:");
        label.setForeground(Color.WHITE);
        String[] tipos = {"Simples", "Dupla", "Circular"};
        tipoListaCombo = new JComboBox<>(tipos);
        tipoListaCombo.addActionListener(e -> trocarTipoLista());
        topPanel.add(label);
        topPanel.add(tipoListaCombo);
        container.add(topPanel, BorderLayout.NORTH);
        
        // CENTRO
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setFont(new Font("Monospaced", Font.BOLD, 14));
        displayArea.setBackground(new Color(44, 62, 80));
        displayArea.setForeground(Color.WHITE);
        JScrollPane scroll = new JScrollPane(displayArea);
        container.add(scroll, BorderLayout.CENTER);
        
        // SUL - PAINEL DE BOTÕES
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.Y_AXIS));
        bottomPanel.setBackground(Color.LIGHT_GRAY);
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Linha 1: Input
        JPanel linha1 = new JPanel(new FlowLayout());
        linha1.setBackground(Color.LIGHT_GRAY);
        linha1.add(new JLabel("Valor:"));
        inputField = new JTextField(10);
        linha1.add(inputField);
        bottomPanel.add(linha1);
        
        // Linha 2: Botões de inserção e remoção
        JPanel linha2 = new JPanel(new FlowLayout());
        linha2.setBackground(Color.LIGHT_GRAY);
        
        JButton btnInicio = new JButton("Inserir Início");
        btnInicio.setBackground(new Color(46, 204, 113));
        btnInicio.setForeground(Color.WHITE);
        btnInicio.addActionListener(e -> inserirInicio());
        
        JButton btnFim = new JButton("Inserir Fim");
        btnFim.setBackground(new Color(52, 152, 219));
        btnFim.setForeground(Color.WHITE);
        btnFim.addActionListener(e -> inserirFim());
        
        JButton btnRemover = new JButton("Remover");
        btnRemover.setBackground(new Color(231, 76, 60));
        btnRemover.setForeground(Color.WHITE);
        btnRemover.addActionListener(e -> remover());
        
        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setBackground(new Color(241, 196, 15));
        btnBuscar.setForeground(Color.WHITE);
        btnBuscar.addActionListener(e -> buscar());
        
        linha2.add(btnInicio);
        linha2.add(btnFim);
        linha2.add(btnRemover);
        linha2.add(btnBuscar);
        bottomPanel.add(linha2);
        
        // Linha 3: Botões extras
        JPanel linha3 = new JPanel(new FlowLayout());
        linha3.setBackground(Color.LIGHT_GRAY);
        
        JButton btnLimpar = new JButton("Limpar Lista");
        btnLimpar.addActionListener(e -> limparLista());
        
        JButton btnExemplo = new JButton("Carregar Exemplo");
        btnExemplo.addActionListener(e -> carregarExemplo());
        
        linha3.add(btnLimpar);
        linha3.add(btnExemplo);
        bottomPanel.add(linha3);
        
        container.add(bottomPanel, BorderLayout.SOUTH);
        
        atualizarDisplay();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void trocarTipoLista() {
        tipoLista = (String) tipoListaCombo.getSelectedItem();
        atualizarDisplay();
    }
    
    private void inserirInicio() {
        try {
            int valor = Integer.parseInt(inputField.getText().trim());
            switch (tipoLista) {
                case "Simples": listaSimples.inserirInicio(valor); break;
                case "Dupla": listaDupla.inserirInicio(valor); break;
                case "Circular": listaCircular.inserirInicio(valor); break;
            }
            atualizarDisplay();
            inputField.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Digite um número válido!");
        }
    }
    
    private void inserirFim() {
        try {
            int valor = Integer.parseInt(inputField.getText().trim());
            switch (tipoLista) {
                case "Simples": listaSimples.inserirFinal(valor); break;
                case "Dupla": listaDupla.inserirFinal(valor); break;
                case "Circular": listaCircular.inserirFinal(valor); break;
            }
            atualizarDisplay();
            inputField.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Digite um número válido!");
        }
    }
    
    private void remover() {
        try {
            int valor = Integer.parseInt(inputField.getText().trim());
            switch (tipoLista) {
                case "Simples": listaSimples.remover(valor); break;
                case "Dupla": listaDupla.remover(valor); break;
                case "Circular": listaCircular.remover(valor); break;
            }
            atualizarDisplay();
            inputField.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Digite um número válido!");
        }
    }
    
    private void buscar() {
        try {
            int valor = Integer.parseInt(inputField.getText().trim());
            boolean encontrado = false;
            switch (tipoLista) {
                case "Simples": encontrado = listaSimples.buscar(valor); break;
                case "Dupla": encontrado = listaDupla.buscar(valor); break;
                case "Circular": encontrado = listaCircular.buscar(valor); break;
            }
            String msg = encontrado ? "Elemento encontrado!" : "Elemento não encontrado!";
            JOptionPane.showMessageDialog(this, msg);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Digite um número válido!");
        }
    }
    
    private void limparLista() {
        switch (tipoLista) {
            case "Simples": listaSimples = new ListaEncadeadaSimples(); break;
            case "Dupla": listaDupla = new ListaDuplamenteEncadeada(); break;
            case "Circular": listaCircular = new ListaEncadeadaCircular(); break;
        }
        atualizarDisplay();
    }
    
    private void carregarExemplo() {
        switch (tipoLista) {
            case "Simples":
                listaSimples = new ListaEncadeadaSimples();
                listaSimples.inserirFinal(10);
                listaSimples.inserirFinal(20);
                listaSimples.inserirFinal(30);
                break;
            case "Dupla":
                listaDupla = new ListaDuplamenteEncadeada();
                listaDupla.inserirFinal(100);
                listaDupla.inserirFinal(200);
                break;
            case "Circular":
                listaCircular = new ListaEncadeadaCircular();
                listaCircular.inserirFinal(5);
                listaCircular.inserirFinal(10);
                break;
        }
        atualizarDisplay();
    }
    
    private void atualizarDisplay() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n  LISTA ").append(tipoLista.toUpperCase()).append("\n");
        sb.append("  ══════════════════════════════════\n\n");
        
        String rep = "";
        switch (tipoLista) {
            case "Simples": rep = listaSimples.getRepresentacao(); break;
            case "Dupla": rep = listaDupla.getRepresentacao(); break;
            case "Circular": rep = listaCircular.getRepresentacao(); break;
        }
        
        sb.append("  ").append(rep).append("\n");
        sb.append("\n  ══════════════════════════════════\n");
        displayArea.setText(sb.toString());
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ListaGUI());
    }
}