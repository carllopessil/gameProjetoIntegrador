package exs.fh;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class Jogo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("GGBB#&&J????GY?J55PJYBBGBBBGGBBBBGGGGGBGGGGGGGGGGGGGGGGGGBBBBBB#####&&&&&&&&&&&&&&&&&&&&&@@&&&&&##########&&#####&&&&@@@@@@&&&&####BBGP55YJJ5GBB#G5PP555555YYY55PGGPGB#&&&&&&&&&&&#&&&&&&&&&&&&&&&&&&&&&\n"
                + "???YPGGB##BB######&&&&&&&&&&&&&#########################&&&&&&&&&&&&&&&&&&&&&&&&&&&&&@&&&&&&&&&&#####&@&&&&&&&@@@&##&&&&&###BGP5GB#&&@@&PG###BPG##BBBBB#BBB##&&#B#&&&&&#GBB#&&&&&&&&&&&&&&&&&&&&&&&&&&##\n"
                + "!??7J5PGGB##BB######&&&#####################################&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&#&&#&&&&&&&&&@@@&B#&&&&##GP555GB#&&&@@&PYJ5#?:^5##@&#&B?5B##BB#B#&&&##&#######&&&&&#&&&&&&&&&&&&&#######\n"
                + "77777Y?YPGGGBBGGBBBBGB#########B######B5P##############&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&B#&&&&&&##&&&&&&&&@@&@&#B#&&&&#GP5PGB#&&&#&&@&GBBPY~~YGG#&BB&BP7?P&&&&&&&&PBPPPPB&#&&###&&&&#&&&&&&&&&&&&&&&####\n"
                + "77777JJ?Y55P5PBG5GGGG5BBBBB###########~ J########&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&GB&#&##&&&&#&&&&#&&&&@@&&BB&&@&#G5PGBB##&&&&&&&#B#&#BJJG&BPPG#&BGGB#&&&&&&&#P7?Y?JJYB#&&&&&##&&##&&&&&##&&&&&&&#&#&\n"
                + "7?777?Y7JYJYYY5B55GGGPB#############&5.7&##&#&&&&&&&&&&&&&&&&&&&&&&&########&&&&&&GG###&#&&&&&&&@&&&&&&@&@&&#G#&&&#BP55GBBBB##&&&&BBYP###!...5#GB?7YBGB&&#B#&&###J?!!~~!7#&&&&#&&&&&##&&&&#B&&&&&&&&&&&#\n"
                + "7777?7?J7!~JY5PBPG####&#GGG#&&##B###&BG#&##&&#B#######BB########BGGB####B#&&&&#G5BBB#GB######&&&@@#BBB#&@@&BG#&BBB###BBGPGGB#&&&#GGB####? 7Y.:P&&55#&###&BPPG#&&@@#GY55GYG&&##&#BBGB##&&&##&&&&&&&&&&&&&\n"
                + "77777?Y55Y5GPGBBBGB##P!^^~~^7BB^^B&&#!:J&####!:?#BBBBG^:P####B?^^~~^~5&7:J&BPYPBG#7~~~^^~~~~!#@&5!^~~~^^7PBG&&5:~&&&##G^:?GBB#BBB######Y.^G#7 ~BB#&&&B^^5!^^:P&&G7^~~~:^7J#&##J~~!!~~5@&#&&&&&&&&&&&&&&&\n"
                + "77??J5YPPGGBBGBB##B#Y.:Y###P^^? ~####^ ?#BBBB~ 7BBBB#G..5###B^ 7B##B?.?:.Y5JYPGB&##B#P..P####&&! ~G&&&#5:.?&&&5 :##BGP5~.~GGBB#&&&BB##P:.YB5Y^ 7&@&&@B..:JB#B#&Y.^5P#BY!.:5&&J ^G#GP5G&#&&&&&&&&&&&&&&&&\n"
                + "JJY55P5JYGGGBBBBBB#B: J&####P...5BBBB^ ?#BBB#~ 7#####G:.5###? ^#&&&&&~..~Y5PGGB#&&&&&G.:B&&&&@Y ^#@&&&&&Y.:B&&5 :GGP5Y57.^B&&########B~.?##PGP:.5###&G..5&&&&&B:.7YYY?JJ: 7B&Y:.!?YP#BG#&&&&&&&&&&&&&&&&\n"
                + "55555PP5J?5GGPGBBPP5..JPPBBBP:.7BBBBB^ ?#####~ ?#####G:.P&&&! !&&&#BP~.:5GGB#&&&&&&&&P.:B&&&&@? ~&&&&&&#Y..P#&Y ^555PG#J ^###&&&###BG7..~~~~~!:.:J5G&G..G&##&&5..7??7?JJ?JPBBBYJ?!^:~YGGB#&&&&&&&&&&&&&&\n"
                + "5YY55PP5P5??Y5YY5G5J^.!G5G#B?..Y####B^ ?&####~ !#&&&#Y..P@&&Y :PBPYJ7..^B#&&&#&&##&&&G..P@@&&&P..5@@@@&P~ !BB&5.:YGBB##~ ?###GGB#GPGJ.:5G5YPPGB! ^B#&G..P###&G5^ 7#B#&&&&###BGGG#&PJ..PGGBB#&&&&&&&&&&&&\n"
                + "YYY555555555J?JYYYBPJ^.^77J~^7.:JJP##?.:?JJ#&~..~JY?~~^ !Y5&#?.:~~!!:7~.?YY####&&&&&&&! ^JJY&&&Y^.!JYY7::7##BBG~.:?Y?7^:JB#&B555PG#G:.Y@BYPB#@@B^ !#&P. 5##&BPBP~.^7YYYJ7!BBY~~?JY?^.!BG5PP5G&&&###B&&&&\n"
                + "YY55555P5PPP5YJ55YBG5P5?!7?YB#P?7?G&##PJ??Y#&~ 7Y??JP&BY?75#BB5J?!7YG&BY77Y###&&&&&&&&#5J??P&&&&#PY?7775#&&#PY5GPJ?!7JP#@&&#BGG#&##Y~?&BGB#BGGPG57?#&GJJB##BPBGGBYY?77?JJG&G5J??7!??5BBG5YYYYG&&#GGP#&&&\n"
                + "Y5555555PP55PPYY5PB5GBBGG######&&&&###&&&&&&#~ ?&&&&&#&##BBBBB####&&#########&&&&&&&&&&&&&&&&&&&&@@&#GG#&&#Y5GPGBBB#B&@&#BGB#&&###&#GG&PJP#&5?JYYJY#&#&@&&B5GBGB5G&&BB##&&&####&#BBBPBPPB55YY5G&&BGPB##&\n"
                + "YY55555PPPPPG5Y5PBPPBBGG#####################7:J&####BBGGGBBB#########B########&&&&&&&&&&&##&&&&&&&#BPG#&&#JJPGGGBBJJG#B##&&###&&&&@@&###&&@BPB&&#&&&&&&@#5GGGB5P#&#B###&&&&##BB###BGGBBBBY5YY5B&#PG####\n"
                + "YYY555555PGGP5PPBGPBBBG##############BB#######B####BGGGBBBBB##################&&&&&#&&&&&&#&&&&&&&&#BGB#&&#P5PGB#&#GG##&&#B#&B#&&&&&##&&&&&&&@@&&&&&&&&@#YGGGG5P&&#BB##&&###&##BBBB#BG5PGBPY5YYP#&PG#&##\n"
                + "YY5555PPPGGGP5PG#GG##BG#######BBBBBB#########BBBBBGGBBBBBB##################&&&&&&&&&&&&&&&&&&&&&&&##BB#&&GGGB##&&&&&####G5G#PG####&&&&@@@&&&&&&&#&&&&@#YGGGG5P@&&##B#&&&#&######BGBB??5GPP5PPPPB#PP#&&#\n");
        menu();
        // FALTA COMPLETAR MENU (RESUMO E SAIR)
        // ARRUMAR HISTORIA DA PARTE DO CARLOS E GU
        // ARRUMAR FINAL
        // COLOCAR PARTE DA LETRA GRANDE NO COME??O
        // FELIPE CONFIRMAR SE A PARTE DO JOGO EST?? RODANDO
        // JO??O RODAR TODO O JOGO E REVISAR A HISTORIA
    }

    static void menu() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Timer timer = new Timer();
        int entrada;
        do {
            System.out.println("------- MENU -------");
            System.out.println("\n");
            System.out.println("(1) JOGAR");
            System.out.println("(2) HIST??RIA");
            System.out.println("(3) SAIR");
            System.out.println("\nEscolha sua op????o:");
            entrada = input.nextInt();

            switch (entrada) {
                case 1:;
                    returnText();
                    Thread.sleep(3000);
                    timer.cancel();
                    break;
                case 2:
                    int enter;
                    System.out.println("---RESUMO---"
                            + "Esse jogo se passa na mitologia grega onde dois Deuses se apaixonam e tem um filho\n" +
"chamado Theo que ?? um semideus que precisa assumir o lugar de seu pai que morreu na\n" +
"guerra contra os tit??s.\n" +
"Durante sua jornada, Theo passa por treinamentos para se tornar um Deus onde ele acaba\n" +
"recebendo ensinamentos de sua m??e e de Athena para ser um Deus completamente\n" +
"diferente de seu pai.\n" +
"No final dos seus treinamentos Theo precisa receber a aprova????o de Zeus onde ele passar\n" +
"desafio final onde ele ter?? que passar por tr??s mostro que representa os tr??s principais\n" +
"Deus do olimpo que s??o Hades, Poseidon e Zeus se Theo conseguir passar pelo desafio\n" +
"final ele assumir?? o lugar de seu pai e se tornar?? o novo Deus da guerra");
                    do {

                        System.out.println("DIGITE 1 PARA VOLTAR AO MENU");
                        enter = input.nextInt();
                        if (enter == 1) {
                            menu();
                        }else{
                            System.out.println("op????o invalida!");
                        }
                    } while (enter != 1);
                    break;

                case 3:
                    System.out.println("------  sangue de ares ------");
                    Thread.sleep(500);
                    System.out.println("");
                    Thread.sleep(500);
                    System.out.println("");
                    Thread.sleep(500);
                    System.out.println("------     historia     ------");
                    Thread.sleep(500);
                    System.out.println("");
                    Thread.sleep(500);
                    System.out.println("");
                    Thread.sleep(500);
                    System.out.println("------     CARLOS     --------");
                    Thread.sleep(500);
                    System.out.println("------     HELOYSA    --------");
                    Thread.sleep(500);
                    System.out.println("------     FELLIPE    --------");
                    Thread.sleep(500);
                    System.out.println("------      JO??O      --------");
                    Thread.sleep(500);
                    System.out.println("------     GUSTAVO    --------");
                    Thread.sleep(500);
                    System.out.println("------     FELIPE     --------");
                    Thread.sleep(500);
                    System.out.println("");
                    Thread.sleep(500);
                    System.out.println("");
                    Thread.sleep(500);
                    System.out.println("------  desenvolvimento ------");
                    Thread.sleep(500);
                    System.out.println("");
                    Thread.sleep(500);
                    System.out.println("");
                    Thread.sleep(500);
                    System.out.println("------     CARLOS     --------");
                    Thread.sleep(500);
                    System.out.println("------     HELOYSA    --------");
                    Thread.sleep(500);
                    System.out.println("------     FELLIPE    --------");
                    Thread.sleep(500);
                    System.out.println("------      JO??O      --------");
                    Thread.sleep(500);
                    System.out.println("------     GUSTAVO    --------");
                    Thread.sleep(500);
                    System.out.println("------     FELIPE     --------");
                    Thread.sleep(500);
                    System.out.println("");
                    Thread.sleep(500);
                    System.out.println("");
                    Thread.sleep(500);
                    System.out.println("------     analise     -------");
                    Thread.sleep(500);
                    System.out.println("");
                    Thread.sleep(500);
                    System.out.println("");
                    Thread.sleep(500);
                    System.out.println("------     CARLOS     --------");
                    Thread.sleep(500);
                    System.out.println("------     HELOYSA    --------");
                    Thread.sleep(500);
                    System.out.println("------     FELLIPE    --------");
                    Thread.sleep(500);
                    System.out.println("------      JO??O      --------");
                    Thread.sleep(500);
                    System.out.println("------     GUSTAVO    --------");
                    Thread.sleep(500);
                    System.out.println("------     FELIPE     --------");
                    Thread.sleep(500);
                    System.out.println("");
                    Thread.sleep(500);
                    System.out.println("");
                    Thread.sleep(500);
                    System.out.println("------  sangue de ares ------");
                    Thread.sleep(500);
                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n"
                            + "@@@@@@@@@@@@@@@@@@@@@@@@P             7@@@@@^    B@@@@@!      Y@@@@@?      J@@@@@@@@@@@@@@@@@@@@@@@@\n"
                            + "@@@@@@@@@@@@@@@@@@@@@@@@P    ^55555555G@@@@@^    B@@@@@!      ^@@@@&.      J@@@@@@@@@@@@@@@@@@@@@@@@\n"
                            + "@@@@@@@@@@@@@@@@@@@@@@@@P    !@@@@@@@@@@@@@@^    B@@@@@!   :.  P@@@Y  ..   J@@@@@@@@@@@@@@@@@@@@@@@@\n"
                            + "@@@@@@@@@@@@@@@@@@@@@@@@P    !@@@@@@@@@@@@@@^    B@@@@@!   !~  ~@@@^  7~   J@@@@@@@@@@@@@@@@@@@@@@@@\n"
                            + "@@@@@@@@@@@@@@@@@@@@@@@@P    ~#BBBBB&@@@@@@@^    B@@@@@!   7P   B@P   G^   J@@@@@@@@@@@@@@@@@@@@@@@@\n"
                            + "@@@@@@@@@@@@@@@@@@@@@@@@P           5@@@@@@@^    B@@@@@!   !@:  7@~  ~@^   J@@@@@@@@@@@@@@@@@@@@@@@@\n"
                            + "@@@@@@@@@@@@@@@@@@@@@@@@P    .::::::P@@@@@@@^    B@@@@@!   !@J  .5   5@^   J@@@@@@@@@@@@@@@@@@@@@@@@\n"
                            + "@@@@@@@@@@@@@@@@@@@@@@@@P    !@&&&&&@@@@@@@@^    B@@@@@!   !@#.  .  :&@^   J@@@@@@@@@@@@@@@@@@@@@@@@\n"
                            + "@@@@@@@@@@@@@@@@@@@@@@@@P    !@@@@@@@@@@@@@@^    B@@@@@!   !@@!     J@@^   J@@@@@@@@@@@@@@@@@@@@@@@@\n"
                            + "@@@@@@@@@@@@@@@@@@@@@@@@P    !@@@@@@@@@@@@@@^    B@@@@@!   !@@G    .#@@^   J@@@@@@@@@@@@@@@@@@@@@@@@\n"
                            + "@@@@@@@@@@@@@@@@@@@@@@@@P    !@@@@@@@@@@@@@@^    B@@@@@!   !@@@^   !@@@^   J@@@@@@@@@@@@@@@@@@@@@@@@\n"
                            + "@@@@@@@@@@@@@@@@@@@@@@@@P    !@@@@@@@@@@@@@@^    B@@@@@!   !@@@5   G@@@^   J@@@@@@@@@@@@@@@@@@@@@@@@\n"
                            + "@@@@@@@@@@@@@@@@@@@@@@@@G.::.7@@@@@@@@@@@@@@~.:::B@@@@@?.:.7@@@&^.~@@@@~.:.Y@@@@@@@@@@@@@@@@@@@@@@@@\n"
                            + "@@@@@@@@@@@@@@@@@@@@@@@@@&&&&&@@@@@@@@@@@@@@&&&&&@@@@@@&&&&&@@@@&&@@@@@&&&&@@@@@@@@@@@@@@@@@@@@@@@@@\n");
                    break;

            }
        } while (entrada != 3);
    }

    static int ataqueTheo() {
        Scanner leitor = new Scanner(System.in);
        System.out.println(" Tome uma decis??o ");
        System.out.println("(1) ( ATAQUE TIPO ??GUA )");
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
                    System.out.println(" ATAQUE TIPO ??GUA\n");
                    hpMonstro -= 5;
                    System.out.println("Theo usa lembra??as da natureza. \n");

                    break;
                case 2:
                    System.out.println(" ATAQUE TIPO TERRA\n ");
                    hpTheo -= 3;
                    System.out.println(" Ataque n??o surgiu efeito e foi repelido pela criatura !\n");
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
                    System.out.println("Op????o invalida! ");
                    break;

            }
            if (hpMonstro > 0) {
                decisao = ataqueMonstro();
                switch (decisao) {
                    case 1:
                        System.out.println(" MINOTAURO USA SEU MACHADO ");
                        hpTheo -= 4;
                        System.out.println(" Voc?? senti a lamina quase perfurando a sua armadura ...\n");
                        break;
                    case 2:
                        System.out.println(" MINOTAURO USA INVESTIDA");
                        hpTheo -= 5;
                        System.out.println(
                                "Voc?? sente o impacto da critura, fazendo com que tu perca momentaneamente os seus sentidos...\n ");
                        break;
                    case 3:
                        System.out.println(" MINOTAURO USA SEUS CHIFRES");
                        hpTheo -= 8;
                        System.out.println(" Voc?? ?? arreme??ado e fica meio confuso ...\n ");

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
                    System.out.println(" ATAQUE TIPO ??GUA\n");
                    System.out.println("Ataque n??o surgiu efeito e foi repelido pela criatura !\n ");
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
                    System.out.println("Op????o invalida! ");
                    break;

            }
            if (hpMonstro > 0) {
                decisao = ataqueMonstro();
                switch (decisao) {
                    case 1:
                        System.out.println(" Equidna usa RAJADA D'??GUA ! \n");
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
                    System.out.println(" ATAQUE TIPO ??GUA\n");
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
                    System.out.println("Ataque n??o surgiu efeito e foi repelido pela criatura !\n ");
                    hpTheo -= 3;
                    break;
                case 4:
                    System.out.println("Dialogo ");
                    System.out.println("Tentativa de dialogo falhou, o Monstro te atacou\n");
                    hpTheo -= 5;
                    break;
                default:
                    System.out.println("Op????o invalida! ");
                    break;

            }
            if (hpMonstro > 0) {
                decisao = ataqueMonstro();
                switch (decisao) {
                    case 1:
                        System.out.println(" Grifo usa Rajada de Vento ...  ");
                        hpTheo -= 4;
                        System.out.println("O Grifo sobrevoa o Theo e Balan??a suas asas ... ");
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
                        System.out.println("E logo em seguida, tenta novamente...");

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

    static void returnText() throws InterruptedException {
        Timer timer = new Timer();
        System.out.println("\n Tudo come??a em uma festa no Olimpo, onde dois Deuses, ??rtemis e Ares\n "
                + "se apaixonam e acaba gerando um filho, chamado Theo.\n"
                + "Isso causa uma grande revolta em Zeus que acaba mandando o Ares para\nenfrentar os Tit??s.\n");
        Thread.sleep(3000);
        System.out.println(
                "nessa batalha contra os Tit??s, Theo acaba perdendo seu pai, com tudo, \n os Deuses"
                + " do Olimpo ficam furiosos com Zeus, para que Zeus\n n??o levasse toda a culpa, ele acaba tendo uma solu????o.");
        System.out.println("Onde ele resolve colocar Theo para assumir o lugar de seu pai.\n");
        Thread.sleep(3000);

        System.out.println(
                "Theo ainda era crian??a e precisava de treinamento para \nassumir esse grande posto,ent??o Zeus "
                + "resolve que ??rtemis dever?? ");
        System.out.println("cuidar de Theo e dar todos os ensinamentos necess??rios.\n");
        Thread.sleep(3000);
        System.out.println("S?? que ??rtemis n??o daria conta de dar todos os ensinamentos para Theo.");
        System.out.println(
                "Athena vendo toda aquela situa????o ela resolve ajudar, dando ensinamentos\n sobre estrat??gias e alguns "
                + "ensinamentos sobre Guerra.\n");
        Thread.sleep(3000);
        CarloseGu();
        System.out.println("Theo acaba passando pelo treinamento de Athena obtendo sabedoria e conhecimento\n"
                + "sobre a guerra.\n");
        System.out.println("Passar do tempo, Theo acaba recebendo seu ??ltimo treinamento de sua m??e onde ele ter?? "
                + "\nque passar por um ??ndio que tem que objetivo de usar os ensinamentos de\nAthena e aprender um pouco sobre a natureza");
        Thread.sleep(3000);

        FH();
        timer.cancel();
        System.out.println("Theo ?? chamado por Zeus para ganhar a aprova????o para se tornar um Deus.");
        System.out.println("Ele se depara com os tr??s principais Deuses como Zeus, Hades e Poseidon. \n");
        Thread.sleep(3000);
        System.out.println("-Ol?? Theo, parece que voc?? est?? pronto para passar pela aprova????o");
        System.out.println("-Voc?? enfrentar?? os tr??s grande monstro do Olimpo");
        Thread.sleep(3000);
        System.out.println("\nMinotauro que representa Hades , Equidna que representa Poseidon e Grifo que\n"
                + "representa Zeus.");
        Thread.sleep(3000);
        DesafioZeus();
        System.out.println("Parab??ns Theo, voc?? conseguiu!!");
        System.out.println("Theo se esfor??ou e se dedicou para chegar at?? aqui");
        System.out.println("Theo finalmente est?? pronto para se tornar um grande Deus.");
        timer.cancel();
    }

    static void CarloseGu() throws InterruptedException {
        Timer timer = new Timer();
        Scanner input = new Scanner(System.in);
        int grade;
        // contextualiza????o
        System.out.println("Atena, no intuito de preparar Theo, e trazer o conhecimento e sabedoria da \nguerra, "
                + "ela o leva para uma experi??ncia de guerra, onde ele iria conhecer a\n verdade sobre as guerras,"
                + "diferente da vis??o que seu pai tinha.\n"
                + "para isso, Theo ?? deixado levado ?? uma especie de bifrost, e rapidamente ?? teletransportado sozinho.");
        Thread.sleep(3000);
        // hist??ria
        System.out.println("");
        System.out.println("----- TREINAMENTO ATENA -----");
        System.out.println("");

        System.out.println(
                "Iniciando em um corredor totalmente escuro, com ru??dos de armas recarregando, \ne fuzis disparando, como se fossem"
                + "disparos de testes e avisos\n");
        Thread.sleep(3000);

        do {

            System.out.println(
                    "Theo tem 2 op????es, seguir no corredor escuro e enfrentar tudo o que pode\n acontecer, ou procurar um interruptor.\n");
            Thread.sleep(3000);
            System.out.println("Digite 1 para procurar um interruptor");
            System.out.println("Digite 2 seguir no escuro");

            grade = input.nextInt();

        } while (grade != 1 && grade != 2);

        switch (grade) {

            case 1:
                System.out.println("ao procurar o interruptor, ele (theo), encontra um tablet,"
                        + " por??m para\n desbloquea-lo ele precisa descobrir a senha de "
                        + "acesso, que ?? a resposta\n deo eniguima!\n");

                System.out.println(
                        "Qual a data de invas??o  mais recente de um pa??s pelo outro, dando inicio a uma guerra?");
                Thread.sleep(3000);
                timer.cancel();

                int diaQ1,
                 mesQ1,
                 anoQ1;
                do {
                    System.out.print("dia:");
                    diaQ1 = input.nextInt();
                    System.out.print("mes:");
                    mesQ1 = input.nextInt();
                    System.out.print("ano:");
                    anoQ1 = input.nextInt();
                    if (diaQ1 != 24 || mesQ1 != 02 || anoQ1 != 2022) {
                        System.out.println("voc?? errou, tente novamente!");
                    }
                } while (diaQ1 != 24 || mesQ1 != 02 || anoQ1 != 2022);

                System.out.println("O Theo ao conseguir desbloquear, v?? toda aquela cena de guerra,\n n??o as mais "
                        + "conhecidas, como imagem de homens fardados com armas, e sim a cena\n de uma cidade "
                        + "destru??da, com pessoas feridas, desoladas, crian??as perdidas chorando,\n in??meros "
                        + "tiroteios e bombardeios acontecendo ao redor.");
                Thread.sleep(3000);
                System.out.println("\n");
                System.out.println("DERREPENTE, ele ?? surpreendido com uma bomba de fuma??a, perde todos os seus \n"
                        + "sentidos, e acaba desmaiando.");
                Thread.sleep(3000);
                System.out.println("Tempo depois. Ele acorda sem saber onde est??, em um local "
                        + "completamente escuro.\n quando repentinamente, acende pain??is iluminando apenas as ??reas "
                        + "onde podem ser pisadas,\n mantendo a escurid??o no entorno.\n");
                Thread.sleep(3000);
                System.out.println("O Theo decide se mover pelo corredor, ao som de bombas explodindo,"
                        + " e mantendo aqueles mesmos avisos de armas! \n"
                        + "pelo caminho, ele recebe pelo tablet um "
                        + "???torpedo??? questionando se ele \nsabe onde e quando ele est???\n");
                Thread.sleep(3000);
                System.out.println("por um instante Theo n??o tem nenhuma pista de onde est??"
                        + "at?? que DERREPENTE Theo houve um barulho ensurdecedor,\n"
                        + "como nunca ningu??m ouviu antes, tudo se ilumina!\n"
                        + "uma nuvem gigante em formato de cogumelo se forma ao fundo! parece o apocalipse\n"
                        + " para fugir disso,\n ");
                Thread.sleep(3000);
                System.out.println("descubra onde e quando voc?? est??!");
                Thread.sleep(3000);
                timer.cancel();
                // onde: Hiroshima 06/08/1945;

                String onde;
                int diaQ2,
                 mesQ2,
                 anoQ2;
                do {
                    System.out.println("onde voc?? est???");
                    onde = input.next();
                    if (onde.equalsIgnoreCase("hiroshima")) {
                        System.out.println("voc?? acertou onde!");
                    } else {
                        System.out.println("voc?? ainda n??o sabe onde est??! tente novamente! (dica: bomba nuclear!");
                    }
                } while (!onde.equalsIgnoreCase("hiroshima"));
                do {
                    System.out.println("em quando voc?? est???");
                    System.out.println("dia:");
                    diaQ2 = input.nextInt();
                    System.out.println("mes:");
                    mesQ2 = input.nextInt();
                    System.out.println("ano:");
                    anoQ2 = input.nextInt();
                    if (diaQ2 == 06 || mesQ2 == 8 || anoQ2 == 1945) {
                        System.out.println("exatamente! esse foi um marco historico e mundialmente triste!");
                    } else {
                        System.out.println("ainda n??o sabe onde est??! (dica: bomba nuclear!)");
                    }

                } while (diaQ2 != 06 || mesQ2 != 8 || anoQ2 != 1945);

                System.out.println("Hiroshima foi onde explodiu a primeira bomba at??mica no mundo, seu poder para \n"
                        + "??poca era inigual??vel, nunca havia visto algo assim antes, sua explos??o dizimou cerca \n"
                        + "de 140.000 pessoas, acabando com toda uma civiliza????o) isso considerando que ?? uma \n"
                        + "bomba que explodiu em 1945, dado isso, consideramos o ano de 2022, temos bombas \n"
                        + "com poderio aproximado em 3000 X o poder da bomba de Hiroshima, ent??o sabemos \n"
                        + "que ?? uma bomba de propor????es infinitas, onde n??o existe algo que possa se livrar das \n"
                        + "consequ??ncias dessas bombas. \n"
                        + "\n"
                        + "Com esse conhecimento, sabendo de todas essas consequencias que a guerra nos tr??s,\n"
                        + "?? impossivel imaginar o anseio a tais atos!\n");
                Thread.sleep(3000);
                break;
            case 2:
                System.out.println("Theo sai correndo no escuro como se n??o houvesse amanh??, de repente come??am \n"
                        + "clar??es no c??u de misseis passando (neste momento Theo, se depara com toda aquela \n"
                        + "cena de guerra, n??o as mais conhecidas, como imagem de homens fardados com \n"
                        + "armas, e sim a cena da cidade destru??da, com pessoas feridas, desoladas, crian??as \n"
                        + "perdidas chorando, e in??meros tiroteios acontecendo ao redor.)");
                // in??cio desafio 1b
                int resposta;
                System.out.println("De repente um grupo de soldados o aborda, acreditando que Theo seja um infiltrado\n"
                        + "eles come??am a question??-lo sobre quem ele ?? e porque ele estava ali\n");
                Thread.sleep(3000);
                System.out.println("Theo fica sem rea????o e se questionando se tudo aquilo era realmente real,\n"
                        + "at?? que todos os soldados perguntam\n ");
                Thread.sleep(3000);
                System.out.println("Quem ?? o maior culpado por essa Guerra?");
                Thread.sleep(3000);
                do {
                    System.out.println(
                            " 1) Vladmir Putin\n "
                            + "2) Adolf Hitler\n "
                            + "3) Josef Stalin\n"
                            + " 4) Fidel Castro");
                    System.out.println("insira o n??mero que corresponde ?? alternativa correta");
                    resposta = input.nextInt();
                } while (resposta != 1);
                System.out.println("??timo ele n??o ?? soldado russo, deixem ele ir\n");
                System.out.println(
                        "logo ap??s, ainda muito assustado com o que estava acontecendo, Theo sai correndo novamente...");
                Thread.sleep(3000);
                System.out.println(
                        "Durante sua fuga desesperada Theo acaba se perdendo, at?? que come??am a tocar sirenes alerta de bomba\n"
                        + "Dessa mesma sirene come??a a sair uma risada diab??lica\n "
                        + "mas logo essa risada ?? ofuscada pelo som mais alto e ensurdecedor de todos,\n"
                        + "e junto desse som uma nuvem se forma no horizonte com a forma de um cogumelo.\n"
                        + "Enquanto isso Theo escuta uma voz macabra que lembrava muito a de seu pai, lhe perguntanto se sabia onde estava ");
                Thread.sleep(3000);
                int resposta2;
                System.out.println("\npara prosseguir responda onde voc?? est??");

                do {
                    System.out.println(
                            " 1) Hiroshima quando: 06/09/1950\n "
                            + "2) Nagazaki quando: 03/07/1943\n "
                            + "3) Hiroshima quando: 06/08/1945\n"
                            + " 4) Jap??o quando: 02/07/1942");
                    System.out.println("insira o n??mero que corresponde ?? alternativa correta");
                    resposta2 = input.nextInt();
                } while (resposta2 != 3);
                timer.cancel();
                System.out.println("Hiroshima foi onde explodiu a primeira bomba at??mica no mundo, seu poder para \n"
                        + "??poca era inigual??vel, nunca havia visto algo assim antes, sua explos??o dizimou cerca\n"
                        + "de 140.000 pessoas, acabando com toda uma civiliza????o) isso considerando que ?? uma \n"
                        + "bomba que explodiu em 1945, dado isso, consideramos o ano de 2022, temos bombas \n"
                        + "com poderio aproximado em 3000 X o poder da bomba de Hiroshima, ent??o sabemos \n"
                        + "que ?? uma bomba de propor????es infinitas, onde n??o existe algo que possa se livrar das \n"
                        + "consequ??ncias dessas bombas.\n");
                Thread.sleep(3000);
                break;
        }

        System.out.println("Theo recebeu por passar por esse aprendizado recebeu uma aljava de terra.");
    }

    static void FH() throws InterruptedException {
        Timer timer = new Timer();
        Scanner input = new Scanner(System.in);

        int FHvFOX = 0;
        int FHcontinua = 0;
        System.out.println("Meu filho, agora a pr??xima etapa da sua jornada ser?? relacionada a natureza!");
        System.out.println("...");
        Thread.sleep(3000);
        System.out.println("Largado por sua m??e em uma grande floresta, v??vida, com belos sons\n"
                + "de p??ssaros, arvores de v??rios tipos, galhos, arbustos, flores, e o aroma da\n"
                + "natureza.\n");
        Thread.sleep(3000);
        timer.cancel();
        System.out.println("Olhando a sua volta, observa-se uma ??rea circular bem florida com um\n"
                + "grande tronco cerrado.");
        System.out.println("Uma depress??o com plantas a borda de um bonito riacho.\n");
        String FHesc1;
        Thread.sleep(3000);
        timer.cancel();

        do {
            System.out.println("Escolha para qual lado seguir:");
            System.out.println("--Op????es...\n Tronco cerrado (Oeste/O)\n Riacho (Norte/N)");
            FHesc1 = input.next();

        } while (!FHesc1.equalsIgnoreCase("oeste") && !FHesc1.equalsIgnoreCase("norte") && !FHesc1.equalsIgnoreCase("o")
                && !FHesc1.equalsIgnoreCase("n"));

        if (FHesc1.equalsIgnoreCase("oeste") || FHesc1.equalsIgnoreCase("o")) {
            System.out.println("Chegando perto da grande ??rvore cerrada, revela-se uma raposa, branca,\n"
                    + "com olhos puxados, amarelos e contornados em vermelho.\n");
            Thread.sleep(3000);
            System.out.println("-Ol?? humano, quem ?? voc???");
            Thread.sleep(3000);
            for (int FHi = 0; FHi < 1;) {
                System.out.println(
                        "--Op????es...\n(1) Se apresentar ?? raposa.\n(2) N??o se apresentar e manter o sil??ncio.");
                int FHvCF = input.nextInt();
                switch (FHvCF) {
                    case 1:
                        System.out.println("-Que curioso! Muito prazer em te conhecer Theo!\n...");
                        Thread.sleep(3000);
                        System.out.println("-Talvez essa informa????o seja ??til para voc?? um dia, mas voc?? sabia que as\n"
                                + "??rvores costumam ser ego??sta?");
                        Thread.sleep(3000);
                        System.out.println("Ap??s dizer isso, a misteriosa raposa sai andando para longe de sua\n"
                                + "percep????o e desaparece.");
                        FHvFOX = 3; // Valor 3 significa intera????o boa com a raposa!
                        FHi = 1;
                        break;
                    case 2:

                        System.out.println("-Que ser rude voc?? ??.");
                        Thread.sleep(3000);
                        System.out.println(
                                "Com um semblante chateado, a raposa some em uma forte ventania moment??nea.\n");
                        System.out.println(
                                "Se aproximando do rio, Theo se impressiona com o quanto aparenta ser muito fundo,\n e consegue observar uma ponte, um tanto distante");
                        System.out.println("que concede para o outro lado do rio.\n");
                        Thread.sleep(3000);
                        System.out.println("Ao chegar ao meio d?? ponte, come??a uma forte ventania balan??ando a ponte,");
                        System.out.println("quando derrepente, surge a mesma raposa de antes");
                        Thread.sleep(3000);
                        FHvFOX = 2; // Valor 2 significa intera????o RUIM com a raposa!
                        FHi = 1;
                        break;
                    default:
                        System.out.println("-O que voc?? disse?");
                        break;
                }
            }

            System.out.println("Apos a intera????o com a raposa, a unica op????o de Theo ?? ir em dire????o ao norte");
            FHcontinua = 1;
            Thread.sleep(3000);
        }
        if (FHesc1.equalsIgnoreCase("norte") || FHesc1.equalsIgnoreCase("n") || FHcontinua == 1) {
            System.out.println(
                    "\nSe aproximando do rio, Theo se impressiona com o quanto aparenta ser muito fundo,\n e "
                    + "consegue observar uma ponte, um tanto distante que concede para o outro lado do rio");

            System.out
                    .println("No caminho at?? a ponte, encontra-se um ??ndio sentado como se tivesse a sua espera...\n");
            Thread.sleep(3000);
            System.out.println(
                    "-Oi Theo, voc?? precisa aprender para se tornar um grande Deus, e para isso,\n precisa passar pelos desafios a sua frente \n");
            Thread.sleep(3000);
            desafioVetor();

            System.out.println("-Parab??ns Theo, voc?? conseguiu, boa sorte na sua jornada daqui pela frente! ");
            Thread.sleep(3000);
            System.out.println("Theo est?? atravessando a ponte...");
            Thread.sleep(3000);
            if (FHvFOX == 3) {
                System.out.println("\nUm monstro mar??tmo quebra a ponte inteira e com tudo isso,");
                System.out.println("Theo ca?? na ??gua e tem de encarar o monstro!");
                Thread.sleep(3000);

            }
            if (FHvFOX == 2) {
                System.out.println("A raposa aparece em frente a ponte com um semblante dessa vez de f??ria");
                Thread.sleep(3000);
                System.out.println("-Para ser digno de se tornar um deus seria bom come??ar a ter educa????o!");
                Thread.sleep(3000);
                System.out.println("A raposa destroi a ponte com suas investidas furiosas");
                System.out.println("Theo de baixo d'??gua avista algo se aproximando");
            }

            System.out.println(
                    "Um grande peixe-gato de aparencia contradit??ria e assustradora, te convida para jogar 21");
            Thread.sleep(3000);
            Namazu21();

            System.out.println("-Muito bem Theo");
            Thread.sleep(3000);
            System.out.println("O monstro segura Theo, e o leva at?? a parte rasa do mar");

            System.out.println("\n- Agora siga em diante");
            Thread.sleep(3000);
            System.out.println("\n??rtemis, sua m??e, aparece inesperadamente.");
            Thread.sleep(3000);
            System.out.println("-Querido filho, seu treinamento acabou e voc?? conseguiu");
            System.out.println("obter os conhecimentos necess??rios, voc?? est?? pronto para o desafio final");
            System.out.println("Sua m??e acaba dando-lhe  um presente");
            Thread.sleep(3000);
            System.out.println("-Filho, esse presente que estou lhe dando, ?? para voc?? se defender do \n"
                    + "mal que aparecer na sua jornada.");

            System.out.println("Theo acaba recebendo um arco de sua M??e...");
            Thread.sleep(3000);
        }
    }

    static void desafioVetor() throws InterruptedException {
        Timer timer = new Timer();
        Scanner input = new Scanner(System.in);

        System.out.println("Para passar, s?? ?? preciso interligar cada exemplo com a sua defini????o");
        System.out.println(" NA MESMA ORDEM DESCRITA ");

        Thread.sleep(3000);
        System.out.println("---DE ACORDO COM O SEU N??MERO---");

        {
            String[] defini????o = new String[7];
            defini????o[0] = " ";
            defini????o[1] = "??gua";
            defini????o[2] = "Luz";
            defini????o[3] = "Algas";
            defini????o[4] = "Agente f??sico que permite que os       |\n|  objetos sejam vis??veis";
            defini????o[5] = "Uma subst??ncia essencial para todos    | \n|  os seres vivos do planeta ";
            defini????o[6] = "S??o respons??veis pela produ????o de      |\n|  54% do oxig??nio do mundo";

            System.out.println(" _________________________________________________________\n"
                    + "()________________________________________________________)");
            System.out.println("|    COMPLETE O EXEMPLO COM A SUA DEFINI????O:         |\n| \t \t \t \t \t \t \t  |");
            for (int i = 1; i < defini????o.length - 3; i++) {
                System.out
                        .println("|  EXEMPLO " + i + ": " + defini????o[i]
                                + "\t \t \t \t \t  |\n|    \t \t \t \t \t \t \t  | ");
            }
            System.out
                    .println("|_________________________________________________________| \n| \t \t \t \t \t \t \t  |");
            for (int i = 4; i < defini????o.length; i++) {
                System.out.println(
                        "|  DEFINI????O " + i + ": " + defini????o[i] + "\t \t \t \t  |\n| \t \t \t \t \t \t \t  |");
            }
            System.out.println("|_________________________________________________________| \n"
                    + "()________________________________________________________)");

            System.out.println("\n");
        }
        double entrada, entrada1, entrada2;

        do {
            System.out.println("Qual ?? o n??mero que atribui a defini????o do exemplo 1: ");
            entrada = input.nextDouble();
            System.out.println("Qual ?? o n??mero que atribui a defini????o do exemplo 2: ");
            entrada1 = input.nextDouble();
            System.out.println("Qual ?? o n??mero que atribui a defini???? do exemplo 3: ");
            entrada2 = input.nextDouble();
            if (entrada != 5 || entrada1 != 4 && entrada2 != 6) {
                System.out.println("TENTE NOVAMENTE");
            }
        } while (entrada != 5 || entrada1 != 4 && entrada2 != 6);
    }

    public static void rule21() {
        System.out.println("Regras do jogo");
        System.out.println("todos os jogadores receber??o 3 cartas de 1 a 10");
        System.out.println(
                "Voc?? escolhe uma das suas cartas e coloca sobre a mesa\nTodos os jogadores fazem o mesmo e compram uma carta");
        System.out
                .println(
                        "O jogador que conseguir fazer chegar exatamente a 21 ganha!\n o jogador que ultrapassar o 21 perde.");
    }

    public static void proc1() {

        System.out.println("\n==========INICIO===========");
        System.out.println("Vamos jogar 21!");
    }

    static void Namazu21() throws InterruptedException {
        Timer timer = new Timer();
        Scanner input = new Scanner(System.in);

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

                if (lose == 1) {
                    for (int o = 0; o < 20; o++) {
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
                    if (lose > 0) {
                        cMesa = 0;
                        lose = 0;
                    }
                    System.out.println("Vamos comer??ar!\nVoc?? recebe 3 cartas: ");
                    System.out.println(cartaM1 + ", " + cartaM2 + ", " + cartaM3);
                    System.out.println("Escolha entre suas cartas, qual voc?? colocara na mesa?");
                    int choic = sc.nextInt();
                    // if(choic != cartaM1 || choic != cartaM2 || choic != cartaM3){
                    // }
                    if (choic == cartaM1) {
                        entr1 = cartaM1;
                        cartaM1 = cartB1.nextInt(10) + 1;
                        System.out.println("Sua nova carta ??: " + cartaM1);
                    } else if (choic == cartaM2) {
                        entr1 = cartaM2;
                        cartaM2 = cartB1.nextInt(10) + 1;
                        System.out.println("Sua nova carta ??: " + cartaM2);
                    } else if (choic == cartaM3) {
                        entr1 = cartaM3;
                        cartaM3 = cartB1.nextInt(10) + 1;
                        System.out.println("Sua nova carta ??: " + cartaM3);
                    } else if (choic != cartaM1 || choic != cartaM2 || choic != cartaM3) {
                        System.out.println("Voc?? n??o tem esta carta e sua penalidade por tentar roubar ?? a morte.");
                        lose = 1;
                        verif = 0;
                        FHverif = 1;
                        break;
                    }

                    cMesa = cMesa + entr1;
                    win = (21 - cMesa);
                    if (cMesa >= 21) {
                        if (cMesa == 21) {
                            System.out.println("Voc?? venceu!");
                            System.out.println("\ntotal de rodadas: " + contador1);

                            lose = 0;
                            verif = 2;
                            FHverif = 2;
                            break;
                        }
                        System.out.println("Voc?? perdeu.");
                        System.out.println("\ntotal de rodadas: " + contador1);
                        lose = 1;
                        // verif = 0;
                        // FHverif = 0;
                        break;
                    }

                    System.out.println("\nContagem com a sua jogada: " + cMesa);
                    timer.cancel();

                    // config bot
                    System.out.println("Vez do monstro ...\n");
                    timer.cancel();
                    // System.out.println("cartas do bot: " + cartaY1 + " " + cartaY2 + " " +
                    // cartaY3);
                    if (contador1 == 1) {
                        if (cartaY1 >= cartaY2) {
                            if (cartaY1 == cartaY2) {
                                if (cartaY1 == 0) {
                                    cartaY1 = cartB2.nextInt(10) + 1;
                                }
                                entr2 = cartaY1;
                                cartaY1 = cartB2.nextInt(10) + 1;
                            }
                            if (cartaY1 > cartaY3) {
                                if (cartaY1 == 0) {
                                    cartaY1 = cartB2.nextInt(10) + 1;
                                }
                                entr2 = cartaY1;
                                cartaY1 = cartB2.nextInt(10) + 1;
                                // System.out.println("Nova carta do bot: " + cartaY1);
                            } else {
                                if (cartaY3 == 0) {
                                    cartaY3 = cartB2.nextInt(10) + 1;
                                }
                                entr2 = cartaY3;
                                cartaY3 = cartB2.nextInt(10) + 1;
                                // System.out.println("Nova carta do bot: " + cartaY3);
                            }
                        } else if (cartaY2 >= cartaY3) {
                            if (cartaY2 == cartaY3) {
                                if (cartaY2 == 0) {
                                    cartaY2 = cartB2.nextInt(10) + 1;
                                }
                                entr2 = cartaY2;
                                cartaY2 = cartB2.nextInt(10) + 1;
                            }
                            if (cartaY2 == 0) {
                                cartaY2 = cartB2.nextInt(10) + 1;
                            }
                            if (cartaY2 == 0) {
                                cartaY2 = cartB2.nextInt(10) + 1;
                            }
                            if (cartaY2 == 0) {
                                cartaY2 = cartB2.nextInt(10) + 1;
                            }
                            entr2 = cartaY2;
                            cartaY2 = cartB2.nextInt(10) + 1;
                            // System.out.println("Nova carta do bot: " + cartaY2);
                        }
                    } else {

                        if (cMesa + cartaY1 == 21) {
                            entr2 = cartaY1;
                            // System.out.println("Nova carta do bot:" + cartaY1);
                        } else if (cMesa + cartaY2 == 21) {
                            entr2 = cartaY2;
                            // System.out.println("Nova carta do bot:" + cartaY2);
                        } else if (cMesa + cartaY3 == 21) {
                            entr2 = cartaY3;
                            // System.out.println("Nova carta do bot:" + cartaY3);
                        } else {
                            if (cartaY1 <= cartaY2) {
                                if (cartaY1 == cartaY2) {
                                    entr2 = cartaY2;
                                    cartaY2 = cartB2.nextInt(10) + 1;
                                }
                                if (cartaY1 <= cartaY3) {
                                    entr2 = cartaY1;
                                    cartaY1 = cartB2.nextInt(10) + 1;
                                    // System.out.println("Nova carta do bot: " + cartaY1);

                                } else if (cartaY2 <= cartaY1) {
                                    if (cartaY2 <= cartaY3) {
                                        entr2 = cartaY2;
                                        cartaY2 = cartB2.nextInt(10) + 1;
                                        // System.out.println("Nova carta do bot: " + cartaY2);
                                    }
                                } else if (cartaY3 <= cartaY1) {
                                    if (cartaY3 <= cartaY2) {
                                        entr2 = cartaY3;
                                        cartaY3 = cartB2.nextInt(10) + 1;
                                        // System.out.println("Nova carta do bot: " + cartaY3);
                                    }
                                }

                            }
                        }
                    }
                    Thread.sleep(3000);
                    System.out.println("O monstro jogou a carta: " + entr2);
                    timer.cancel();

                    contador1++;

                    cMesa = cMesa + entr2;
                    win = (21 - cMesa);

                    System.out.println("\ncontagem com a jogada do monstro: " + cMesa);
                    if (cMesa >= 21) {
                        if (cMesa == 21) {
                            System.out.println("Monstro wins!");
                            System.out.println("total de rodadas: " + contador1);
                            verif = 2;
                            lose = 1;
                            FHverif = 2;
                            break;
                        }
                        System.out.println("Monstro perdeu.");
                        System.out.println("total de rodadas: " + contador1);
                        System.out.println("O MONSTRO TE ENTREGA UM ALJAVA DE ??GUA\n");
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
                    }
                }

                System.out.println("Fim do jogo.");

            }
        } while (lose != 0);
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

    static void DesafioZeus() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("____________Desafio de ZEUS____________");
        System.out.println("Neste desafio lutara contra 3 criaturas!");
        System.out.println("Regras da batalha se voce derrotar uma critaura poderar seguir em frete caso contrario deve lutar novamente!");
        System.out.println("Boa sorte ! ");

        int a = 1;
        int b = 1;
        int c = 1;

        while (a == 1) {

            fightMinotauro();

            System.out.println(" Fim ! (1) Para Lutar novamente (2) Para seguir  ");
            a = leitor.nextInt();
        }
        while (b == 1) {

            fightEquidna();

            System.out.println(" Fim ! (1) Para Lutar novamente (2) Para seguir  ");
            b = leitor.nextInt();
        }

        while (c == 1) {

            fightGrifo();

            System.out.println(" Fim ! (1) Para Lutar novamente (2) Para seguir  ");
            c = leitor.nextInt();

        }

    }

}
