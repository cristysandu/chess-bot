import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Vector;

public final class ScoreManager{

    static HashMap<Integer,StorageValue> valueMap = new HashMap<Integer,StorageValue>();


    public static void readValue() {
        valueMap.put(Constants.A1,new StorageValue(-30,0,0,-50,-20,-20,20,0,0,-50,-20,-20));
        valueMap.put(Constants.A2,new StorageValue(-30,50,5,-40,-10,-10,20,5,-5,-40,-10,-10));
        valueMap.put(Constants.A3,new StorageValue(-30,10,-5,-30,-10,-10,-10,5,-5,-30,-10,-10));
        valueMap.put(Constants.A4,new StorageValue(-30,5,-5,-30,-5,-10,-20,0,-5,-30,0,-10));
        valueMap.put(Constants.A5,new StorageValue(-20,0,-5,-30,0,-10,-30,5,-5,-30,-5,-10));
        valueMap.put(Constants.A6,new StorageValue(-10,5,-5,-30,-10,-10,-30,10,-5,-30,-10,-10));
        valueMap.put(Constants.A7,new StorageValue(20,5,-5,-40,-10,-10,-30,50,5,-40,-10,-10));
        valueMap.put(Constants.A8,new StorageValue(20,0,0,-50,-20,-20,-30,0,0,-50,-20,-20));

        valueMap.put(Constants.B1,new StorageValue(-40,0,0,-40,-10,-10,30,0,0,-40,-10,-10));
        valueMap.put(Constants.B2,new StorageValue(-40,50,10,-20,0,0,20,10,0,-20,0,5));
        valueMap.put(Constants.B3,new StorageValue(-40,10,0,0,0,0,-20,-5,0,5,5,10));
        valueMap.put(Constants.B4,new StorageValue(-40,5,0,5,0,5,-30,0,0,0,0,0));
        valueMap.put(Constants.B5,new StorageValue(-30,0,0,0,0,0,-40,5,0,5,0,5));
        valueMap.put(Constants.B6,new StorageValue(-20,-5,0,5,5,10,-40,10,0,0,0,0));
        valueMap.put(Constants.B7,new StorageValue(20,10,0,-20,0,5,-40,50,10,-20,0,0));
        valueMap.put(Constants.B8,new StorageValue(30,0,0,-40,-10,-10,-40,0,0,-40,-10,-10));

        valueMap.put(Constants.C1,new StorageValue(-40,0,0,-30,-10,-10,10,0,0,-30,-10,-10));
        valueMap.put(Constants.C2,new StorageValue(-40,50,10,0,0,0,0,10,0,0,5,0));
        valueMap.put(Constants.C3,new StorageValue(-40,20,0,10,5,5,-20,-10,0,10,5,10));
        valueMap.put(Constants.C4,new StorageValue(-40,10,0,15,5,5,-30,0,0,15,5,10));
        valueMap.put(Constants.C5,new StorageValue(-30,0,0,15,5,10,-40,10,0,15,5,5));
        valueMap.put(Constants.C6,new StorageValue(-20,-10,0,10,5,10,-40,20,0,10,5,5));
        valueMap.put(Constants.C7,new StorageValue(0,10,0,0,5,0,-40,50,10,0,0,0));
        valueMap.put(Constants.C8,new StorageValue(10,0,0,-30,-10,-10,-40,0,0,-30,-10,-10));

        valueMap.put(Constants.D1,new StorageValue(-50,0,5,-30,-5,-10,0,0,5,-30,-5,-10));
        valueMap.put(Constants.D2,new StorageValue(-50,50,10,0,0,0,0,-20,0,5,0,0));
        valueMap.put(Constants.D3,new StorageValue(-50,30,0,15,5,10,-20,0,0,15,5,10));
        valueMap.put(Constants.D4,new StorageValue(-50,25,0,20,5,10,-40,20,0,20,5,10));
        valueMap.put(Constants.D5,new StorageValue(-40,20,0,20,5,10,-50,25,0,20,5,10));
        valueMap.put(Constants.D6,new StorageValue(-20,0,0,15,5,10,-50,30,0,15,5,10));
        valueMap.put(Constants.D7,new StorageValue(0,-20,0,5,0,0,-50,50,10,0,0,0));
        valueMap.put(Constants.D8,new StorageValue(0,0,5,-30,-5,-10,-50,0,5,-30,-5,-10));

        valueMap.put(Constants.E1,new StorageValue(-50,0,5,-30,-5,-10,0,0,5,-30,-5,-10));
        valueMap.put(Constants.E2,new StorageValue(-50,50,10,0,0,0,0,-20,0,5,0,0));
        valueMap.put(Constants.E3,new StorageValue(-50,30,0,15,5,10,-20,0,0,15,5,10));
        valueMap.put(Constants.E4,new StorageValue(-50,25,0,20,5,10,-40,20,0,20,5,10));
        valueMap.put(Constants.E5,new StorageValue(-40,20,0,20,5,10,-50,25,0,20,5,10));
        valueMap.put(Constants.E6,new StorageValue(-20,0,0,15,5,10,-50,30,0,15,5,10));
        valueMap.put(Constants.E7,new StorageValue(0,-20,0,5,0,0,-50,50,10,0,0,0));
        valueMap.put(Constants.E8,new StorageValue(0,0,5,-30,-5,-10,-50,0,5,-30,-5,-10));

        valueMap.put(Constants.F1,new StorageValue(-40,0,0,-30,-10,-10,10,0,0,-30,-10,-10));
        valueMap.put(Constants.F2,new StorageValue(-40,50,10,0,0,0,0,10,0,0,0,0));
        valueMap.put(Constants.F3,new StorageValue(-40,20,0,10,5,5,-20,-10,0,10,5,10));
        valueMap.put(Constants.F4,new StorageValue(-40,10,0,15,5,5,-30,0,0,15,5,10));
        valueMap.put(Constants.F5,new StorageValue(-30,0,0,15,5,10,-40,10,0,15,5,5));
        valueMap.put(Constants.F6,new StorageValue(-20,-10,0,10,5,10,-40,20,0,10,5,5));
        valueMap.put(Constants.F7,new StorageValue(0,10,0,0,0,0,-40,50,10,0,0,0));
        valueMap.put(Constants.F8,new StorageValue(10,0,0,-30,-10,-10,-40,0,0,-30,-10,-10));

        valueMap.put(Constants.G1,new StorageValue(-40,0,0,-40,-10,-10,30,0,0,-40,-10,-10));
        valueMap.put(Constants.G2,new StorageValue(-40,50,10,-20,0,0,20,10,0,-20,0,5));
        valueMap.put(Constants.G3,new StorageValue(-40,10,0,0,0,0,-20,-5,0,5,0,10));
        valueMap.put(Constants.G4,new StorageValue(-40,5,0,5,0,5,-30,0,0,0,0,0));
        valueMap.put(Constants.G5,new StorageValue(-30,0,0,0,0,0,-40,5,0,5,0,5));
        valueMap.put(Constants.G6,new StorageValue(-20,-5,0,5,0,10,-40,10,0,0,0,0));
        valueMap.put(Constants.G7,new StorageValue(20,10,0,-20,0,5,-40,50,10,-20,0,0));
        valueMap.put(Constants.G8,new StorageValue(30,0,0,-40,-10,-10,-40,0,0,-40,-10,-10));

        valueMap.put(Constants.H1,new StorageValue(-30,0,0,-50,-20,-20,20,0,0,-50,-20,-20));
        valueMap.put(Constants.H2,new StorageValue(-30,50,5,-40,-10,-10,20,5,-5,-40,-10,-10));
        valueMap.put(Constants.H3,new StorageValue(-30,10,-5,-30,-10,-10,-10,5,-5,-30,-10,-10));
        valueMap.put(Constants.H4,new StorageValue(-30,5,-5,-30,-5,-10,-20,0,-5,-30,-5,-10));
        valueMap.put(Constants.H5,new StorageValue(-20,0,-5,-30,-5,-10,-30,5,-5,-30,-5,-10));
        valueMap.put(Constants.H6,new StorageValue(-10,5,-5,-30,-10,-10,-30,10,-5,-30,-10,-10));
        valueMap.put(Constants.H7,new StorageValue(20,5,-5,-40,-10,-10,-30,50,5,-40,-10,-10));
        valueMap.put(Constants.H8,new StorageValue(20,0,0,-50,-20,-20,-30,0,0,-50,-20,-20));


    }
    public static int getScore(Piece p, int pozition){

       if (p.getName() == 'p') {
           return p.getValue()+ valueMap.get(pozition).pawnValN;
       } else if (p.getName() == 'n') {
           return p.getValue()+ valueMap.get(pozition).KnightValN;
       } else if (p.getName() == 'k') {
           return p.getValue()+ valueMap.get(pozition).KingValN;
       } else  if (p.getName() == 'b') {
           return p.getValue()+ valueMap.get(pozition).BishopValN;
       } else  if (p.getName() == 'q') {
           return p.getValue()+ valueMap.get(pozition).QueenValN;
       } else  if (p.getName() == 'r') {
           return p.getValue()+ valueMap.get(pozition).RookValN;
       } else if (p.getName() == 'P') {
           return p.getValue()+ valueMap.get(pozition).pawnVal;
       } else if (p.getName() == 'N') {
           return p.getValue()+ valueMap.get(pozition).KnightVal;
       } else if (p.getName() == 'K') {
           return p.getValue()+ valueMap.get(pozition).KingVal;
       } else  if (p.getName() == 'B') {
           return p.getValue()+ valueMap.get(pozition).BishopVal;
       } else  if (p.getName() == 'Q') {
           return p.getValue()+ valueMap.get(pozition).QueenVal;
       } else  if (p.getName() == 'R') {
           return p.getValue()+ valueMap.get(pozition).RookVal;
       }
        return 0;

    }
   /* public static void readFromFile(String piesa,String fconfiguratie,String fvalori_alb,String fvalori_negre) {

        File file = new File(fconfiguratie);
        File file1 = new File(fvalori_alb);
        File file2 = new File(fvalori_negre);
        String str1,str2,str3;
        int valoare_alb,valoare_negru,configuratie_t;
        try {
            BufferedReader pozition = new BufferedReader(new FileReader(file));
            BufferedReader scoreWhite = new BufferedReader(new FileReader(file1));
            BufferedReader scoreBlack = new BufferedReader(new FileReader(file2));

            while (((str1 = scoreWhite.readLine()) != null) && ((str2 = scoreBlack.readLine())!= null) && ((str3 = pozition.readLine())!= null)){
                valoare_alb = Integer.parseInt(str1);
                valoare_negru = Integer.parseInt(str2);
                configuratie_t = Integer.parseInt(str3);
                picesWhite.add(new StorageValue(piesa,configuratie_t,valoare_alb,valoare_negru));
            }

        }catch (Exception e)
        {
            e.getStackTrace();
        }
        String st;

    }*/

    /*public static void addPices(){

    }*/


} 