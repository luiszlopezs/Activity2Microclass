/*
 * Clase FrezzberryBuilder
 * -----------------------
 * Builder concreto para la bebida "Frezzberry" dentro del patrón Builder.
 * Define los pasos específicos para construir una bebida de tipo Frezzberry,
 * que tiene agua como base, sabor arándano y no lleva helado.
 */
package model;

public class FrezzberryBuilder implements BebidaBuilder {

    // Instancia de Bebida que se construirá paso a paso
    private Bebida bebida = new Bebida();

    /**
     * Asigna el nombre de la bebida como "Frezzberry".
     */
    public void buildNombre() { 
        bebida.setNombre("Frezzberry"); 
    }

    /**
     * Define la base de la bebida como "Agua".
     * Frezzberry no utiliza leche.
     */
    public void buildBase() { 
        bebida.setBase("Agua"); 
    }

    /**
     * Como Frezzberry no usa leche, se asigna "N/A" 
     * para indicar que este atributo no aplica.
     * @param tipoLeche Parámetro requerido por la interfaz pero no utilizado.
     */
    public void buildTipoLeche(String tipoLeche) { 
        bebida.setTipoLeche("N/A"); 
    }

    /**
     * Establece el sabor de la bebida como "Arándano".
     */
    public void buildSabor() { 
        bebida.setSabor("Arandano"); 
    }

    /**
     * Indica que esta bebida NO lleva helado.
     */
    public void buildHelado() { 
        bebida.setHelado(false); 
    }

    /**
     * Devuelve la bebida completamente construida.
     * @return Objeto Bebida configurado como Frezzberry.
     */
    public Bebida getBebida() { 
        return bebida; 
    }
}
