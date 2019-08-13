/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Recemnascido;
/**
 *
 * @author Administrador
 */
public class DaoRecemnascido {
     public static boolean inserir(Recemnascido objeto) {
        String sql = "INSERT INTO recemnascido (nomedamae, peso, numerodoquarto, sexo) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNomedamae());
            ps.setDouble(2, objeto.getPeso());
            ps.setInt(3, objeto.getNumerodoquarto());
            ps.setString(4, objeto.getSexo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
      public static void main(String[] args) {
        Recemnascido objeto = new Recemnascido();
        objeto.setNomedamae("Marta");
        objeto.setPeso(4.33);
        objeto.setNumerodoquarto(2);
        objeto.setSexo("M");
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
  public static boolean alterar(Recemnascido objeto) {
        String sql = "UPDATE recemnascido SET nomedamae = ?, peso = ?, numerodoquarto = ?, sexo = ? WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNomedamae()); 
            ps.setDouble(2, objeto.getPeso());
            ps.setInt(3, objeto.getNumerodoquarto());
            ps.setString(4, objeto.getSexo());
            ps.setInt(5, objeto.getCodigo());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    public static boolean excluir(Recemnascido objeto) {
        String sql = "DELETE FROM recemnascido WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
