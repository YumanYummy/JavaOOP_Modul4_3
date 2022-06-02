package Geometry;


public class Limas extends Persegi{
    int Alas, Tinggi, TinggiAlas;
    double Volume;

    @Override
    public double getVolume() {
        return Volume = 0.3333*(0.5*Alas*TinggiAlas)*Tinggi;
    }

    public void setAlas(int Alas) {
        this.Alas = Alas;
    }
    public void setTinggi(int Tinggi){
        this.Tinggi = Tinggi;
    }

    public void setTinggiAlas(int TinggiALas){
        this.TinggiAlas = TinggiALas;
    }
}
