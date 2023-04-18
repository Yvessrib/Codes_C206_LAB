package org.example;

public class Main {
    public static void main(String[] args) {

        Nave nave = new Nave("Millenium Falcon",true);

        Sabre sabre1 = new Sabre("Verde");
        Jedi jedi = new Jedi("Yoda", 60,true, sabre1);

        Sabre sabre2 = new Sabre("Vermelho");
        Sith sith = new Sith("Vader",65,true,sabre2);

        Droid droid1 = new Droid("Droid",15,true);
        Droid droid2 = new Droid("Droid 2", 30, false);

        nave.personagens[1] = jedi;
        nave.personagens[2] = sith;
        nave.personagens[3] = droid1;
        nave.personagens[4] = droid2;

        nave.mostraInfo();

        jedi.mostraInfo();
        jedi.travarBatalha();
        jedi.treinarPadawan();
        jedi.usarForca();
        jedi.trocarSabre("Roxo");
        jedi.mostraInfo();

        sith.mostraInfo();
        sith.corromperJedi();
        sith.travarBatalha();
        sith.usarForca();

        droid1.mostraInfo();
        droid1.hackearSistema();
        droid1.travarBatalha();

        droid2.mostraInfo();
        droid2.hackearSistema();
        droid2.travarBatalha();





    }
}