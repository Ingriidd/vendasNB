/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.vendasnb.view;

import br.com.vendasnb.controller.ControllerProdutos;
import br.com.vendasnb.controller.ControllerUsuario;
import br.com.vendasnb.controller.ControllerVenda;
import br.com.vendasnb.controller.ControllerVendasUsuario;
import br.com.vendasnb.model.ModelProdutos;
import br.com.vendasnb.model.ModelUsuario;
import br.com.vendasnb.model.ModelVendasUsuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nicolas
 */
public class ViewVendas extends javax.swing.JFrame {

    ControllerUsuario controllerUsuario = new ControllerUsuario();
    ModelUsuario modelUsuario = new ModelUsuario();
    ArrayList<ModelUsuario> listaModelUsuario = new ArrayList<>();
    
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();    
    
    ArrayList<ModelVendasUsuario> listaModelVendasUsuario = new ArrayList<>();
    ControllerVendasUsuario controllerVendasUsuario = new ControllerVendasUsuario();
    
    ControllerVenda controllerVenda = new ControllerVenda();
    
    /**
     * Creates new form ViewVendas
     */
    public ViewVendas() {
        initComponents();
        this.listarUsuario();
        this.listarProdutos();
        this.carregarVendas();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtVenCodUsu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtVenCodVen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtVenNomeUsu = new componentes.UJComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtVenQtdPro = new javax.swing.JTextField();
        bntVendaAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVendasProdutos = new javax.swing.JTable();
        btnVenCancelar = new javax.swing.JButton();
        btnVenNovo = new javax.swing.JButton();
        btnVendaSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtVenNomePro = new componentes.UJComboBox();
        txtVenCodPro = new javax.swing.JTextField();
        txtVenDesconto = new javax.swing.JTextField();
        txtVenValorTotal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtVenPesquisar = new javax.swing.JTextField();
        btnVenPesquisar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableVendas = new javax.swing.JTable();
        btnVenExcluir = new javax.swing.JButton();
        btnVenEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Código Usu.");

        txtVenCodUsu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVenCodUsuFocusLost(evt);
            }
        });

        jLabel2.setText("Nome do Usuario:");

        txtVenCodVen.setBackground(new java.awt.Color(153, 255, 204));

        jLabel3.setText("Numero da Venda:");

        txtVenNomeUsu.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                txtVenNomeUsuPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel4.setText("Quantidade:");

        bntVendaAdd.setBackground(new java.awt.Color(153, 255, 204));
        bntVendaAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/adicionar.png"))); // NOI18N
        bntVendaAdd.setToolTipText("Adicionar");
        bntVendaAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntVendaAddActionPerformed(evt);
            }
        });

        tableVendasProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód. Prod.", "Nome Produto", "Quant.", "Valor Uni.", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableVendasProdutos);
        if (tableVendasProdutos.getColumnModel().getColumnCount() > 0) {
            tableVendasProdutos.getColumnModel().getColumn(0).setMinWidth(80);
            tableVendasProdutos.getColumnModel().getColumn(0).setPreferredWidth(80);
            tableVendasProdutos.getColumnModel().getColumn(0).setMaxWidth(80);
            tableVendasProdutos.getColumnModel().getColumn(2).setMinWidth(70);
            tableVendasProdutos.getColumnModel().getColumn(2).setPreferredWidth(70);
            tableVendasProdutos.getColumnModel().getColumn(2).setMaxWidth(70);
            tableVendasProdutos.getColumnModel().getColumn(3).setMinWidth(90);
            tableVendasProdutos.getColumnModel().getColumn(3).setPreferredWidth(90);
            tableVendasProdutos.getColumnModel().getColumn(3).setMaxWidth(90);
            tableVendasProdutos.getColumnModel().getColumn(4).setMinWidth(90);
            tableVendasProdutos.getColumnModel().getColumn(4).setPreferredWidth(90);
            tableVendasProdutos.getColumnModel().getColumn(4).setMaxWidth(90);
        }

        btnVenCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/cancelar.png"))); // NOI18N
        btnVenCancelar.setToolTipText("Cancelar");

        btnVenNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/novo.png"))); // NOI18N
        btnVenNovo.setToolTipText("Novo");

        btnVendaSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/salvar.png"))); // NOI18N
        btnVendaSave.setToolTipText("Salvar");

        jLabel5.setText("Desconto:");

        jLabel6.setText("Valor Total:");

        jLabel7.setText("Cod Pro.");

        jLabel8.setText("Nome do Produto:");

        txtVenNomePro.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                txtVenNomeProPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        txtVenCodPro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVenCodProFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVenCodUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(txtVenCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtVenNomePro, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVenNomeUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(txtVenCodVen, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(txtVenQtdPro, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(bntVendaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVenDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVenValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnVenCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnVenNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVendaSave)))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtVenCodUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtVenNomeUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtVenCodVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVenNomePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVenQtdPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVenCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bntVendaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVenDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVenValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVenNovo)
                    .addComponent(btnVenCancelar)
                    .addComponent(btnVendaSave))
                .addGap(9, 9, 9))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        jLabel9.setText("Pesquisa:");

        btnVenPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/pesquisar.png"))); // NOI18N
        btnVenPesquisar.setToolTipText("Pesquisar");

        tableVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome Usu.", "Data"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableVendas);

        btnVenExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/deletar.png"))); // NOI18N
        btnVenExcluir.setToolTipText("Excluir");
        btnVenExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenExcluirActionPerformed(evt);
            }
        });

        btnVenEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/vendasnb/imagens/editar.png"))); // NOI18N
        btnVenEditar.setToolTipText("Alterar");
        btnVenEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtVenPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnVenPesquisar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnVenEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnVenExcluir)))
                .addContainerGap(313, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVenPesquisar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVenPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVenEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVenExcluir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consultar/Excluir/Alterar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVenEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVenEditarActionPerformed

    private void txtVenCodUsuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVenCodUsuFocusLost
        // TODO add your handling code here:
        if(txtVenCodUsu.getText().equals("")){
           txtVenCodUsu.setText("1"); 
        }else{
         modelUsuario = controllerUsuario.getUsuarioController(Integer.parseInt(txtVenCodUsu.getText()));
         txtVenNomeUsu.setSelectedItem(modelUsuario.getNomeUsuario());
        }
    }//GEN-LAST:event_txtVenCodUsuFocusLost

    private void txtVenCodProFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVenCodProFocusLost
        // TODO add your handling code here:
        if (txtVenCodPro.getText().equals("")) {
            txtVenCodPro.setText("1");
        } else {
            modelProdutos = controllerProdutos.retornaProdutoController(Integer.parseInt(txtVenCodPro.getText()));
            txtVenNomePro.setSelectedItem(modelProdutos.getNome());
        }
    }//GEN-LAST:event_txtVenCodProFocusLost

    private void txtVenNomeUsuPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_txtVenNomeUsuPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        if (txtVenNomeUsu.isPopupVisible()) {
            modelUsuario = controllerUsuario.getUsuarioController(txtVenNomeUsu.getSelectedItem().toString());
            txtVenCodUsu.setText(String.valueOf(modelUsuario.getIdUsuario()));
        } else {
        }
    }//GEN-LAST:event_txtVenNomeUsuPopupMenuWillBecomeInvisible

    private void txtVenNomeProPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_txtVenNomeProPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        if(txtVenNomePro.isPopupVisible()){
            modelProdutos = controllerProdutos.retornaProdutoController(txtVenNomePro.getSelectedItem().toString());
            txtVenCodPro.setText(String.valueOf(modelProdutos.getIdProduto()));
        }else{
            
        }
    }//GEN-LAST:event_txtVenNomeProPopupMenuWillBecomeInvisible

    private void btnVenExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenExcluirActionPerformed
        // Excluir venda:
        int linha = tableVendas.getSelectedRow();
        int codigoVenda = (int)  tableVendas.getValueAt(linha, 0);
        
        if(this.controllerVenda.excluiiVendaController(codigoVenda)){
            JOptionPane.showMessageDialog(this, "Produto excluído com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            this.carregarVendas();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir a venda!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnVenExcluirActionPerformed

    private void bntVendaAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntVendaAddActionPerformed
        // Botao adicionar 
        if(txtVenQtdPro.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Você deve preencher todos os campos","Atenção", JOptionPane.WARNING_MESSAGE);
        }else{
           modelProdutos = controllerProdutos.retornaProdutoController(Integer.parseInt(txtVenCodPro.getText()));
           //adicionar linha na tabela
           DefaultTableModel modelo = (DefaultTableModel) tableVendasProdutos.getModel();
           int cont = 0;
           double quantidade = 0;
           quantidade = Double.parseDouble(txtVenQtdPro.getText());
           for(int i=0; i < cont; i++){
               modelo.setNumRows(0);
           }
           modelo.addRow(new Object[] {
               modelProdutos.getIdProduto(),
               modelProdutos.getNome(),
               txtVenQtdPro.getText(),
               modelProdutos.getValor(),
               quantidade * modelProdutos.getValor()
           });
        }
    }//GEN-LAST:event_bntVendaAddActionPerformed

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
            java.util.logging.Logger.getLogger(ViewVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVendas().setVisible(true);
            }
        });
    }
    
    /***
     * preenche o combobox com todos usuarios
     */
    
    private void listarUsuario(){
        listaModelUsuario = controllerUsuario.getListaUsuarioController();
        txtVenNomeUsu.removeAllItems();
        for(int i=0; i<listaModelUsuario.size(); i++){
            txtVenNomeUsu.addItem(listaModelUsuario.get(i).getNomeUsuario());
        }
    }
    
    /***
     * Preeche combobox com todos produtos
     */
    
    private void listarProdutos(){
        listaModelProdutos = controllerProdutos.retornaListaProdutoController();
        txtVenNomePro.removeAllItems();
        for(int i=0; i < listaModelProdutos.size(); i++) {
            txtVenNomePro.addItem(listaModelProdutos.get(i).getNome());
        }
    }
    
    private void carregarVendas(){
        DefaultTableModel modelo = (DefaultTableModel) tableVendas.getModel();
        listaModelVendasUsuario = controllerVendasUsuario.getListaVendasUsuarioController();
        for(int i=0; i < listaModelVendasUsuario.size(); i++){
            modelo.addRow(new Object[]{
                listaModelVendasUsuario.get(i).getModelVenda().getIdVenda(),
                listaModelVendasUsuario.get(i).getModelUsuario().getNomeUsuario(),
                listaModelVendasUsuario.get(i).getModelVenda().getDataVenda()       
            });
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntVendaAdd;
    private javax.swing.JButton btnVenCancelar;
    private javax.swing.JButton btnVenEditar;
    private javax.swing.JButton btnVenExcluir;
    private javax.swing.JButton btnVenNovo;
    private javax.swing.JButton btnVenPesquisar;
    private javax.swing.JButton btnVendaSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tableVendas;
    private javax.swing.JTable tableVendasProdutos;
    private javax.swing.JTextField txtVenCodPro;
    private javax.swing.JTextField txtVenCodUsu;
    private javax.swing.JTextField txtVenCodVen;
    private javax.swing.JTextField txtVenDesconto;
    private componentes.UJComboBox txtVenNomePro;
    private componentes.UJComboBox txtVenNomeUsu;
    private javax.swing.JTextField txtVenPesquisar;
    private javax.swing.JTextField txtVenQtdPro;
    private javax.swing.JTextField txtVenValorTotal;
    // End of variables declaration//GEN-END:variables
}
