import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CrearAvenger {
    private JPanel mainPanel;
    private JTextField NombreTxt;
    private JTextField MisionTxt;
    private JTextField PeligrosidadTxt;
    private JTextField PagoTxt;
    private JButton registrarButton;
    private JLabel Lable2;
    private JLabel Label3;


    private ListaAvengers lista;

    public CrearAvenger(ListaAvengers lista) {
        this.lista = lista;

        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nombre = NombreTxt.getText();
                    String mision = MisionTxt.getText();
                    String peligrosidad = PeligrosidadTxt.getText();
                    double pago = Double.parseDouble(PagoTxt.getText());

                    Avenger nuevo = new Avenger("123", nombre, new Mision(mision, peligrosidad), pago);
                    lista.agregar(nuevo);

                    JOptionPane.showMessageDialog(null, "Agregado exitosamente");

                    NombreTxt.setText("");
                    MisionTxt.setText("");
                    PeligrosidadTxt.setText("");
                    PagoTxt.setText("");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error al registrar el Avenger");
                }
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}

