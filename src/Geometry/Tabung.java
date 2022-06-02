package Geometry;

public class Tabung extends Lingkaran{
    int Tinggi;
    double Volume;

    @Override
    public double getVolume() {
        return Volume = Math.PI*JariJari*JariJari*Tinggi;
    }

    public void setTinggi(int tinggi) {
        this.Tinggi = tinggi;
    }

}
