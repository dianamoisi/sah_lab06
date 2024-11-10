public class Cal extends PiesaSah{
    public Cal(int coordX, int coordY, String nume) {
        super(coordX, coordY, nume, (nume.equals("N") ? 1 : 0));
    }

    public int mutaPiesa(int new_coordX, int new_coordY){
        if(TablaSah.tabla[this.coordX][this.coordY] == null) {
            return 0;
        }
        int ok = 0;
        if((new_coordX <= 7) && (new_coordX >= 0) && (new_coordY <= 7) && (new_coordY >= 0)) {
            //inseamna ca este in tabla de sah urmatoarea mutare
            if((Math.abs(new_coordX - this.coordX) == 2 &&  Math.abs(new_coordY - this.coordY) == 1) || (Math.abs(new_coordX - this.coordX) == 1 &&  Math.abs(new_coordY - this.coordY) == 2)){
                //inseamna ca este buna mutarea de nebun
                if(tabla[new_coordX][new_coordY] == null) {
                    ok = 1;
                }else if((!TablaSah.tabla[new_coordX][new_coordY].numePiesa.equals("Re")) && (TablaSah.nrMutari % 2 != super.color)) {
                    ok = 2;
                }
            }
        }
        return ok;
    }
    public String getNumePiesa() {
        return this.numePiesa;
    }
}
