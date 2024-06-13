package br.com.alura.teste;

import br.com.alura.animal.Animal;
import br.com.alura.cachorro.Cachorro;
import br.com.alura.gato.Gato;

public class TesteAnimais {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.emitirSom();
        cachorro.abanarRabo();

        gato.emitirSom();
        gato.arranharMoveis();
    }

}
