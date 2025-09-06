/*
Animal (superclasse):
atributos: nome.
métodos: comer(), beber().

    Ave (subclasse):
    atributos: nome.
    métodos: voar().
    
        Dragão:
        atributo: nome.
        métodos: comer(), beber(), jogarFogo(), voar().

        Pomba:
        atributos: nome, cartasEntregues.
        métodos: comer(), beber(), voar(), entregarCarta().

    Cachorro: 
    atributos: nome, ossosComidos.
    métodos: comer(), beber(), latir(), lamber().

    Gato:
    atributo: nome.
    métodos: comer(), beber(), miar().


Utilizar os conceitos aprendidos e otimizar o código usando os conceitos de herança e polimorfismo.
Obs.: Quando o cachorro come ele aumenta o número de ossos que ele come em 1. O pombo pode só voar, mas quando o pombo entrega cartas ele obrigatoriamente voará.
 */

import java.util.ArrayList;

 import Animais.*;

public class App{
    Cachorro dog = new Cachorro()
    ArrayList<Pomba> pombos = new ArrayList<Pomba>();
    pombos.add(new Pomba("Isa", "Vermelha"));
    pombos.add(new Pomba("Ema", "Preto"));
    pombos.add(new Pomba("Maria", "Rosa"));

    for (Pomba pomba: pombos){
        if(pomba.get)
    }

}

 