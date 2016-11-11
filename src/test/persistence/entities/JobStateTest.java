package persistence.entities;


import com.websystique.springmvc.persistence.entities.JobState;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static com.websystique.springmvc.utils.enums.JobStateEnum.DONE;
import static org.junit.Assert.assertEquals;

public class JobStateTest {

    private JobState jobState;

    @Before
    public void setUp(){
        jobState=new JobState();
        jobState.setJobId(1L);
        jobState.setJobName("TestJobState");
        jobState.setJobState(DONE);
        jobState.setRefreshDate(new Date(25));

    }

    @Test
    public void getterAndsetterTest() {
        assertEquals(new Long(1),jobState.getJobId());
        assertEquals("TestJobState",jobState.getJobName());
        assertEquals(DONE,jobState.getJobState());
        assertEquals(new Date(25), jobState.getRefreshDate());
    }
}
