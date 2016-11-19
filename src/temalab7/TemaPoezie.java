package temalab7;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
//
        TemaPoezie tm = new TemaPoezie();
        List<String> poezie = tm.citesteFisier("luceafarul.txt");
        tm.afiseaza(poezie);

    }

   // cireste fisier si citeste randuri
    private List<String> citesteFisier(String pathFile) {

        List<String> lines = new ArrayList<>();
        try {
            List<String>  poezia = new ArrayList<>();

            Path path = Paths.get(".", pathFile);
            Charset charset = Charset.forName("UTF-8");
            lines = Files.readAllLines(path, charset);


        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    private void afiseaza(List<String> poezie) {
        for(String rand: poezie) {
            System.out.println(rand);

        }
    }

    private void afiseazaCuFor(List<String> poezie) {
        for(int i=0;i<poezie.size();i++) {
            String rand = poezie.get(i);
            System.out.println(rand);
        }
    }
}
