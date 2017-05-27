package apresentacao;

import auxiliar.Perfil;
import datamapper.exceptions.NonexistentEntityException;
import modelo.UsuarioModel;
import servico.AdministracaoDeUsuariosService;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thiago Lima
 */
public class AdministracaoDeUsuarios extends javax.swing.JFrame {

    private JFrame previousFrame;
    private AdministracaoDeUsuariosService aum;
    
    /**
     * Creates new form AdministrarUsuarios
     */
    public AdministracaoDeUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnGroup_Acao.add(rbtn_CriarUsuario);
        btnGroup_Acao.add(rbtn_EditarUsuario); 
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(Recursos.LOGO_DO_MACKENZIE)));
        
        
 
    }
    
    public AdministracaoDeUsuarios(JFrame previous) {
        initComponents();
        this.setLocationRelativeTo(null);
        previousFrame = previous;
        btnGroup_Acao.add(rbtn_CriarUsuario);
        btnGroup_Acao.add(rbtn_EditarUsuario);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource(Recursos.LOGO_DO_MACKENZIE)));
        salvarButton.setEnabled(false);
        
        aum = new AdministracaoDeUsuariosService();
        List<UsuarioModel> usuarios = aum.listarUsuarios();
        List<String> listaDeUsuarios = new ArrayList<String>();
        
        cmb_Nome.addItem("Selecione um usuário");
        
        for(UsuarioModel modelo : usuarios){
             cmb_Nome.addItem(modelo.Usuario);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup_Acao = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rbtn_EditarUsuario = new javax.swing.JRadioButton();
        rbtn_CriarUsuario = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmb_Perfil = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cmb_Janela = new javax.swing.JComboBox();
        cmb_Nome = new javax.swing.JComboBox();
        jToggleButton1 = new javax.swing.JToggleButton();
        txt_Nome = new javax.swing.JTextField();
        txt_Senha = new javax.swing.JTextField();
        txt_Confirme = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        salvarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrar Usuários");

        jLabel1.setText("Ação:");

        rbtn_EditarUsuario.setText("Editar Usuário");
        rbtn_EditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_EditarUsuarioActionPerformed(evt);
            }
        });

        rbtn_CriarUsuario.setText("Criar Novo Usuário");
        rbtn_CriarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_CriarUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jLabel3.setText("Senha:");

        jLabel4.setText("Confirme:");

        jLabel5.setText("Perfil:");

        cmb_Perfil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Funcionário", "Professor" }));
        cmb_Perfil.setToolTipText("Selecione o perfil.");
        cmb_Perfil.setMinimumSize(new java.awt.Dimension(70, 20));
        cmb_Perfil.setPreferredSize(new java.awt.Dimension(70, 20));

        jLabel6.setText("Janela:");

        cmb_Janela.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Item 2", "Item 3", "Item 4" }));
        cmb_Janela.setToolTipText("Selecione a Janela.");
        cmb_Janela.setMinimumSize(new java.awt.Dimension(70, 20));
        cmb_Janela.setPreferredSize(new java.awt.Dimension(70, 20));

        cmb_Nome.setToolTipText("Selecione o Usuário.");
        cmb_Nome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmb_Nome.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmb_NomeItemStateChanged(evt);
            }
        });

        jToggleButton1.setText("Cancelar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        txt_Nome.setToolTipText("Digite o nome do usuário");
        txt_Nome.setEnabled(false);
        txt_Nome.setMinimumSize(new java.awt.Dimension(200, 20));
        txt_Nome.setPreferredSize(new java.awt.Dimension(70, 20));

        txt_Senha.setToolTipText("Digite a senha.");
        txt_Senha.setMinimumSize(new java.awt.Dimension(70, 20));
        txt_Senha.setPreferredSize(new java.awt.Dimension(70, 20));

        txt_Confirme.setToolTipText("Confirme a senha.");
        txt_Confirme.setMinimumSize(new java.awt.Dimension(70, 20));
        txt_Confirme.setPreferredSize(new java.awt.Dimension(70, 20));

        salvarButton.setText("Salvar");
        salvarButton.setActionCommand("salvarButton");
        salvarButton.setEnabled(false);
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salvarButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Confirme, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_Nome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_Nome, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_Janela, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_Perfil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtn_CriarUsuario)
                                    .addComponent(rbtn_EditarUsuario)))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtn_EditarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtn_CriarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(cmb_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Confirme, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_Janela, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(salvarButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtn_EditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_EditarUsuarioActionPerformed
        txt_Nome.setEnabled(false);
        cmb_Nome.setEnabled(true);
        
        if(cmb_Nome.getItemCount() != 0){
            cmb_Nome.setSelectedIndex(0);
            
        }

        
        cmb_Nome.removeAllItems();
        
        aum = new AdministracaoDeUsuariosService(); 
        
        List<UsuarioModel> usuarios = aum.listarUsuarios();
        List<String> listaDeUsuarios = new ArrayList<String>();
        
        cmb_Nome.addItem("Selecione um usuário");
        
        for(UsuarioModel modelo : usuarios){
             cmb_Nome.addItem(modelo.Usuario);
        }
    }//GEN-LAST:event_rbtn_EditarUsuarioActionPerformed

    private void rbtn_CriarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_CriarUsuarioActionPerformed
        cmb_Nome.setEnabled(false);
        txt_Nome.setText("");
        txt_Senha.setText("");
        txt_Confirme.setText("");
        txt_Nome.setEnabled(true);
        salvarButton.setEnabled(true);
        
        
    }//GEN-LAST:event_rbtn_CriarUsuarioActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try {
            this.dispose();
            previousFrame.setVisible(true);
        } catch (Exception e) {
            System.out.println("Erro ao retornar para janela anterior!");
        }       
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        aum = new AdministracaoDeUsuariosService();
        Perfil perfil = (Perfil)cmb_Perfil.getSelectedItem();
        
        if(rbtn_EditarUsuario.isSelected()){
            try {
                
                UsuarioModel model = aum.obterUsuario(txt_Nome.getText());
                
                
                
                aum.editarUsuario(txt_Senha.getText(), perfil, model.id);
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(AdministracaoDeUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(AdministracaoDeUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            aum.salvarUsuario(txt_Nome.getText(),txt_Senha.getText(), perfil);
        }
		
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void cmb_NomeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmb_NomeItemStateChanged
               
        
                if( evt.getStateChange() == ItemEvent.SELECTED && (cmb_Nome.getSelectedIndex() != 0)){

//                    String usuario = (String)evt.getItem();  //Do what ever you want :))
//                    int sobrevivi= 0;
                    String username = (String)evt.getItem();
                    
                    aum = new AdministracaoDeUsuariosService();
                    UsuarioModel modelo = aum.obterUsuario(username);
                    
                    txt_Nome.setText(modelo.Usuario);
                    txt_Senha.setText(modelo.Senha);
                    txt_Confirme.setText(modelo.Senha);

                    cmb_Perfil.setSelectedItem(modelo.profile);
                }
    }//GEN-LAST:event_cmb_NomeItemStateChanged

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
            java.util.logging.Logger.getLogger(AdministracaoDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministracaoDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministracaoDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministracaoDeUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministracaoDeUsuarios().setVisible(true);                  
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup_Acao;
    private javax.swing.JComboBox cmb_Janela;
    private javax.swing.JComboBox cmb_Nome;
    private javax.swing.JComboBox cmb_Perfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JRadioButton rbtn_CriarUsuario;
    private javax.swing.JRadioButton rbtn_EditarUsuario;
    private javax.swing.JButton salvarButton;
    private javax.swing.JTextField txt_Confirme;
    private javax.swing.JTextField txt_Nome;
    private javax.swing.JTextField txt_Senha;
    // End of variables declaration//GEN-END:variables
}
