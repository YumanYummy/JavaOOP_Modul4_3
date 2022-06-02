package MiniGames;


public class Assasin extends Hero implements CritDamage{
    public double HP = 3000, Defence = 300, AttackDamage = 800;
    public double BonusHP = 90, BonusDeff = 15, BonusAtt = 30;

    public void SpawnIntro(){
        System.out.println("Unseen and Unheard");
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
                AttackDamage += AttackDamage*BonusDamage;
                setattDamage(AttackDamage);
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

