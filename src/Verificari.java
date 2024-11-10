public class Verificari extends TablaSah{
    public boolean sePoateMuta(int x, int y, int new_x, int new_y, String piece) {
        boolean ok = true;

        if(tabla[new_x][new_y].color == TablaSah.nrMutari % 2) {
            ok = false;
            return ok;
        }//aici se verifica daca poz la care dorim sa ajungem este de aceeasi culoare, pentru a nu mai face calculele

        if(piece == "t" || piece == "r" || piece == "T" || piece == "R") {
            //daca piesele sunt tura sau regina, se verifica liniile drepte
            int[] direction = {1, -1};
            int var = 0;
            if(x == new_x) {
                if(y > new_y) {
                    var = 1;
                }
                while(y < new_y - 1) {
                    y = y + direction[var];
                    if(tabla[x][y] != null) {
                        ok = false;
                    }
                }
            } else if(y == new_y) {
                var = 0;
                if(x > new_x) {
                    var = 1;
                }
                while(x < new_x) {
                    x = x + direction[var];
                    if(tabla[x][y] != null) {
                        ok = false;
                    }
                }
            }
        }
        if(piece == "n" || piece == "r" || piece == "N" || piece == "R") {
            //daca piesele sunt nebun sau regina, se verifica diagonalele
            int[] direction1 = {1, 1};
            int[] direction2 = {1, -1};
            int[] direction3 = {-1, 1};
            int[] direction4 = {-1, -1};

            if((x < new_x) && (y < new_y)) {
                while((x < new_x) && (y < new_y)) {
                    x = x + direction1[0];
                    y = y + direction1[1];
                    if(tabla[x][y] != null) {
                        ok = false;
                    }
                }
                while((x < new_x) && (y > new_y)) {
                    x = x + direction2[0];
                    y = y + direction2[1];
                    if(tabla[x][y] != null) {
                        ok = false;
                    }
                }
                while((x > new_x) && (y < new_y)) {
                    x = x + direction3[0];
                    y = y + direction3[1];
                    if(tabla[x][y] != null) {
                        ok = false;
                    }
                }
                while((x > new_x) && (y > new_y)) {
                    x = x + direction4[0];
                    y = y + direction4[1];
                    if(tabla[x][y] != null) {
                        ok = false;
                    }
                }
            }
        }
        return ok;
    }


    public boolean eSah(int x, int y, int rX, int rY, String piesa) {
        boolean ok = false;
        if((piesa == "p") || (piesa == "P")) {
            int[] direction = {-1, 1};// se va continua
        }
        return ok;
    }

    public void afisareTabla(TablaSah t) {
        for(int i = 7; i >= 0; i--) {
            for(int j = 0; j < 8; j++) {
                if(TablaSah.tabla[i][j] == null) {
                    System.out.print("  ");
                } else {
                    System.out.print(TablaSah.tabla[i][j].getNumePiesa() + " ");
                }
            }
            System.out.println();
        }
    }
}
