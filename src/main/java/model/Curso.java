/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author anfeg
 */
public class Curso {

    private int id_curso;
    private String nombre_curso;

    public Curso() {
    }

    public Curso(int id_curso, String nombre_curso) {
        this.id_curso = id_curso;
        this.nombre_curso = nombre_curso;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

}
