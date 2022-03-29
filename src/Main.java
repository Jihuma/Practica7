public class Main {
    public static void main(String[] args) {
        Bird[] Pajaros = new Bird[3];

        System.out.println("----------- Angry Birds -----------");

        Pajaros[0] = new Bird("Red", "Rojo", 1);
        Pajaros[1] = new Bird("Blue", "Azul", 1);
        Pajaros[2] = new Bird("Chuck", "Amarillo", 1);

        Red.ataque(Pajaros[0].nombre, Pajaros[0].color, Pajaros[0].tamaño);
        Blue.ataque(Pajaros[1].nombre, Pajaros[1].color, Pajaros[1].tamaño);
        Chuck.ataque(Pajaros[2].nombre, Pajaros[2].color, Pajaros[2].tamaño);
    }
}
