package temalab7;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by icondor on 19/11/16.
 */
public class TemaPoezie {

    public static void main(String[] args) {
        // citire fisier
        // citit  randuri
        // afisat randuri
        // afisat cate randuri
//
        TemaPoezie tm = new TemaPoezie();
        List<String> poezie = tm.citesteFisier("luceafarul.txt");
        tm.afiseaza(poezie);

        int lungime = tm.getRows(poezie);
        System.out.println("randuri:"+lungime);

        int nrCuvinte = tm.getWords(poezie);
        System.out.println("cuvinte:" + nrCuvinte);

        int r = tm.getRowsAbove20Chars(poezie);
        System.out.println("r:"+r);
    }

    private int getRows(List<String> poezie) {
        return poezie.size();
    }


    private int getRowsAbove20Chars(List<String> poezie) {
        int contor = 0;
        for (String rand : poezie) { // ma duc rand cu rand
            if(rand.length()>20) {
                contor++;
                System.out.println(rand);
            }
        }
        return contor;
    }





    private int getWords(List<String> poezie) {
        System.out.println("enter");

        int nrWords = 0;

        // pt fiecare rand din poezie
        for (String rand : poezie) {

            // sparg dupa spatiu
            StringTokenizer st2 = new StringTokenizer(rand, " ");
            // atata timp cat sunt cuvinte in randul curent
            while (st2.hasMoreElements()) {
                nrWords++; // mai adaug la nr total
                st2.nextElement(); // sar la urmatorul cuvant din rand
            } // gata randul curent
        } // gata toate randurile

        //returnez totalul de cuvinte
        return nrWords;


    }


    // cireste fisier si citeste randuri
    protected List<String> citesteFisier(String pathFile) {

        List<String> lines = new ArrayList<>();
        try {
            List<String> poezia = new ArrayList<>();

            Path path = Paths.get(".", pathFile);
            Charset charset = Charset.forName("UTF-8");
            lines = Files.readAllLines(path, charset);
            // returneaza inclusiv linii goale (cu enter)


        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    private void afiseaza(List<String> poezie) {
        for (String rand : poezie) {
            System.out.println(rand);

        }
    }

    private void afiseazaCuFor(List<String> poezie) {
        for (int i = 0; i < poezie.size(); i++) {
            String rand = poezie.get(i);
            System.out.println(rand);
        }
    }
}


