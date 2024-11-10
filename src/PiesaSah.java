public abstract class PiesaSah extends TablaSah{
    public int coordX;
    public int coordY;
    public String numePiesa;
    int color; // 1 = alb ; 0 = negru

    public abstract int mutaPiesa(int new_coordX, int new_coordY);

    public PiesaSah() {
        numePiesa = " ";
        coordX = 0;
        coordY = 0;
    }

    public PiesaSah (int coordX, int coordY, String nume, int color) {
        numePiesa = nume;
        this.coordX = coordX;
        this.coordY = coordY;
        this.color = color;
    }
    public String getNumePiesa(){
        return numePiesa;
    }
}
