package main;

import java.util.Scanner;

public class Main {

    public static final String[] roles = new String[6];
    public static final String[] persons = new String[6];
    public static final String[] situations = new String[10];
    public static final String[] psicologicMechanism = new String[10];
    public static final String[] technologicMechanism = new String[10];
    public static final String[] chemicalMechanism = new String[10];
    public static final String[] somaticMechanism = new String[10];
    public static final String[] sublimeMechanism = new String[10];

    public static void main(String[] args) {
        initVariables();
        showMenu();
    }

    public static void initGame(){
        System.out.println(getRandomPerson());
    }

    public static void initVariables(){
        initPersons();
        initRoles();
    }

    public static void initRoles(){
        roles[0] = "Chefe";
        roles[1] = "Funcionário da limpeza";
        roles[2] = "Colega do trabalho";
        roles[3] = "Colega Invejoso";
        roles[4] = "Secretária";
        roles[5] = "Segurança";
    }

    public static void initPersons(){
        persons[0] = "Álvaro";
        persons[1] = "Aline";
        persons[2] = "Gabriel";
        persons[3] = "Rafael";
        persons[4] = "Cainã";
        persons[5] = "Marília";
    }

    public static String getRandomPerson(){
        int randomPersonIndex = (int)(Math.random() * 5);
        int randomRoleIndex = (int)(Math.random() * 5);
        return persons[randomPersonIndex] + " - " + roles[randomRoleIndex];
    }

    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        String menuLogo = "\n" +
                "                                                                   __ \n" +
                " _______     _______.___________.    ___       _______  __       _/_/     .______       __    ______   \n" +
                "|   ____|   /       |           |   /   \\     /  _____||  |     /   \\     |   _  \\     |  |  /  __  \\  \n" +
                "|  |__     |   (----`---|  |----`  /  ^  \\   |  |  __  |  |    /  ^  \\    |  |_)  |    |  | |  |  |  | \n" +
                "|   __|     \\   \\       |  |      /  /_\\  \\  |  | |_ | |  |   /  /_\\  \\   |      /     |  | |  |  |  | \n" +
                "|  |____.----)   |      |  |     /  _____  \\ |  |__| | |  |  /  _____  \\  |  |\\  \\----.|  | |  `--'  | \n" +
                "|_______|_______/       |__|    /__/     \\__\\ \\______| |__| /__/     \\__\\ | _| `._____||__|  \\______/  \n" +
                "                                                ____    __    ____  ___      .______          _______. \n" +
                "                                                \\   \\  /  \\  /   / /   \\     |   _  \\        /       | \n" +
                "    (1) - Instruções                             \\   \\/    \\/   / /  ^  \\    |  |_)  |      |   (----` \n" +
                "    (2) - Jogar                                   \\            / /  /_\\  \\   |      /        \\   \\     \n" +
                "    (3) - Créditos                                 \\    /\\    / /  _____  \\  |  |\\  \\----.----)   |    \n" +
                "    (4) - Sair                                      \\__/  \\__/ /__/     \\__\\ | _| `._____|_______/     \n" +
                "                                                                                                           \n";
        int choice;
        do{
            System.out.println(menuLogo);
            System.out.println("Digite a opção desejada: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("\nBem vindo as instruções do jogo\n");
                    break;
                case 2:
                    initGame();
                    break;
                case 3:
                    System.out.println("\nCréditos:\n Rafael Freitas\n");
                    break;
                case 4:
                    System.out.println("\nVocê saiu do jogo... Até a próxima!\n");
                    break;

            }
        } while(choice != 4);
    }
}