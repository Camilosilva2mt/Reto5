/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3Grupo.Reto3;
//Clase Respositorio Cliente donde se implmenta lo concreot de la persistencia con el framework
//Librerias necesarias para la relaciones, persistencias, inserciones, etc.

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Camilo Andres Silva A.
 */
@Repository
//Anotación que identifica la clase como un repositorio
//Clase repositorio reservaciones
public class RepositorioReservaciones {

    @Autowired//Anotación para la inyección de dependencias
    private InterfaceReservaciones crud4;//Declaración de la variable proveniente de la interface para su uso

    //Metodo get para la obtención de la lista de reservaciones con la ayuda de la interface
    public List<Reservaciones> getAll() {
        return (List<Reservaciones>) crud4.findAll();
    }

    //Metodo get para la obtención de las reservaciones por medio del id con la ayuda de la interface
    public Optional<Reservaciones> getReservation(int id) {
        return crud4.findById(id);
    }

    //Metodo grabar reservaciones con la ayuda de la interface
    public Reservaciones save(Reservaciones reservation) {
        return crud4.save(reservation);
    }

    //Metodo eliminar reservaciones con la ayuda de la interface
    public void delete(Reservaciones reservation) {
        crud4.delete(reservation);
    }
}
