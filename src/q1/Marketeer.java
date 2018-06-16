package q1;

//import java.util.*;
//import java.sql.*;
import java.util.Date;

/**
 * @author flo
 * @since 09/06/2018.
 */
public class Marketeer extends Employee {

    private Date cucu = new Date();
    private String name;

    public Marketeer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getVacationDays() {
        System.out.println("vacation days of a marketeer");
       return super.getVacationDays();
    }

    public static void main(String[] args) {
        Employee m = new Marketeer("Ion");
        m.getVacationDays();
        System.out.println(m.buildPayroll());

        m.toString();
        System.out.println(m.equals(m));
        System.out.println(m.equals(new Marketeer("Ion")));
    }

    @Override
    public String toString() {
        return "Marketeer{" +
                "cucu=" + cucu +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Marketeer marketeer = (Marketeer) o;

        if (cucu != null ? !cucu.equals(marketeer.cucu) : marketeer.cucu != null) return false;
        return name != null ? name.equals(marketeer.name) : marketeer.name == null;
    }

    @Override
    public int hashCode() {
        int result = cucu != null ? cucu.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
