/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Asistencia;
import util.DbUtil;

/**
 *
 * @author anfeg
 */
public class AsistenciaDAO {
    
       private Connection connection;

    public AsistenciaDAO() throws SQLException, URISyntaxException {
        connection = DbUtil.getConnection();
    }
    
    public ArrayList<Asistencia> getAsistenciaID(int a) throws SQLException, URISyntaxException {
        ArrayList<Asistencia> asistencia = null;
        boolean result = false;
        String query = "SELECT * FROM asistencia where id_asistencia= " + a;
        Connection connection = DbUtil.getConnection();
        try {

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            int id_asistencia = 0;
            int id_curso = 0;
            int id_estudiante = 0;
            String fecha = null;
            boolean vino = false; 
        
           
            while (rs.next()) {
                if (asistencia == null) {
                    asistencia = new ArrayList<Asistencia>();
                }
                Asistencia registro = new  Asistencia(id_asistencia, fecha, vino, id_curso, id_estudiante);
                
                id_asistencia = rs.getInt("id_asistencia");
                registro.setId_asistencia(id_asistencia);
                
                id_curso = rs.getInt("id_curso");
                registro.setId_curso(id_curso);

                id_estudiante = rs.getInt("id_estudiante");
                registro.setId_estudiante(id_estudiante);

                fecha = rs.getString("fecha");
                registro.setFecha(fecha);

                vino = rs.getBoolean("vino");
                registro.setVino(vino);

                asistencia.add(registro);

            }
            if (asistencia != null) {
                for (int i = 0; i < asistencia.size(); i++) {
                    System.out.println(asistencia.get(i).getId_asistencia()+ " " + asistencia.get(i).getId_curso()+ " " + asistencia.get(i).getId_estudiante()+ " " + asistencia.get(i).getFecha() + " " + asistencia.get(i).getVino());
                }
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Profesores");
            e.printStackTrace();
        }

        return asistencia;

    }
    
}
