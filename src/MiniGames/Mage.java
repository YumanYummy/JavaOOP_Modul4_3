package MiniGames;

public class Mage extends Hero implements MagicDamage{
    public double HP = 2500, Defence = 200, AttackDamage = 700;
    public double BonusHP = 85, BonusDeff = 10, BonusAtt = 35;

    public void SpawnIntro(){
        System.out.println("The Beautiful Power Of Magic");
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
            AttackDamage += AttackDamage*magicDamageBonus;
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
