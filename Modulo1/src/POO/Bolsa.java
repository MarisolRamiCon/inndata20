package POO;

import java.util.ArrayList;
import java.util.List;

public class Bolsa <T>{
    List<T> listaDeObjetos= new ArrayList<>();

    //Metodos de ArrayList add añadir, get obtener
    //Añadir objetos a mi lista
    public void anhadir(T objeto){
        listaDeObjetos.add(objeto);
    }

    public List<T> getLista(){
        return listaDeObjetos;
    }

}
