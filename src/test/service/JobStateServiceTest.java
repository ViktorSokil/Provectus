package service;


import com.websystique.springmvc.dao.IJobStateDao;
import com.websystique.springmvc.persistence.entities.JobState;
import com.websystique.springmvc.service.IJobStateService;
import com.websystique.springmvc.service.impl.JobStateServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

public class JobStateServiceTest {

    @Mock
    private IJobStateDao jobStateDao;

    @InjectMocks
    private IJobStateService jobStateService=new JobStateServiceImpl();

    private JobState jobState;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

    }

    @Test
    public void getJobStateByIdTest() {
        Long jobId = 1L;
        jobStateDao.getJobStateById(jobId);
        verify(jobStateDao).getJobStateById(jobId);
    }

    @Test
    public void updateJobSateTest() {
        Long jobId = 1L;
        jobStateDao.updateJobSate(jobState);
        verify(jobStateDao).updateJobSate(jobState);
    }
}
