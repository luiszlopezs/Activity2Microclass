/*
 * Clase BananiniBuilder
 * ----------------------
 * Implementa la interfaz BebidaBuilder para construir la bebida específica "Bananini".
 * Aplica el patrón Builder, separando la construcción de la representación del objeto final.
 */
package model;

public class BananiniBuilder implements BebidaBuilder {

    // Instancia de Bebida que se va a construir
    private Bebida bebida = new Bebida();
    // Almacena el tipo de leche elegido por el cliente
    private String tipoLeche;

    /**
     * Constructor de la clase.
     * @param tipoLeche Tipo de leche seleccionado por el cliente (Entera, Deslactosada o Almendras).
     */
    public BananiniBuilder(String tipoLeche) {
        this.tipoLeche = tipoLeche;
    }

    /**
     * Asigna el nombre de la bebida.
     * Parte del paso a paso de la construcción.
     */
    public void buildNombre() {
        bebida.setNombre("Bananini");
    }

    /**
     * Define la base de la bebida como "Leche".
     * Esta bebida siempre usa leche.
     */
    public void buildBase() {
        bebida.setBase("Leche");
    }

    /**
     * Asigna el tipo de leche a la bebida.
     * @param tipoLeche Este parámetro no se usa directamente, 
     *                  se emplea el atributo interno para garantizar consistencia.
     */
    public void buildTipoLeche(String tipoLeche) {
        bebida.setTipoLeche(this.tipoLeche);
    }

    /**
     * Define el sabor de la bebida como "Banano".
     */
    public void buildSabor() {
        bebida.setSabor("Banano");
    }

    /**
     * Indica que esta bebida lleva helado.
     */
    public void buildHelado() {
        bebida.setHelado(true);
    }

    /**
     * Devuelve la bebida completamente construida.
     * @return Objeto Bebida con todos sus atributos configurados.
     */
    public Bebida getBebida() {
        return bebida;
    }
}
