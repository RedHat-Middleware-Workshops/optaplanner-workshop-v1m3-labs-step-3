package org.optaplanner.examples.cloudbalancing.persistence;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.io.File;

import org.junit.Test;
import org.optaplanner.examples.cloudbalancing.domain.CloudBalance;


/**
 * CloudBalanceRepositoryTest
 */
public class CloudBalanceRepositoryTest {


    @Test
    public void testLoadCloudBalance() {
        CloudBalanceRepository repository = new CloudBalanceRepository();
        File inputFile = new File("data/cloudbalancing/unsolved/4computers-12processes.xml");
        CloudBalance cloudBalance = repository.load(inputFile);

        assertThat(4, is(cloudBalance.getComputerList().size()));
        assertThat(12, is(cloudBalance.getProcessList().size()));
    }
    
}
