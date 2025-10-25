import javax.swing.*;
import java.awt.*;

public class TesteSimples extends JFrame {
    public TesteSimples() {
        setTitle("Teste");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        JTextArea area = new JTextArea("Área de texto");
        add(area, BorderLayout.CENTER);
        
        JPanel painel = new JPanel();
        painel.setBackground(Color.RED);
        JButton btn = new JButton("BOTÃO TESTE");
        painel.add(btn);
        
        add(painel, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new TesteSimples();
    }
}
