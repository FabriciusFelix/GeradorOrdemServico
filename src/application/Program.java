/*
 * 
 *  
 * Programa Desenvolvido por: Fabricius Felix
 * Gerador de Arquivo .CSV contendo Dados para impressão de documento Ordem de Serviço.
 *
 *
 */

package application;
  
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import entities.Data;
import entities.DocumentoLimitado;
  
public class Program extends JFrame implements ActionListener{
  
       private static final long serialVersionUID = 1L;
        
    public static void main(String[] args)  
    {  
       Program field = new Program();
       field.testaJFormattedTextField();
    }
  
    private void testaJFormattedTextField() {
             Container janela = getContentPane();
             setLayout(null);
  
             //Define os r�tulos dos bot�es
             JLabel labelRazao = new JLabel("Razao Social: ");
             JLabel labelContato = new JLabel("Contato: ");
             JLabel labelTecnico = new JLabel("Tecnico: ");
             JLabel labelData = new JLabel("Data: ");
             JLabel labelProduto = new JLabel("Produto: ");
             JLabel labelSerie = new JLabel("Sequencial: ");
             JLabel labelMarca = new JLabel("Marca: ");
             JLabel labelModelo = new JLabel("Modelo:"); 
             JLabel labelOcorrencia = new JLabel("Ocorrencia:"); 
             JLabel labelObs = new JLabel("Observacoes: "); 
             JLabel labelAtividade = new JLabel("Atividade: ");

             JLabel labelVersao = new JLabel("Versão: 1.1");
             
             
             labelRazao.setBounds(50,40,100,20);
             labelContato.setBounds(50,80,100,20);
             labelTecnico.setBounds(50,120,100,20);
             labelData.setBounds(50,160,100,20);
             labelProduto.setBounds(50, 200, 100, 20);
             labelSerie.setBounds(50, 240, 100, 20);
             labelMarca.setBounds(50, 280, 100, 20);
             labelModelo.setBounds(50, 320, 100, 20);
             labelOcorrencia.setBounds(50, 360, 100, 20);
             labelObs.setBounds(400, 280, 100, 20);
             labelAtividade.setBounds(400, 320, 100, 20);
             labelVersao.setBounds(25, 450, 100, 10);
             
             
             
             
             //Define as m�scaras e a caixa Atividades
             // Todas as instancia��es precisaram ficar do lado de fora do Try
             
             MaskFormatter mascaraRazao = null;
             MaskFormatter mascaraContato = null;
             MaskFormatter mascaraTecnico = null;
             MaskFormatter mascaraData = null;
             MaskFormatter mascaraProduto = null;
             MaskFormatter mascara = null;
             MaskFormatter mascaraSerie = null;
             MaskFormatter mascaraMarca = null;             
             MaskFormatter mascaraModelo = null;
             MaskFormatter mascaraOcorrencia = null;
             MaskFormatter mascaraObs = null;
             MaskFormatter mascaraAtividade = null;

             JTextArea ativ = null;
             
             
             try{
            	  //mascaraContato = new MaskFormatter("**************************************");
                 // mascaraTecnico = new MaskFormatter("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
            	 // mascaraProduto = new MaskFormatter("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU");
                 // mascaraMarca =  new MaskFormatter("UUUUUUUUUUU");
                 //  mascaraModelo = new MaskFormatter("AAAAAAAAAAAA");
                    mascaraRazao = new MaskFormatter(" ##.###.###/####-##");
                  
                    mascaraData = new MaskFormatter(" ##/##/####");
                  
                    mascaraSerie = new MaskFormatter("#################");
 
                    //mascaraOcorrencia = new MaskFormatter("******************************************");
                    //mascaraObs = new MaskFormatter(null);
                    mascaraAtividade = new MaskFormatter("*****************************************************************");
                   
                    ativ = new JTextArea();
                    ativ.setLineWrap(true);//Comando que permite pular as linhas automaticamente
                   
                    
//Fazendo o Bot�o criar alguma a��o ao ser clicado
                    //Ao ser clicado o bot�o vai coletar os dados e armazenar num arquivo CSV
      //////              botao.addActionListener(this);
                    
                    
                    
                    
                  
                /*  mascaraContato.setPlaceholderCharacter('_');
                	mascaraTecnico.setPlaceholderCharacter('_');
               		mascaraProduto.setPlaceholderCharacter('_');
               		mascaraMarca.setPlaceholderCharacter('_');
                	mascaraModelo.setPlaceholderCharacter('_');
                 	mascaraOcorrencia.setPlaceholderCharacter('_');
                    mascaraObs.setPlaceholderCharacter('_');*/
                   
                    
                   
                    mascaraAtividade.setPlaceholderCharacter('_');
                    mascaraRazao.setPlaceholderCharacter('_');
                    mascaraSerie.setPlaceholderCharacter('_');
                    mascaraData.setPlaceholderCharacter('_');
            
	
             
             
		        
     	      

             
//Instanciando as m�scaras nos objetos JFormattedTextField
             JTextField jFormattedTextRazao = new JFormattedTextField(mascaraRazao);
             JTextField JFormattedTextRazao2 = new JFormattedTextField();
             JTextField jFormattedTextContato = new JFormattedTextField(mascaraContato);
             JTextField jFormattedTextTecnico = new JFormattedTextField(mascaraTecnico);
             JTextField jFormattedTextData = new JFormattedTextField(mascaraData);
             JTextField jFormattedProduto = new JFormattedTextField(mascaraProduto);
             JTextField jFormattedSerie = new JFormattedTextField(mascaraSerie);
             JTextField jFormattedMarca = new JFormattedTextField(mascaraMarca);
             JTextField jFormattedModelo = new JFormattedTextField(mascaraModelo);
             JTextField jFormattedOcorrencia = new JFormattedTextField(mascaraOcorrencia);
             JTextField jFormattedObs = new JFormattedTextField(mascaraObs);
           //  JFormattedTextField jFormattedAtividade = new JFormattedTextField(ativ);
             
             JButton botao = null;
             botao = new JButton("Submit");
             botao.addActionListener(new Manuseio(botao, jFormattedTextRazao, jFormattedTextContato, jFormattedTextTecnico, jFormattedTextData, jFormattedProduto, jFormattedSerie, jFormattedMarca, jFormattedModelo, jFormattedOcorrencia, jFormattedObs, ativ));     			

             
 // Limitando as caixas de texto para 10 digitos, import da classe DocumentoLimitado.            
             jFormattedMarca.setDocument( new DocumentoLimitado(10) );
             jFormattedTextTecnico.setDocument(new DocumentoLimitado(20)); 
             jFormattedProduto.setDocument(new DocumentoLimitado(15));
             jFormattedTextContato.setDocument(new DocumentoLimitado(15));
             jFormattedModelo.setDocument(new DocumentoLimitado(15));
             jFormattedOcorrencia.setDocument(new DocumentoLimitado(20));
             jFormattedObs.setDocument(new DocumentoLimitado(60));
             ativ.setDocument(new DocumentoLimitado(170));
             
            
             
             JFormattedTextRazao2.setBounds(320, 40, 150, 20);
             jFormattedTextRazao.setBounds(150,40,150,20);
             jFormattedTextContato.setBounds(150,80,150,20);
             jFormattedTextTecnico.setBounds(150,120,150,20);
             jFormattedTextData.setBounds(150,160,75,20);
             jFormattedProduto.setBounds(150,200,150,20);
             jFormattedSerie.setBounds(150,240,150,20);
             jFormattedMarca.setBounds(150,280,150,20);
             jFormattedModelo.setBounds(150,320,150,20);
             jFormattedOcorrencia.setBounds(150,360,150,20);
             jFormattedObs.setBounds(500,280,250,20);
          // jFormattedAtividade.setBounds(500,40,150,80);            
             jFormattedSerie.setBounds(150,240,150,20);
             jFormattedMarca.setBounds(150,280,150,20);
             jFormattedModelo.setBounds(150,320,150,20);
             ativ.setBounds(500,320,250,90); 
             botao.setBounds(350,425,100,20);
            
             
             
             
             
             
             
          	String razaoSocial = jFormattedTextRazao.getText(); 
         	String contato = jFormattedTextContato.getText();
         	String tecnico = jFormattedTextTecnico.getText();
         	String data = jFormattedTextData.getText();
         	String product = jFormattedProduto.getText();
         	String serie = jFormattedSerie.getText();
         	String marca = jFormattedMarca.getText();
         	String modelo = jFormattedModelo.getText();
         	String ocorrencia = jFormattedOcorrencia.getText();
         	String observacoes = jFormattedObs.getText();
         	String atividade = ativ.getText();
         	
              

             Data teste = new Data(razaoSocial, contato, tecnico, data, product, serie, marca, modelo, ocorrencia, observacoes, atividade);
             
             
             
             
             
            		 //caixas de texto
                     janela.add(jFormattedTextRazao);
                     janela.add(jFormattedTextContato);
                     janela.add(jFormattedTextTecnico);
                     janela.add(jFormattedTextData);
                //   janela.add(jFormattedAtividade);
                     janela.add(jFormattedProduto);
                     janela.add(jFormattedMarca);
                     janela.add(jFormattedModelo);
                     janela.add(jFormattedObs);
                     janela.add(jFormattedOcorrencia);
                     janela.add(jFormattedSerie);
                     janela.add(ativ);
                     janela.add(JFormattedTextRazao2);
                     //bot�o
                     janela.add(botao);
                     janela.add(labelVersao);
                     
             
                     janela.add(labelRazao);
                     janela.add(labelContato);
                     janela.add(labelTecnico);
                     janela.add(labelData);
                     janela.add(labelProduto);
                     janela.add(labelSerie);
                     janela.add(labelMarca);
                     janela.add(labelModelo);
                     janela.add(labelOcorrencia);
                     janela.add(labelObs);
                     janela.add(labelAtividade);
                     
             
                     setSize(800, 500);
                     setTitle("Gerador de Ordem de Servico");
                     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                     setVisible(true);
            
             
             }catch(ParseException excp) {
                    System.err.println("Erro na formatacao: " + excp.getMessage());
                    System.exit(-1);
             }
             }
             
//Adiciona os Labels e os campos de textos com m�scaras na tela
             //labels
             
             
             
            
            
             
             
             
 //Janela do programa
    
            
    
    
	/*public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Data dados = new Data(razaoSocial, contato, tecnico, data, product, serie, marca, modelo, ocorrencia, observacoes, atividade);
    	
    	System.out.println(dados.getContato());
    	System.out.println(dados.getRazaoSocial());
    	System.out.println(dados.getTecnico());
    	System.out.println(dados.getData());
    	System.out.println(dados.getProduct());
    	System.out.println(dados.getSerie());
    	System.out.println(dados.getMarca());
    	System.out.println(dados.getModelo());
    	System.out.println(dados.getOcorrencia());
    	System.out.println(dados.getObservacoes());
    	System.out.println(dados.getAtividade());
		
		System.out.println("Teste");
		System.out.println();
		JOptionPane.showMessageDialog(null, "Arquivo enviado! Consulte C:\\Ordem Servico");
		
		//Data dados = new Data(razaoSocial, contato, tecnico, data, product, serie, marca, modelo, ocorrencia, observacoes, horaInicio, horaFim, atividade)
          
	
	
	
	
	}
*/

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		
		}
		

	}
	
	
	   