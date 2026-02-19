public class Principal {

    public static void main(String[] args) {
        //Mandar a llamar una función
        System.out.println(IMC(80,1.6));

        //Para llamar a un metodo primero hay que instanciar a la clase donde se creo el metodo
        Principal p= new Principal();
        p.Saludar();

        double resultado=sumar(3,5,6,7);
        System.out.println(resultado);

        //Instancia a Persona
        Persona persona = new Persona("Evangelina", 50);
        System.out.println(persona.getNombre());
        persona.setNombre("Angela");
        System.out.println(persona.getNombre());


    }

    //Crear función que calcule el indice de la masa corporal
    static double IMC(double peso,double estatura){
        return peso/Math.pow(estatura,2);
    }
    //Crear un metodo de Saludar
    public void Saludar(){
        System.out.println("Te saludo desde el metodo Saludar");
    }

    //crear una función que tenga muchos parametros para sumar
    static double sumar(double... numeros){
        double suma=0;
        for(double num:numeros){
            suma+=num;
        }
        return suma;
    }
}
