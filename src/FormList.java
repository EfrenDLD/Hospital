import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FormList extends JFrame {
    private JTable jTable;
    private DefaultTableModel modelo;
    private JButton regresar, cerrar;
    private JPanel panelButton1;
    private ButtonGroup buttonGroup2;

    public FormList() {
        initControl();
        configTable();
        configFrame();
        setControl();
        regresar();
    }
    private void initControl() {
        panelButton1 = new JPanel();
        regresar = new JButton();
        cerrar = new JButton();
        buttonGroup2 = new ButtonGroup();
    }
    private void configFrame() {
        setTitle("Tabla de pacientes");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(900, 200);
    }

    private void setControl() {
        regresar.setText("Regresar al registro");
        cerrar.setText("Cerrar registro");
    }

    private void configTable() {
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(Titulos.titulos);
        String[] fila = new String[modelo.getColumnCount()];
        ArrayList<Paciente> lista = Formulario.getElemento();
        for (Paciente userTable : lista) {
            fila[0] = userTable.getNombre();
            fila[1] = userTable.getApellido();
            fila[2] = userTable.getApellido2();
            fila[3] = userTable.getEdad();
            fila[4] = userTable.getCorreo();
            fila[5] = userTable.getTelefono();
            fila[6] = userTable.getNombreMedico();
            fila[7] = userTable.getHoraCita();
            fila[8] = userTable.getFecha();
            modelo.addRow(fila);
        }
        jTable = new JTable(modelo);
        jTable.setGridColor(new Color(245, 255, 46));
        jTable.setPreferredScrollableViewportSize(new Dimension(800, 70));
        JScrollPane scrollPane = new JScrollPane(jTable);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }

    private void regresar() {
        regresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Formulario formulario = new Formulario();
                formulario.setVisible(true);
            }
        });
        panelButton1.add(regresar);
        getContentPane().add(panelButton1);
    }
}
