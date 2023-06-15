import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.Flow;

public class Formulario extends JFrame implements ChangeListener {
    private JPanel paneliz, paneliz2,panelde2, panelde, panelButton, panelForm, panelContainer,panelRadio,panelRadio2;
    private JLabel nombre, edad, apellido,apellido2,telefono,correo,nombreMedico,horacira,fecha,motivo,
            nota,vacio,vacio2,vacio3,vacio4,vacio5,vacio6,vacio7,saltos,saltos1,
            datos,datosCon,diabetico,datosCont,tienesTel,vacio8,vacio9,vacio10,tienesCo;
    private JTextField text1, text2, text3,text4, text5, text6,text7,text8,text9,text10;
    private JRadioButton radio1,radio2,radio3,radio4,radio5,radio6,radio7,radio8,radio9,radio10;
    private JButton btnQuery,boton1;
    private ButtonGroup buttonGroup,buttonGroup2,buttonGroup3,buttonGroup4,buttonGroup5;

    private static ArrayList<Paciente> lista = new ArrayList<>();

    EventClick eventClick = new EventClick();
    public Formulario() {
        initControl();
        configFrame();
        setControl();
        configPanel();
        add(panelContainer);
        query();
        radio1.addChangeListener(this);
        radio2.addChangeListener(this);
        radio3.addChangeListener(this);
        radio4.addChangeListener(this);
        radio5.addChangeListener(this);
        radio6.addChangeListener(this);
        radio7.addChangeListener(this);
        radio8.addChangeListener(this);
        radio9.addChangeListener(this);
        radio10.addChangeListener(this);
    }

    private void query(){
        btnQuery.addActionListener(e -> {
            FormList formList = new FormList();
            formList.setVisible(true);
            this.setVisible(false);
        });
    }

    private void initControl(){
        paneliz = new JPanel();
        paneliz2 = new JPanel();
        panelde = new JPanel();
        panelde2 = new JPanel();
        panelButton = new JPanel();
        panelForm = new JPanel();
        panelContainer = new JPanel();
        panelRadio = new JPanel();
        panelRadio2 = new JPanel();

        nombre = new JLabel();
        apellido = new JLabel();
        apellido2 = new JLabel();

        edad = new JLabel();
        telefono = new JLabel();
        correo = new JLabel();
        nombreMedico =new JLabel();
        horacira=new JLabel();
        fecha=new JLabel();
        motivo=new JLabel();

        nota = new JLabel();
        vacio= new JLabel();
        vacio2= new JLabel();
        datos= new JLabel();
        vacio3=new JLabel();
        datosCon=new JLabel();
        vacio4=new JLabel();
        vacio5=new JLabel();
        vacio6=new JLabel();
        vacio7=new JLabel();
        vacio8=new JLabel();
        vacio9=new JLabel();
        vacio10=new JLabel();
        diabetico=new JLabel();
        datosCont=new JLabel();
        tienesTel=new JLabel();
        saltos=new JLabel();
        saltos1=new JLabel();
        tienesCo=new JLabel();

        boton1 = new JButton();
        btnQuery = new JButton();


        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();
        text5 = new JTextField();
        text6 = new JTextField();
        text7 = new JTextField();
        text8 = new JTextField();
        text9 = new JTextField();
        text10 = new JTextField();

        radio1 = new JRadioButton();
        radio2 = new JRadioButton();
        radio3 = new JRadioButton();
        radio4 = new JRadioButton();
        radio5 = new JRadioButton();
        radio6 = new JRadioButton();
        radio7 = new JRadioButton();
        radio8 = new JRadioButton();
        radio9 = new JRadioButton();
        radio10 = new JRadioButton();
        buttonGroup = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        buttonGroup3 = new ButtonGroup();
        buttonGroup4 = new ButtonGroup();
        buttonGroup5 = new ButtonGroup();

    }

    private void configFrame(){
        setTitle("Registro de Pacientes");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(700, 500);
    }

    private void setControl(){
        nota.setText("¿ Primera cita ?");
        vacio.setText(" ");
        radio1.setText("Si");
        radio2.setText("No");
        vacio3.setText(" ");
        datos.setText("Datos personales");
        vacio2.setText(" ");

        nombre.setText("Nombre del paciente:");
        apellido.setText("Apellido paterno:");
        apellido2.setText("Apellido materno:");
        edad.setText("Edad: ");
        radio3.setText("Hombre");
        radio4.setText("Mujer");

        datosCon.setText("Datos Consulta");
        motivo.setText("Motivo de la cita:");
        vacio4.setText(" ");
        nombreMedico.setText("Nombre Medico:");
        diabetico.setText("¿Es diabetico?");
        radio5.setText("Si");
        radio6.setText("No");
        horacira.setText("Hora cita:");
        fecha.setText("Fecha de cita medica:");

        saltos.setText(" ");
        vacio8.setText("");
        saltos1.setText(" ");
        vacio9.setText("");

        datosCont.setText("Datos de Contacto");
        vacio6.setText(" ");
        tienesTel.setText("¿Tienes telefono?");
        vacio7.setText(" ");
        radio7.setText("Si");
        radio8.setText("No");
        telefono.setText("Numero de Telefono");
        tienesCo.setText("¿Tienes Correo?");
        vacio10.setText(" ");
        radio9.setText("Si");
        radio10.setText("No");
        correo.setText("Correo Electronico");

        boton1.setText("Guardar");
        btnQuery.setText("Consultar");
    }
    private void configPanel(){
        paneliz.setLayout(new FlowLayout());
        paneliz.setLayout(new GridLayout(16, 0));
        paneliz.add(nota);//primera cita
        paneliz.add(radio1);
        paneliz.add(vacio);

        paneliz.add(datos);
        paneliz.add(nombre);
        paneliz.add(apellido);
        paneliz.add(apellido2);
        paneliz.add(edad);
        paneliz.add(radio3);

        paneliz.add(datosCon);


        paneliz.add(motivo);
        paneliz.add(diabetico);
        paneliz.add(radio5);//Diabetico
        paneliz.add(nombreMedico);
        paneliz.add(horacira);
        paneliz.add(fecha);

        panelde.setLayout(new FlowLayout());
        panelde.setLayout(new GridLayout(16, 0));
        panelde.add(vacio);//vacio Primera cita
        panelde.add(radio2);
        panelde.add(vacio2);
        panelde.add(text1);
        panelde.add(text2);
        panelde.add(text3);
        panelde.add(text4);

        panelde.add(radio4);//Genero paciente
        panelde.add(vacio4);

        panelde.add(text8);
        panelde.add(vacio5);//Diabetico
        panelde.add(radio6);
        panelde.add(text7);
        panelde.add(text9);
        panelde.add(text10);

        paneliz2.setLayout(new GridLayout(8, 0));
        panelde2.add(saltos);
        paneliz2.add(saltos1);
        paneliz2.add(datosCont);
        //telefono
        paneliz2.add(tienesTel);
        paneliz2.add(radio7);
        paneliz2.add(telefono);
        //Correo
        paneliz2.add(tienesCo);
        paneliz2.add(radio9);
        paneliz2.add(correo);

        panelde2.setLayout(new GridLayout(8, 0));
        //Telefono
        panelde2.add(vacio6);
        panelde2.add(vacio7);
        panelde2.add(radio8);
        panelde2.add(text6);
        //Correo
        panelde2.add(vacio10);
        panelde2.add(radio10);
        panelde2.add(text5);


        panelForm.setLayout(new GridLayout(1, 1));
        panelForm.setPreferredSize(new Dimension(500, 400));
        panelForm.add(paneliz);
        panelForm.add(panelde);

        panelForm.setPreferredSize(new Dimension(500, 400));
        panelForm.add(paneliz2);
        panelForm.add(panelde2);

        panelButton.setLayout(new FlowLayout());
        panelButton.setPreferredSize(new Dimension(150, 50));
        panelButton.add(boton1);
        boton1.addActionListener(eventClick);
        panelButton.add(btnQuery);


        panelRadio.setLayout(new FlowLayout());
        panelRadio.setPreferredSize(new Dimension(200, 50));
        buttonGroup.add(radio1);
        buttonGroup.add(radio2);

        buttonGroup2.add(radio3);
        buttonGroup2.add(radio4);

        buttonGroup3.add(radio5);
        buttonGroup3.add(radio6);

        buttonGroup4.add(radio7);
        buttonGroup4.add(radio8);

        buttonGroup5.add(radio9);
        buttonGroup5.add(radio10);



        panelContainer.setLayout(new GridLayout(4, 0));
        panelContainer.add(panelForm);
        panelContainer.add(panelButton);
        panelContainer.add(panelRadio);
        panelContainer.add(panelRadio2);
        add(panelContainer);

    }

    public static ArrayList<Paciente> getElemento(){
        return lista;
    }
    @Override
    public void stateChanged(ChangeEvent e) {
        if (radio2.isSelected()) {//deshabilitar
            text1.setEnabled(false);
            text2.setEditable(false);
            text3.setEditable(false);
            text4.setEditable(false);
            text5.setEditable(false);
            text6.setEditable(false);
        }
        if (radio1.isSelected()) {//deshabilitar
            text1.setEnabled(true);
            text2.setEditable(true);
            text3.setEditable(true);
            text4.setEditable(true);
            text5.setEditable(true);
            text6.setEditable(true);
        }
        if (radio8.isSelected()) {//deshabilitar
            text6.setEditable(false);
        }
        if (radio7.isSelected()) {//deshabilitar
            text6.setEditable(true);
        }
        if (radio10.isSelected()) {//deshabilitar
            text5.setEditable(false);
        }
        if (radio9.isSelected()) {//deshabilitar
            text5.setEditable(true);
        }
    }

    public class EventClick implements ActionListener {
        public EventClick(){
            lista = new ArrayList<>();
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre = text1.getText();
            String apellido = text2.getText();
            String apellido2 = text3.getText();
            String edad = text4.getText();

            String correo = text5.getText();
            String telefono = text6.getText();

            String nombreMedico = text7.getText();
            String motivo = text8.getText();
            String horaCira = text9.getText();
            String fecha = text10.getText();

            lista.add(new Paciente(nombre,apellido,apellido2,edad,telefono,correo,horaCira,nombreMedico,fecha,motivo));
            text1.setText(" ");
            text2.setText(" ");
            text3.setText(" ");
            text4.setText(" ");
            text5.setText(" ");
            text6.setText(" ");
            text7.setText(" ");
            text8.setText(" ");
            text9.setText(" ");
            text10.setText(" ");
            for (Paciente personas:lista) {
                System.out.println("Nombre : " + personas.getNombre() + " Apellido : " + personas.getApellido() + "Apellido2"
                        +personas.getApellido2() + "Edad "+personas.getEdad() + "\n Nombre Medico: "+personas.getNombreMedico() +"Hora"+personas.getHoraCita()
                +"Fecha"+personas.getFecha()+"Correo:"+personas.getCorreo()+"Telefono"+personas.getTelefono()+"Motivo :"+motivo);
            }
        }
    }
}