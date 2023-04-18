package org.example;

public class Jedi extends Personagem implements Treinamento,Forca{

    private boolean mestre;
    private Sabre sabre;

    public Jedi(String nome, int poder, boolean mestre, Sabre sabre) {
        super(nome,poder);
        this.mestre = mestre;
        this.sabre = sabre;
    }

    @Override
    public void mostraInfo() {
        System.out.println("--- Infos do Jedi ---");
        super.mostraInfo();
        if(mestre)
            System.out.println("Este é um Jedi mestre");
        else
            System.out.println("Este não é um Jedi mestre");
        System.out.println("Cor do sabre: " + sabre.cor);
    }

    @Override
    void travarBatalha() {
        System.out.println(getNome() + " travou uma batalha contra um sith");
        setPoder(getPoder() + 1);
    }

    @Override
    public void usarForca() {
        System.out.println(getNome() + " usou a força para o bem");
        setPoder(getPoder() + 5);
    }

    @Override
    public void trocarSabre(String cor) {
        sabre.cor = cor;
    }

    @Override
    public void treinarPadawan() {
        if(mestre || getPoder() > 70)
            System.out.println(getNome() + " treinou um Padawan");
        else
            System.out.println(getNome() + " ainda não consegue treinar padawans");
    }

}
