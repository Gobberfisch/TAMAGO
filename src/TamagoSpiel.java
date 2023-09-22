import java.util.Scanner;


public class TamagoSpiel {

    public static void main(String[] args) throws InterruptedException {

        //Startbildschirm
        clearScreen(5);
        System.out.println("""
                ,---------.    ____    ,---.    ,---.   ____      .-_'''-.       ,-----.    \s
                \\          \\ .'  __ `. |    \\  /    | .'  __ `.  '_( )_   \\    .'  .-,  '.  \s
                 `--.  ,---'/   '  \\  \\|  ,  \\/  ,  |/   '  \\  \\|(_ o _)|  '  / ,-.|  \\ _ \\ \s
                    |   \\   |___|  /  ||  |\\_   /|  ||___|  /  |. (_,_)/___| ;  \\  '_ /  | :\s
                    :_ _:      _.-`   ||  _( )_/ |  |   _.-`   ||  |  .-----.|  _`,/ \\ _/  |\s
                    (_I_)   .'   _    || (_ o _) |  |.'   _    |'  \\  '-   .': (  '\\_/ \\   ;\s
                   (_(=)_)  |  _( )_  ||  (_,_)  |  ||  _( )_  | \\  `-'`   |  \\ `"/  \\  ) / \s
                    (_I_)   \\ (_ o _) /|  |      |  |\\ (_ o _) /  \\        /   '. \\_/``".'  \s
                    '---'    '.(_,_).' '--'      '--' '.(_,_).'    `'-...-'      '-----'    \s
                                                                                            \s
        """);
        clearScreen(5);

        System.out.println("WÄHLE DEINE KLASSE");
        System.out.println("1: BERSERKER");
        System.out.println("2: RITTER");
        System.out.println("3. MAGIER");
        System.out.println("(Zahl von 1-3 eingeben)");


        //Klassenwahl
        //EXCEPTION HANDLER BEI INPUT
        Scanner scanner = new Scanner(System.in);
        int inputKlasse = 0;

        while (true) {
            try {
                inputKlasse = scanner.nextInt();

                if (inputKlasse == 0 || inputKlasse > 3) {
                    System.out.println("WÄHLE DEINE KLASSE");
                    System.out.println("1: BERSERKER");
                    System.out.println("2: RITTER");
                    System.out.println("3. MAGIER");
                    System.out.println("(Zahl von 1-3 eingeben)");
                } else {
                    break;  // verlässt die Schleife, wenn die Eingabe korrekt ist
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("NUMMERN BITTE!");
                scanner.nextLine();  // klärt den Eingabepuffer
            }
        }

        if (inputKlasse == 1){
            //Berserker
            clearScreen(20);
            System.out.println("""
                    ██████╗ ███████╗██████╗ ███████╗███████╗██████╗ ██╗  ██╗███████╗██████╗
                    ██╔══██╗██╔════╝██╔══██╗██╔════╝██╔════╝██╔══██╗██║ ██╔╝██╔════╝██╔══██╗
                    ██████╔╝█████╗  ██████╔╝███████╗█████╗  ██████╔╝█████╔╝ █████╗  ██████╔╝
                    ██╔══██╗██╔══╝  ██╔══██╗╚════██║██╔══╝  ██╔══██╗██╔═██╗ ██╔══╝  ██╔══██╗
                    ██████╔╝███████╗██║  ██║███████║███████╗██║  ██║██║  ██╗███████╗██║  ██║
                    ╚═════╝ ╚══════╝╚═╝  ╚═╝╚══════╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝
                                                         """);
            Thread.sleep(2000);

        } else if (inputKlasse == 2){
            //Ritter
            clearScreen(20);
            System.out.println(""" 
                     ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄\s
                    ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌
                    ▐░█▀▀▀▀▀▀▀█░▌ ▀▀▀▀█░█▀▀▀▀  ▀▀▀▀█░█▀▀▀▀  ▀▀▀▀█░█▀▀▀▀ ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌
                    ▐░▌       ▐░▌     ▐░▌          ▐░▌          ▐░▌     ▐░▌          ▐░▌       ▐░▌
                    ▐░█▄▄▄▄▄▄▄█░▌     ▐░▌          ▐░▌          ▐░▌     ▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌
                    ▐░░░░░░░░░░░▌     ▐░▌          ▐░▌          ▐░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌
                    ▐░█▀▀▀▀█░█▀▀      ▐░▌          ▐░▌          ▐░▌     ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀█░█▀▀\s
                    ▐░▌     ▐░▌       ▐░▌          ▐░▌          ▐░▌     ▐░▌          ▐░▌     ▐░▌ \s
                    ▐░▌      ▐░▌  ▄▄▄▄█░█▄▄▄▄      ▐░▌          ▐░▌     ▐░█▄▄▄▄▄▄▄▄▄ ▐░▌      ▐░▌\s
                    ▐░▌       ▐░▌▐░░░░░░░░░░░▌     ▐░▌          ▐░▌     ▐░░░░░░░░░░░▌▐░▌       ▐░▌
                     ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀       ▀            ▀       ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀\s
                                                                                                 \s
                    """);
            Thread.sleep(2000);

        } else {
            //Magier
            clearScreen(20);
            System.out.println(""" 
                    • ▌ ▄ ·.  ▄▄▄·  ▄▄ • ▪  ▄▄▄ .▄▄▄ \s
                    ·██ ▐███▪▐█ ▀█ ▐█ ▀ ▪██ ▀▄.▀·▀▄ █·
                    ▐█ ▌▐▌▐█·▄█▀▀█ ▄█ ▀█▄▐█·▐▀▀▪▄▐▀▀▄\s
                    ██ ██▌▐█▌▐█ ▪▐▌▐█▄▪▐█▐█▌▐█▄▄▌▐█•█▌
                    ▀▀  █▪▀▀▀ ▀  ▀ ·▀▀▀▀ ▀▀▀ ▀▀▀ .▀  ▀
                    """);
            Thread.sleep(2000);
        }

        //Tamago erstellen
        Tamago Tamago1 = new Tamago();

        //Spieler in Klasse erstellen
        Spieler Spieler1 = new Spieler(inputKlasse);


        //TODO
        //Gibt die Klasse des Spielers zurück
        //System.out.println(Spieler1.getKlasse());
        //TODO _________________________


        //LEBEN AUSGABE
        System.out.println("LEBEN     "+ Spieler1.getLeben() + "/100 ");
        System.out.print("[");
        for (int i = 0 ; i < (Spieler1.getLeben()/10); i++){
            System.out.print("▓");
        }
        System.out.print("] ");
        System.out.println();

        //ZWEITEZEILE AUSGABE
        System.out.println( Spieler1.getLeisteZwei() + Spieler1.getleisteZweiWert() + "/" + Spieler1.getLeisteZweiMax());
        System.out.print("[");
        for (int i = 0 ; i < (Spieler1.getleisteZweiWert()/10); i++) {
            System.out.print("▓");
        }
        System.out.print("] ");
        System.out.println();
        Thread.sleep(2000);

        //TAMAGO START
        clearScreen(3);
        System.out.println("       .-[][][]-.               ");
        System.out.println("      /   o  o   \\             ");
        System.out.println("     /|    --    |\\            ");
        System.out.println("    //|          |\\\\          ");
        System.out.println("   // \\__________/ \\\\        ");
        System.out.println("  //   '--------'   \\\\        ");
        System.out.println("(__)    _/    \\_    (__)       ");
        System.out.println();

        //LEBEN AUSGABE
        System.out.println("TAMAGO    "+ Tamago1.getLeben() + "/100 ");
        System.out.print("[");
        for (int i = 0 ; i < (Tamago1.getLeben()/10); i++){
            System.out.print("▓");
        }
        System.out.print("] ");
        System.out.println();
        System.out.println();

        //Spiellogik
        int tempPlayerInput = 0;
        while (Spieler1.getLeben() > 0 && Tamago1.getLeben() > 0) {

            //Kampfeingabe
            Thread.sleep(2000);
            System.out.println("Wähle deinen Angriff:");
            System.out.println("1: normal");
            System.out.println("2: SPECIAL");
            System.out.println("3. U L T R A");

            //EceptionHandler
            scanner = new Scanner(System.in);

            try {
                tempPlayerInput = scanner.nextInt();

                if (tempPlayerInput == 0 || tempPlayerInput > 3) {
                    clearScreen(20);
                    System.out.println("Wähle deinen Angriff:");
                    System.out.println("1: normal");
                    System.out.println("2: SPECIAL");
                    System.out.println("3. U L T R A");
                } else {

                }

            } catch (java.util.InputMismatchException e) {
                clearScreen(20);
                System.out.println("NUMMERN BITTE!");
                scanner.nextLine();  // klärt den Eingabepuffer
                tempPlayerInput = 0; //damit kein Angriff ausgewählt werden kann

            }


            System.out.println();

            //Schadensberechnung Tamago
            if (tempPlayerInput == 1) {
                //Spieler greift Tamago normal an
                clearScreen(30);
                System.out.println("""
                                    ___                        _  __     _     _____                                                                     _              \s
                                   /   \\_   _    __ _ _ __ ___(_)/ _|___| |_  /__   \\__ _ _ __ ___   __ _  __ _  ___    _ __   ___  _ __ _ __ ___   __ _| |   __ _ _ __ \s
                                  / /\\ / | | |  / _` | '__/ _ \\ | |_/ __| __|   / /\\/ _` | '_ ` _ \\ / _` |/ _` |/ _ \\  | '_ \\ / _ \\| '__| '_ ` _ \\ / _` | |  / _` | '_ \\\s
                                 / /_//| |_| | | (_| | | |  __/ |  _\\__ \\ |_   / / | (_| | | | | | | (_| | (_| | (_) | | | | | (_) | |  | | | | | | (_| | | | (_| | | | |
                                /___,'  \\__,_|  \\__, |_|  \\___|_|_| |___/\\__|  \\/   \\__,_|_| |_| |_|\\__,_|\\__, |\\___/  |_| |_|\\___/|_|  |_| |_| |_|\\__,_|_|  \\__,_|_| |_|
                                                |___/                                                     |___/                                                         \s
                        """);
                Thread.sleep(2000);
                System.out.println();
                System.out.println("       .-[][][]-.               ");
                System.out.println("      /   >  <   \\             ");
                System.out.println("     /|    --    |\\            ");
                System.out.println("    //|          |\\\\          ");
                System.out.println("   // \\__________/ \\\\        ");
                System.out.println("  //   '--------'   \\\\        ");
                System.out.println("(__)    _/    \\_    (__)       ");
                System.out.println();
                Thread.sleep(2000);




                Tamago1.receiveBasicAttack();
                if (Tamago1.getLeben() > 0) {
                    //LEBEN AUSGABE
                    System.out.println("TAMAGO    "+ Tamago1.getLeben() + "/100 ");
                    System.out.print("[");
                    for (int i = 0 ; i < (Tamago1.getLeben()/10); i++){
                        System.out.print("▓");
                    }
                    System.out.print("] ");
                    System.out.println();
                    System.out.println();
                }

            } else if (tempPlayerInput == 2) {
                //Spieler greift Tamago mit Spezial an
                clearScreen(30);
                System.out.println("""
                            ____                           _ ______     ______                                               _ __     _____ ____  ___________________    __                \s
                           / __ \\__  __   ____ _________  (_) __/ /_   /_  __/___ _____ ___  ____ _____ _____     ____ ___  (_) /_   / ___// __ \\/ ____/ ____/  _/   |  / /      ____ _____\s
                          / / / / / / /  / __ `/ ___/ _ \\/ / /_/ __/    / / / __ `/ __ `__ \\/ __ `/ __ `/ __ \\   / __ `__ \\/ / __/   \\__ \\/ /_/ / __/ / /    / // /| | / /      / __ `/ __ \\
                         / /_/ / /_/ /  / /_/ / /  /  __/ / __/ /_     / / / /_/ / / / / / / /_/ / /_/ / /_/ /  / / / / / / / /_    ___/ / ____/ /___/ /____/ // ___ |/ /___   / /_/ / / / /
                        /_____/\\__,_/   \\__, /_/   \\___/_/_/  \\__/    /_/  \\__,_/_/ /_/ /_/\\__,_/\\__, /\\____/  /_/ /_/ /_/_/\\__/   /____/_/   /_____/\\____/___/_/  |_/_____/   \\__,_/_/ /_/\s
                                       /____/                                                   /____/                                                                                     \s
                        """);
                Thread.sleep(2000);
                System.out.println();
                System.out.println("       .-[][][]-.               ");
                System.out.println("      /   >  <   \\             ");
                System.out.println("     /|   ]==[   |\\            ");
                System.out.println("    //|          |\\\\          ");
                System.out.println("   // \\__________/ \\\\        ");
                System.out.println("  //   '--------'   \\\\        ");
                System.out.println("(__)    _/    \\_    (__)       ");
                System.out.println();
                Thread.sleep(2000);




                Tamago1.receiveSpecialAttack();
                if (Tamago1.getLeben() > 0) {
                    //LEBEN AUSGABE
                    System.out.println("TAMAGO    "+ Tamago1.getLeben() + "/100 ");
                    System.out.print("[");
                    for (int i = 0 ; i < (Tamago1.getLeben()/10); i++){
                        System.out.print("▓");
                    }
                    System.out.print("] ");
                    System.out.println();
                    System.out.println();
                }
            }

            else if (tempPlayerInput == 3){
                //Spieler greift Tamago mit Spezial an
                clearScreen(30);
                System.out.println("""
                         (                                                                                                     (               (                           \s
                         )\\ )                          (       )    *   )                                          )           )\\ )    *   )   )\\ )     (                  \s
                        (()/(    (    (  ( (     (  (  )\\ ) ( /(  ` )  /(   )    )      ) (  (          )    (  ( /(      (   (()/(  ` )  /(  (()/(     )\\         )       \s
                         /(_))  ))\\   )\\))()(   ))\\ )\\(()/( )\\())  ( )(_)| /(   (    ( /( )\\))( (      (     )\\ )\\())     )\\   /(_))  ( )(_))  /(_)) ((((_)(    ( /(  (    \s
                        (_))_  /((_) ((_))(()\\ /((_|(_)/(_)|_))/  (_(_()))(_))  )\\  ')(_)|(_))\\ )\\     )\\  '((_|_))/   _ ((_) (_))   (_(_())  (_))    )\\ _ )\\   )(_)) )\\ ) \s
                         |   \\(_))(   (()(_|(_|_))  (_|_) _| |_   |_   _((_)_ _((_))((_)_ (()(_|(_)  _((_))  (_) |_   | | | | | |    |_   _|  | _ \\   (_)_\\(_) ((_)_ _(_/( \s
                         | |) | || | / _` | '_/ -_) | ||  _|  _|    | | / _` | '  \\() _` / _` / _ \\ | '  \\() | |  _|  | |_| | | |__    | |    |   /    / _ \\   / _` | ' \\))\s
                         |___/ \\_,_| \\__, |_| \\___| |_||_|  \\__|    |_| \\__,_|_|_|_|\\__,_\\__, \\___/ |_|_|_|  |_|\\__|   \\___/  |____|   |_|    |_|_\\   /_/ \\_\\  \\__,_|_||_| \s
                                     |___/                                               |___/                                                                             \s
                        """);
                Thread.sleep(2000);
                System.out.println();
                System.out.println("       .-[][][]-.               ");
                System.out.println("      /   x  X   \\             ");
                System.out.println("     /|   (__[   |\\            ");
                System.out.println("    //|          |\\\\          ");
                System.out.println("   // \\__________/ \\\\        ");
                System.out.println("  //   '--------'   \\\\        ");
                System.out.println("(__)    _/    \\_    (__)       ");
                System.out.println();
                Thread.sleep(2000);



                Tamago1.receiveUltraAttack();
                if (Tamago1.getLeben() > 0) {
                    //LEBEN AUSGABE
                    System.out.println("TAMAGO    "+ Tamago1.getLeben() + "/100 ");
                    System.out.print("[");
                    for (int i = 0 ; i < (Tamago1.getLeben()/10); i++){
                        System.out.print("▓");
                    }
                    System.out.print("] ");
                    System.out.println();
                    System.out.println();
                }
            }

            Thread.sleep(3000);

            //Tamago wählt Attacke
            int tamagoattack = Spieler1.genRandomAttack() + 1;

            //Schadensberechnung Tamago
            if (tamagoattack == 1) {
                //Tamago greift Spieler normal an
                //clearScreen(5);
                System.out.println("""
                         _____                                                   _  __ _         _ _      _                                        _              \s
                        /__   \\__ _ _ __ ___   __ _  __ _  ___     __ _ _ __ ___(_)/ _| |_    __| (_) ___| |__    _ __   ___  _ __ _ __ ___   __ _| |   __ _ _ __ \s
                          / /\\/ _` | '_ ` _ \\ / _` |/ _` |/ _ \\   / _` | '__/ _ \\ | |_| __|  / _` | |/ __| '_ \\  | '_ \\ / _ \\| '__| '_ ` _ \\ / _` | |  / _` | '_ \\\s
                         / / | (_| | | | | | | (_| | (_| | (_) | | (_| | | |  __/ |  _| |_  | (_| | | (__| | | | | | | | (_) | |  | | | | | | (_| | | | (_| | | | |
                         \\/   \\__,_|_| |_| |_|\\__,_|\\__, |\\___/   \\__, |_|  \\___|_|_|  \\__|  \\__,_|_|\\___|_| |_| |_| |_|\\___/|_|  |_| |_| |_|\\__,_|_|  \\__,_|_| |_|
                                                    |___/         |___/                                                                                           \s
                        """);
                Thread.sleep(2000);
                System.out.println();
                System.out.println("       .-[][][]-.                       ");
                System.out.println("      /   >  <   \\                     ");
                System.out.println("     /|    --    |========(__)          ");
                System.out.println("    //|          |                      ");
                System.out.println("   // \\__________/                     ");
                System.out.println("  //   '--------'                       ");
                System.out.println("(__)    _/    \\_                       ");
                System.out.println();
                Thread.sleep(2000);



                Spieler1.receiveBasicAttack();
                if (Tamago1.getLeben() > 0) {
                    //LEBEN AUSGABE
                    System.out.println("LEBEN     "+ Spieler1.getLeben() + "/100 ");
                    System.out.print("[");
                    for (int i = 0 ; i < (Spieler1.getLeben()/10); i++){
                        System.out.print("▓");
                    }
                    System.out.print("] ");
                    System.out.println();

                    //ZWEITEZEILE AUSGABE
                    System.out.println( Spieler1.getLeisteZwei() + Spieler1.getleisteZweiWert() + "/" + Spieler1.getLeisteZweiMax());
                    System.out.print("[");
                    for (int i = 0 ; i < (Spieler1.getleisteZweiWert()/10); i++) {
                        System.out.print("▓");
                    }
                    System.out.print("] ");
                    System.out.println();
                    System.out.println();
                }

            } else if (tamagoattack == 2) {
                //Tamago greift Spieler mit Spezial an
                //clearScreen(5);
                System.out.println("""
                          ______                                                     _ ______         ___      __                 _ __     _____ ____  ___________________    __                \s
                         /_  __/___ _____ ___  ____ _____ _____     ____ _________  (_) __/ /_   ____/ (_)____/ /_     ____ ___  (_) /_   / ___// __ \\/ ____/ ____/  _/   |  / /      ____ _____\s
                          / / / __ `/ __ `__ \\/ __ `/ __ `/ __ \\   / __ `/ ___/ _ \\/ / /_/ __/  / __  / / ___/ __ \\   / __ `__ \\/ / __/   \\__ \\/ /_/ / __/ / /    / // /| | / /      / __ `/ __ \\
                         / / / /_/ / / / / / / /_/ / /_/ / /_/ /  / /_/ / /  /  __/ / __/ /_   / /_/ / / /__/ / / /  / / / / / / / /_    ___/ / ____/ /___/ /____/ // ___ |/ /___   / /_/ / / / /
                        /_/  \\__,_/_/ /_/ /_/\\__,_/\\__, /\\____/   \\__, /_/   \\___/_/_/  \\__/   \\__,_/_/\\___/_/ /_/  /_/ /_/ /_/_/\\__/   /____/_/   /_____/\\____/___/_/  |_/_____/   \\__,_/_/ /_/\s
                                                  /____/         /____/                                                                                                                         \s
                        """);
                Thread.sleep(2000);
                System.out.println();
                System.out.println("       .-[][][]-.              ");
                System.out.println("      /   >  <   \\         __,_______          ");
                System.out.println("     /|   ]==[   |========/  __.==--\"     ");
                System.out.println("    //|          |       /#(-'          ");
                System.out.println("   // \\__________/       `-'        ");
                System.out.println("  //   '--------'                       ");
                System.out.println("(__)    _/    \\_                       ");
                System.out.println();
                Thread.sleep(2000);



                Spieler1.receiveSpecialAttack();
                if (Tamago1.getLeben() > 0) {
                    //LEBEN AUSGABE
                    System.out.println("LEBEN     "+ Spieler1.getLeben() + "/100 ");
                    System.out.print("[");
                    for (int i = 0 ; i < (Spieler1.getLeben()/10); i++){
                        System.out.print("▓");
                    }
                    System.out.print("] ");
                    System.out.println();

                    //ZWEITEZEILE AUSGABE
                    System.out.println( Spieler1.getLeisteZwei() + Spieler1.getleisteZweiWert() + "/" + Spieler1.getLeisteZweiMax());
                    System.out.print("[");
                    for (int i = 0 ; i < (Spieler1.getleisteZweiWert()/10); i++) {
                        System.out.print("▓");
                    }
                    System.out.print("] ");
                    System.out.println();
                    System.out.println();
                }
            }

            else if (tamagoattack == 3){
                //Tamago greift Spieler mit Spezial an
                //clearScreen(5);
                System.out.println("""
                                                                                                                                      (               (                           \s
                          *   )                                             (       )    (              )                 )           )\\ )    *   )   )\\ )     (                  \s
                        ` )  /(   )    )      ) (  (       (  ( (     (  (  )\\ ) ( /(    )\\ ) (      ( /(      )    (  ( /(      (   (()/(  ` )  /(  (()/(     )\\         )       \s
                         ( )(_)| /(   (    ( /( )\\))( (    )\\))()(   ))\\ )\\(()/( )\\())  (()/( )\\  (  )\\())    (     )\\ )\\())     )\\   /(_))  ( )(_))  /(_)) ((((_)(    ( /(  (    \s
                        (_(_()))(_))  )\\  ')(_)|(_))\\ )\\  ((_))(()\\ /((_|(_)/(_)|_))/    ((_)|(_) )\\((_)\\     )\\  '((_|_))/   _ ((_) (_))   (_(_())  (_))    )\\ _ )\\   )(_)) )\\ ) \s
                        |_   _((_)_ _((_))((_)_ (()(_|(_)  (()(_|(_|_))  (_|_) _| |_     _| | (_)((_) |(_)  _((_))  (_) |_   | | | | | |    |_   _|  | _ \\   (_)_\\(_) ((_)_ _(_/( \s
                          | | / _` | '  \\() _` / _` / _ \\ / _` | '_/ -_) | ||  _|  _|  / _` | | / _|| ' \\  | '  \\() | |  _|  | |_| | | |__    | |    |   /    / _ \\   / _` | ' \\))\s
                          |_| \\__,_|_|_|_|\\__,_\\__, \\___/ \\__, |_| \\___| |_||_|  \\__|  \\__,_| |_\\__||_||_| |_|_|_|  |_|\\__|   \\___/  |____|   |_|    |_|_\\   /_/ \\_\\  \\__,_|_||_| \s
                                               |___/      |___/                                                                                                                   \s
                        """);
                Thread.sleep(2000);
                System.out.println();
                System.out.println("       .-[][][]-.________________,          ");
                System.out.println("      /   >  <   \\___________/   \\               ");
                System.out.println("     /|   ]==[   |__________|     |");
                System.out.println("    //|          |___________\\___/           ");
                System.out.println("   // \\__________/                     ");
                System.out.println("  //   '--------'                       ");
                System.out.println("(__)    _/    \\_                       ");
                System.out.println();
                Thread.sleep(2000);


                Tamago1.receiveUltraAttack();
                if (Spieler1.getLeben() > 0) {
                    //LEBEN AUSGABE
                    System.out.println("LEBEN     "+ Spieler1.getLeben() + "/100 ");
                    System.out.print("[");
                    for (int i = 0 ; i < (Spieler1.getLeben()/10); i++){
                        System.out.print("▓");
                    }
                    System.out.print("] ");
                    System.out.println();

                    //ZWEITEZEILE AUSGABE
                    System.out.println( Spieler1.getLeisteZwei() + Spieler1.getleisteZweiWert() + "/" + Spieler1.getLeisteZweiMax());
                    System.out.print("[");
                    for (int i = 0 ; i < (Spieler1.getleisteZweiWert()/10); i++) {
                        System.out.print("▓");
                    }
                    System.out.print("] ");
                    System.out.println();
                    System.out.println();
                }
            }





            //Endbedingungen
            if (Spieler1.getLeben() <= 0) {
                clearScreen(20);
                System.out.println("Du hast kein Leben mehr");
                System.out.println("""
                         ▄▀▀▄ ▀▀▄  ▄▀▀▀▀▄   ▄▀▀▄ ▄▀▀▄      ▄▀▀▀▀▄    ▄▀▀▀▀▄   ▄▀▀▀▀▄   ▄▀▀▀▀▄  ▄▀▀█▄▄▄▄\s
                        █   ▀▄ ▄▀ █      █ █   █    █     █    █    █      █ █      █ █ █   ▐ ▐  ▄▀   ▐\s
                        ▐     █   █      █ ▐  █    █      ▐    █    █      █ █      █    ▀▄     █▄▄▄▄▄ \s
                              █   ▀▄    ▄▀   █    █           █     ▀▄    ▄▀ ▀▄    ▄▀ ▀▄   █    █    ▌ \s
                            ▄▀      ▀▀▀▀      ▀▄▄▄▄▀        ▄▀▄▄▄▄▄▄▀ ▀▀▀▀     ▀▀▀▀    █▀▀▀    ▄▀▄▄▄▄  \s
                            █                               █                          ▐       █    ▐  \s
                            ▐                               ▐                                  ▐       \s
                        """);
                return ;
            } else if (Tamago1.getLeben() <= 0) {


                clearScreen(20);
                System.out.println("       .-[][][]-.               ");
                Thread.sleep(500);
                System.out.println("      /   X  X   \\             ");
                Thread.sleep(500);
                System.out.println("      |   ____   |              ");
                Thread.sleep(500);
                System.out.println("      |          |            ");
                Thread.sleep(500);
                System.out.println("      \\__________/           ");
                Thread.sleep(500);
                System.out.println("       '--------'             ");
                Thread.sleep(500);
                System.out.println("        _/    \\_               ");
                Thread.sleep(500);
                clearScreen(3);


                System.out.println("Tamago hat kein Leben mehr");
                return ;
            }


        }





    }

    private static void clearScreen(int j) {
        for (int i = 0 ; i < j ; i++){
            System.out.println();
        }
        return;
    }


}