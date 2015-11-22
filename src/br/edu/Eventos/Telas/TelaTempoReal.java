package br.edu.Eventos.Telas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JProgressBar;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;




import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class TelaTempoReal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable tabelaEventos;
	
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 420);
		contentPane = new JPanel();
		contentPane.setToolTipText("AA");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCancelarEvento = new JButton("CANCELAR EVENTO");
		btnCancelarEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelarEvento.setBounds(90, 357, 170, 23);
		contentPane.add(btnCancelarEvento);
		
		JButton btnConfirmarRetirada = new JButton("CONFIRMAR RETIRADA");
		btnConfirmarRetirada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnConfirmarRetirada.setBounds(498, 357, 170, 23);
		contentPane.add(btnConfirmarRetirada);
		
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
		btnBuscar.setBounds(16, 58, 130, 29);
		panel.add(btnBuscar);
		
		JRadioButton rdbtnNomeDoEvento = new JRadioButton("Nome do Evento");
		rdbtnNomeDoEvento.setBounds(178, 6, 141, 23);
		panel.add(rdbtnNomeDoEvento);
		
		JRadioButton rdbtnHoraDeInicio = new JRadioButton("Hora de Inicio");
		rdbtnHoraDeInicio.setBounds(178, 35, 141, 23);
		panel.add(rdbtnHoraDeInicio);
		
		JRadioButton rdbtnSala = new JRadioButton("Sala");
		rdbtnSala.setBounds(178, 59, 141, 23);
		panel.add(rdbtnSala);
		
		btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnNomeDoEvento);
		btnGroup.add(rdbtnHoraDeInicio);
		btnGroup.add(rdbtnSala);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(24, 261, 698, 20);
		contentPane.add(progressBar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 155, 698, 100);
		contentPane.add(scrollPane);
		
		tabelaEventos = new JTable();
		tabelaEventos.setModel(new DefaultTableModel(
				new Object[][]{
				},
				new String[]{
						"Evento","Func. Respons.", "Sala", "Inicio", "Fim", "Status"
				}));

		scrollPane.setViewportView(tabelaEventos);
		
		JLabel lblInicio = new JLabel("Inicio");
		lblInicio.setBounds(24, 293, 46, 16);
		contentPane.add(lblInicio);
		
		JLabel lblFim = new JLabel("Fim");
		lblFim.setBounds(683, 293, 39, 16);
		contentPane.add(lblFim);
		
		JLabel lblPrevisto = new JLabel("Previsto");
		lblPrevisto.setForeground(new Color(255, 215, 0));
		lblPrevisto.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblPrevisto.setVisible(false);
		lblPrevisto.setBounds(590, 43, 78, 16);
		contentPane.add(lblPrevisto);
		
		JLabel lblAcontecendo = new JLabel("Acontecendo");
		lblAcontecendo.setForeground(new Color(0, 128, 0));
		lblAcontecendo.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblAcontecendo.setBounds(590, 43, 117, 16);
		lblAcontecendo.setVisible(false);
		contentPane.add(lblAcontecendo);
		
		JLabel lblEncerrado = new JLabel("Encerrado");
		lblEncerrado.setForeground(new Color(255, 0, 0));
		lblEncerrado.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblEncerrado.setBounds(590, 43, 94, 16);
		lblEncerrado.setVisible(false);
		contentPane.add(lblEncerrado);
		
	}
}
