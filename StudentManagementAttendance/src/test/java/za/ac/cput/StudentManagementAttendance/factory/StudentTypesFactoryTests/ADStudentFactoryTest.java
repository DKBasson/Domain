package za.ac.cput.StudentManagementAttendance.factory.StudentTypesFactoryTests;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.ADStudent;
import za.ac.cput.StudentManagementAttendance.factory.StudentTypesFactory.ADStudentPunishmentFactory;

public class ADStudentFactoryTest {

    @Test
    public void testGetADStudent() throws Exception {
        String name = "Deklerk";
        String surname = "Basson";
        String datesNotAttended = "#2019-04-15#";
        int studentNumber = 216183006;
        int numNotAttended = 1;

        ADStudent c = ADStudentPunishmentFactory.getADStudent(name, surname, datesNotAttended, studentNumber, numNotAttended);
        System.out.println(c);
        Assert.assertNotNull(c.getsName());
    }
}