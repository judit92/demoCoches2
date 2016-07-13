package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CocheService
{
@Autowired
    private CocheRepository cocheRepository;

@Autowired
    private PersonaRepository personaRepository;
@Transactional

    public void testCoches()
    {



        Coche coche = new Coche();
        coche.setAño(2015);
        coche.setMarca ("Abarth");
        coche.setModelo("124 spider");
        coche.setPrecio(40000);
        coche.setMatricula("4586B");


        Persona persona = new Persona();
        persona.setNombre("Pedro");
        persona.setApellido("Merino");
        persona.setEdad(23);
        personaRepository.save(persona);

        coche.setPropietario(persona);
        cocheRepository.save(coche);

        System.out.println("_______________________________________________________________________________________________________________________________________");

        Coche coche2 = new Coche();
        coche2.setAño(2010);
        coche2.setMarca ("Alfa Romeo");
        coche2.setModelo("Giulieta");
        coche2.setPrecio(21000);
        coche2.setMatricula("7896L");

        Persona ivan = personaRepository.findOne(1L);
        coche2.setPropietario(ivan);
        cocheRepository.save(coche2);

        System.out.println("_______________________________________________________________________________________________________________________________________");

        Coche coche3 = new Coche();
        coche3.setAño(2012);
        coche3.setMarca ("Aston Martin");
        coche3.setModelo("V8 Vantage");
        coche3.setPrecio(132000);
        coche3.setMatricula("2356K");

        Persona ivan1 = personaRepository.findOne(1L);
        coche3.setPropietario(ivan);
        cocheRepository.save(coche3);

        System.out.println("_______________________________________________________________________________________________________________________________________");

        Coche coche4 = new Coche();
        coche4.setAño(2016);
        coche4.setMarca ("Bugati");
        coche4.setModelo("Chiron");
        coche4.setPrecio(2900000);
        coche4.setMatricula("5631M");

        Persona dimple = personaRepository.findOne(2L);
        coche4.setPropietario(dimple);
        cocheRepository.save(coche4);

        System.out.println("_______________________________________________________________________________________________________________________________________");

        Coche coche5 = new Coche();
        coche5.setAño(2012);
        coche5.setMarca ("Ferrari");
        coche5.setModelo("F12 Berlinetta");
        coche5.setPrecio(311000);
        coche5.setMatricula("4200K");

        Persona dimple2 = personaRepository.findOne(2L);
        coche5.setPropietario(dimple);
        cocheRepository.save(coche5);

        System.out.println("_______________________________________________________________________________________________________________________________________");

        Coche coche6 = new Coche();
        coche6.setAño(2008);
        coche6.setMarca ("Ferrari");
        coche6.setModelo("California T");
        coche6.setPrecio(214000);
        coche6.setMatricula("5697T");

        Persona noelia = personaRepository.findOne(3L);
        coche6.setPropietario(noelia);
        cocheRepository.save(coche6);

        System.out.println("_______________________________________________________________________________________________________________________________________");

        Coche coche7 = new Coche();
        coche7.setAño(2012);
        coche7.setMarca ("Ferrari");
        coche7.setModelo("FF");
        coche7.setPrecio(630000);
        coche7.setMatricula("4789N");

        Persona dimple3 = personaRepository.findOne(2L);
        coche7.setPropietario(dimple);
        cocheRepository.save(coche7);

        System.out.println("_______________________________________________________________________________________________________________________________________");


        System.out.println(cocheRepository.findOne(2L));

        System.out.println("_______________________________________________________________________________________________________________________________________");

        System.out.println(cocheRepository.findByMarca("Abarth"));

        System.out.println("_______________________________________________________________________________________________________________________________________");

        System.out.println("Mostrar todos los coches cuyo año de fabricación sea >= a 2005: ");
        System.out.println(cocheRepository.findByAñoGreaterThanEqual(2005));

        System.out.println("_______________________________________________________________________________________________________________________________________");

        System.out.println("Mostrar todos los coches cuyo año de fabricación sea <= a 2016: ");
        System.out.println(cocheRepository.findByAñoLessThanEqual(2016));

        System.out.println("_______________________________________________________________________________________________________________________________________");

        System.out.println("Mostrar todos los coches cuyo año de fabricación se encuentre entre 2010 y 2016: ");
        System.out.println(cocheRepository.findByAñoBetween(2010, 2016));

        System.out.println("_______________________________________________________________________________________________________________________________________");

        System.out.println("Mostrar todos los coches cuyo precio sea >= a 35000: ");
        System.out.println(cocheRepository.findByPrecioGreaterThanEqual(35000));

        System.out.println("_______________________________________________________________________________________________________________________________________");

        System.out.println("Mostrar todos los coches cuyo precio sea <= a 130000");
        System.out.println(cocheRepository.findByPrecioLessThanEqual(130000));

        System.out.println("_______________________________________________________________________________________________________________________________________");

        System.out.println("Mostrar todos los coches cuyo precio se encuentre entre 50000 y 150000");
        System.out.println(cocheRepository.findByPrecioBetween(50000, 150000));

        System.out.println("_______________________________________________________________________________________________________________________________________");

        System.out.println("Mostrar la matricula del Aston Martin: ");
        System.out.println(cocheRepository.findByMatricula("2356K"));

        System.out.println("_______________________________________________________________________________________________________________________________________");

        System.out.println("Mostrar todos los coches Bugati: ");
        System.out.println(cocheRepository.findByMarca("Bugati"));

        System.out.println("_______________________________________________________________________________________________________________________________________");

        System.out.println("Mostrar todos los coches Alfa Romeo Guilieta");
        System.out.println(cocheRepository.findByMarcaAndModelo("Alfa Romeo", "Guilieta"));

        System.out.println("_______________________________________________________________________________________________________________________________________");

        System.out.println("Mostrar todos los Abarth con un precio inferior a 50000");
        System.out.println(cocheRepository.findByMarcaAndPrecioLessThanEqual("Abarth", 50000));

        System.out.println("_______________________________________________________________________________________________________________________________________");

        System.out.println("La media del precio de los coches Ferrari es: ");
        System.out.println(cocheRepository.obtenerMediaPorMarca("Ferrari"));

        System.out.println("_______________________________________________________________________________________________________________________________________");

        System.out.println("Mostrar todos los coches de Dimple: ");
        System.out.println(cocheRepository.obtenerCoches(dimple));

        System.out.println("_______________________________________________________________________________________________________________________________________");

        System.out.println("Mostrar todos los coches de Dimple que tengan un precio => 55000: ");
        System.out.println(cocheRepository.obtenerCochesConPrecioMayor(dimple, 55000));


        System.out.println("_______________________________________________________________________________________________________________________________________");

        System.out.println("Mostrar todos los coches de Dimple cuyo año de fabricación se encuentre entre el 2010 y 2016: ");
        System.out.println(cocheRepository.obtenerCochesEntreAños(dimple, 2010, 2016));



        System.out.println("_______________________________________________________________________________________________________________________________________");

        System.out.println("Mostrar todos los coches de las personas que tengan más de 24 años: ");
        System.out.println(cocheRepository.obtenerCochesPersonasMayoresEdad(24));


        System.out.println("_______________________________________________________________________________________________________________________________________");

        System.out.println("Mostrar todos los coches de las personas que tengan entre 23 y 26 años: ");
        System.out.println(cocheRepository.obtenerCochesRangoEdad(23, 26));


        System.out.println("_______________________________________________________________________________________________________________________________________");


        System.out.println("Mostrar todos los coches cuya matrícula contenga K: ");
        System.out.println(cocheRepository.obtenerDatosMatricula("K"));


        System.out.println("_______________________________________________________________________________________________________________________________________");

        System.out.println("Mostrar el precio mínimo, máximo medio de cada marca: ");

        List<Object[]> estadisticaMarcaList = cocheRepository.obtenerEstadisticasPorMarca();

        for (Object[] estadisticaMarca : estadisticaMarcaList){

            System.out.println("marca: " + estadisticaMarca[0]);
            System.out.println("media: " + estadisticaMarca[1]);
            System.out.println("max: " + estadisticaMarca[2]);
            System.out.println("min: " + estadisticaMarca[3]);
        }







    }



}