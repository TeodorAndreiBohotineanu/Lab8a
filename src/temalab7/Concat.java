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


        String[] listaFisiereSursa = {"iarnapeulita.txt", "luceafarul.txt", "sarapedeal.txt"};
        String fisierDestinatie = "cartepoezii.txt";




        Concat tm = new Concat();
        Path path = Paths.get(".", fisierDestinatie);
        Charset charset = Charset.forName("UTF-8");



        for (String nume : listaFisiereSursa) {
            List<String> poezie = tm.citesteFisier(nume);

            try {
                if(Files.exists(path)) {
                    Files.write(path, poezie, StandardOpenOption.APPEND);
                    System.out.println("a intrat pe append");
                }

                else {
                    Files.write(path, poezie);
                    System.out.println("a intrat pe new");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


}
