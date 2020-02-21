package org.optaplanner.examples.cloudbalancing.benchmark;

import java.io.File;

import org.optaplanner.benchmark.api.PlannerBenchmark;
import org.optaplanner.benchmark.api.PlannerBenchmarkFactory;
import org.optaplanner.core.api.solver.SolverFactory;
import org.optaplanner.examples.cloudbalancing.domain.CloudBalance;
import org.optaplanner.examples.cloudbalancing.persistence.CloudBalanceRepository;

/**
 * CloudBalancingBenchmarker
 */
public class CloudBalancingBenchmarker {

    public static void main(String[] args) {
        SolverFactory<CloudBalance> solverFactory = SolverFactory
                .createFromXmlResource("org/optaplanner/examples/cloudbalancing/solver/cloudBalancingSolverConfig.xml");
        PlannerBenchmarkFactory benchmarkFactory = PlannerBenchmarkFactory.createFromSolverFactory(solverFactory);

        // Project build directory is provided as an argument to this method
        String projectBuildPath = args[0];
        File dataSetOne = new File(
                projectBuildPath + File.separator + "data/cloudbalancing/unsolved/100computers-300processes.xml");
        CloudBalance cloudBalanceDataSet1 = CloudBalanceRepository.load(dataSetOne);

        PlannerBenchmark benchmark = benchmarkFactory.buildPlannerBenchmark(cloudBalanceDataSet1);
        benchmark.benchmark();
    }

}