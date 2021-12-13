/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author danie
 */
public class Grupo {
    String grupo;
    String Instructor;
    String gradoInstructor;
    String horario;
    String dias;
    int idAlumno;

    public Grupo() {
    }

    public Grupo(String grupo, String Instructor, String gradoInstructor, String horario, String dias, int idAlumno) {
        this.grupo = grupo;
        this.Instructor = Instructor;
        this.gradoInstructor = gradoInstructor;
        this.horario = horario;
        this.dias = dias;
        this.idAlumno = idAlumno;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getInstructor() {
        return Instructor;
    }

    public void setInstructor(String Instructor) {
        this.Instructor = Instructor;
    }

    public String getGradoInstructor() {
        return gradoInstructor;
    }

    public void setGradoInstructor(String gradoInstructor) {
        this.gradoInstructor = gradoInstructor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }
   

}
