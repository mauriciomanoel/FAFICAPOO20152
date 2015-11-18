package com.fafica.aula12.exemplo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.fafica.aula04.cliente.CPFInvalidoException;
import com.fafica.aula04.cliente.Cliente;
import com.fafica.aula04.cliente.ClienteJaCadastradoException;
import com.fafica.aula04.cliente.IdadeInvalidoException;
import com.fafica.aula04.endereco.Endereco;
import com.fafica.aula04.endereco.EnderecoJaCadastradoException;
import com.fafica.aula04.fachada.Fachada;
import com.fafica.aula04.util.CampoObritarorioInvalidoException;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaCadastroCliente2 {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtBanco;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtUf;
	private Fachada fachada;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroCliente2 window = new TelaCadastroCliente2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastroCliente2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 669, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelBotao = new JPanel();
		panelBotao.setBounds(10, 11, 629, 65);
		frame.getContentPane().add(panelBotao);
		panelBotao.setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cadastrar();
				
			}
		});
		btnCadastrar.setBounds(14, 11, 81, 23);
		panelBotao.add(btnCadastrar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.setBounds(109, 11, 89, 23);
		panelBotao.add(btnAtualizar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.setBounds(212, 11, 89, 23);
		panelBotao.add(btnRemover);
		
		JButton btnProcurar = new JButton("PRocurar");
		btnProcurar.setBounds(315, 11, 89, 23);
		panelBotao.add(btnProcurar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(418, 11, 89, 23);
		panelBotao.add(btnListar);
		
		JButton btnLimparCampos = new JButton("Limpar");
		btnLimparCampos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limparCampos();
			}
		});
		btnLimparCampos.setBounds(521, 11, 89, 23);
		panelBotao.add(btnLimparCampos);
		
		JPanel panelCampos = new JPanel();
		panelCampos.setBounds(10, 87, 629, 103);
		frame.getContentPane().add(panelCampos);
		panelCampos.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 11, 46, 14);
		panelCampos.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(47, 8, 172, 20);
		panelCampos.add(txtNome);
		txtNome.setColumns(10);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(272, 5, 142, 20);
		panelCampos.add(txtCpf);
		txtCpf.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(229, 8, 46, 14);
		panelCampos.add(lblCpf);
		
		JLabel lblBanco = new JLabel("Banco:");
		lblBanco.setBounds(435, 8, 46, 14);
		panelCampos.add(lblBanco);
		
		txtBanco = new JTextField();
		txtBanco.setBounds(480, 5, 86, 20);
		panelCampos.add(txtBanco);
		txtBanco.setColumns(10);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setBounds(10, 39, 86, 14);
		panelCampos.add(lblLogradouro);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setBounds(84, 36, 285, 20);
		panelCampos.add(txtLogradouro);
		txtLogradouro.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(390, 39, 57, 14);
		panelCampos.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(456, 36, 86, 20);
		panelCampos.add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 67, 46, 14);
		panelCampos.add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(57, 64, 102, 20);
		panelCampos.add(txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(189, 67, 46, 14);
		panelCampos.add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(233, 64, 86, 20);
		panelCampos.add(txtCidade);
		txtCidade.setColumns(10);
		
		JLabel lblUf = new JLabel("UF:");
		lblUf.setBounds(329, 67, 46, 14);
		panelCampos.add(lblUf);
		
		txtUf = new JTextField();
		txtUf.setBounds(361, 64, 86, 20);
		panelCampos.add(txtUf);
		txtUf.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 201, 629, 159);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 609, 137);
		panel.add(scrollPane);
		
		String[] tituloTabela = new String[] {"Codigo", "Nome", "CPF"};
		
		DefaultTableModel defaultTableModelCliente = new DefaultTableModel(
				new Object[][] {,},tituloTabela
			);
		table = new JTable();
		table.setModel(defaultTableModelCliente);
		scrollPane.setViewportView(table);
		
		ArrayList<Cliente> clientes = fachada.listarCliente();
		for(Cliente cliente: clientes) {
			Vector vector = new Vector();
			vector.add(cliente.getCodigo());
			vector.add(cliente.getNome());
			vector.add(cliente.getCpf());
			defaultTableModelCliente.addRow(vector);
		}
	}
	
	private void limparCampos(){
		txtNome.setText("");
		txtCpf.setText("");
		txtBanco.setText("");
		txtLogradouro.setText("");
		txtNumero.setText("");
		txtBairro.setText("");
		txtCidade.setText("");
		txtUf.setText("");
	}
	
	private void cadastrar() {
		String nome = txtNome.getText();
		String cpf	= txtCpf.getText();
		String banco = txtBanco.getText();
		String logradouro	= txtLogradouro.getText();
		String numero		= txtNumero.getText();
		String bairro		= txtBairro.getText();
		String cidade		= txtCidade.getText();
		String estado		= txtUf.getText();
		
		Cliente cliente = new Cliente(nome, cpf, banco);
		Endereco endereco = new Endereco(cliente, logradouro, numero, bairro, cidade, estado);
		cliente.setEndereco(endereco);
		fachada = Fachada.getInstance();
		try {
			fachada.cadastrarCliente(cliente);
			JOptionPane.showMessageDialog(frame, "Cliente Cadastrado com Sucesso", "SUCESSO", JOptionPane.PLAIN_MESSAGE);
			limparCampos();
		} catch (IllegalArgumentException | CPFInvalidoException | ClienteJaCadastradoException
				| CampoObritarorioInvalidoException | IdadeInvalidoException | EnderecoJaCadastradoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		
	}
}
