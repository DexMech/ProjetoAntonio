package br.edu.Eventos.Telas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.edu.Eventos.Controles.ControlaEvento;




import br.edu.Eventos.Modelos.Evento;
import br.edu.Eventos.Util.Validador;
import javafx.scene.control.ComboBox;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;


public class TelaCadastroEvento extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SimpleDateFormat date ;
	private List<String> list;
	private JFormattedTextField textdata,texthora,texthoraf;
	private MaskFormatter mascaraHora, mascaraData;
	private Evento evento;
	private ControlaEvento eventoControle;
	private JPanel contentPane;

	private JTextField textnNomeEvento;
	private JTextField textSolicitante;
	private JTextField textSetor;
	private JTextField textRamal;
	private JTextField textSala;
	private JTextField textFuncionario;
	

	private SimpleDateFormat ds;
	private JTextField textAudi;
	private JTextField textLocal;
	private JComboBox comboBoxPri;




	/**
	 * Create the frame.
	 */
	public TelaCadastroEvento() {
		try {
			mascaraHora = new MaskFormatter("##:##:##");
			mascaraData = new MaskFormatter("##/##/####");
		} catch (ParseException e3) {

			e3.printStackTrace();
		}
		mascaraHora.setValidCharacters("0123456789");
		mascaraData.setValidCharacters("0123456789");

		date = new SimpleDateFormat("dd/mm/yyyy");
		eventoControle = new ControlaEvento();
		list = new ArrayList<String>();


		eventoControle = new ControlaEvento();
		ds = new SimpleDateFormat("DD/MM/YYYY");

		evento = new Evento();
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		lblSala.setBounds(258, 102, 39, 14);
		contentPane.add(lblSala);

		JLabel lblAuditorio = new JLabel("Auditorio");
		lblAuditorio.setBounds(10, 102, 70, 14);
		contentPane.add(lblAuditorio);

		JLabel lblData = new JLabel("Data");
		lblData.setBounds(258, 70, 39, 14);
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
		textSetor.setBounds(384, 36, 76, 20);
		contentPane.add(textSetor);
		textSetor.setColumns(10);

		textRamal = new JTextField();
		textRamal.setBounds(535, 36, 86, 20);
		contentPane.add(textRamal);
		textRamal.setColumns(10);

		textSala = new JTextField();
		textSala.setBounds(309, 99, 96, 20);
		contentPane.add(textSala);
		textSala.setColumns(10);

		textFuncionario = new JTextField();
		textFuncionario.setBounds(117, 163, 234, 20);
		contentPane.add(textFuncionario);
		textFuncionario.setColumns(10);


		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if(!(textnNomeEvento.getText()==""))
					eventoControle.deletar(textnNomeEvento.getText());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnExcluir.setBounds(67, 541, 122, 23);
		contentPane.add(btnExcluir);

		JButton btnAlterar = new JButton("ALTERAR");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					eventoControle.atualizar(evento,textnNomeEvento.getText());
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
			}
		});
		btnAlterar.setBounds(265, 541, 122, 23);
		contentPane.add(btnAlterar);


		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                
				try {
					if(textdata.getText().equals(("  /  /    "))){
						
					}else{
					evento.setData(date.parse(textdata.getText()));
					}
				} catch (ParseException e2) {

					e2.printStackTrace();



					}
					evento.setHoraFim(texthoraf.getText());
					evento.setHoraInicio(texthora.getText());
					evento.setNome(textnNomeEvento.getText());
					evento.setObservacao(textObservacao.getText());
					evento.setSetor(textSetor.getText());
					evento.setRamal(textRamal.getText());
					evento.setAuditorio(textAudi.getText());
					evento.setSolicitante(textSolicitante.getText());
					evento.setRamal(textRamal.getText());
					evento.setLocal(textLocal.getText());
					evento.setFuncionario(textFuncionario.getText());
					evento.setPrioridade(comboBoxPri.getSelectedItem().toString());
                    evento.setPassador(chckbxPassador.isSelected());
                    evento.setMicrofone(chckbxMicrofone.isSelected());
                    evento.setSala(textSala.getText());
                     Validador val = new Validador();
                     boolean v=val.valida(evento);
                     if(v){
					eventoControle.inserir(evento);
                     }else{
                    	 
                    	 JOptionPane.showMessageDialog(null, "Não deixe nenhum cambo em branco");
                     }

				}
			
		});
		btnSalvar.setBounds(465, 541, 122, 23);
		contentPane.add(btnSalvar);

		textAudi = new JTextField();
		textAudi.setBounds(121, 93, 114, 26);
		contentPane.add(textAudi);
		textAudi.setColumns(10);

		comboBoxPri = new JComboBox();
		comboBoxPri.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBoxPri.setBounds(83, 205, 76, 27);
		contentPane.add(comboBoxPri);


		textLocal = new JTextField();
		textLocal.setText("");
		textLocal.setBounds(124, 64, 122, 23);
		contentPane.add(textLocal);
		textLocal.setColumns(10);

		textdata = new JFormattedTextField(mascaraData);
		textdata.setBounds(309, 64, 96, 27);
		contentPane.add(textdata);

		texthora = new JFormattedTextField(mascaraHora);
		texthora.setBounds(121, 125, 72, 27);
		contentPane.add(texthora);

		texthoraf = new JFormattedTextField(mascaraHora);
		texthoraf.setBounds(268, 125, 70, 27);
		contentPane.add(texthoraf);


	}
}
