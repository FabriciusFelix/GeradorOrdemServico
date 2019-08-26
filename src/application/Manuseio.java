package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import entities.Data;

public class Manuseio implements ActionListener {
    JButton botao = new JButton();
    JTextField razaoSocial = new JTextField();
    JTextField Contato = new JTextField();
    JTextField Tecnico = new JTextField();
    JTextField Data = new JFormattedTextField();
    JTextField Produto = new JFormattedTextField();
    JTextField Serie = new JFormattedTextField();
    JTextField Marca = new JFormattedTextField();
    JTextField Modelo = new JFormattedTextField();
    JTextField Ocorrencia = new JFormattedTextField();
    JTextField Obs = new JFormattedTextField();
    JTextArea Ativ = new JTextArea();
    
    String guardarTexto;
    String contato;
    String tecnico;
    String data;
    String produto;
    String serie;
    String marca;
    String modelo;
    String ocorrencia;
    String obs;
    String ativ;
    
    Manuseio(JButton botao, JTextField jFormattedTextRazao , JTextField jFormattedTextContato, JTextField jFormattedTextTecnico,  JTextField jFormattedTextData,JTextField jFormattedProduto,JTextField jFormattedSerie,JTextField jFormattedMarca,JTextField jFormattedModelo,JTextField jFormattedOcorrencia,JTextField jFormattedObs, JTextArea ativ){
        this.botao=botao;
        razaoSocial = jFormattedTextRazao;
        Contato = jFormattedTextContato;
        Tecnico = jFormattedTextTecnico;
        Data = jFormattedTextData;
        Produto = jFormattedProduto;
        Serie = jFormattedSerie;
        Marca = jFormattedMarca;
        Modelo = jFormattedModelo;
        Ocorrencia = jFormattedOcorrencia;
        Obs = jFormattedObs;
        Ativ = ativ;
        
        
        
    }

    public void actionPerformed(ActionEvent evento) {
        //O que escrever aqui? Eis minha dúvida.
        guardarTexto = razaoSocial.getText();
        contato = Contato.getText();
        tecnico = Tecnico.getText();
        data = Data.getText();
        produto = Produto.getText();
        serie = Serie.getText();
        marca = Marca.getText();
        modelo = Modelo.getText();
        ocorrencia = Ocorrencia.getText();
        obs = Obs.getText();
        ativ = Ativ.getText();
        JOptionPane.showMessageDialog(null, "Certifique-se de que nenhum programa está utilizando o arquivo" );
        Data dados = new Data(guardarTexto, contato, tecnico, data, produto, serie, marca, modelo, ocorrencia, obs, ativ);
        System.out.println(dados.getOcorrencia());
        System.out.println(dados.getMarca());
        System.out.println(dados.getProduct());
        
        
        
        

		String sourceFolderStr = "c:\\Ordem de servico";
		
		boolean success = new File(sourceFolderStr + "\\out").mkdirs();
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

					
							
							bw.write(dados.getRazaoSocial() +
							";" + 
							dados.getContato() +
							";" + 
							dados.getTecnico()+ ";" +
							dados.getData() + ";" +
							dados.getProduct()+ ";" +
							dados.getSerie()+ ";" +
							dados.getMarca() + ";" +
							dados.getModelo()+ ";" +
							dados.getOcorrencia()+ ";" +
							dados.getObservacoes()+ ";" +
							dados.getAtividade());
							
					bw.newLine();
					

				System.out.println(targetFileStr + " CREATED!");
				JOptionPane.showMessageDialog(null, "Arquivo Criado!! Consute a pasta: " + targetFileStr);
				
				
			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
				JOptionPane.showMessageDialog(null, "Error writing file: " + e.getMessage());
			}

    }

	
        
        
        
        
        
    }
