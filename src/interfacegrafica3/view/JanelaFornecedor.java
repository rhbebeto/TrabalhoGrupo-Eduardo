package interfacegrafica3.view;

import interfacegrafica3.model.Fornecedor;
import interfacegrafica3.repository.FornecedorRepository;
import javax.swing.JOptionPane;
import interfacegrafica3.model.Uf;

public class JanelaFornecedor extends javax.swing.JInternalFrame {

    private static JanelaFornecedor instancia;
    private JanelaPrincipal janelaPrincipal;

    public JanelaFornecedor(JanelaPrincipal janelaPrincipal) {
        initComponents();
        this.janelaPrincipal = janelaPrincipal;
        txtId1.setVisible(false); //escondendo txtId
        txtId1.setText("0");

    }

    private void fecharJanela() {
        instancia = null;
        dispose();
    }

    private void limparCampos() {
        txtId1.setText("0");
        txtNome.setText("");
        txtEndereco.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        txtCnpj.setText("");
        txtEndereco1.setText("");
        txtEmail1.setText("");
        txtTelefone1.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFechar1 = new javax.swing.JButton();
        btnExcluir1 = new javax.swing.JButton();
        btnGravar1 = new javax.swing.JButton();
        btnAvancar2 = new javax.swing.JButton();
        txtId1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        btnRetroceder = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEndereco1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEmail1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTelefone1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnFechar1.setText("Fechar");
        btnFechar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechar1ActionPerformed(evt);
            }
        });

        btnExcluir1.setText("Excluir");
        btnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
            }
        });

        btnGravar1.setText("Gravar");
        btnGravar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravar1ActionPerformed(evt);
            }
        });

        btnAvancar2.setText("⏩");
        btnAvancar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvancar2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome:");

        jLabel2.setText("Endereco:");

        jLabel3.setText("E-mail:");

        jLabel4.setText("Telefone:");

        btnRetroceder.setText("⏪");
        btnRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrocederActionPerformed(evt);
            }
        });

        jLabel7.setText("CNPJ:");

        jLabel8.setText("Inscrição Estadual:");

        jLabel9.setText("Nome Fantasia:");

        jLabel10.setText("Categoria:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGravar1)
                        .addGap(42, 42, 42)
                        .addComponent(btnExcluir1)
                        .addGap(60, 60, 60)
                        .addComponent(btnFechar1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRetroceder)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnAvancar2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtId1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(btnAvancar2)
                    .addComponent(btnRetroceder))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar1)
                    .addComponent(btnExcluir1)
                    .addComponent(btnFechar1))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFechar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechar1ActionPerformed
        fecharJanela();
    }//GEN-LAST:event_btnFechar1ActionPerformed

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed

    }//GEN-LAST:event_btnExcluir1ActionPerformed

    private void btnGravar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravar1ActionPerformed
      
try {
        // Obtém o ID do formulário (se for "0" significa novo cadastro)
        int id = Integer.parseInt(txtId1.getText());
        
        // Cria o objeto Fornecedor com os dados dos campos
        Fornecedor fornecedor = new Fornecedor(
            txtCnpj.getText(),          // cnpj
            txtEndereco1.getText(),     // inscrição estadual
            txtEmail1.getText(),        // nome fantasia
            txtNome.getText(),          // nome
            txtEmail.getText(),         // email
            txtEndereco.getText(),      // endereço
            txtTelefone.getText(),      // telefone
            txtTelefone1.getText(),     // categoria
            new Uf("UF Nome", "UF", 0),   // objeto Uf dummy (substitua por dados reais)
            id                          // id
        );
        
        // Instancia o repositório e realiza a operação de inserção ou atualização
        FornecedorRepository repo = new FornecedorRepository();
        boolean sucesso;
        if(id == 0){
            // Se ID for 0, é um novo cadastro
            sucesso = repo.inserir(janelaPrincipal.conexaoMySQL.connection, fornecedor);
        } else {
            // Caso contrário, atualiza o registro existente
            sucesso = repo.atualizar(janelaPrincipal.conexaoMySQL.connection, fornecedor);
        }
        
        // Exibe mensagem de sucesso e limpa os campos se a operação for bem-sucedida
        if(sucesso){
            JOptionPane.showMessageDialog(
                this,
                "Cadastro realizado com sucesso!",
                "Cadastro de Fornecedor",
                JOptionPane.INFORMATION_MESSAGE
            );
            limparCampos();
        }
    } catch(Exception ex) {
        JOptionPane.showMessageDialog(
            this,
            "Erro ao gravar os dados: " + ex.getMessage(),
            "Erro",
            JOptionPane.ERROR_MESSAGE
        );
    }
    }//GEN-LAST:event_btnGravar1ActionPerformed

    private void btnAvancar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAvancar2ActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed

    }//GEN-LAST:event_btnRetrocederActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaPrincipal janelaPrincipal = new JanelaPrincipal(); // ou obtenha a instância de uma janela já existente
                new JanelaFornecedor(janelaPrincipal).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvancar2;
    private javax.swing.JButton btnExcluir1;
    private javax.swing.JButton btnFechar1;
    private javax.swing.JButton btnGravar1;
    private javax.swing.JButton btnRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmail1;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEndereco1;
    private javax.swing.JTextField txtId1;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTelefone1;
    // End of variables declaration//GEN-END:variables
}
