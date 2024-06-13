package br.com.alura.cachorro;

import br.com.alura.animal.Animal;

public class Cachorro extends Animal {
    @Override
    public void emitirSom(){
        System.out.println("AUAUAUAUAUAUAU");
    }

    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }

}
