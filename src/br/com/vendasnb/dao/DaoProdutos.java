/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.vendasnb.dao;

import br.com.vendasnb.conexoes.ConexaoMysql;
import br.com.vendasnb.model.ModelProdutos;

/**
 *
 * @author Nicolas
 */
public class DaoProdutos extends ConexaoMysql {

    /**
     * Cadastrar produto no banco
     *
     * @param pModelProdutos
     * @return int
     */
    public int salvarProdutosDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO produto("
                + "nome,"
                + "estoque,"
                + "valor,"
                + "valor_compra,"
                + "fornecedor_id"
                + ") VALUES ("
                + "'" + pModelProdutos.getNome() + "',"
                + "'" + pModelProdutos.getEstoque() + "',"
                + "'" + pModelProdutos.getValor() + "',"
                + "'" + pModelProdutos.getValorCompra() + "',"
                + "'" + pModelProdutos.getFornecedor() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * excluir produto do banco
     *
     * @param pIdProduto
     * @return boolean
     */
    public boolean excluirProdutoDAO(int pIdProduto) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM produto WHERE id= '" + pIdProduto + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
    
    /**
     * Alterar dados do produto
     * @param pModelProdutos
     * @return boolean
     */

    public boolean alteraProdutoDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE produto SET "
                + "nome = '" + pModelProdutos.getNome() + "',"
                + "estoque'" + pModelProdutos.getEstoque() + "',"
                + "valor'" + pModelProdutos.getValor() + "',"
                + "valor_compra'" + pModelProdutos.getValorCompra() + "',"
                + "fornecedor_id'" + pModelProdutos.getFornecedor() + "'"
                + "WHERE id = '" + pModelProdutos.getIdProduto()+ "'"    
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
