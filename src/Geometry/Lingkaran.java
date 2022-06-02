package Geometry;

public class Lingkaran implements BangunRuang{
    int JariJari;
    double LuasLingkaran;
    double Keliling;
    double Volume;

    public double luas() {
        LuasLingkaran = (Math.PI*JariJari*JariJari);
        return LuasLingkaran;
    }

    @Override
    public double Keliling() {
        Keliling = (2*Math.PI*JariJari);
        return Keliling;
    }

    public void setJariJari(int JariJari) {
        this.JariJari = JariJari;
    }


    public double getVolume(){
        return Volume;
    }
}
