package za.ac.cput.StudentManagementAttendance.domain.mains;

public class Person {
    private String personName, personSurname;

    public Person(Builder builder) {
        this.personName = builder.personName;
        this.personSurname = builder.personSurname;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonSurname() {
        return personSurname;
    }

    public void setPersonSurname(String personSurname) {
        this.personSurname = personSurname;
    }

    public static class Builder{
         String personName, personSurname;

               public Builder personName(String personName){
            this.personName = personName;
            return this;
        }
        public Builder personSurname(String personSurname){
            this.personSurname = personSurname;
            return this;
        }
        public Person.Builder copy(Person student){
            this.personName = student.personName;
            this.personSurname = student.personSurname;



            return this;
        }
        public Person build(){
            return new Person(this);
        }

    }



    @Override
    public String toString() {
        return "Person{" +
                "personName='" + personName + '\'' +
                ", personSurname='" + personSurname + '\'' +
                '}';
    }
}
