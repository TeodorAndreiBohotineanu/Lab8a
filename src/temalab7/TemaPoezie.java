package temalab7;

import java.util.List;

/**
 * Created by icondor on 19/11/16.
 */
public class TemaPoezie {

    public static void main(String[] args) {
        // citire fisier
        // citit  randuri
        // afisat randuri
        // afisat cate randuri

        TemaPoezie tm = new TemaPoezie();
        List<String> poezie = tm.citesteFisier("luceafarul.txt");
        tm.afiseaza(poezie);
    }


}
