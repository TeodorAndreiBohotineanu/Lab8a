/**
 * Created by icondor on 19/11/16.
 */
public class AfiseazaCeva {


    private  void afiseaza(String ce) {
        System.out.println(ce);

    }

    private  void afiseaza(String ce, int numar) {
        System.out.println(ce+":"+numar);

    }
    public static void main(String[] args) {
        AfiseazaCeva a = new AfiseazaCeva();
        a.afiseaza("ana are mere");

        a.afiseaza("ana are mere"+"55");

    }
}
