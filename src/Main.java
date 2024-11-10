public class Main {

    public static void main(String[] args) {
      //  TablaSah t = new TablaSah();
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                TablaSah.tabla[i][j] = null;
            }
        }
        for(int j = 0; j < 8; j++) { //pe i = 0 si i = 1 voi pune pionii albi
            TablaSah.tabla[1][j] = new Pion(1, j, "P");
            TablaSah.tabla[6][j] = new Pion(6, j, "p");
            if(j == 0 || j == 7) {
                TablaSah.tabla[0][j] = new Tura(0, j, "T");
                TablaSah.tabla[7][j] = new Tura(7, j, "t");
            }
            if(j == 1 || j == 6) { // aici ar trebui sa stea calul
                TablaSah.tabla[0][j] = new Cal(0, j, "C");
                TablaSah.tabla[7][j] = new Cal(7, j, "c");
            }
            if(j == 2 || j == 5) {
                TablaSah.tabla[0][j] = new Nebun(0, j, "N");
                TablaSah.tabla[7][j] = new Nebun(7, j, "n");
            }
        }

        // AICI VERIFIC TOATE PIESELE PE CARE LE-AM IMPLEMENTAT DACA SUNT CORECTE

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


        if(TablaSah.tabla[1][3].mutaPiesa(3, 3) == 1) {
            TablaSah.tabla[3][3] = TablaSah.tabla[1][3];
            TablaSah.nrMutari = TablaSah.nrMutari + 1;
            System.out.println(TablaSah.nrMutari);
            TablaSah.tabla[1][3] = null;
        }

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

        System.out.println();
        System.out.println();

        if(TablaSah.tabla[6][2].mutaPiesa(5, 2) == 1) {
            TablaSah.tabla[5][2] = TablaSah.tabla[6][2];
            TablaSah.nrMutari++;
            TablaSah.tabla[6][2] = null;
        }
        System.out.println(TablaSah.nrMutari);

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

        if(TablaSah.tabla[1][2].mutaPiesa(2, 2) == 1) {
            TablaSah.tabla[2][2] = TablaSah.tabla[1][2];
            TablaSah.nrMutari++;
            TablaSah.tabla[1][2] = null;
        }
        System.out.println(TablaSah.nrMutari);

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
        if(TablaSah.tabla[7][0].mutaPiesa(4, 0) == 1) {
            TablaSah.tabla[4][0] = TablaSah.tabla[7][0];
            TablaSah.nrMutari++;
            TablaSah.tabla[7][0] = null;
        }
        System.out.println(TablaSah.nrMutari);

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

        if(TablaSah.tabla[0][2].mutaPiesa(2, 4) == 1) {
            TablaSah.tabla[2][4] = TablaSah.tabla[0][2];
            TablaSah.nrMutari++;
            TablaSah.tabla[0][2] = null;
        }
        System.out.println(TablaSah.nrMutari);

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
        if(TablaSah.tabla[7][1].mutaPiesa(5, 0) == 1) {
            TablaSah.tabla[5][0] = TablaSah.tabla[7][1];
            TablaSah.nrMutari++;
            TablaSah.tabla[7][1] = null;
        }
        System.out.println(TablaSah.nrMutari);

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