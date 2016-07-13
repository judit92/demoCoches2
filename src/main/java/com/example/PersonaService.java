package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by professor on 20/06/2016.
 */
@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public void testPersonas(){
        Persona persona = new Persona(); // crear objeto
        persona.setNombre("Ivan"); // nombre objeto
        persona.setApellido("Merino");
        persona.setEdad(23);
        personaRepository.save(persona); // grabar en base datos

        Persona persona2 = new Persona();
        persona2.setNombre("Dimple");
        persona2.setApellido("Rodriguez");
        persona2.setEdad(26);
        personaRepository.save(persona2);

        Persona persona3 = new Persona();
        persona3.setNombre("Noelia");
        persona3.setApellido("Villa");
        persona3.setEdad(25);
        personaRepository.save(persona3);

        Persona persona4 = new Persona();
        persona4.setNombre("Jordi");
        persona4.setApellido("Garcia");
        persona4.setEdad(25);
        personaRepository.save(persona4);

        Persona persona5 = new Persona();
        persona5.setNombre("Ricard");
        persona5.setApellido("Hernandez");
        persona5.setEdad(25);
        personaRepository.save(persona5);

        Persona persona6 = new Persona();
        persona6.setNombre("Noelia");
        persona6.setApellido("Garcia");
        persona6.setEdad(24);
        personaRepository.save(persona6);

        System.out.println(personaRepository.findOne(2L)); // buscar persona en base datos
        System.out.println(personaRepository.findByNombre("Noelia"));

        System.out.println("Mostramos todas las personas cuya edad es igual o superior a 25 (>=25): ");
        System.out.println(personaRepository.findByEdadGreaterThanEqual(23));

        System.out.println("Mostramos todas las personas que se llamen Noelia Villa");
        System.out.println(personaRepository.findByNombreAndApellido("Noelia", "Villa"));

        System.out.println("Mostramos todas las personas cuyo nombre sea Noelia o su apellido sea Villa");
        System.out.println(personaRepository.findByNombreOrApellido("Noelia", "Villa"));





    }
}
