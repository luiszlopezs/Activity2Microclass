/*
 * Clase Bebida
 * ----------------------
 * Representa el producto final que se construirá utilizando el patrón Builder.
 * Contiene todos los atributos que describen una bebida en la cafetería Starbiks.
 * Además, incluye métodos para configurar (setters) y mostrar la información de la bebida.
 */
package model;

public class Bebida {

    // Nombre de la bebida (por ejemplo, "Bananini" o "ChocoTin")
    private String nombre;

    // Base de la bebida: puede ser "Leche" o "Agua"
    private String base;

    // Tipo de leche elegido si la base es leche (Entera, Deslactosada, Almendras)
    private String tipoLeche;

    // Sabor de la bebida (Chocolate, Banano, Arándano, etc.)
    private String sabor;

    // Indica si la bebida lleva helado (true = Sí, false = No)
    private boolean helado;

    // ---------- MÉTODOS SETTERS PARA CONFIGURAR LA BEBIDA ----------

    /**
     * Asigna el nombre de la bebida.
     * @param nombre Nombre de la bebida.
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Define la base de la bebida (Leche o Agua).
     * @param base Tipo de base.
     */
    public void setBase(String base) { this.base = base; }

    /**
     * Define el tipo de leche para la bebida, 
     * solo se usa si la base es leche.
     * @param tipoLeche Tipo de leche elegido.
     */
    public void setTipoLeche(String tipoLeche) { this.tipoLeche = tipoLeche; }

    /**
     * Establece el sabor principal de la bebida.
     * @param sabor Sabor elegido.
     */
    public void setSabor(String sabor) { this.sabor = sabor; }

    /**
     * Indica si la bebida incluirá helado.
     * @param helado true para incluir helado, false para no incluirlo.
     */
    public void setHelado(boolean helado) { this.helado = helado; }

    // ---------- MÉTODO PARA MOSTRAR LOS DETALLES DE LA BEBIDA ----------

    /**
     * Muestra en consola un resumen completo de la bebida construida,
     * incluyendo base, tipo de leche (si aplica), sabor y si tiene helado.
     */
    public void mostrarBebida() {
        System.out.println(nombre);
        System.out.println("- Base: " + base);

        // Si la base es leche, también se muestra el tipo de leche seleccionado
        if (base.equalsIgnoreCase("Leche")) {
            System.out.println("- Tipo de leche: " + tipoLeche);
        }

        System.out.println("- Sabor: " + sabor);
        System.out.println("- Helado: " + (helado ? "Sí" : "No"));
        System.out.println("----------------------------");
    }
}
