package br.edu.Eventos.Telas;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.Eventos.Modelos.Item;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaCadastroItens extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	private JTextField txtsessp;
	private JTextField txtdas;
	private JTextField txtmodelo;
	private JTextField txtsn;
	
	private Item item;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroItens frame = new TelaCadastroItens();
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
	public TelaCadastroItens() {
		item = new Item();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 388, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblPatriminoSessp = new JLabel("Patrimonio SESSP");
		lblPatriminoSessp.setBounds(10, 87, 139, 14);
		contentPane.add(lblPatriminoSessp);
		
		JLabel lblPatrminoCgadas = new JLabel("Patrimonio CGA/DAS");
		lblPatrminoCgadas.setBounds(216, 87, 146, 14);
		contentPane.add(lblPatrminoCgadas);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 160, 76, 14);
		contentPane.add(lblModelo);
		
		JLabel lblObservacao = new JLabel("OBSERVACAO");
		lblObservacao.setBounds(130, 241, 174, 14);
		contentPane.add(lblObservacao);
		
		JLabel lblNSerial = new JLabel("S/N");
		lblNSerial.setBounds(10, 200, 76, 14);
		contentPane.add(lblNSerial);
		
		JLabel lblItem = new JLabel("Item");
		lblItem.setBounds(160, 12, 42, 15);
		contentPane.add(lblItem);
		
		
		txtsessp = new JTextField();
		txtsessp.setBounds(10, 112, 120, 20);
		contentPane.add(txtsessp);
		txtsessp.setColumns(10);
		
		txtdas = new JTextField();
		txtdas.setColumns(10);
		txtdas.setBounds(216, 112, 139, 20);
		contentPane.add(txtdas);
		
		txtmodelo = new JTextField();
		txtmodelo.setBounds(79, 157, 183, 20);
		contentPane.add(txtmodelo);
		txtmodelo.setColumns(10);
		
		txtsn = new JTextField();
		txtsn.setColumns(10);
		txtsn.setBounds(79, 197, 183, 20);
		contentPane.add(txtsn);
		
		
		JTextArea txtob = new JTextArea();
		txtob.setBounds(25, 278, 336, 145);
		contentPane.add(txtob);
		
		
		JButton btnExcluir = new JButton("EXCLUIR");
		btnExcluir.setBounds(10, 435, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnAlterar = new JButton("ALTERAR");
		btnAlterar.setBounds(144, 435, 89, 23);
		contentPane.add(btnAlterar);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				item.setModelo(txtmodelo.getText());
				item.setNumeroSerial(txtsn.getText());
				item.setPatSessp(txtsessp.getText());
				item.setPatDas(txtdas.getText());
			}
		});
		btnSalvar.setBounds(270, 435, 89, 23);
		contentPane.add(btnSalvar);
		
	}
}
