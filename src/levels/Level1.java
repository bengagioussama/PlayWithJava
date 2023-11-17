package levels;

import models.Employee;
import utils.Data;

import java.util.List;

public class Level1 {
    public static void main(String[] args) {
        List<Employee> employees = Data.employees();

        /* TO DO 1: Afficher tous les employés */
        System.out.println("------------------------");
        employees.stream().forEach(e -> {
            System.out.println(e);
        });

        /*
         * TO DO 2: Afficher les employés dont le nom commence par la lettre n
         */
        System.out.println("------------------------");
        employees.stream().filter(e -> e.getName().startsWith("n")).forEach(e -> System.out.println(e.getName()));

        /*
         * TO DO 3: Afficher les employés dont le nom commence par la lettre n
         * et le salaire> 1000
         */
        System.out.println("------------------------");
        employees.stream()
                .filter(e -> e.getName().startsWith("n"))
                .filter(e -> e.getSalary() > 1000)
                .forEach(e -> {
                    System.out.println(e);
                });

        /*
         * TO DO 4: Afficher les employés dont le nom commence par la lettre s
         * triés par salaire
         */
        System.out.println("------------------------");
        employees.stream()
                .filter(e -> e.getName().startsWith("s"))
                .sorted((e1, e2) -> e1.getSalary() - e2.getSalary())
                .forEach(e -> {
                    System.out.println(e);
                });
        /*
         * TO DO 5: Afficher les noms des employés dont le salaire > 600 avec 2
         * maniéres différentes
         */
        /* First Way */
        System.out.println("------------------------");
        employees.stream().filter(e -> e.getSalary() > 600).forEach(e -> System.out.println(e.getName()));
        /* Second Way */
        System.out.println("------------------------");
        employees.stream()
                .filter(e -> e.getSalary() > 600)
                .map(e -> e.getName())
                .forEach(nom -> System.out.println(nom));
        /*
         * TO DO 6: Ajouter 200 D pour les employés dont le nom commence avec m
         * et les affichés ensuite
         */


        System.out.println("------------------------");
        employees.stream().filter(e -> e.getName().startsWith("m")).forEach(e -> {

            e.setSalary( e.getSalary() + 200 ) ;

            System.out.println(e);
        });


    }
}
