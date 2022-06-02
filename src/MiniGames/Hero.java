package MiniGames;

public abstract class Hero {
    private double HealthPoint, AttDamage, Deff, TrueDamage;
    private int Levels;
    private boolean Stats = true;
    public double FixHP;

    public void Attack(
            String Player1, String Player2,
            double Player1Att , double Player2Deff,
            double Player2HP){

        System.out.printf("=== %s Turn ===\n", Player1);
        SpawnIntro();
        reviewDamage(Player1Att,Player2Deff) ;
        FixHP = (Player2HP - getTrueDmg());
        if(FixHP >= 0 ){
            FixHP = FixHP;
        } else FixHP = 0;
        System.out.printf(" %s HP Remaining : %.1f\n", Player2, FixHP);
    }

    public void reviewDamage(double AttDamage , double Deff){
        setTrueDmg(AttDamage - Deff);
    }

    public abstract void SpawnIntro();
    public abstract void HeroIntro();
    public abstract void Level(int Levels);

    public void CheckStatus(int Level,String Player){
        System.out.println("=====  "+Player+"  =====");
        System.out.println("Level: "+Level);
        System.out.println("Attack Damage:   "+getattDamage()+"\t\t\t Live Status: "+isStats());
        System.out.println("Health Point:   "+getHealthPoint()+"\t\t\tDefense: "+getDeff());
    }

    public void setHealthPoint(double HealthPoint){
        this.HealthPoint = HealthPoint;
    }

    public double getHealthPoint() {
        return HealthPoint;
    }

    public void setattDamage(double AttDamage){
        this.AttDamage = AttDamage;
    }

    public double getattDamage() {
        return AttDamage;
    }

    public void setDeff(double deff) {
        this.Deff = deff;
    }

    public double getDeff(){
        return Deff;
    }

    public void setlevels(int Levels) {
        this.Levels = Levels;
    }

    public int getlevels(int Levels){
        return Levels;
    }

    public void setTrueDmg(double TrueDamage) {
        this.TrueDamage = TrueDamage;
    }

    public double getTrueDmg(){
        return TrueDamage;
    }

    public void setStats(boolean Stats) {
        this.Stats = Stats;
    }

    public boolean isStats() {
        return Stats;
    }

}
