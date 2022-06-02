package MiniGames;

public class Tank extends Hero  {
    public double HP = 7000, Defence = 500, AttackDamage = 500;
    public double BonusHP = 200, BonusDeff = 15, BonusAtt = 20;

    public void SpawnIntro(){
        System.out.println("I'm The Strongest People In The World");
    }

    public void HeroIntro(){
        setHealthPoint(HP);
        setDeff(Defence);
        setattDamage(AttackDamage);
    }

    public void Level(int Levels){
        setlevels(Levels);
        if(Levels > 1){
            setHealthPoint(getHealthPoint() + BonusHP*Levels);
            setDeff(getDeff() + BonusDeff*Levels);
            setattDamage(getattDamage() + BonusAtt*Levels);

        }else{
            setHealthPoint(HP);
            setDeff(Defence);
            setattDamage(AttackDamage);
        }
        this.AttackDamage = getattDamage();
        this.Defence= getDeff();
        this.HP = getHealthPoint();

    }
}
