public class Tura extends PiesaSah{
    public Tura(int coordX, int coordY, String nume) {
        super(coordX, coordY, nume, (nume.equals("T") ? 1 : 0));
    }

    public int mutaPiesa(int new_coordX, int new_coordY){
        int ok = 0;
        if((new_coordX <= 7) && (new_coordX >= 0) && (new_coordY <= 7) && (new_coordY >= 0)) {
            //inseamna ca este in tabla de sah urmatoarea mutare
            if((new_coordX == this.coordX) || (new_coordY == this.coordY)){
                //inseamna ca este buna mutarea de tura
                if(tabla[new_coordX][new_coordY] == null) {
                    ok = 1;
                } else {
                    if((!TablaSah.tabla[new_coordX][new_coordY].numePiesa.equals("Re")) && (TablaSah.nrMutari % 2 != super.color)) {
                        ok = 2;
                    }
                }
            }
        }
        return ok;
    }
    public String getNumePiesa() {
        return this.numePiesa;
    }
}
