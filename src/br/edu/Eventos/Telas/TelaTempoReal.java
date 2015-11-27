package br.edu.Eventos.Telas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import br.edu.Eventos.Controles.ControlaEvento;
import br.edu.Eventos.Dao.ControlaBanco;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JProgressBar;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;




import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class TelaTempoReal extends JFrame {
	private JRadioButton rdbtnSala,rdbtnNomeDoEvento,rdbtnHoraDeInicio;
	private ControlaEvento evento;
	private JPanel contentPane;
	private JTextField textField;
	private JTable tabelaEventos;

	private DefaultTableModel modeloTable;


	private ButtonGroup  btnGroup;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTempoReal frame = new TelaTempoReal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaTempoReal() {

		super("Eventos Tempo Real");
		evento = new ControlaEvento();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 420);
		contentPane = new JPanel();
		contentPane.setToolTipText("AA");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(6, 6, 339, 93);
		contentPane.add(panel);
		panel.setLayout(null);

		textField = new JTextField();
		textField.setBounds(16, 19, 130, 26);
		panel.add(textField);
		textField.setColumns(10);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modeloTable = (DefaultTableModel) tabelaEventos.getModel();
				while (modeloTable.getRowCount() > 0) {
					modeloTable.removeRow(0);
				}
				ResultSet resultado = null;
				if(rdbtnNomeDoEvento.isSelected()){
					resultado = evento.mostra("nome",textField.getText());
				}else if(rdbtnSala.isSelected()){
					resultado =evento.mostra("sala",textField.getText());
				}else if(rdbtnHoraDeInicio.isSelected()){
					resultado= evento.mostra("horainicio",textField.getText());

				}else{

					JOptionPane.showMessageDialog(null, "selecione uma opção");
				}

				try {
					while(resultado.next()){

						modeloTable.addRow(new Object[]{resultado.getString("nome"),resultado.getString("funcionario"),
								resultado.getString("sala"),resultado.getString("horainicio"),
								resultado.getString("horafim"),
								resultado.getString("mouse"),resultado.getString("passador")});
					}
				} catch (SQLException e1) {

					e1.printStackTrace();
				}

			}
		});
		btnBuscar.setBounds(16, 58, 130, 29);
		panel.add(btnBuscar);

		rdbtnNomeDoEvento = new JRadioButton("Nome do Evento");
		rdbtnNomeDoEvento.setBounds(178, 6, 141, 23);
		panel.add(rdbtnNomeDoEvento);

		rdbtnHoraDeInicio = new JRadioButton("Hora de Inicio");
		rdbtnHoraDeInicio.setBounds(178, 35, 141, 23);
		panel.add(rdbtnHoraDeInicio);

		rdbtnSala = new JRadioButton("Sala");
		rdbtnSala.setBounds(178, 59, 141, 23);
		panel.add(rdbtnSala);

		btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnNomeDoEvento);
		btnGroup.add(rdbtnHoraDeInicio);
		btnGroup.add(rdbtnSala);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 155, 698, 100);
		contentPane.add(scrollPane);

		tabelaEventos = new JTable();
		tabelaEventos.setModel(new DefaultTableModel(
				new Object[][]{
				},
				new String[]{
						"Evento","Func. Respons.", "Sala", "Inicio", "Fim", "Mouse","Passador"
				}));

		scrollPane.setViewportView(tabelaEventos);

		JLabel lblFim = new JLabel("Fim");
		lblFim.setBounds(683, 293, 39, 16);
		contentPane.add(lblFim);

	}



}
