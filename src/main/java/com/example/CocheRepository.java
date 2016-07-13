package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CocheRepository extends JpaRepository<Coche, Long>
{
    List<Coche> findByMarca (String marca);

    List<Coche> findByModelo (String modelo);

    List<Coche> findByAñoGreaterThanEqual (Integer año);

    List<Coche> findByAñoLessThanEqual (Integer año);

    List<Coche> findByAñoBetween (Integer añoMin, Integer añoMax);

    List<Coche> findByPrecio (Integer precio);

    List<Coche> findByPrecioGreaterThanEqual (Integer precio);

    List<Coche> findByPrecioLessThanEqual (Integer precio);

    List<Coche> findByPrecioBetween (Integer precioMin, Integer precioMax);

    Coche findByMatricula (String matricula);

    List<Coche> findByMarcaAndModelo (String marca, String modelo);

    List<Coche> findByMarcaAndPrecioLessThanEqual (String marca, Integer precio);


    @Query ("SELECT AVG (c. precio) from Coche c where c.marca = :marca")
    Double obtenerMediaPorMarca (@Param("marca") String marca);

    @Query ("SELECT (coche) from Coche coche where coche. propietario = :propietario")
    List<Coche> obtenerCoches (@Param("propietario") Persona propietario);

    @Query ("SELECT (coche) from Coche coche where coche.propietario = :propietario and coche.precio >= :precio")
    List<Coche> obtenerCochesConPrecioMayor (
            @Param("propietario") Persona propietario,
            @Param("precio") Integer precio);

    @Query ("SELECT (coche) FROM Coche coche WHERE coche.propietario = :propietario AND coche.año >= :añoMin AND coche.año <= :añoMax ")
    List<Coche> obtenerCochesEntreAños (
            @Param("propietario") Persona propietario,
            @Param ("añoMin") Integer añoMin,
            @Param ("añoMax") Integer añoMax);

    @Query ("SELECT (coche) FROM Coche coche WHERE coche.propietario.edad >= :edad")
    List<Coche> obtenerCochesPersonasMayoresEdad (@Param ("edad")Integer edad);

    @Query ("SELECT (coche) FROM Coche coche WHERE coche.propietario.edad >= :edadMax AND coche.propietario.edad <= :edadMin")
    List<Coche> obtenerCochesRangoEdad (
            @Param("edadMax") Integer edadMax,
            @Param ("edadMin")Integer edadMin);

    @Query("SELECT (coche) FROM Coche coche WHERE coche.matricula LIKE(CONCAT ('%', :fragmentoMatricula, '%'))")
    List<Coche> obtenerDatosMatricula (@Param("fragmentoMatricula") String fragmentoMatricula);

    @Query ("SELECT (coche.marca), MIN (coche.precio), MAX (coche.precio), AVG (coche.precio) FROM Coche coche GROUP BY coche.marca")
    List<Object[]> obtenerEstadisticasPorMarca ();

}