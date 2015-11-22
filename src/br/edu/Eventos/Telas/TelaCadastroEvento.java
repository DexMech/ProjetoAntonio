package br.edu.Eventos.Telas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.Eventos.Controles.ControlaEvento;
import br.edu.Eventos.Modelos.Evento;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;


public class TelaCadastroEvento extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SimpleDateFormat date ;
	private List<String> list;
	private Evento evento;
	private JPanel contentPane;
	private JTextField textnNomeEvento;
	private JTextField textSolicitante;
	private JTextField textSetor;
	private JTextField textRamal;
	private JTextField textSala;
	private JTextField textData;
	private JTextField textHInicio;
	private JTextField textHFim;
	private JTextField textFuncionario;
	private ControlaEvento eventoControle;
	private JComboBox comboBoxAuditorio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroEvento frame = new TelaCadastroEvento();
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
	public TelaCadastroEvento() {
	    date = new SimpleDateFormat("dd/mm/yyyy");
		eventoControle = new ControlaEvento();
		list = new ArrayList<String>();
		evento = new Evento();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNomeDoEvento = new JLabel("Nome do Evento");
		lblNomeDoEvento.setBounds(10, 11, 123, 14);
		contentPane.add(lblNomeDoEvento);

		JLabel lblSolicitante = new JLabel("Solicitante");
		lblSolicitante.setBounds(10, 36, 63, 14);
		contentPane.add(lblSolicitante);

		JLabel lblSetor = new JLabel("Setor");
		lblSetor.setBounds(308, 36, 46, 14);
		contentPane.add(lblSetor);

		JLabel lblRamal = new JLabel("Ramal");
		lblRamal.setBounds(458, 36, 46, 14);
		contentPane.add(lblRamal);

		JLabel lblLocal = new JLabel("Local");
		lblLocal.setBounds(10, 61, 46, 14);
		contentPane.add(lblLocal);

		JLabel lblNewLabel = new JLabel("Hora Inicio");
		lblNewLabel.setBounds(10, 128, 84, 14);
		contentPane.add(lblNewLabel);

		JLabel lblHoraFim = new JLabel("Hora Fim");
		lblHoraFim.setBounds(434, 128, 84, 14);
		contentPane.add(lblHoraFim);

		JLabel lblPrioridade = new JLabel("Prioridade");
		lblPrioridade.setBounds(10, 212, 84, 14);
		contentPane.add(lblPrioridade);

		JCheckBox chckbxMicrofone = new JCheckBox("Microfone");
		chckbxMicrofone.setBounds(92, 250, 97, 23);
		contentPane.add(chckbxMicrofone);

		JCheckBox chckbxPassador = new JCheckBox("Passador");
		chckbxPassador.setBounds(239, 250, 97, 23);
		contentPane.add(chckbxPassador);

		JCheckBox chckbxPrensenca = new JCheckBox("Prensenca");
		chckbxPrensenca.setBounds(391, 250, 127, 23);
		contentPane.add(chckbxPrensenca);

		JLabel lblData = new JLabel("Data");
		lblData.setBounds(10, 96, 46, 14);
		contentPane.add(lblData);

		JComboBox comboBoxPrioridade = new JComboBox();
		comboBoxPrioridade.setModel(new DefaultComboBoxModel(new String[] { "", "1", "2","3","4","5" }));
		comboBoxPrioridade.setBounds(104, 209, 52, 20);
		contentPane.add(comboBoxPrioridade);


		JLabel lblObservacao = new JLabel("OBSERVACAO");
		lblObservacao.setBounds(239, 280, 102, 14);
		contentPane.add(lblObservacao);

		JTextArea textObservacao = new JTextArea();
		textObservacao.setBounds(67, 305, 467, 189);
		contentPane.add(textObservacao);

		textnNomeEvento = new JTextField();
		textnNomeEvento.setBounds(139, 8, 452, 20);
		contentPane.add(textnNomeEvento);
		textnNomeEvento.setColumns(10);

		textSolicitante = new JTextField();
		textSolicitante.setBounds(104, 33, 194, 20);
		contentPane.add(textSolicitante);
		textSolicitante.setColumns(10);

		textSetor = new JTextField();
		textSetor.setBounds(362, 33, 86, 20);
		contentPane.add(textSetor);
		textSetor.setColumns(10);

		textRamal = new JTextField();
		textRamal.setBounds(505, 33, 86, 20);
		contentPane.add(textRamal);
		textRamal.setColumns(10);

		textSala = new JTextField();
		textSala.setBounds(295, 61, 86, 20);
		contentPane.add(textSala);
		textSala.setColumns(10);

		textData = new JTextField();
		textData.setBounds(104, 93, 86, 20);
		contentPane.add(textData);
		textData.setColumns(10);

		textHInicio = new JTextField();
		textHInicio.setBounds(104, 125, 86, 20);
		contentPane.add(textHInicio);
		textHInicio.setColumns(10);

		textHFim = new JTextField();
		textHFim.setBounds(505, 125, 86, 20);
		contentPane.add(textHFim);
		textHFim.setColumns(10);

		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setBounds(67, 541, 122, 23);
		contentPane.add(btnExcluir);

		JButton btnAlterar = new JButton("ALTERAR");
		btnAlterar.setBounds(252, 541, 112, 23);
		contentPane.add(btnAlterar);
		
		JComboBox comboBoxPredio = new JComboBox();
		comboBoxPredio.setModel(new DefaultComboBoxModel(new String[] { "", "terreo", "2","3","4","5" }));
		comboBoxPredio.setBounds(104, 58, 97, 20);
		contentPane.add(comboBoxPredio);

		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					evento.setData(date.parse(textData.getText()));
				} catch (ParseException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				evento.setHoraFim(textHFim.getText());
				evento.setHoraInicio(textHInicio.getText());
				evento.setLocal(comboBoxPredio.getSelectedItem().toString());
				evento.setNome(textnNomeEvento.getText());
				evento.setObservacao(textObservacao.getText());
				evento.setSetor(textSetor.getText());
				evento.setRamal(textRamal.getText());
				evento.setSolicitante(textSolicitante.getText());
				evento.setPrioridade(comboBoxPrioridade.getSelectedItem().toString());
				evento.setAuditorio(comboBoxAuditorio.getSelectedItem().toString());
				
				
				try {
					eventoControle.inserir(evento);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnSalvar.setBounds(445, 541, 89, 23);
		contentPane.add(btnSalvar);

		JLabel lblFuncionarioResponsavel = new JLabel("Funcionario ");
		lblFuncionarioResponsavel.setBounds(10, 166, 141, 14);
		contentPane.add(lblFuncionarioResponsavel);

		textFuncionario = new JTextField();
		textFuncionario.setBounds(104, 163, 227, 20);
		contentPane.add(textFuncionario);
		textFuncionario.setColumns(10);

		JLabel lblSala = new JLabel("Sala");
		lblSala.setBounds(239, 61, 46, 14);
		contentPane.add(lblSala);

		

		JLabel lblAuditorio = new JLabel("Auditorio");
		lblAuditorio.setBounds(434, 61, 70, 14);
		contentPane.add(lblAuditorio);

		 comboBoxAuditorio = new JComboBox();
		comboBoxAuditorio.setModel(new DefaultComboBoxModel(new String[] { "", "1", "2","3","4","5" }));
		comboBoxAuditorio.setBounds(505, 61, 76, 20);
		contentPane.add(comboBoxAuditorio);
	}
}
