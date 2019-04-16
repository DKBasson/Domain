package za.ac.cput.StudentManagementAttendance.factory.StudentTypesFactoryTests;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.StudentManagementAttendance.domain.StudentTypes.MDStudent;
import za.ac.cput.StudentManagementAttendance.factory.StudentTypesFactory.MDStudentPunishmentFactory;

public class MDStudentFactoryTest {

    @Test
    public void testGetMDStudent() throws Exception {
        String name = "Deklerk";
        String surname = "Basson";
        String datesNotAttended = "#2019-04-15#";
        int studentNumber = 216183006;
        int numNotAttended = 1;

        MDStudent c = MDStudentPunishmentFactory.getMDStudent(name, surname, datesNotAttended, studentNumber, numNotAttended);
        System.out.println(c);
        Assert.assertNotNull(c.getsName());
    }
}
