package com.fafica.aula12.exemplo;
// 981.337.569-87
// 443.237.417-90
// 875.067.305-02
// 952.614.761-86
import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import com.fafica.aula04.cliente.CPFInvalidoException;
import com.fafica.aula04.cliente.Cliente;
import com.fafica.aula04.cliente.IdadeInvalidoException;
import com.fafica.aula04.endereco.Endereco;
import com.fafica.aula04.endereco.EnderecoJaCadastradoException;
import com.fafica.aula04.endereco.EnderecoNaoEncontradoException;
import com.fafica.aula04.exemplo.ClienteJaCadastradoException;
import com.fafica.aula04.exemplo.ClienteNaoEncontradoException;
import com.fafica.aula04.fachada.Fachada;
import com.fafica.aula04.util.CampoObritarorioInvalidoException;

import javax.swing.JRadioButton;

public class TelaCadastroCliente {

	private JFrame frame;
	private JTextField txtCPF;
	private JTextField txtBanco;
	private JTextField txtNome;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JTextField txtEstado;
	private Fachada fachada;
	private JTable tableCliente;
	private DefaultTableModel defaultTableModelCliente;
	private ButtonGroup groupSexo;
	private JRadioButton rdbtnMasculino;
	private JRadioButton rdbtnFeminino;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroCliente window = new TelaCadastroCliente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadastroCliente() {
		fachada = Fachada.getInstance();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 649, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelBotao = new JPanel();
		panelBotao.setBounds(10, 11, 613, 55);
		frame.getContentPane().add(panelBotao);
		panelBotao.setLayout(null);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastrar();
			}
		});
		btnCadastrar.setBounds(4, 11, 97, 23);
		panelBotao.add(btnCadastrar);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remover();
			}
		});
		btnRemover.setBounds(206, 11, 97, 23);
		panelBotao.add(btnRemover);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				procurar();
			}
		});
		btnProcurar.setBounds(307, 11, 97, 23);
		panelBotao.add(btnProcurar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listar();
			}
		});
		btnListar.setBounds(408, 11, 97, 23);
		panelBotao.add(btnListar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				limparCampo();
				limparTabelaCliente();
			}
		});
		btnLimpar.setBounds(509, 11, 97, 23);
		panelBotao.add(btnLimpar);
		
		JButton btnUpdate = new JButton("Atualizar");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				atualizar();
			}
		});
		btnUpdate.setBounds(105, 11, 97, 23);
		panelBotao.add(btnUpdate);
		
		JPanel panelCampos = new JPanel();
		panelCampos.setBounds(10, 77, 613, 123);
		frame.getContentPane().add(panelCampos);
		panelCampos.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 15, 46, 19);
		panelCampos.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(302, 17, 32, 14);
		panelCampos.add(lblCpf);
		
		txtCPF = new JTextField();
		txtCPF.setBounds(344, 14, 112, 20);
		panelCampos.add(txtCPF);
		txtCPF.setColumns(10);
		
		JLabel lblBanco = new JLabel("Banco:");
		lblBanco.setBounds(462, 17, 49, 14);
		panelCampos.add(lblBanco);
		
		txtBanco = new JTextField();
		txtBanco.setBounds(505, 14, 86, 20);
		panelCampos.add(txtBanco);
		txtBanco.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(48, 14, 244, 20);
		panelCampos.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setBounds(10, 45, 73, 14);
		panelCampos.add(lblLogradouro);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setBounds(90, 42, 244, 20);
		panelCampos.add(txtLogradouro);
		txtLogradouro.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(377, 45, 46, 14);
		panelCampos.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(433, 42, 61, 20);
		panelCampos.add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(10, 78, 46, 14);
		panelCampos.add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(71, 73, 142, 20);
		panelCampos.add(txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(223, 76, 46, 14);
		panelCampos.add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(269, 73, 121, 20);
		panelCampos.add(txtCidade);
		txtCidade.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(400, 75, 46, 14);
		panelCampos.add(lblEstado);
		
		txtEstado = new JTextField();
		txtEstado.setBounds(450, 73, 86, 20);
		panelCampos.add(txtEstado);
		txtEstado.setColumns(10);
		
		rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(71, 100, 109, 23);
		panelCampos.add(rdbtnMasculino);
		
		rdbtnFeminino = new JRadioButton("Feminino");
		rdbtnFeminino.setBounds(192, 100, 109, 23);
		panelCampos.add(rdbtnFeminino);
		
		JScrollPane scrollPaneTabelaCliente = new JScrollPane();
		scrollPaneTabelaCliente.setBounds(10, 198, 613, 163);
		frame.getContentPane().add(scrollPaneTabelaCliente);
		
		tableCliente = new JTable();
		String colunaTabelaCliente[] = new String[] {"ID", "Nome", "CPF", "Banco", "Logradouro", "Bairro", "Cidade", "Numero", "UF"};
		defaultTableModelCliente = new DefaultTableModel(new Object[] []{ }, colunaTabelaCliente) {
			public boolean isCellEditable(int row, int col) {
				return false;
			}
		};
		
		tableCliente.setModel(defaultTableModelCliente);
		scrollPaneTabelaCliente.setViewportView(tableCliente);
		groupSexo = new ButtonGroup();
		groupSexo.add(rdbtnMasculino);
		groupSexo.add(rdbtnFeminino);
	}
	
	private void cadastrar() {
		String nome			= txtNome.getText();
		String cpf 			= txtCPF.getText();
		String logradouro	= txtLogradouro.getText();
		String numero		= txtNumero.getText();
		String bairro		= txtBairro.getText();
		String cidade		= txtCidade.getText();
		String estado		= txtEstado.getText();
		String banco		= txtBanco.getText();
		Cliente cliente 	= new Cliente(nome, cpf, banco);
		Endereco endereco 	= new Endereco(cliente, logradouro, numero, bairro, cidade, estado);
		cliente.setEndereco(endereco);
		try {
			fachada.cadastrarCliente(cliente);
			JOptionPane.showMessageDialog(frame, "Cliente Cadastrado com Sucesso");
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (CPFInvalidoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (CampoObritarorioInvalidoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (IdadeInvalidoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (EnderecoJaCadastradoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void listar() {
		this.limparTabelaCliente();
		ArrayList<Cliente> clientes = fachada.listarCliente();
		for(Cliente cliente: clientes) {
			Vector vector = new Vector();
			vector.add(cliente.getCodigo());
			vector.add(cliente.getNome());
			vector.add(cliente.getCpfFormatado());
			vector.add(cliente.getBanco());
			vector.add(cliente.getEndereco().getLogradouro());
			vector.add(cliente.getEndereco().getNumero());
			vector.add(cliente.getEndereco().getBairro());
			vector.add(cliente.getEndereco().getCidade());
			vector.add(cliente.getEndereco().getEstado());
			defaultTableModelCliente.addRow(vector);
		}
	}
	
	private void limparTabelaCliente() {
		defaultTableModelCliente.setNumRows(0);;
	}
	
	private void procurar(){
		try {
			Cliente cliente = fachada.procurarCliente(txtCPF.getText());
			txtNome.setText(cliente.getNome());
			//txtCPF.setText(cliente.getCpfFormatado());
			txtBanco.setText(cliente.getBanco());
			txtLogradouro.setText(cliente.getEndereco().getLogradouro());
			txtNumero.setText(cliente.getEndereco().getNumero());
			txtBairro.setText(cliente.getEndereco().getBairro());
			txtCidade.setText(cliente.getEndereco().getCidade());
			txtEstado.setText(cliente.getEndereco().getEstado());
		} catch (CPFInvalidoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (EnderecoNaoEncontradoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void limparCampo() {
		txtNome.setText("");
		txtCPF.setText("");
		txtBanco.setText("");
		txtLogradouro.setText("");
		txtNumero.setText("");
		txtBairro.setText("");
		txtCidade.setText("");
		txtEstado.setText("");
	}
	
	private void atualizar() {
		try {
			Cliente cliente = fachada.procurarCliente(txtCPF.getText());
			cliente.setNome(txtNome.getText());
			cliente.setBanco(txtBanco.getText());
			cliente.getEndereco().setLogradouro(txtLogradouro.getText());
			cliente.getEndereco().setNumero(txtNumero.getText());
			cliente.getEndereco().setBairro(txtBairro.getText());
			cliente.getEndereco().setCidade(txtCidade.getText());
			cliente.getEndereco().setEstado(txtEstado.getText());
			fachada.atualizarCliente(cliente);
			JOptionPane.showMessageDialog(frame, "Cliente Atualizado com Sucesso");
			limparCampo();
		} catch (CPFInvalidoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (EnderecoNaoEncontradoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void remover() {
		try {
			fachada.removerCliente(txtCPF.getText());
			JOptionPane.showMessageDialog(frame, "Cliente Removido com Sucesso");
			limparCampo();
		} catch (CPFInvalidoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (EnderecoNaoEncontradoException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(frame, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}
}

