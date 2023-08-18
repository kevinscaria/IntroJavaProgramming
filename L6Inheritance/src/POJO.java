public class POJO {
    public static void main(String[] args) {

        for (int i = 1; i<= 5; i++){
            StudentPojo s = new StudentPojo(
                    "STU1234A" + i,
                    switch(i) {
                        case 1 -> "Kevin";
                        case 2 -> "Mary";
                        case 3 -> "John";
                        case 4 -> "Ben";
                        case 5 -> "Abyn";
                        default -> "Anonymous";
                    },
                    switch(i) {
                        case 1 -> "12/03/1996";
                        case 2 -> "12/04/1996";
                        case 3 -> "12/05/1996";
                        case 4 -> "12/06/1996";
                        case 5 -> "12/07/1996";
                        default -> "01/01/0000";
                    },
                    "JavaMasterClass"
                    );
            System.out.println(s);

            StudentRecord sr = new StudentRecord("STU1234A" + i,
                    switch(i) {
                        case 1 -> "Kevin";
                        case 2 -> "Mary";
                        case 3 -> "John";
                        case 4 -> "Ben";
                        case 5 -> "Abyn";
                        default -> "Anonymous";
                    },
                    switch(i) {
                        case 1 -> "12/03/1996";
                        case 2 -> "12/04/1996";
                        case 3 -> "12/05/1996";
                        case 4 -> "12/06/1996";
                        case 5 -> "12/07/1996";
                        default -> "01/01/0000";
                    },
                    "JavaMasterClass");
            System.out.println(sr);
        }

        StudentPojo studentPojo = new StudentPojo("1234", "Kevin", "12/09/1234", "Java");
        StudentRecord studentRecord = new StudentRecord("1234", "Kevin", "12/09/1234", "Java");
        System.out.println();
        System.out.println(studentPojo);
        System.out.println(studentRecord);

        // Differences in getter methods
        System.out.println("Student Pojo Name: " + studentPojo.getName());
        System.out.println("Student Record Name: " + studentRecord.name());

        // Differences in setter methods - Records are immutable so cannot set any value
        studentPojo.setClassList(studentPojo.getClassList() + ", AWS Cloud Associate");
    }
}
