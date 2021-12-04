/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import conexoes.MySQL;
import javax.swing.JOptionPane;
import objetos.Produto;
import objetos.Vendedor;

/**
 *
 * @author Macrr
 */
public class ViewCadastroProduto extends javax.swing.JFrame {
    
    MySQL conectar = new MySQL(); //acessar os métodos de conexao com o banco
    Produto novoProduto = new Produto();
    Vendedor novoVendedor = new Vendedor();
    
    private int vendedorID = 0;
    void setVendedorID(int ID)
    {
         vendedorID = ID;
         System.out.println(vendedorID);
         
    }
        
    public ViewCadastroProduto() {
        initComponents();
        getDono(novoVendedor);

    }
    
    
    private void cadastraProduto(Produto novoProduto){
        this.conectar.conectaBanco(); 
        
        boolean piscina = false;
        boolean churrasqueira = false;
        
        novoProduto.setNome_casa(txtNome.getText());
        novoProduto.setCasa_valor(1);
        novoProduto.setCasa_cidade(txtCidade.getText());
        novoProduto.setCasa_endereco(txtEndereco.getText());
        Integer Numero = Integer.valueOf(txtNumero.getText());
        novoProduto.setCasa_numero(Numero);
        Integer quartos = Integer.valueOf(txtQuartos.getText());
        novoProduto.setCasa_quartos(quartos);
        Integer Banheiros = Integer.valueOf(txtBanheiros.getText());
        novoProduto.setCasa_banheiros(Banheiros);
        if(cbPiscina.getSelectedIndex() == 1)
        {
            piscina = true;
        }else{piscina = false;}
        if(cbChurrasqueira.getSelectedIndex() == 1)
        {
            churrasqueira = true;
        }else{churrasqueira = false;}

        
        try {
                        
            this.conectar.insertSQL("INSERT INTO casas ("
                    + "casa_nome,"
                    + "casa_cidade,"
                    + "casa_endereco,"
                    + "casa_numero,"
                    + "casa_quartos,"
                    + "casa_banheiros,"
                    + "casa_piscina,"
                    + "casa_churrasqueira,"
                    + "casa_alugada,"
                    + "vendedor_id"
                + ") VALUES ("
                    + "'" + novoProduto.getNome_casa() + "',"
                    + "'" + novoProduto.getCasa_cidade() + "',"        
                    + "'" + novoProduto.getCasa_endereco() + "'," 
                    + "'" + novoProduto.getCasa_numero() + "',"         
                    + "'" + novoProduto.getCasa_quartos() + "'," 
                    + "'" + novoProduto.getCasa_banheiros() + "'," 
                    + "'" + piscina + "',"  
                    + "'" + churrasqueira + "',"  
                    + "'" + null + "',"          
                    + "'" + vendedorID + "'"  
                            
                + ");");
            
        } catch (Exception e) {
            
            System.out.println("Erro ao cadastrar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto");
            
        } finally{            
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
            //novoCliente.limpaCliente();
            //limparCamposCadastro();
        }                
    } 
    
    private void getDono(Vendedor novoVendedor)
    {
    

            this.conectar.conectaBanco();  
                
        try {
            this.conectar.executarSQL(
               "select * from ListaCasas where id =" + vendedorID + ";"
            );
            
            while(this.conectar.getResultSet().next()){               

            varDono.setText(this.conectar.getResultSet().getString(1));
            novoVendedor.setNome(this.conectar.getResultSet().getString(0));
            
           }

           
        } catch (Exception e) {            
            System.out.println("Erro ao consultar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto");
            
        }finally{
            
            


            this.conectar.fechaBanco();   
        }               
        
        
    }
    
    /*
     private void buscarProduto(Produto novoProduto){
         
        this.conectar.conectaBanco();
        
        String consultaProduto = this.consultaProduto.getText();
                
        try {
            this.conectar.executarSQL(
                   "SELECT "
                    + "produto,"
                    + "tamanho,"
                    + "descricao,"
                    + "fornecedor,"
                    + "custo,"
                    + "venda,"
                    + "icms"
                 + " FROM"
                     + " cadastroproduto"
                 + " WHERE"
                     + " produto = '" + consultaProduto + "'"
                + ";"
            );
            
            while(this.conectar.getResultSet().next()){               
                novoProduto.setProduto(this.conectar.getResultSet().getString(1));
                novoProduto.setTamanho(this.conectar.getResultSet().getInt(2));
                novoProduto.setDescricao(this.conectar.getResultSet().getString(3));
                novoProduto.setFornecedor(this.conectar.getResultSet().getString(4));
                novoProduto.setCusto(this.conectar.getResultSet().getFloat(5));
                novoProduto.setVenda(this.conectar.getResultSet().getFloat(6));
                novoProduto.setIcms(this.conectar.getResultSet().getFloat(7));
           }
            
           if(novoProduto.getProduto() == ""){
                JOptionPane.showMessageDialog(null, "Produto não encontrado!");
           }
           
        } catch (Exception e) {            
            System.out.println("Erro ao consultar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto");
            
        }finally{
            consultaDescricao.setText(novoProduto.getDescricao());
            consultaFornecedor.setText(novoProduto.getFornecedor());
            consultaTamanho.setText(Integer.toString(novoProduto.getTamanho()));
            consultaCusto.setText(Float.toString(novoProduto.getCusto()));
            consultaVenda.setText(Float.toString(novoProduto.getVenda()));
            consultaICMC.setText(Float.toString(novoProduto.getIcms()));

            this.conectar.fechaBanco();   
        }               
    }    
     
     
    private void limpaCamposCadastro(){
        txtProduto.setText("");
        txtCusto.setText("");
        txtDescricao.setText("");
        txtFornecedor.setText("");
        txtICMC.setText("");
        txtTamanho.setText("");
        txtVenda.setText("");
    }
    
    private void limparCamposBusca(){
        consultaCusto.setText("");
        consultaDescricao.setText("");
        consultaFornecedor.setText("");
        consultaICMC.setText("");
        consultaProduto.setText("");
        consultaTamanho.setText("");
        consultaVenda.setText("");
    }
*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        varDono = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtQuartos = new javax.swing.JTextField();
        txtBanheiros = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        cbPiscina = new javax.swing.JComboBox<>();
        cbChurrasqueira = new javax.swing.JComboBox<>();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Nova Casa:");

        varDono.setText("Dono");

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Valor: ");

        jLabel3.setText("Cidade:");

        jLabel4.setText("Endereço:");

        jLabel5.setText("Numero");

        jLabel6.setText("Quartos:");

        jLabel7.setText("Banheiros:");

        jLabel8.setText("Piscina:");

        jLabel9.setText("Churrasqueira:");

        jButton2.setText("Cancelar");

        cbPiscina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));
        cbPiscina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPiscinaActionPerformed(evt);
            }
        });

        cbChurrasqueira.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sim", "Não" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(varDono)
                        .addGap(96, 96, 96)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNome)
                                    .addComponent(txtValor)
                                    .addComponent(txtCidade)
                                    .addComponent(txtEndereco)
                                    .addComponent(txtNumero)
                                    .addComponent(txtQuartos)
                                    .addComponent(txtBanheiros)
                                    .addComponent(cbPiscina, 0, 251, Short.MAX_VALUE)
                                    .addComponent(cbChurrasqueira, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtBanheiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cbPiscina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cbChurrasqueira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(varDono)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           
        cadastraProduto(novoProduto);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbPiscinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPiscinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPiscinaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbChurrasqueira;
    private javax.swing.JComboBox<String> cbPiscina;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBanheiros;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtQuartos;
    private javax.swing.JTextField txtValor;
    private javax.swing.JLabel varDono;
    // End of variables declaration//GEN-END:variables
}
