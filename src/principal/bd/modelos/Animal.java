package principal.bd.modelos;

public class Animal {
    private int idAnimal;
    private String tipo;
    private String nombre;
    private String color;
    private int edad;
    private int numenfermedades;

    public Animal(int idAnimal, String tipo, String nombre, String color, int edad, int numenfermedades) {
        this.idAnimal = idAnimal;
        this.tipo = tipo;
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.numenfermedades = numenfermedades;
    }

    public Animal(int idAnimal, String tipo, String nombre, int edad, int numenfermedades) {
        this.idAnimal = idAnimal;
        this.tipo = tipo;
        this.nombre = nombre;
        this.edad = edad;
        this.numenfermedades = numenfermedades;
    }


    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumenfermedades() {
        return numenfermedades;
    }

    public void setNumenfermedades(int numenfermedades) {
        this.numenfermedades = numenfermedades;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "idAnimal=" + idAnimal +
                ", tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", edad=" + edad +
                ", numenfermedades=" + numenfermedades +
                '}';
    }
}
