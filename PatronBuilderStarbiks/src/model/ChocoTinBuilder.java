/*
 * Clase ChocoTinBuilder
 * ----------------------
 * Builder concreto para la bebida "ChocoTin" dentro del patrón Builder.
 * Encapsula la lógica necesaria para construir paso a paso un objeto Bebida
 * configurado con las características específicas del ChocoTin.
 */
package model;

public class ChocoTinBuilder implements BebidaBuilder {

    // Instancia de Bebida que se irá configurando paso a paso
    private Bebida bebida = new Bebida();

    // Tipo de leche seleccionado por el cliente (Entera, Deslactosada o Almendras)
    private String tipoLeche;

    /**
     * Constructor de ChocoTinBuilder.
     * @param tipoLeche Tipo de leche elegido por el cliente.
     */
    public ChocoTinBuilder(String tipoLeche) { 
        this.tipoLeche = tipoLeche; 
    }

    /**
     * Asigna el nombre de la bebida como "ChocoTin".
     */
    public void buildNombre() { 
        bebida.setNombre("ChocoTin"); 
    }

    /**
     * Define la base de la bebida como "Leche".
     * Todas las ChocoTin utilizan leche como base.
     */
    public void buildBase() { 
        bebida.setBase("Leche"); 
    }

    /**
     * Establece el tipo de leche para la bebida,
     * usando el valor proporcionado en el constructor.
     * @param tipoLeche Parámetro requerido por la interfaz, 
     *                  pero internamente se usa this.tipoLeche.
     */
    public void buildTipoLeche(String tipoLeche) { 
        bebida.setTipoLeche(this.tipoLeche); 
    }

    /**
     * Asigna el sabor de la bebida como "Chocolate".
     */
    public void buildSabor() { 
        bebida.setSabor("Chocolate"); 
    }

    /**
     * Indica que esta bebida incluye helado (valor fijo en true).
     */
    public void buildHelado() { 
        bebida.setHelado(true); 
    }

    /**
     * Devuelve la bebida completamente construida y lista para usarse.
     * @return Objeto Bebida configurado como un ChocoTin.
     */
    public Bebida getBebida() { 
        return bebida; 
    }
}
