package temalab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by icondor on 19/11/16.
 */
public class SimulareSplitLista {

    public static void main(String[] args) {

        List<String> carte= new ArrayList<>();
        String[] s={"X", "a", "b", "c", "Y", "d", "e", "Z", "f", "k", "l"};
        carte= Arrays.asList(s);

        String[] delim = {"X", "Y", "Z"};

        List<String> poezie = new ArrayList<>();

        int index=0;
        while(index<carte.size()) {
            poezie.add(carte.get(index));


            if(carte.get(index).equals("Y")) {
                poezie.remove(index);
                break;
            }


            index++;
        }

        System.out.println(poezie);



    }
}
