
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author felipe.salencar
 */
public class gameFaseJoaoEFelipe {

    static Scanner leitor = new Scanner(System.in);

    static int ataqueTheo() {
        System.out.println(" Tome uma decisão ");
        System.out.println("(1) ( ATAQUE TIPO �?GUA )");
        System.out.println("(2) ( ATAQUE TIPO TERRA )");
        System.out.println("(3) ( ATAQUE TIPO RAIO )");
        System.out.println("(4) ( DIALOGO )");
        return leitor.nextInt();
    }

    static int ataqueMonstro() {
        Random gerador = new Random();
        return gerador.nextInt(4) + 1;
    }

    static void imprimirHPM(int hpTheo, int hpMonstro) {
        System.out.println("********************");
        System.out.println(" > HP Theo: " + hpTheo);
        System.out.println(" > HP Minotauro: " + hpMonstro);
        System.out.println("********************");
    }

    static void imprimirHPE(int hpTheo, int hpMonstro) {
        System.out.println("********************");
        System.out.println(" > HP Theo: " + hpTheo);
        System.out.println(" > HP Equidina: " + hpMonstro);
        System.out.println("********************");
    }

    static void imprimirHPG(int hpTheo, int hpMonstro) {
        System.out.println("********************");
        System.out.println(" > HP Theo: " + hpTheo);
        System.out.println(" > HP Grifo: " + hpMonstro);
        System.out.println("********************");
    }

    static void fightMinotauro() {
        int hpTheo = 50;
        int hpMonstro = 30;
        int decisao;
        while (hpTheo > 0 && hpMonstro > 0) {
            imprimirHPM(hpTheo, hpMonstro);
            decisao = ataqueTheo();
            switch (decisao) {

                case 1:
                    System.out.println(" ATAQUE TIPO �?GUA\n");
                    hpMonstro -= 5;
                    System.out.println("Theo usa lembraças da natureza. \n");

                    break;
                case 2:
                    System.out.println(" ATAQUE TIPO TERRA\n ");
                    hpTheo -= 3;
                    System.out.println(" Ataque não surgiu efeito e foi repelido pela criatura !\n");
                    break;
                case 3:
                    System.out.println(" ATAQUE TIPO RAIO  ");
                    hpMonstro -= 7;
                    System.out.println("Theo usa a flecha que Zeus o presenteou. \n ");
                    break;
                case 4:
                    System.out.println("Dialogo ");
                    System.out.println("Tentativa de dialogo falhou, o Monstro te atacou\n");
                    hpTheo -= 5;
                    break;
                default:
                    System.out.println("Opção invalida! ");
                    break;

            }
            if (hpMonstro > 0) {
                decisao = ataqueMonstro();
                switch (decisao) {
                    case 1:
                        System.out.println(" MINOTAURO USA SEU MACHADO ");
                        hpTheo -= 4;
                        System.out.println(" Você senti a lamina quase perfurando a sua armadura ...\n");
                        break;
                    case 2:
                        System.out.println(" MINOTAURO USA INVESTIDA");
                        hpTheo -= 5;
                        System.out.println("Você sente o impacto da critura, fazendo com que tu perca momentaneamente os seus sentidos...\n ");
                        break;
                    case 3:
                        System.out.println(" MINOTAURO USA SEUS CHIFRES");
                        hpTheo -= 8;
                        System.out.println(" Você é arremeçado e fica meio confuso ...\n ");

                        break;
                    case 4:
                        System.out.println(" MINOTAURO CARREGA SEU ATAQUE\n");

                }
            } else {
                System.out.println("Inimigo derrotado");
            }

        }
    }

    static void fightEquidna() {
        int hpTheo = 50;
        int hpMonstro = 40;
        int decisao;
        while (hpTheo > 0 && hpMonstro > 0) {
            imprimirHPE(hpTheo, hpMonstro);
            decisao = ataqueTheo();
            switch (decisao) {

                case 1:
                    System.out.println(" ATAQUE TIPO �?GUA\n");
                    System.out.println("Ataque não surgiu efeito e foi repelido pela criatura !\n ");
                    hpTheo -= 3;
                    break;
                case 2:
                    System.out.println(" ATAQUE TIPO TERRA\n ");
                    hpMonstro -= 5;
                    System.out.println(" Theo usa sua flecha de terra ... \n");
                    break;
                case 3:
                    System.out.println(" ATAQUE TIPO RAIO  ");
                    hpMonstro -= 6;
                    System.out.println("Theo usa a flecha que Zeus o presenteou. \n ");
                    break;
                case 4:
                    System.out.println("Dialogo ");
                    System.out.println("Tentativa de dialogo falhou, o Monstro te atacou\n");
                    hpTheo -= 5;
                    break;
                default:
                    System.out.println("Opção invalida! ");
                    break;

            }
            if (hpMonstro > 0) {
                decisao = ataqueMonstro();
                switch (decisao) {
                    case 1:
                        System.out.println(" Equidna usa RAJADA D'�?GUA ! \n");
                        hpTheo -= 4;
                        System.out.println("Theo sente sua armadura cada vez mais pesada... \n");
                        break;
                    case 2:
                        System.out.println("Equidna usa CHICOTE DE CAUDA");
                        hpTheo -= 5;
                        System.out.println("Theo sente a cauda da criatura rasgando sua pele... \n");
                        break;
                    case 3:
                        System.out.println(" Equidna usa O BOTE ");
                        hpTheo -= 8;
                        System.out.println("Theo sente as presas de Equidina perfurando o seu corpo... \n");
                        break;
                    case 4:
                        System.out.println(" Equidina mergulha para recuperar seu vigor");
                        hpMonstro += 5;

                }
            } else {
                System.out.println("Inimigo derrotado");
            }
        }
    }

    static void fightGrifo() {
        int hpTheo = 50;
        int hpMonstro = 50;
        int decisao;
        while (hpTheo > 0 && hpMonstro > 0) {
            imprimirHPG(hpTheo, hpMonstro);
            decisao = ataqueTheo();
            switch (decisao) {

                case 1:
                    System.out.println(" ATAQUE TIPO �?GUA\n");
                    System.out.println(" Theo usa Flecha da natureza. \n ");
                    hpMonstro -= 6;
                    break;
                case 2:
                    System.out.println(" ATAQUE TIPO TERRA\n ");
                    hpMonstro -= 5;
                    System.out.println(" Theo usa sua flecha de terra ... \n");
                    break;
                case 3:
                    System.out.println(" ATAQUE TIPO RAIO  ");
                    System.out.println("Theo usa a flecha que Zeus o presenteou. \n ");
                    System.out.println("Ataque não surgiu efeito e foi repelido pela criatura !\n ");
                    hpTheo -= 3;
                    break;
                case 4:
                    System.out.println("Dialogo ");
                    System.out.println("Tentativa de dialogo falhou, o Monstro te atacou\n");
                    hpTheo -= 5;
                    break;
                default:
                    System.out.println("Opção invalida! ");
                    break;

            }
            if (hpMonstro > 0) {
                decisao = ataqueMonstro();
                switch (decisao) {
                    case 1:
                        System.out.println(" Grifo usa Rajada de Vento ...  ");
                        hpTheo -= 4;
                        System.out.println("O Grifo sobrevoa o Theo e Balança suas asas ... ");
                        break;
                    case 2:
                        System.out.println("Grifo usa o Rujido");
                        hpTheo -= 5;
                        System.out.println(" Theo fica desnorteado com o rugido ! \n");
                        break;
                    case 3:
                        System.out.println(" Grifo usa o Agarrar ! ");
                        hpTheo -= 8;
                        System.out.println("Theo e capturado e levado para as nuvens, ficando ofegante e lento. \n");
                        break;
                    case 4:
                        System.out.println("Grifo sobrevoa as nuvens para recuperar energia");
                        hpMonstro += 3;
                        System.out.println("Grifo rasga os ceus e da uma investida em Theo! ");
                        hpTheo -= 2;

                }
            } else {
                System.out.println("Inimigo derrotado");
            }
        }
    }

    public static void main(String[] args) {
        int continua = 1;
        while (continua == 1) {

           fightMinotauro();

            System.out.println(" Fim ! (1) Para Lutar novamente (2) Para seguir  ");
            continua = leitor.nextInt();
        }
while (continua == 1) {

           fightEquidna();

            System.out.println(" Fim ! (1) Para Lutar novamente (2) Para seguir  ");
            continua = leitor.nextInt();
        }
    }
while (continua == 1) {

           fightGrifo();

            System.out.println(" Fim ! (1) Para Lutar novamente (2) Para seguir  ");
            continua = leitor.nextInt();
        }
}
