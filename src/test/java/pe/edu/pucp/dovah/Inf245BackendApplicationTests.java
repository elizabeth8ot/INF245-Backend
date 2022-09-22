/**
 * Nombre del archivo: Inf245BackendApplicationTests.java
 * Fecha de creacion: 19/09/2022
 * Autor: Carlos Toro
 * Descripcion: Clase que permitira ejecutar pruebas sobre el backend
 */

package pe.edu.pucp.dovah;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

/*
@SpringBootTest

class Inf245BackendApplicationTests {

    @Test
    void contextLoads() {
    }

}
*/
@SpringBootApplication
public class Inf245BackendApplicationTests {
    public static void main(String[] args){
        SpringApplication.run(Inf245BackendApplicationTests.class,args);
    }
}