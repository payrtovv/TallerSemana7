import javax.swing.*;

public class ListarAvengers {
    private JPanel mainPanel;
    private JTextArea textArea1;
    private ListaAvengers lista;

    public ListarAvengers(ListaAvengers lista) {
        this.lista = lista;

        StringBuilder sb = new StringBuilder();
        for (Avenger a : lista.getLista()) {
            sb.append(a.toString()).append("\n");
        }

        textArea1.setText(sb.toString());
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
