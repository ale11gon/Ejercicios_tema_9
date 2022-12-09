public class Main
{
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.edad = 30;
        cliente.nombre = "Alfonso";
        cliente.telefono = 123456;
        cliente.credito = 90000;
        
        System.out.println(cliente.nombre + " tiene "+ cliente.edad + " anos , su telefono es: "+ cliente.telefono + " y su credito es: "+ cliente.credito);
        
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 45;
        trabajador.nombre = "Maria";
        trabajador.telefono = 654321;
        trabajador.salario = 3500;
        
        System.out.println(trabajador.nombre + " tiene "+ trabajador.edad + " anos , su telefono es: "+ trabajador.telefono + " y su salario es: "+ trabajador.salario);
    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
} 