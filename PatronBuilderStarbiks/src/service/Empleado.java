/*
 * Clase Empleado
 * ----------------------
 * Actúa como el "Director" dentro del patrón Builder.
 * Es responsable de coordinar los pasos necesarios para preparar una bebida,
 * utilizando un objeto BebidaBuilder concreto (ChocoTinBuilder, BananiniBuilder, FrezzberryBuilder).
 */
package service;

import model.Bebida;
import model.BebidaBuilder;

public class Empleado {

    // Referencia al builder que se usará para construir la bebida
    private BebidaBuilder builder;

    /**
     * Asigna el builder que se utilizará para construir la bebida.
     * Este builder puede ser ChocoTinBuilder, BananiniBuilder o FrezzberryBuilder.
     * @param builder Builder concreto seleccionado según la opción del cliente.
     */
    public void setBuilder(BebidaBuilder builder) { 
        this.builder = builder; 
    }

    /**
     * Devuelve la bebida ya construida por el builder.
     * @return Objeto Bebida completamente configurado.
     */
    public Bebida getBebida() { 
        return builder.getBebida(); 
    }

    /**
     * Orquesta el proceso de construcción de la bebida.
     * Llama a cada uno de los métodos definidos en la interfaz BebidaBuilder
     * para completar paso a paso la configuración del objeto Bebida.
     */
    public void prepararBebida() {
        // Asigna el nombre específico de la bebida (ej: "ChocoTin")
        builder.buildNombre();
        // Establece la base líquida (Agua o Leche)
        builder.buildBase();
        // Define el tipo de leche (para bebidas que la usan). 
        // Si la bebida no usa leche, el builder concreto puede ignorar este valor.
        builder.buildTipoLeche(null);
        // Asigna el sabor correspondiente (ej: Chocolate, Banano, Arándano)
        builder.buildSabor();
        // Indica si lleva helado o no
        builder.buildHelado();
    }
}
