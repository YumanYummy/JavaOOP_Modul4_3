package Geometry;

public class Persegi implements BangunRuang{
    int Sisi;
    double LuasPersegi;
    double Keliling;
    double Volume;

    public double luas() {
        LuasPersegi = (Sisi*Sisi);
        return LuasPersegi;
    }

    @Override
    public double Keliling() {
        Keliling = (4*Sisi);
        return Keliling;
    }

    public void setSisi(int Sisi) {
        this.Sisi = Sisi;
    }


    public double getVolume(){
        return Volume;
    }
}
