
//clasa Constants e de tip Singleton
//stocheaza toate constantele folosite in programul nostru
public final class Constants{

    //consstructor privat
    private Constants(){
        // do nothing
    }

    //constante care reprezinta o codificare pentru fiecare patrat de pe tabla
    //formula de codificare  ab = (valoare ASCII) a * 10 + b
    public static final int A1 = 971;
    public static final int A2 = 972;
    public static final int A3 = 973;
    public static final int A4 = 974;
    public static final int A5 = 975;
    public static final int A6 = 976;
    public static final int A7 = 977;
    public static final int A8 = 978;

    public static final int B1 = 981;
    public static final int B2 = 982;
    public static final int B3 = 983;
    public static final int B4 = 984;
    public static final int B5 = 985;
    public static final int B6 = 986;
    public static final int B7 = 987;
    public static final int B8 = 988;

    public static final int C1 = 991;
    public static final int C2 = 992;
    public static final int C3 = 993;
    public static final int C4 = 994;
    public static final int C5 = 995;
    public static final int C6 = 996;
    public static final int C7 = 997;
    public static final int C8 = 998;

    public static final int D1 = 1001;
    public static final int D2 = 1002;
    public static final int D3 = 1003;
    public static final int D4 = 1004;
    public static final int D5 = 1005;
    public static final int D6 = 1006;
    public static final int D7 = 1007;
    public static final int D8 = 1008;

    public static final int E1 = 1011;
    public static final int E2 = 1012;
    public static final int E3 = 1013;
    public static final int E4 = 1014;
    public static final int E5 = 1015;
    public static final int E6 = 1016;
    public static final int E7 = 1017;
    public static final int E8 = 1018;

    public static final int F1 = 1021;
    public static final int F2 = 1022;
    public static final int F3 = 1023;
    public static final int F4 = 1024;
    public static final int F5 = 1025;
    public static final int F6 = 1026;
    public static final int F7 = 1027;
    public static final int F8 = 1028;

    public static final int G1 = 1031;
    public static final int G2 = 1032;
    public static final int G3 = 1033;
    public static final int G4 = 1034;
    public static final int G5 = 1035;
    public static final int G6 = 1036;
    public static final int G7 = 1037;
    public static final int G8 = 1038;

    public static final int H1 = 1041;
    public static final int H2 = 1042;
    public static final int H3 = 1043;
    public static final int H4 = 1044;
    public static final int H5 = 1045;
    public static final int H6 = 1046;
    public static final int H7 = 1047;
    public static final int H8 = 1048;


    //valorile predefinite pentru fiecare piesa in parte
    public static final int PAWN_VALUE = 100;
    public static final int KNIGHT_VALUE = 300;
    public static final int BISHOP_VALUE = 300;
    public static final int ROOK_VALUE = 500;
    public static final int QUEEN_VALUE = 1800;
    public static final int KING_VALUE = 9000;


    //constante de culori
    public static final int WHITE_COLOR = 1;
    public static final int BLACK_COLOR = 2;
    public static final int NON_COLOR = -1;


    //codificare pentru tipurile speciale de mutari
    //Rocade, En-Passant, Promotion
    public static final int WHITE_KING_SIDE_CASTLING = 6666;
    public static final int WHITE_QUEEN_SIDE_CASTLING = 7777;
    public static final int BLACK_KING_SIDE_CASTLING = 8888;
    public static final int BLACK_QUEEN_SIDE_CASTLING = 9999;


    public static final int QUEEN_PROMOTION = 11111;
    public static final int BISHOP_PROMOTION = 22222;
    public static final int KNIGHT_PROMOTION = 33333;
    public static final int ROOK_PROMOTION = 44444;


    public static final int EN_PASSANT = 55555;


    //constante de end-game utilizate de Minimax
    public static final int MINI_CHECKMATED = 100000;
    public static final int MAXI_CHECKMATED = -100000;
    public static final int MAXI_STALEMATE = 5000;
    public static final int MINI_STALEMATE = -5000;



    public static final int WE_ARE_CHECKMATED = 172617;
    public static final int THEY_ARE_CHECKMATED = 281199;
    public static final int WE_ARE_STALLED = 78112;
    public static final int THEY_ARE_STALLED = 991891;

}