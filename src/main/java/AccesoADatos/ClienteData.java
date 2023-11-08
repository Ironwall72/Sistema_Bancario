
package AccesoADatos;

import com.mycompany.sistema_bancario.Clases.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteData {
    
    private String SQL = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public ClienteData() {
    }

    public void agregarCliente(Cliente nuevo){
        
        SQL = "INSERT INTO `clientes`(`dni`, `nombre`, `apellido`, `direccion`,"
                + " `estado`)"
                + "VALUES ( ?, ?, ?, ?, ?, ?) ";
        try {
            ps = Conexion.getConexion().prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, nuevo.getDni());
            ps.setString(2, nuevo.getNombre());
            ps.setString(3, nuevo.getApellido());
            ps.setString(4, nuevo.getDireccion());
            ps.setBoolean(5, nuevo.isEstado());
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();

            if (rs.next()) {
                nuevo.setId(rs.getInt(1)); //para tomar el id, si este es autoincremental

                JOptionPane.showMessageDialog(null, "persona creada con exito");
            } else {
                JOptionPane.showMessageDialog(null, "Error en agregar persona ");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion con la base de datos." + ex);
            System.out.println(ex);
        } finally {
            try {
                Conexion.getConexion().close();
            } catch (SQLException ex) {
                Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
