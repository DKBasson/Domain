package za.ac.cput.StudentManagementAttendance.factory.StudentTypesFactoryTests;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.BDStudent;
import za.ac.cput.StudentManagementAttendance.factory.StudentTypesFactory.BDStudentPunishmentFactory;

public class BDStudentFactoryTest {

    @Test
    public void testGetBDStudent() throws Exception {
        String name = "Deklerk";
        String surname = "Basson";
        String datesNotAttended = "#2019-04-15#";
        int studentNumber = 216183006;
        int numNotAttended = 1;

        BDStudent c = BDStudentPunishmentFactory.getBDStudent(name, surname, datesNotAttended, studentNumber, numNotAttended);
        System.out.println(c);
        Assert.assertNotNull(c.getsName());
    }
}

