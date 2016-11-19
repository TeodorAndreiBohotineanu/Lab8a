package temalab7;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * Created by icondor on 19/11/16.
 */
public class Concat extends TemaPoezie{

    public static void main(String[] args) {

        // citesc primul fisier
        // creez destinatia si scriu primul fisier acolo
        // citesc pe al doilea
        // scriu in destinatie
        // citesc pe al treilea










        Concat tm = new Concat();
        List<String> poezie = tm.citesteFisier("luceafarul.txt");


        Path path = Paths.get(".", "destinatie.txt");
        Charset charset = Charset.forName("UTF-8");
        try {
            Files.write(path, poezie);
        } catch (IOException e) {
            e.printStackTrace();
        }


        List<String> poezie2 = tm.citesteFisier("iarnapeulita.txt");




        try {
            Files.write(path, poezie2,StandardOpenOption.APPEND );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
