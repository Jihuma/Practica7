public class Bird {
    //Atributos
    public String nombre;
    public String color;
    public int tamaño;
    //Constructorres
    public Bird() {
        this.nombre = "";
        this.color = "";
        this.tamaño = 0;
    }

    public Bird(String nombre, String color, int tamaño) {
        this.nombre = nombre;
        this.color = color;
        this.tamaño = tamaño;
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

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
}

class Red extends Bird {
    static void ataque(String nombre, String color, int tamaño) {
        System.out.println("El pájaro Red atacó.");
    }

}

class Blue extends Bird {
    int dividirse;

    public Blue() {
        this.dividirse = 3;
    }
    
    static void ataque(String nombre, String color, int tamaño) {
        System.out.println("El pájaro Blue atacó y se dividió en 3.");
    }
}

class Chuck extends Bird {
    int velocidad;

    public Chuck() {
        this.velocidad = 3;
    }

    static void ataque(String nombre, String color, int tamaño) {
        System.out.println("El pájaro Chuck atacó y se hizo más veloz.");
    }
}
