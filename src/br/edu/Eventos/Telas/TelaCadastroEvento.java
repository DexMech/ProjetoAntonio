package br.edu.Eventos.Telas;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import br.edu.Eventos.Controles.ControlaEvento;




import br.edu.Eventos.Modelos.Evento;
import br.edu.Eventos.Util.Validador;


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





import java.awt.event.ActionEvent;

import javax.swing.JFormattedTextField;


public class TelaCadastroEvento extends JFrame {

	private static final long serialVersionUID = 1L;

	private SimpleDateFormat date ;

	private JFormattedTextField textdata,texthora,texthoraf,sala,ramal;
	private MaskFormatter mascaraHora, mascaraData,salam,ramalm;
	private Evento evento;
	private ControlaEvento eventoControle;
	private JPanel contentPane;

	private JTextField textnNomeEvento;
	private JTextField textSolicitante;
	private JTextField textSetor;


	private JTextField textFuncionario;



	private JTextField textAudi;
	private JTextField textLocal;
	private JComboBox<String> comboBoxPri;





	public TelaCadastroEvento() {
		try {
			salam = new MaskFormatter("###");
			ramalm = new MaskFormatter("###");
			mascaraHora = new MaskFormatter("##:##:00");
			mascaraData = new MaskFormatter("##/##/####");
		} catch (ParseException e3) {

			e3.printStackTrace();
		}
		mascaraHora.setValidCharacters("0123456789");
		mascaraData.setValidCharacters("0123456789");

		date = new SimpleDateFormat("dd/MM/yyyy");
		eventoControle = new ControlaEvento();



		eventoControle = new ControlaEvento();
		

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
		lblNomeDoEvento.setBounds(18, 29, 122, 20);
		contentPane.add(lblNomeDoEvento);

		JLabel lblSolicitante = new JLabel("Solicitante");
		lblSolicitante.setBounds(18, 70, 70, 14);
		contentPane.add(lblSolicitante);

		JLabel lblSetor = new JLabel("Setor");
		lblSetor.setBounds(333, 72, 46, 14);
		contentPane.add(lblSetor);

		JLabel lblRamal = new JLabel("Ramal");
		lblRamal.setBounds(480, 72, 46, 14);
		contentPane.add(lblRamal);

		JLabel lblLocal = new JLabel("Local");
		lblLocal.setBounds(18, 108, 46, 14);
		contentPane.add(lblLocal);

		JLabel lblNewLabel = new JLabel("Hora Inicio");
		lblNewLabel.setBounds(18, 185, 84, 14);
		contentPane.add(lblNewLabel);

		JLabel lblHoraFim = new JLabel("Hora Fim");
		lblHoraFim.setBounds(266, 185, 70, 14);
		contentPane.add(lblHoraFim);

		JLabel lblPrioridade = new JLabel("Prioridade");
		lblPrioridade.setBounds(18, 255, 84, 14);
		contentPane.add(lblPrioridade);

		JLabel lblSala = new JLabel("Sala");
		lblSala.setBounds(266, 156, 39, 14);
		contentPane.add(lblSala);

		JLabel lblAuditorio = new JLabel("Auditorio");
		lblAuditorio.setBounds(18, 156, 70, 14);
		contentPane.add(lblAuditorio);

		JLabel lblData = new JLabel("Data");
		lblData.setBounds(266, 108, 39, 14);
		contentPane.add(lblData);

		JLabel lblObservacao = new JLabel("OBSERVACAO");
		lblObservacao.setBounds(281, 324, 102, 14);
		contentPane.add(lblObservacao);

		JLabel lblFuncionarioResponsavel = new JLabel("Funcionario ");
		lblFuncionarioResponsavel.setBounds(18, 218, 84, 14);
		contentPane.add(lblFuncionarioResponsavel);


		JCheckBox chckbxMicrofone = new JCheckBox("Microfone");
		chckbxMicrofone.setBounds(138, 289, 97, 23);
		contentPane.add(chckbxMicrofone);

		JCheckBox chckbxPassador = new JCheckBox("Passador");
		chckbxPassador.setBounds(274, 289, 97, 23);
		contentPane.add(chckbxPassador);


		JTextArea textObservacao = new JTextArea();
		textObservacao.setBounds(67, 350, 520, 179);
		contentPane.add(textObservacao);


		textnNomeEvento = new JTextField();
		textnNomeEvento.setBounds(152, 26, 221, 26);
		contentPane.add(textnNomeEvento);
		

		textSolicitante = new JTextField();
		textSolicitante.setBounds(129, 70, 192, 26);
		contentPane.add(textSolicitante);
		

		textSetor = new JTextField();
		textSetor.setBounds(392, 69, 76, 26);
		contentPane.add(textSetor);
		

		ramal = new JFormattedTextField(ramalm);
		ramal.setBounds(543, 69, 86, 26);
		contentPane.add(ramal);


		sala = new JFormattedTextField(salam);
		sala.setBounds(317, 153, 96, 26);
		contentPane.add(sala);


		textFuncionario = new JTextField();
		textFuncionario.setBounds(129, 215, 234, 26);
		contentPane.add(textFuncionario);
		textFuncionario.setColumns(10);


		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if((textnNomeEvento.getText().length()>0))
					eventoControle.deletar(textnNomeEvento.getText());
				else
					JOptionPane.showMessageDialog(null, "Forneça um nome");
			}
		});
		btnExcluir.setBounds(67, 541, 122, 23);
		contentPane.add(btnExcluir);


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
				evento.setRamal(ramal.getText());
				evento.setAuditorio(textAudi.getText());
				evento.setSolicitante(textSolicitante.getText());
				evento.setLocal(textLocal.getText());
				evento.setFuncionario(textFuncionario.getText());
				evento.setPrioridade(comboBoxPri.getSelectedItem().toString());
				evento.setPassador(chckbxPassador.isSelected());
				evento.setMicrofone(chckbxMicrofone.isSelected());
				evento.setSala(sala.getText());
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
		textAudi.setBounds(129, 147, 114, 26);
		contentPane.add(textAudi);
		textAudi.setColumns(10);

		comboBoxPri = new JComboBox<String>();
		comboBoxPri.setModel(new DefaultComboBoxModel<String>(new String[] {"1", "2", "3", "4", "5"}));
		comboBoxPri.setBounds(91, 250, 76, 27);
		contentPane.add(comboBoxPri);


		textLocal = new JTextField();
		textLocal.setText("");
		textLocal.setBounds(129, 102, 122, 26);
		contentPane.add(textLocal);
		textLocal.setColumns(10);

		textdata = new JFormattedTextField(mascaraData);
		textdata.setBounds(317, 102, 96, 27);
		contentPane.add(textdata);

		texthora = new JFormattedTextField(mascaraHora);
		texthora.setBounds(129, 179, 72, 27);
		contentPane.add(texthora);

		texthoraf = new JFormattedTextField(mascaraHora);
		texthoraf.setBounds(343, 179, 70, 27);
		contentPane.add(texthoraf);
		
		JButton btnAltera = new JButton("ALTERA");
		btnAltera.addActionListener(new ActionListener() {
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
				evento.setRamal(ramal.getText());
				evento.setAuditorio(textAudi.getText());
				evento.setSolicitante(textSolicitante.getText());
				evento.setLocal(textLocal.getText());
				evento.setFuncionario(textFuncionario.getText());
				evento.setPrioridade(comboBoxPri.getSelectedItem().toString());
				evento.setPassador(chckbxPassador.isSelected());
				evento.setMicrofone(chckbxMicrofone.isSelected());
				evento.setSala(sala.getText());
				Validador val = new Validador();
				boolean v=val.valida(evento);
				if(v){
					eventoControle.atualizar(evento,textnNomeEvento.getText());
				}else{

					JOptionPane.showMessageDialog(null, "Não deixe nenhum cambo em branco");
				}
				
			}
		});
		btnAltera.setBounds(271, 539, 100, 27);
		contentPane.add(btnAltera);


	}
}
