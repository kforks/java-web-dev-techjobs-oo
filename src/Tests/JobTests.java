package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;


public class JobTests {

    @Test
    public void testSettingJobId() {
       Job job1 = new Job();
       Job job2 = new Job();
        assertEquals(false, job1.equals(job2));
        assertEquals(1,job2.getId() - job1.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        ;

        assertEquals(true, job3.getName() instanceof String );
        assertEquals(true, job3.getEmployer() instanceof Employer );
        assertEquals(true, job3.getLocation() instanceof Location );
        assertEquals(true, job3.getPositionType() instanceof PositionType );
        assertEquals(true, job3.getCoreCompetency() instanceof CoreCompetency );

        assertEquals("Product tester", job3.getName() );
        assertEquals("ACME", job3.getEmployer().getValue() );
        assertEquals("Desert", job3.getLocation().getValue());
        assertEquals("Quality control", job3.getPositionType().getValue());
        assertEquals("Persistence", job3.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality() {
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));;
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));;

        assertEquals(false, job4.equals(job5));
    }

    @Test
    public void testToString() {
        Job job6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));;

        assertEquals("\nID: 3\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n" , job6.toString());
    }
    @Test
    public void testIsDataAvailable() {
        Job job7 = new Job("Product tester", new Employer("ACME"), new Location(), new PositionType("Quality control"), new CoreCompetency("Persistence"));;

        assertEquals("\nID: 4\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Data not available\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence\n" , job7.toString());
    }

    @Test
    public void testDoesJobExist() {
        Job job1 = new Job();

        assertEquals("OOPS! This job does not seem to exist.", job1.toString());
    }



}
