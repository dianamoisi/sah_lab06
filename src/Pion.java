public class Pion extends PiesaSah {

    public Pion(int coordX, int coordY, String nume) {
        super(coordX, coordY, nume, (nume.equals("P") ? 1 : 0));
    }

    public int mutaPiesa(int new_coordX, int new_coordY) {
        int ok = 0;
        //  pentru piesele albe
        if ((this.numePiesa.equals("P")) && (super.nrMutari % 2 == 1)) {
            if (TablaSah.nrMutari == 1) {
                //System.out.println("x = " + this.coordX + " y = " + this.coordY + " new_x = " + new_coordX + " new_y = " + new_coordY);
                if ((new_coordX == this.coordX + 2) && (TablaSah.tabla[new_coordX][new_coordY] == null)) {
                    //unde nu avem piese de sah vom pune null
                    ok = 1; // 1 inseamna ca se muta pe un spatiu liber
                }
                if ((new_coordX == this.coordX + 1) && (TablaSah.tabla[new_coordX][new_coordY] == null)) {
                    //unde nu avem piese de sah vom pune null
                    ok = 1;
                }

            } else {
                if ((this.coordX > 0) && (this.coordX < 7) && (new_coordY <= 7) && (new_coordY >= 0) && (this.coordX + 1 == new_coordX)) {
                    // aici verific daca pionul este in tabla de sah, si poate fi mutat, urmeaza sa verific daca
                    // vrea sa mute pe loc gol, sau vrea sa captureze o piesa adversar
                    if((tabla[new_coordX][new_coordY] != null) && (this.coordY + 1 == new_coordY  || this.coordY - 1 == new_coordY) && (!TablaSah.tabla[new_coordX][new_coordY].numePiesa.equals("Re")) && (tabla[new_coordX][new_coordY].color == 0)){
                        //inseamna ca dorim sa facem o captura, si vom pune doar ok pe true, tabla se reinitializeaza in joc
                        ok = 2; // asta insemna ca vrea sa captureze o piesa
                        }
                    if((tabla[new_coordX][new_coordY] == null) && (this.coordY == new_coordY)) {
                        ok = 1;
                    }
                }
            }

        }
        if ((this.numePiesa.equals("p")) && (super.nrMutari % 2 == 0)) {
            if (super.nrMutari == 2) {
                if ((new_coordX == this.coordX - 2) && (super.tabla[new_coordX][new_coordY] == null)) {
                    //unde nu avem piese de sah vom pune null
                    ok = 1; // 1 inseamna ca se muta pe un spatiu liber
                }
                if ((new_coordX == this.coordX - 1) && (super.tabla[new_coordX][new_coordY] == null)) {
                    //unde nu avem piese de sah vom pune null
                    ok = 1;
                }

            } else {
                if ((this.coordX > 0) &&(this.coordX < 7) && (this.coordX - 1 == new_coordX) && (new_coordY >= 0) && (new_coordY <= 6)) {
                    // aici verific daca pionul este in tabla de sah, si poate fi mutat, urmeaza sa verific daca
                    // vrea sa mute pe loc gol, sau vrea sa captureze o piesa adversar
                    if((tabla[new_coordX][new_coordY] != null) && (this.coordY - 1 == new_coordY || this.coordY + 1 == new_coordY) && (!TablaSah.tabla[new_coordX][new_coordY].numePiesa.equals("Re")) && (tabla[new_coordX][new_coordY].color == 0)){
                        //inseamna ca dorim sa facem o captura, si vom pune doar ok pe true, tabla se reinitializeaza in joc
                        ok = 2; // asta insemna ca vrea sa captureze o piesa
                    }
                    if((tabla[new_coordX][new_coordY] == null) && (this.coordX == new_coordX)) {
                        ok = 1;
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