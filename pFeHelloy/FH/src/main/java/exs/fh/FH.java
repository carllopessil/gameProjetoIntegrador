package exs.fh;

import java.util.Scanner;
import java.util.Random;

public class FH {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int FHvFOX = 0;
    int FHcontinua = 0;
    System.out.println("Meu filho, Agora a próxima etápa da sua jornada será relacionada a natureza!");
    System.out.println("...");
    System.out.println("Largado por sua mãe em uma grande floresta, vívida, com belos sons\n"
        + "de pássaros, arvores de vários tipos, galhos, arbustos, flores, e o aroma da\n"
        + "natureza.");
    System.out.println("Olhando a sua volta, observa-se uma área circular bem florida com um\n"
        + "grande tronco cerrado.");
    System.out.println("Uma depressão com plantas a borda de um bonito riacho.");
    String FHesc1;
    do {
      System.out.println("\n Escolha para qual lado seguir:");
      System.out.println("--Opções...\n Tronco cerrado (Oeste/O)\n Riacho (Norte/N)");
      FHesc1 = input.next();

    } while (!FHesc1.equalsIgnoreCase("oeste") && !FHesc1.equalsIgnoreCase("norte") && !FHesc1.equalsIgnoreCase("o")
        && !FHesc1.equalsIgnoreCase("n"));

    if (FHesc1.equalsIgnoreCase("oeste") || FHesc1.equalsIgnoreCase("o")) {
      System.out.println("Chegando perto da grande árvore cerrada, revela-se uma raposa, branca,\n"
          + "com olhos puxados, amarelos e contornados em vermelho.");
      System.out.println("-Olá humano, quem é você?");

      for (int FHi = 0; FHi < 1;) {
        System.out.println("--Opções...\n(1) Se apresentar á raposa.\n(2) Não se apresentar e manter o silêncio.");
        int FHvCF = input.nextInt();
        switch (FHvCF) {
          case 1:
            System.out.println("-Que curioso! Muito prazer em te conhecer Theo!\n...");
            System.out.println("-Talvez essa informação seja útil para você um dia, mas você sabia que as\n"
                + "árvores costumam ser egoísta?");
            System.out.println("Após dizer isso, a misteriosa raposa sai andando para longe de sua\n" +
                "percepção e desaparece.");
            FHvFOX = 3; // Valor 3 significa interação boa com a raposa!
            FHi = 1;
            break;
          case 2:
            System.out.println("-Que ser rude você é.");
            System.out.println("Com um semblante chateado, a raposa some em uma forte ventania momentânea.");
            System.out.println(
                "Se aproximando do rio, Theo se impressiona com o quanto aparenta ser muito fundo, e consegue observar uma ponte, um tanto distante");
            System.out.println("que concede para o outro lado do rio.");
            System.out.println("Ao chegar ao meio dá ponte, começa uma forte ventania balançando a ponte,");
            System.out.println("quando derrepente, surge a mesma raposa de antes");

            FHvFOX = 2; // Valor 2 significa interação RUIM com a raposa!
            FHi = 1;
            break;
          default:
            System.out.println("-O que você disse?");
            break;
        }
      }
      System.out.println("Apos a interação com a raposa, a unica opção de Theo é ir em direção ao norte");
      FHcontinua = 1;
    }
    if (FHesc1.equalsIgnoreCase("norte") || FHesc1.equalsIgnoreCase("n") || FHcontinua == 1) {
      System.out.println(
          "\nSe aproximando do rio, Theo se impressiona com o quanto aparenta ser muito fundo, e consegue observar uma ponte, um tanto distante");
      System.out.println("que concede para o outro lado do rio.");
      System.out.println("No caminho até a ponte, encontra-se um índio sentado como se tivesse a sua espera...");
      System.out.println(
          "-Oi Theo, você precisa aprender para se tornar um grande Deus, e para isso, precisa passar pelos desafios a sua frente \n");
      FH.desafioVetor();
      System.out.println("Parabéns Theo, você conseguiu, boa sorte na sua jornada daqui pela frente! \n");
      System.out.println("Theo está atravessando a ponte");
      if (FHvFOX == 3) {
        System.out.println("Um monstro marítmo quebra a ponte inteira e com tudo isso,");
        System.out.println("Theo caí na água e tem de encarar o monstro");
      }
      if (FHvFOX == 2) {
        System.out.println("A raposa aparece em frente a ponte com um semblante dessa vez de fúria");
        System.out.println("-Para ser digno de se tornar um deus seria bom começar a ter educação!");
        System.out.println("A raposa destroi a ponte com suas investidas furiosas");
        System.out.println("Theo de baixo d'água avista algo se aproximando");
      }

      System.out.println("Um grande peixe-gato de aparencia contraditória e assustradora, te convida para jogar 21");
      Namazu21();
      System.out.println("O MONSTRO ENTREGA UM ALJAVA DE ÁGUA");
      System.out.println("Theo segue em frente nadando até o outro lado do mar");
        System.out.println("Quando repentinamente avista um Texugo, listrado, na cor ");
        System.out.println("marrom e branco, carismático e bem bricalhão.");
        System.out.println("- Olá Theo, espero que você esteja bem");
        System.out.println("Theo observa que ele tem um copo com dados dentro...");
        TexugoFH();
      
      
    }
  }

  static void desafioVetor() {
    Scanner input = new Scanner(System.in);

    System.out.println("Para passar, só é preciso interligar cada problema com a sua consequência");
    System.out.println(" NA MESMA ORDEM DESCRITA ");
    System.out.println("");
    System.out.println(" exemplo: (1,1) ");
    {
      String[] problemas = new String[7];
      problemas[0] = " ";
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
        System.out
            .println("|  PROBLEMA " + i + ": " + problemas[i] + "\t \t \t \t \t  |\n|    \t \t \t \t \t \t \t  | ");
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
      if (entrada != 1.5 || entrada1 != 2.4 && entrada2 != 3.6) {
        System.out.println("TENTE NOVAMENTE");
      }
    } while (entrada != 1.5 || entrada1 != 2.4 && entrada2 != 3.6);
  }

  public static void rule21() {
    System.out.println("Regras do jogo");
    System.out.println("todos os jogadores receberão 3 cartas de As a 10");
    System.out.println(
        "Você escolhe uma das suas cartas e coloca sobre a mesa\nTodos os jogadores fazem o mesmo e compram uma carta");
    System.out
        .println("O jogador que conseguir fazer chegar exatamente a 21 ganha!\n o jogador que ultrapassar o 21 perde.");
  }

  public static void proc1() {
    System.out.println("==========INICIO===========");
    System.out.println("Vamos jogar 21!");
  }

  static void Namazu21() {
    Scanner sc = new Scanner(System.in);
    Random cart1 = new Random();
    Random cart2 = new Random();
    Random cart3 = new Random();
    Random cart4 = new Random();
    Random cart5 = new Random();
    Random cart6 = new Random();
    Random cartB1 = new Random();
    Random cartB2 = new Random();
    int FHverif21 = 1;
    proc1();
    int verif = 1;
    int lose = 0;
    int entr1 = 0, entr2 = 0;
    int win = 0;
    int FHverif = 0;

    do {
          verif = 1;
          FHverif = 0;
          int cMesa = 0;
          int contador1 = 1;
          while (verif == 1) {
            if(lose == 1){
              for(int o = 0; o < 20; o++){
                lose = 0;
               System.out.println(" ");
              }
              System.out.println("Reiniciando...");
            }

            int cartaM1 = cart1.nextInt(10) + 1;
            int cartaM2 = cart2.nextInt(10) + 1;
            int cartaM3 = cart3.nextInt(10) + 1;
            int cartaY1 = cart4.nextInt(10) + 1;
            int cartaY2 = cart5.nextInt(10) + 1;
            int cartaY3 = cart6.nextInt(10) + 1;
        
            while (cMesa != 21 && verif == 1 && FHverif == 0) {
              System.out.println("Vamos comerçar!\nVocê recebe 3 cartas: ");
              System.out.println(cartaM1 + ", " + cartaM2 + ", " + cartaM3);
              System.out.println("Escolha entre suas cartas, qual você colocara na mesa?");
              int choic = sc.nextInt();
              // if(choic != cartaM1 || choic != cartaM2 || choic != cartaM3){
              // }
              if (choic == cartaM1) {
                entr1 = cartaM1;
                cartaM1 = cartB1.nextInt(10) + 1;
                System.out.println("Sua nova carta é: " + cartaM1);
              } else if (choic == cartaM2) {
                entr1 = cartaM2;
                cartaM2 = cartB1.nextInt(10) + 1;
                System.out.println("Sua nova carta é: " + cartaM2);
              } else if (choic == cartaM3) {
                entr1 = cartaM3;
                cartaM3 = cartB1.nextInt(10) + 1;
                System.out.println("Sua nova carta é: " + cartaM3);
              } else if (choic != cartaM1 || choic != cartaM2 || choic != cartaM3) {
                System.out.println("Você não tem esta carta e sua penalidade por tentar roubar é a morte.");
                lose = 1;
                verif = 0;
                FHverif = 1;
                break;
              }

              cMesa = cMesa + entr1;
              win = (21 - cMesa);
              if (cMesa >= 21) {
                if (cMesa == 21) {
                  System.out.println("Você venceu!");
                  System.out.println("\ntotal de rodadas: " + contador1);
                 
                    
                  lose = 0;
                  verif = 2;
                  FHverif = 2;
                  break;
                }
                System.out.println("Você perdeu.");
                System.out.println("\ntotal de rodadas: " + contador1);
                lose = 1;
                verif = 0;
                FHverif = 0;
                break;
              }

              System.out.println("\nContagem com a sua jogada: " + cMesa);

              // config bot
              System.out.println("Vez do bot...\n");
              System.out.println("cartas do bot: " + cartaY1 + " " + cartaY2 + " " + cartaY3);
              if (contador1 == 1) {
                if (cartaY1 > cartaY2) {
                  if (cartaY1 > cartaY3) {
                    entr2 = cartaY1;
                    cartaY1 = cartB2.nextInt(10) + 1;
                    System.out.println("Nova carta do bot: " + cartaY1);
                  } else {
                    entr2 = cartaY3;
                    cartaY3 = cartB2.nextInt(10) + 1;
                    System.out.println("Nova carta do bot: " + cartaY3);
                  }
                } else if (cartaY2 > cartaY3) {
                  entr2 = cartaY2;
                  cartaY2 = cartB2.nextInt(10) + 1;
                  System.out.println("Nova carta do bot: " + cartaY2);
                }
              } else {

                if (cMesa + cartaY1 == 21) {
                  entr2 = cartaY1;
                 // System.out.println("Nova carta do bot:" + cartaY1);
                } else if (cMesa + cartaY2 == 21) {
                  entr2 = cartaY2;
                //  System.out.println("Nova carta do bot:" + cartaY2);
                } else if (cMesa + cartaY3 == 21) {
                  entr2 = cartaY3;
                //  System.out.println("Nova carta do bot:" + cartaY3);
                } else {
                  if (cartaY1 < cartaY2) {
                    if (cartaY1 < cartaY3) {
                      entr2 = cartaY1;
                      cartaY1 = cartB2.nextInt(10) + 1;
                     // System.out.println("Nova carta do bot: " + cartaY1);

                    } else if (cartaY2 < cartaY1) {
                      if (cartaY2 < cartaY3) {
                        entr2 = cartaY2;
                        cartaY2 = cartB2.nextInt(10) + 1;
                        //System.out.println("Nova carta do bot: " + cartaY2);
                      }
                    } else if (cartaY3 < cartaY1) {
                      if (cartaY3 < cartaY2) {
                        entr2 = cartaY3;
                        cartaY3 = cartB2.nextInt(10) + 1;
                       // System.out.println("Nova carta do bot: " + cartaY3);
                      }
                    }

                  }
                }
              }

              System.out.println("O bot jogou a carta: " + entr2);

              contador1++;

              cMesa = cMesa + entr2;
              win = (21 - cMesa);

              System.out.println("\ncontagem com a jogada do bot: " + cMesa);
              if (cMesa >= 21) {
                if (cMesa == 21) {
                  System.out.println("Bot wins!");
                  System.out.println("total de rodadas: " + contador1);
                  // verif = 2;
                  FHverif = 0;
                  break;
                }
                System.out.println("Bot perdeu.");
                System.out.println("total de rodadas: " + contador1);
                verif = 2;
                FHverif = 2;
                break;
              }

              if (cMesa >= 21) {
                break;
              }
              // fim config bot
              if (verif == 2) {
                break;
              } else {
                verif = 1;
              }
              if(lose == 1){

              }
            }  
            System.out.println("Fim do jogo.");  
          }
        }
        while (lose != 0);
  }


  static void TexugoFH() {
    Scanner sc = new Scanner(System.in);
    Random dado1 = new Random();
    int confi = 0;
    int vet[] = new int[20];

    System.out.println("Deseja girar o dado? S/N");
    char v1 = sc.next().charAt(0);

    switch (v1) {
      case 's':
      case 'S':
        confi = 1;
        break;
      case 'n':
      case 'N':
        confi = 2;
        break;
    }

    int i = 0;
    // estrutura do dado - salvando em array todos os valores
    for (int cont = 1; cont == confi;) {
      vet[i] = dado1.nextInt(6) + 1;
      System.out.println("> " + vet[i] + " <");
      i++;
      System.out.println("S/N");
      char verif2 = sc.next().charAt(0);
      if (verif2 == 'S' || verif2 == 's') {
        cont = 1;
      } else {
        cont = 2;
        System.out.println("TODOS OS VALORES\n");
        // mostrar todos os valores
        for (int j = 0; j < i; j++) {
          System.out.println("| " + vet[j] + " |");
        }
        break;
      }
    }
  }
}
