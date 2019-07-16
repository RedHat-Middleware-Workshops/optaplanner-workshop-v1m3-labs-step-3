package org.optaplanner.examples.cloudbalancing;

import java.io.File;

import org.junit.Test;
import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;
import org.optaplanner.examples.cloudbalancing.domain.CloudBalance;
import org.optaplanner.examples.cloudbalancing.persistence.CloudBalanceRepository;

/**
 * CloudBalancingSolverTest
 */
public class CloudBalancingSolverTest {

    @Test
    public void testSolver() {
        //Create the solver from our solver configuration.
        SolverFactory<CloudBalance> solverFactory = SolverFactory.createFromXmlResource("org/optaplanner/examples/cloudbalancing/solver/cloudBalancingSolverConfig.xml");
        Solver<CloudBalance> solver = solverFactory.buildSolver();

        //Loud a problem into the PlanningSolution
        CloudBalanceRepository repository = new CloudBalanceRepository();
        File inputFile = new File("data/cloudbalancing/unsolved/100computers-300processes.xml");
        CloudBalance cloudBalance = repository.load(inputFile);

        //Run the solver.
        solver.solve(cloudBalance);

    }
}