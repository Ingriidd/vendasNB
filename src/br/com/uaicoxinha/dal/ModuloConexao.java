/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.uaicoxinha.dal;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Nicolas
 */
public class ModuloConexao {
    //método responsalvel por estabelecer a conexão com o banco
    
    public static Connection conector(){
        Connection conexao = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/uaicoxinha?user=root&password=mysql";
            conexao = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        }
        return conexao;
    }
}
