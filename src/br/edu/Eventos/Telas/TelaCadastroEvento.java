package br.edu.Eventos.Telas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.Eventos.Controles.ControlaEvento;
import br.edu.Eventos.Controles.ControlaItem;
import br.edu.Eventos.Modelos.Evento;

import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;


public class TelaCadastroEvento extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Evento evento;
	private ControlaEvento eventoControle;
	private ControlaItem itemControle;
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
	private SimpleDateFormat ds;

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
		itemControle = new ControlaItem();
		eventoControle = new ControlaEvento();
		ds = new SimpleDateFormat("DD/MM/YYYY");
		evento = new Evento();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 633);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNomeDoEvento = new JLabel("Nome do Evento");
		lblNomeDoEvento.setBounds(10, 11, 112, 14);
		contentPane.add(lblNomeDoEvento);

		JLabel lblSolicitante = new JLabel("Solicitante");
		lblSolicitante.setBounds(10, 37, 70, 14);
		contentPane.add(lblSolicitante);

		JLabel lblSetor = new JLabel("Setor");
		lblSetor.setBounds(325, 39, 46, 14);
		contentPane.add(lblSetor);

		JLabel lblRamal = new JLabel("Ramal");
		lblRamal.setBounds(472, 39, 46, 14);
		contentPane.add(lblRamal);

		JLabel lblLocal = new JLabel("Local");
		lblLocal.setBounds(10, 70, 46, 14);
		contentPane.add(lblLocal);

		JLabel lblNewLabel = new JLabel("Hora Inicio");
		lblNewLabel.setBounds(10, 131, 84, 14);
		contentPane.add(lblNewLabel);

		JLabel lblHoraFim = new JLabel("Hora Fim");
		lblHoraFim.setBounds(205, 131, 70, 14);
		contentPane.add(lblHoraFim);

		JLabel lblPrioridade = new JLabel("Prioridade");
		lblPrioridade.setBounds(10, 210, 84, 14);
		contentPane.add(lblPrioridade);
		
		JLabel lblSala = new JLabel("Sala");
		lblSala.setBounds(237, 102, 39, 14);
		contentPane.add(lblSala);

		JLabel lblAuditorio = new JLabel("Auditorio");
		lblAuditorio.setBounds(10, 102, 70, 14);
		contentPane.add(lblAuditorio);
		
		JLabel lblData = new JLabel("Data");
		lblData.setBounds(237, 70, 39, 14);
		contentPane.add(lblData);

		JLabel lblObservacao = new JLabel("OBSERVACAO");
		lblObservacao.setBounds(284, 289, 102, 14);
		contentPane.add(lblObservacao);
		
		JLabel lblFuncionarioResponsavel = new JLabel("Funcionario ");
		lblFuncionarioResponsavel.setBounds(10, 166, 84, 14);
		contentPane.add(lblFuncionarioResponsavel);

		
		JCheckBox chckbxMicrofone = new JCheckBox("Microfone");
		chckbxMicrofone.setBounds(92, 250, 97, 23);
		contentPane.add(chckbxMicrofone);

		JCheckBox chckbxPassador = new JCheckBox("Passador");
		chckbxPassador.setBounds(274, 250, 97, 23);
		contentPane.add(chckbxPassador);

		JCheckBox chckbxPrensenca = new JCheckBox("Prensenca");
		chckbxPrensenca.setBounds(432, 250, 127, 23);
		contentPane.add(chckbxPrensenca);
		

		JTextArea textObservacao = new JTextArea();
		textObservacao.setBounds(67, 315, 520, 179);
		contentPane.add(textObservacao);
		

		textnNomeEvento = new JTextField();
		textnNomeEvento.setBounds(121, 8, 500, 20);
		contentPane.add(textnNomeEvento);
		textnNomeEvento.setColumns(10);

		textSolicitante = new JTextField();
		textSolicitante.setBounds(121, 37, 192, 20);
		contentPane.add(textSolicitante);
		textSolicitante.setColumns(10);

		textSetor = new JTextField();
		textSetor.setBounds(374, 36, 86, 20);
		contentPane.add(textSetor);
		textSetor.setColumns(10);

		textRamal = new JTextField();
		textRamal.setBounds(535, 36, 86, 20);
		contentPane.add(textRamal);
		textRamal.setColumns(10);

		textSala = new JTextField();
		textSala.setBounds(275, 96, 96, 20);
		contentPane.add(textSala);
		textSala.setColumns(10);

		textData = new JTextField();
		textData.setBounds(275, 67, 93, 20);
		contentPane.add(textData);
		textData.setColumns(10);

		textHInicio = new JTextField();
		textHInicio.setBounds(117, 128, 76, 20);
		contentPane.add(textHInicio);
		textHInicio.setColumns(10);

		textHFim = new JTextField();
		textHFim.setBounds(275, 128, 76, 20);
		contentPane.add(textHFim);
		textHFim.setColumns(10);
		
		textFuncionario = new JTextField();
		textFuncionario.setBounds(117, 163, 234, 20);
		contentPane.add(textFuncionario);
		textFuncionario.setColumns(10);
		

		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setBounds(67, 541, 122, 23);
		contentPane.add(btnExcluir);

		JButton btnAlterar = new JButton("ALTERAR");
		btnAlterar.setBounds(265, 541, 122, 23);
		contentPane.add(btnAlterar);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					evento.setData(ds.parse(textData.getText()));
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				evento.setHoraFim(textHFim.getText());
				evento.setHoraInicio(textHInicio.getText());
				evento.setNome(textnNomeEvento.getText());
				evento.setSolicitante(textSolicitante.getText());
				evento.setRamal(textRamal.getText());
				
				try {
					eventoControle.inserir(evento);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnSalvar.setBounds(465, 541, 122, 23);
		contentPane.add(btnSalvar);
		
	}
}
