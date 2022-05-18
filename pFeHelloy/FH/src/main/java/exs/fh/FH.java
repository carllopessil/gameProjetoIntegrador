package exs.fh;

import java.util.Scanner;

public class FH {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int FHvFOX = 0;
        System.out.println("Meu filho, Agora a próxima etápa na da sua jornada será em relacionada a natureza!");
        System.out.println("...");
        System.out.println("Largado por sua mãe em uma grande floresta, vívida, com belos sons\n"
                + "de pássaros, arvores de vários tipos, galhos, arbustos, flores, e o aroma da\n"
                + "natureza.");
        System.out.println("Olhando a sua volta, observa-se uma área circular bem florida com um\n"
                + "grande tronco cerrado.");
        System.out.println("Uma depressão com plantas a borda de um bonito riacho.");
        System.out.println("--Opções...\nTronco cerrado (Oeste/O)\nRiacho(Note/N)");
        String FHesc1 = input.next();

        switch (FHesc1) {
            case "Oeste":
                System.out.println("Chegando perto da grande arvore cerrada, revela-se uma raposa, branca,\n"
                        + "com olhos puxados, amarelos e contornados em vermelho.");
                System.out.println("-Olá humano, quem é você?");
                for(int FHi = 0; FHi < 1;){
                System.out.println("--Opções...\n(1) Se apresentar á raposa.\n(2) Não se apresentar e manter o silêncio.");
                int FHvCF = input.nextInt();
                switch (FHvCF) {
                    case 1:
                        System.out.println("-Que curioso! Muito prazer em te conhecer Theo!\n...");
                        System.out.println("-Talvez essa informação seja útil para você um dia, mas você sabia que as\n"
                                + "árvores costumam ser egoísta?");
                        System.out.println("Após dizer isso, a misteriosa raposa sai andando para longe de sua\n" +
"percepção e desaparece.");
                        FHvFOX = 3; //Valor 3 significa interação boa com a raposa!
                        FHi = 1;
                        break;
                    case 2: 
                        System.out.println("-Que ser rude você é.");
                        System.out.println("Com um semblante chateado, a raposa some em uma forte ventania momentânea.");
                        FHvFOX = 2; //Valor 2 significa interação RUIM com a raposa!
                        FHi = 1;
                        break;
                    default:
                       System.out.println("-O que você disse?");
                    break;
                    }   
                }
                break;
        }

    }
}
