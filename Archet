public class Student {
    private String id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nameOfSubject;
    private String theoreticalOrNumerical;
    private String previousLectureReview;
    private String noOfStudents;
    private String EUFCalculation;
    private String date;
    private String QOD;
    private String username;
    private String password;

    private Student(StudentBuilder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.nameOfSubject = builder.nameOfSubject;
        this.theoreticalOrNumerical = builder.theoreticalOrNumerical;
        this.previousLectureReview = builder.previousLectureReview;
        this.noOfStudents = builder.noOfStudents;
        this.EUFCalculation = builder.EUFCalculation;
        this.date = builder.date;
        this.QOD = builder.QOD;
        this.username = builder.username;
        this.password = builder.password;
    }

    // Builder class
    public static class StudentBuilder {
        // Mandatory fields
        private String id;
        private String firstName;
        private String lastName;

        // Optional fields
        private String middleName = "";
        private String nameOfSubject = "";
        private String theoreticalOrNumerical = "";
        private String previousLectureReview = "";
        private String noOfStudents = "";
        private String EUFCalculation = "";
        private String date = "";
        private String QOD = "";
        private String username = "";
        private String password = "";

        public StudentBuilder(String id, String firstName, String lastName) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public StudentBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public StudentBuilder nameOfSubject(String nameOfSubject) {
            this.nameOfSubject = nameOfSubject;
            return this;
        }

        public StudentBuilder theoreticalOrNumerical(String theoreticalOrNumerical) {
            this.theoreticalOrNumerical = theoreticalOrNumerical;
            return this;
        }

        public StudentBuilder previousLectureReview(String previousLectureReview) {
            this.previousLectureReview = previousLectureReview;
            return this;
        }

        public StudentBuilder noOfStudents(String noOfStudents) {
            this.noOfStudents = noOfStudents;
            return this;
        }

        public StudentBuilder EUFCalculation(String EUFCalculation) {
            this.EUFCalculation = EUFCalculation;
            return this;
        }

        public StudentBuilder date(String date) {
            this.date = date;
            return this;
        }

        public StudentBuilder QOD(String QOD) {
            this.QOD = QOD;
            return this;
        }

        public StudentBuilder username(String username) {
            this.username = username;
            return this;
        }

        public StudentBuilder password(String password) {
            this.password = password;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    // Getter and setter methods remain the same
    // ...
}
