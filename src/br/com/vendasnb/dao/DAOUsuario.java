package br.com.vendasnb.dao;

import br.com.vendasnb.model.ModelUsuario;
import br.com.vendasnb.conexoes.ConexaoMysql;
import java.util.ArrayList;
/**
*
* @author Nicolas bueno
*/
public class DAOUsuario extends ConexaoMysql {

    /**
    * grava Usuario
    * @param pModelUsuario
    * @return int
    */
    public int salvarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO usuario ("
                    + "id,"
                    + "nome,"
                    + "cpf,"
                    + "telefone,"
                    + "login,"
                    + "senha,"
                    + "cargo_id"
                + ") VALUES ("
                    + "'" + pModelUsuario.getIdUsuario() + "',"
                    + "'" + pModelUsuario.getNomeUsuario() + "',"
                    + "'" + pModelUsuario.getCpf() + "',"
                    + "'" + pModelUsuario.getTelefone() + "',"
                    + "'" + pModelUsuario.getLogin() + "',"
                    + "'" + pModelUsuario.getSenha() + "',"
                    + "'" + pModelUsuario.getCargoId() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Usuario
    * @param pIdUsuario
    * @return ModelUsuario
    */
    public ModelUsuario getUsuarioDAO(int pIdUsuario){
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "nome,"
                    + "cpf,"
                    + "telefone,"
                    + "login,"
                    + "senha,"
                    + "cargo_id"
                 + " FROM"
                     + " usuario"
                 + " WHERE"
                     + " id = '" + pIdUsuario + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNomeUsuario(this.getResultSet().getString(2));
                modelUsuario.setCpf(this.getResultSet().getString(3));
                modelUsuario.setTelefone(this.getResultSet().getString(4));
                modelUsuario.setLogin(this.getResultSet().getString(5));
                modelUsuario.setSenha(this.getResultSet().getString(6));
                modelUsuario.setCargoId(this.getResultSet().getInt(7));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUsuario;
    }

    /**
    * recupera uma lista de Usuario
        * @return ArrayList
    */
    public ArrayList<ModelUsuario> getListaUsuarioDAO(){
        ArrayList<ModelUsuario> listamodelUsuario = new ArrayList();
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "id,"
                    + "nome,"
                    + "cpf,"
                    + "telefone,"
                    + "login,"
                    + "senha,"
                    + "cargo_id"
                 + " FROM"
                     + " usuario"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario = new ModelUsuario();
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNomeUsuario(this.getResultSet().getString(2));
                modelUsuario.setCpf(this.getResultSet().getString(3));
                modelUsuario.setTelefone(this.getResultSet().getString(4));
                modelUsuario.setLogin(this.getResultSet().getString(5));
                modelUsuario.setSenha(this.getResultSet().getString(6));
                modelUsuario.setCargoId(this.getResultSet().getInt(7));
                listamodelUsuario.add(modelUsuario);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelUsuario;
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * @return boolean
    */
    public boolean atualizarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE usuario SET "
                    + "id = '" + pModelUsuario.getIdUsuario() + "',"
                    + "nome = '" + pModelUsuario.getNomeUsuario() + "',"
                    + "cpf = '" + pModelUsuario.getCpf() + "',"
                    + "telefone = '" + pModelUsuario.getTelefone() + "',"
                    + "login = '" + pModelUsuario.getLogin() + "',"
                    + "senha = '" + pModelUsuario.getSenha() + "',"
                    + "cargo_id = '" + pModelUsuario.getCargoId() + "'"
                + " WHERE "
                    + "id = '" + pModelUsuario.getIdUsuario() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui Usuario
    * @param pIdUsuario
    * @return boolean
    */
    public boolean excluirUsuarioDAO(int pIdUsuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM usuario "
                + " WHERE "
                    + "id= '" + pIdUsuario + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}