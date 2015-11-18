package br.edu.Eventos.Telas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

// EXPLICA�AO: AS LABELS DE STATUS VAO DESAPARECER OU FICAR APAGADA QUANDO NAO ESTIVER NELA. POR EXEMPLO, SE ESTIVER ACONTECENDO,
// A LABEL PREVISTO E FINALIZADO SOME OU FICA SEM DESTAQUE
// AQUELE PROGRESS BAR � DE ACORDO COM HORA INICIO E HORA FIM 
public class TelaTempoReal extends JFrame {

	private JPanel contentPane;

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
		setBounds(100, 100, 641, 420);
		contentPane = new JPanel();
		contentPane.setToolTipText("AA");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeReuniao = new JLabel("Evento para discutir a importancia do Cobol em nossas vidas");
		lblNomeReuniao.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNomeReuniao.setBounds(39, 0, 555, 52);
		contentPane.add(lblNomeReuniao);
		
		JLabel lblInfo1 = new JLabel("Funcion\u00E1rio Respons\u00E1vel");
		lblInfo1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblInfo1.setBounds(15, 58, 221, 52);
		contentPane.add(lblInfo1);
		
		JLabel lblInfo2 = new JLabel("Status");
		lblInfo2.setFont(new Font("Verdana", Font.BOLD, 15));
		lblInfo2.setBounds(15, 98, 86, 45);
		contentPane.add(lblInfo2);
		
		JLabel lblInfo5 = new JLabel("Hora Inicio");
		lblInfo5.setFont(new Font("Verdana", Font.BOLD, 15));
		lblInfo5.setBounds(15, 216, 107, 61);
		contentPane.add(lblInfo5);
		
		JLabel lblInfo6 = new JLabel("Hora Fim");
		lblInfo6.setFont(new Font("Verdana", Font.BOLD, 15));
		lblInfo6.setBounds(411, 216, 107, 61);
		contentPane.add(lblInfo6);
		
		JLabel lblInfo3 = new JLabel("Local");
		lblInfo3.setFont(new Font("Verdana", Font.BOLD, 15));
		lblInfo3.setBounds(15, 138, 78, 52);
		contentPane.add(lblInfo3);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(15, 266, 588, 14);
		contentPane.add(progressBar);
		
		JButton btnCancelarEvento = new JButton("CANCELAR EVENTO");
		btnCancelarEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelarEvento.setBounds(114, 304, 170, 23);
		contentPane.add(btnCancelarEvento);
		
		JButton btnConfirmarRetirada = new JButton("CONFIRMAR RETIRADA");
		btnConfirmarRetirada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnConfirmarRetirada.setBounds(326, 304, 170, 23);
		contentPane.add(btnConfirmarRetirada);
		
		JLabel lblFuncionarioResponsavel = new JLabel("WILLOU CASSIANO");
		lblFuncionarioResponsavel.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 14));
		lblFuncionarioResponsavel.setBounds(246, 78, 170, 14);
		contentPane.add(lblFuncionarioResponsavel);
		
		JLabel lblPrevisto = new JLabel("PREVISTO");
		lblPrevisto.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 13));
		lblPrevisto.setBounds(246, 112, 86, 14);
		contentPane.add(lblPrevisto);
		
		JLabel lblAcontecendo = new JLabel("ACONTECENDO");
		lblAcontecendo.setBackground(Color.BLUE);
		lblAcontecendo.setForeground(Color.BLUE);
		lblAcontecendo.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 13));
		lblAcontecendo.setBounds(338, 112, 107, 14);
		contentPane.add(lblAcontecendo);
		
		JLabel lblEncerrado = new JLabel("ENCERRADO");
		lblEncerrado.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 13));
		lblEncerrado.setBounds(455, 112, 86, 14);
		contentPane.add(lblEncerrado);
		
		JLabel lblHoraInicio = new JLabel("08:00");
		lblHoraInicio.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
		lblHoraInicio.setBounds(128, 241, 86, 14);
		contentPane.add(lblHoraInicio);
		
		JLabel lblHoraFim = new JLabel("12:00");
		lblHoraFim.setFont(new Font("Baskerville Old Face", Font.BOLD, 16));
		lblHoraFim.setBounds(530, 241, 73, 14);
		contentPane.add(lblHoraFim);
		
		JLabel lblLocalEvento = new JLabel("AUDITORIO JOSE ADEMAR");
		lblLocalEvento.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 14));
		lblLocalEvento.setBounds(246, 153, 200, 14);
		contentPane.add(lblLocalEvento);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(SystemColor.controlText);
		separator.setBackground(SystemColor.activeCaption);
		separator.setToolTipText("AAAA");
		separator.setBounds(0, 97, 620, 4);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(SystemColor.activeCaption);
		separator_1.setForeground(SystemColor.controlText);
		separator_1.setBounds(0, 63, 620, 4);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(SystemColor.controlText);
		separator_2.setBackground(SystemColor.activeCaption);
		separator_2.setBounds(0, 137, 630, 2);
		contentPane.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(SystemColor.controlText);
		separator_3.setBackground(SystemColor.activeCaption);
		separator_3.setBounds(0, 178, 630, 2);
		contentPane.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(SystemColor.controlText);
		separator_4.setBackground(SystemColor.activeCaption);
		separator_4.setBounds(0, 288, 620, 5);
		contentPane.add(separator_4);
		
		JLabel lblInfo4 = new JLabel("Solicitante");
		lblInfo4.setFont(new Font("Verdana", Font.BOLD, 15));
		lblInfo4.setBounds(15, 176, 97, 52);
		contentPane.add(lblInfo4);
		
		JLabel lblSolicitanteEvento = new JLabel("ALEX E THIAGO");
		lblSolicitanteEvento.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 14));
		lblSolicitanteEvento.setBounds(246, 191, 170, 14);
		contentPane.add(lblSolicitanteEvento);
		
		JLabel lblSetorEvento = new JLabel("SETOR CRH");
		lblSetorEvento.setFont(new Font("DejaVu Serif Condensed", Font.BOLD, 14));
		lblSetorEvento.setBounds(424, 191, 151, 14);
		contentPane.add(lblSetorEvento);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(SystemColor.controlText);
		separator_5.setBackground(SystemColor.activeCaption);
		separator_5.setBounds(0, 216, 630, 2);
		contentPane.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setForeground(Color.BLACK);
		separator_6.setBackground(SystemColor.activeCaption);
		separator_6.setBounds(0, 338, 620, 2);
		contentPane.add(separator_6);
		
		JButton btnProximo = new JButton("PROXIMO");
		btnProximo.setBounds(513, 351, 107, 23);
		contentPane.add(btnProximo);
		
		JButton btnAnterior = new JButton("ANTERIOR");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAnterior.setBounds(0, 351, 101, 23);
		contentPane.add(btnAnterior);
	}
}
