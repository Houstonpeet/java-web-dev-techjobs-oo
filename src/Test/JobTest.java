package Test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.launchcode.techjobs_oo.*;

import javax.lang.model.element.Name;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class JobTest {
    Job test_job1;
    Job test_job2;
    Job test_job3;
    Job test_job4;


    @Before
    public void createJobObject() {

        test_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job2 = new Job("Alien", new Employer("Overlords"), new Location("Space"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        System.out.println(test_job1.getId());
        System.out.println(test_job2);

    }
    @Test
    public void testSettingJobId() {
       assertFalse(test_job1.equals(test_job2));
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Assert.assertEquals(test_job1.getId(), test_job1.getId());
        Assert.assertEquals(test_job1.getName(), "Product tester");
        Assert.assertEquals(test_job1.getEmployer().toString(), "ACME");
        Assert.assertEquals(test_job1.getLocation().toString(), "Desert");
        Assert.assertEquals(test_job1.getPositionType().toString(), "Quality control");
        Assert.assertEquals(test_job1.getCoreCompetency().toString(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertEquals(test_job3, test_job4);
    }

    @Test
    public Override String testToString() {
       return ;
        }


    }



