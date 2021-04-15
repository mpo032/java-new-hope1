import model.Student;

public class WorkWithObjects {
    public static void main(String[] args) {
        Student nikolajs = new Student();
        nikolajs.setFirstName("Nikolajs");
        nikolajs.setLastName("Gr.");
        nikolajs.setEmail("1info@inbox.ru");
        nikolajs.setAge(21);

        Student dasha = new Student();
        dasha.setFirstName("Darja");
        dasha.setLastName("Ag.");
        dasha.setEmail("2pochta@mail.ru");
        dasha.setAge(18);

        Student lena = new Student("Helena", "Ne", "helena@inbox.lv");

//        Student oleg = new Student("Oleg", "Pt", "oleg@inbox.lv");


//        System.out.println(nikolajs.getFirstName() + " " + nikolajs.getLastName());
//        System.out.println(dasha.getFirstName() + " " + dasha.getLastName());
//        System.out.println(nikolajs.getFullName());
//        System.out.println(dasha.getFullName());

                nikolajs.printFullInfo();
                dasha.printFullInfo();
                lena.printFullInfo();
//                oleg.printFullInfo();
    }
}
