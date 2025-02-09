package interfacegrafica3.view;

import interfacegrafica3.model.Fornecedor;
import interfacegrafica3.repository.FornecedorRepository;
import javax.swing.JOptionPane;
import interfacegrafica3.model.Uf;
import interfacegrafica3.repository.UfRepository;
import java.util.ArrayList;
import java.util.List;

public class JanelaFornecedor extends javax.swing.JInternalFrame {

    private static JanelaFornecedor instancia;
    private JanelaPrincipal janelaPrincipal;
    private List<Fornecedor> fornecedores = new ArrayList<>();
    private int indexAtual = -1;

    public JanelaFornecedor(JanelaPrincipal janelaPrincipal) {
        initComponents();
        this.janelaPrincipal = janelaPrincipal;
        txtId1.setVisible(false); //escondendo txtId
        txtId1.setText("0");
        carregarUfs();
        carregarFornecedores();

    }

    private void fecharJanela() {
        instancia = null;
        dispose();
    }

    private void carregarUfs() {
        UfRepository ufRepository = new UfRepository();
        List<Uf> lista = ufRepository.listar(janelaPrincipal.conexaoMySQL.connection);

        cbUf.removeAllItems(); // Limpa os itens anteriores

        if (lista != null && !lista.isEmpty()) {
            for (Uf uf : lista) {
                cbUf.addItem(uf); // Adiciona os estados ao JComboBox
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum estado encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void carregarFornecedores() {
    FornecedorRepository fornecedorRepository = new FornecedorRepository();
    fornecedores = fornecedorRepository.listar(janelaPrincipal.conexaoMySQL.connection); // Assumindo que há esse método no repositório.

    if (fornecedores.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Nenhum fornecedor encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
    } else {
        indexAtual = 0; // Inicializa o índice para o primeiro fornecedor
        exibirFornecedor(indexAtual);
    }
}
    
    private void exibirFornecedor(int index) {
    if (index >= 0 && index < fornecedores.size()) {
        Fornecedor fornecedor = fornecedores.get(index);

        // Exibindo as informações nos campos
        txtId1.setText(String.valueOf(fornecedor.getId()));
        txtNome.setText(fornecedor.getNome());
        txtEndereco.setText(fornecedor.getEndereco());
        txtEmail.setText(fornecedor.getEmail());
        txtTelefone.setText(fornecedor.getTelefone());
        txtCnpj.setText(fornecedor.getCnpj());
        txtEndereco1.setText(fornecedor.getInscricaoEstadual());
        txtEmail1.setText(fornecedor.getNomeFantasia());
        txtTelefone1.setText(fornecedor.getCategoria());
        cbUf.setSelectedItem(fornecedor.getUf()); // Supondo que cbUf contém o objeto Uf
    }
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
        cbUf = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

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

        cbUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUfActionPerformed(evt);
            }
        });

        jLabel5.setText("Uf:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTelefone1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                        .addComponent(cbUf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRetroceder)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnAvancar2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtId1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnGravar1)
                        .addGap(42, 42, 42)
                        .addComponent(btnExcluir1)
                        .addGap(60, 60, 60)
                        .addComponent(btnFechar1)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar1)
                    .addComponent(btnExcluir1)
                    .addComponent(btnFechar1))
                .addGap(23, 23, 23))
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
            Uf ufSelecionado = (Uf) cbUf.getSelectedItem();
            // Cria o objeto Fornecedor com os dados dos campos
            Fornecedor fornecedor = new Fornecedor(
                    txtCnpj.getText(), // cnpj
                    txtEndereco1.getText(), // inscrição estadual
                    txtEmail1.getText(), // nome fantasia
                    txtNome.getText(), // nome
                    txtEmail.getText(), // email
                    txtEndereco.getText(), // endereço
                    txtTelefone.getText(), // telefone
                    txtTelefone1.getText(), // categoria
                    ufSelecionado, // objeto Uf dummy (substitua por dados reais)
                    id // id
            );

            // Instancia o repositório e realiza a operação de inserção ou atualização
            FornecedorRepository repo = new FornecedorRepository();
            boolean sucesso;
            if (id == 0) {
                // Se ID for 0, é um novo cadastro
                sucesso = repo.inserir(janelaPrincipal.conexaoMySQL.connection, fornecedor);
            } else {
                // Caso contrário, atualiza o registro existente
                sucesso = repo.atualizar(janelaPrincipal.conexaoMySQL.connection, fornecedor);
            }

            // Exibe mensagem de sucesso e limpa os campos se a operação for bem-sucedida
            if (sucesso) {
                JOptionPane.showMessageDialog(
                        this,
                        "Cadastro realizado com sucesso!",
                        "Cadastro de Fornecedor",
                        JOptionPane.INFORMATION_MESSAGE
                );
                limparCampos();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Erro ao gravar os dados: " + ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_btnGravar1ActionPerformed

    private void btnAvancar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvancar2ActionPerformed
        if (indexAtual < fornecedores.size() - 1) {
        indexAtual++;
        exibirFornecedor(indexAtual);
    } else {
        JOptionPane.showMessageDialog(this, "Você já está no último fornecedor.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_btnAvancar2ActionPerformed

    private void btnRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrocederActionPerformed
        if (indexAtual > 0) {
        indexAtual--;
        exibirFornecedor(indexAtual);
    } else {
        JOptionPane.showMessageDialog(this, "Você já está no primeiro fornecedor.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }

    }//GEN-LAST:event_btnRetrocederActionPerformed

    private void cbUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUfActionPerformed

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
    private javax.swing.JComboBox<Uf> cbUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
