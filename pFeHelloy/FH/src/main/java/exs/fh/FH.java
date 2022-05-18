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
        System.out.println("--Opções...\nTronco cerrado (Oeste/O)\nRiacho(Norte/N)");
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
                        System.out.println("Se aproximando do rio, Theo se impressiona com o quanto parece ser muito fundo, e consegue observar uma ponte, um tanto distante");
                        System.out.println( "que concede para o outro lado do rio.");
                        System.out.println("Ao chegar ao meio dá ponte, começa uma forte ventania");
                        
                        FHvFOX = 2; //Valor 2 significa interação RUIM com a raposa!
                        FHi = 1;
                        break;
                    default:
                       System.out.println("-O que você disse?");
                    break;
                    }   
                }
               
        }
         switch (FHesc1) {
            case "Norte":
                
                System.out.println("\n Se aproximando do rio, Theo se impressiona com o quanto parece ser muito fundo, e consegue observar uma ponte, um tanto distante");
                System.out.println( "que concede para o outro lado do rio.");
                System.out.println("No caminho até a ponte, encontra-se um índio sentado como se tivesse a sua espera...");
                System.out.println("- Oi Theo, você precisa aprender para se tornar um grande Deus, e para isso, precisa passar pelo desafio \n");
                FH.desafioVetor();
         }
    }
       static void desafioVetor() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Para passar, é só interligar cada problema com a sua consequência");
        System.out.println(" NA MESMA ORDEM DESCRITA ");
           System.out.println(" exemplo: (1,1) ");

        {
            String[] problemas = new String[7];
            problemas[0] = "nada";
            problemas[1] = "Água";
            problemas[2] = "Luz";
            problemas[3] = "Algas";
            problemas[4] = "Agente físico que permite que os       |\n|  objetos sejam visíveis";
            problemas[5] = "Uma substância essencial para todos    | \n|  os seres vivos do planeta ";
            problemas[6] = "São responsáveis pela produção de      |\n|  54% do oxigênio do mundo";

           

            System.out.println(" _________________________________________________________\n"
                    + "()________________________________________________________)");
            System.out.println("|    COMPLETE UM NÚMERO AO OUTRO, NA MESMA ORDEM      |\n| \t \t \t \t \t \t \t  |");
            for (int i = 1; i < problemas.length - 3; i++) {
            System.out.println("|  PROBLEMA " + i + ": " + problemas[i] + "\t \t \t \t \t  |\n|    \t \t \t \t \t \t \t  | ");

            }
            System.out.println("|_________________________________________________________| \n| \t \t \t \t \t \t \t  |");
            for (int i = 4; i < problemas.length; i++) {
            System.out.println("|  CONSEQUENCIA " + i + ": " + problemas[i] + "\t \t \t \t  |\n| \t \t \t \t \t \t \t  |");
            }

            System.out.println("|_________________________________________________________| \n"
                    + "()________________________________________________________)");

            System.out.println("\n");
        }
          double entrada, entrada1, entrada2;

        do {

            System.out.println("Escreva a primeira ordem: ");
            entrada = input.nextDouble();
            System.out.println("Escreva a segunda ordem: ");
            entrada1 = input.nextDouble();
            System.out.println("Escreva a terceira ordem: ");
            entrada2 = input.nextDouble();

            if (entrada == 1.5 && entrada1 == 2.4 && entrada2 == 3.6) {
                System.out.println("Pabéns Theo, você conseguiu, boa sorte na sua jornada pela frente!");
                
            } else {
                System.out.println("TENTE NOVAMENTE");

            }
        } while (entrada != 1.5 || entrada1 != 2.4);      
                

    }
}

