/*
 * Interfaz BebidaBuilder
 * ----------------------
 * Forma parte del patrón de diseño Builder.
 * Define los pasos necesarios para construir una bebida en la cafetería Starbiks.
 * Cada bebida concreta (como Bananini, ChocoTin o Frezzberry) implementará esta
 * interfaz para especificar cómo se construyen sus atributos paso a paso.
 */
package model;

public interface BebidaBuilder {

    /**
     * Establece el nombre de la bebida.
     * Ejemplo: "Bananini", "ChocoTin".
     */
    void buildNombre();

    /**
     * Define la base líquida de la bebida.
     * Puede ser "Leche" o "Agua", según el tipo de bebida.
     */
    void buildBase();

    /**
     * Asigna el tipo de leche para bebidas que usan leche como base.
     * Para bebidas con agua, este método podría ignorarse o no usarse.
     * @param tipoLeche Tipo de leche elegido (Entera, Deslactosada, Almendras).
     */
    void buildTipoLeche(String tipoLeche);

    /**
     * Define el sabor principal de la bebida.
     * Ejemplo: Chocolate, Banano, Arándano, etc.
     */
    void buildSabor();

    /**
     * Indica si la bebida debe incluir helado.
     * true = incluye helado, false = no incluye.
     */
    void buildHelado();

    /**
     * Devuelve el objeto Bebida completamente construido.
     * @return Bebida lista para ser mostrada o servida.
     */
    Bebida getBebida();
}
