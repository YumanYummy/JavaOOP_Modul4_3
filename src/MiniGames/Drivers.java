package MiniGames;
import  java.util.Scanner;


public class Drivers {
    static int Select, Levelss1, Levelss2;
    static Assasin Hyper = new Assasin();
    static Mage  mid = new Mage();
    static Tank roam = new Tank();
    static Versus vs = null;

    enum Versus{
        ASSASINVSMAGE,
        ASSASINVSTANK,
        MAGEVSTANK,
    }

    public static void Menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Select Role To Fight 1 vs 1\n" +
                "1. Assasin vs Mage\n" +
                "2. Assasin vs Tank\n" +
                "3. Mage vs Tank\n" );
        System.out.print("Select Menu: ");
        Select = input.nextInt();
        System.out.print("Select Player 1 Level : ");
        Levelss1 = input.nextInt();
        System.out.print("Select Player 2 Level : ");
        Levelss2 = input.nextInt();
    }


    public static void GameStart(){
        int quarter = 0;

        if(Select == 1){
            vs = Versus.ASSASINVSMAGE;

            Hyper.HeroIntro(); Hyper.Level(Levelss1);
            Hyper.CheckStatus(Levelss1,"Assasin");
            System.out.println();
            mid.HeroIntro(); mid.Level(Levelss2);
            mid.CheckStatus(Levelss2,"Mage");
            System.out.println();
            do {
                quarter++;
                System.out.printf("===== Round %d ===== \n",quarter);

                //Player 1 Attack
                if(Hyper.isStats()){
                    Hyper.Attack("Assasin",
                            "Mage",
                            Hyper.getattDamage(),
                            mid.getDeff(),  mid.getHealthPoint());
                    mid.setHealthPoint(Hyper.FixHP);

                    if(mid.getHealthPoint() <= 0){
                        mid.setStats(false);
                    }
                }

                //Player 2 Attack
                if(mid.isStats()){
                    mid.Attack("Mage",
                            "Assasin",
                            mid.getattDamage(),
                            Hyper.getDeff(), Hyper.getHealthPoint());
                    Hyper.setHealthPoint(mid.FixHP);
                    if(Hyper.getHealthPoint() <= 0 ){
                        Hyper.setStats(false);
                    }
                }
            }while (Hyper.isStats() && mid.isStats());
            Result();
        }
        else if(Select == 2){
            vs = Versus.ASSASINVSTANK;

            Hyper.HeroIntro(); Hyper.Level(Levelss1);
            Hyper.CheckStatus(Levelss1,"Assasin");
            System.out.println();
            roam.HeroIntro(); roam.Level(Levelss2);
            roam.CheckStatus(Levelss2,"Tank");
            System.out.println();
            do {
                quarter++;
                System.out.printf("===== Round %d ===== \n",quarter);

                //Player 1 Attack
                if(Hyper.isStats()){
                    Hyper.Attack("Assasin",
                            "Tank",
                            Hyper.getattDamage(),
                            roam.getDeff(),  roam.getHealthPoint());
                    roam.setHealthPoint(Hyper.FixHP);

                    if(roam.getHealthPoint() <= 0){
                        roam.setStats(false);
                    }
                }

                //Player 2 Attack
                if(roam.isStats()){
                    roam.Attack("Tank",
                            "Assasin",
                            roam.getattDamage(),
                            Hyper.getDeff(), Hyper.getHealthPoint());
                    Hyper.setHealthPoint(roam.FixHP);
                    if(Hyper.getHealthPoint() <= 0 ){
                        Hyper.setStats(false);
                    }
                }
            }while (Hyper.isStats() && roam.isStats());
            Result();

            }
        else if (Select == 3){
            vs = Versus.MAGEVSTANK;

            mid.HeroIntro(); mid.Level(Levelss1);
            mid.CheckStatus(Levelss1,"Mage");
            System.out.println();
            roam.HeroIntro(); roam.Level(Levelss2);
            roam.CheckStatus(Levelss2,"Tank");
            System.out.println();
            do {
                quarter++;
                System.out.printf("===== Round %d ===== \n",quarter);

                //Player 1 Attack
                if(mid.isStats()){
                    mid.Attack("Mage",
                            "Tank",
                            mid.getattDamage(),
                            roam.getDeff(),  roam.getHealthPoint());
                    roam.setHealthPoint(mid.FixHP);

                    if(roam.getHealthPoint() <= 0){
                        roam.setStats(false);
                    }
                }

                //Player 2 Attack
                if(roam.isStats()){
                    roam.Attack("Tank",
                            "Mage",
                            roam.getattDamage(),
                            mid.getDeff(), mid.getHealthPoint());
                    mid.setHealthPoint(roam.FixHP);
                    if(mid.getHealthPoint() <= 0 ){
                        mid.setStats(false);
                    }
                }
            }while (mid.isStats() && roam.isStats());
            Result();

          }

        else{
            System.out.println("You Must Select Correct Menu");
            Menu();
          }
        }


    public static void Result(){
        System.out.println();
        System.out.println("=====  Match Result ==== ");
        if(vs == Versus.ASSASINVSMAGE){
            if(!Hyper.isStats() && mid.isStats()){
                System.out.println("Assasin Die\nMage Wins The Game");
            }else if(Hyper.isStats() && !mid.isStats()){
                System.out.println("Mage Die\nAssasin Wins The Game");
            }
        }else if(vs == Versus.ASSASINVSTANK){
            if(!Hyper.isStats() && roam.isStats()){
                System.out.println("Assasin Die\nTank Wins The Game");
            }else if(Hyper.isStats() && !roam.isStats()){
                System.out.println("Tank Die\nAssasin Wins The Game");
            }
        }else if(vs == Versus.MAGEVSTANK){
            if(!mid.isStats() && roam.isStats()){
                System.out.println("Mage Die\nTank Wins The Game");
            }else if(mid.isStats() && !roam.isStats()){
                System.out.println("Tank Die\nMage Wins The Game");
            }
        }
    }

    public static void main(String[] args) {
        Menu();
        GameStart();

    }
}