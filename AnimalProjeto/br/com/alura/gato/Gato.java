package br.com.alura.gato;

import br.com.alura.animal.Animal;

public class Gato extends Animal {
    @Override
    public void emitirSom(){
        System.out.println("Miauuuuuu Miauuu");
    }
    public void arranharMoveis(){
        System.out.println("Arranhando Moveis");
    }
}
