import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorLetras {
    public static void main(String[] args) {
        //cria a janela
        JFrame frame = new JFrame("Contador de Letras 'a'");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        //cria o texto inicial
        JLabel label = new JLabel("Digite uma string:");
        label.setBounds(10, 20, 150, 25);
        frame.add(label);

        JTextField textField = new JTextField();
        textField.setBounds(160, 20, 200, 25);
        frame.add(textField);
        
        //botão para realizar a contagem
        JButton button = new JButton("Contar Letras 'a'");
        button.setBounds(10, 60, 150, 25);
        frame.add(button);

        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(10, 100, 350, 25);
        frame.add(resultLabel);

            button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();

                //conta o número de vezes que 'a' ou 'A' aparece
                int count = contarLetrasA(input);
                resultLabel.setText("Número de letras 'a/A': " + count);
            }
        });

        // Exibir o frame
        frame.setVisible(true);
    }

    // Método para contar as letras 'a' e 'A'
    public static int contarLetrasA(String texto) {
        int count = 0;
        if (texto != null) {
            for (char c : texto.toCharArray()) {
                if (c == 'a' || c == 'A') {
                    count++;
                }
            }
        }
        return count;
    }
}
