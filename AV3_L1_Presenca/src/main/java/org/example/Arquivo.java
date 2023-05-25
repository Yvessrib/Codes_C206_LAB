package org.example;

import java.io.*;

import java.util.ArrayList;

public class Arquivo implements Comparable <Jogo>{


    public void escrever (Jogo jogo){

        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try{

            os = new FileOutputStream("Jogos.txt",true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("--- Jogo ---");
            bw.newLine();

            bw.write(jogo.getNome() + "\n");
            bw.write(jogo.getPreco() + "\n");
            bw.write(jogo.getGenero() + "\n");

        }catch (Exception e){
        }finally {
            try {
                bw.close();
            }catch (Exception e){}
        }

    }

    public ArrayList<Jogo> ler(){

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        String linhaLer;
        ArrayList<Jogo> arrayJogos = new ArrayList<>();

        try{
            is = new FileInputStream("Jogos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();

            while (linhaLer != null){

                if(linhaLer.contains("--- Jogo ---")){

                    Jogo aux = new Jogo();
                    aux.setNome(br.readLine());
                    aux.setPreco(Double.parseDouble(br.readLine()));
                    aux.setGenero(br.readLine());

                    arrayJogos.add(aux);
                }

                linhaLer = br.readLine();
            }

        }catch (Exception e) {
            System.out.println(e);

        } finally {
            try {
                br.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }

        return  arrayJogos;
    }

    @Override
    public int compareTo(Jogo o) {
        return 0;
    }
}