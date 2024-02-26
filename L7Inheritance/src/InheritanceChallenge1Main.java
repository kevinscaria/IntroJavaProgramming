public class InheritanceChallenge1Main {

    public static void main(String[] args) {
        Employee kevin = new Employee(
                "Kevin",
                "11/11/1995",
                "20/01/2020"
        );

        SalariedEmployee ben = new SalariedEmployee(
                "Ben",
                "12/03/2000",
                "17/02/2023",
                35000
        );

        SalariedEmployee ken = new SalariedEmployee(
                "Ken",
                "30/04/1963",
                "15/07/1982",
                90000
        );

        HourlyEmployee abyn = new HourlyEmployee(
                "Abyn",
                "15/07/1995",
                "17/09/2018",
                88
        );

        System.out.println(kevin);
        System.out.println("Kevin's age: " + kevin.getAge());
        System.out.println("Kevin's bi-weekly pay: $ " + kevin.collectPay());

        System.out.println(ben);
        System.out.println("Ben's age: " + ben.getAge());
        System.out.println("Ben's bi-weekly pay: $ " + ben.collectPay());

//      Retired Salaried Employee
        System.out.println(ken);
        System.out.println("Ken's age: " + ken.getAge());
        System.out.println("Ken's bi-weekly pay: " + ken.collectPay());
        ken.retire("01/01/2024");
        System.out.println("Ken's bi-weekly pay after retirement: " + ken.collectPay());

        System.out.println(abyn);
        System.out.println("Abyn's age: " + abyn.getAge());
        System.out.println("Abyn's weekly pay by hour: $ " + abyn.collectPay());
        System.out.println("Abyn's double pay by hour: $ " + abyn.getDoublePay());
    }
}
