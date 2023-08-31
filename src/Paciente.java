
import java.io.Serializable;
import java.sql.PreparedStatement;


public class Paciente implements Serializable{
    
    String id, paciente,contacto,edad,servicio,cita,anotacion;

    public Paciente(String id, String paciente, String contacto, String edad, String servicio, String cita, String anotacion) {
        this.id = id;
        this.paciente = paciente;
        this.contacto = contacto;
        this.edad = edad;
        this.servicio = servicio;
        this.cita = cita;
        this.anotacion = anotacion;
    }
    public int insertar(Conexion cnt) {
        try {
            String sql = "INSERT INTO cita VALUES(?,?,?,?,?,?,?)";
            PreparedStatement ps = cnt.con.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, paciente);
            ps.setString(3, contacto);
            ps.setString(4, edad);
            ps.setString(5, servicio);
            ps.setString(6,cita);
            ps.setString(7, anotacion);
            int resp = ps.executeUpdate();
            return resp;
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        }
}
}
