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
        
        PlannerBenchmarkFactory benchmarkFactory = PlannerBenchmarkFactory.createFromXmlResource("org/optaplanner/examples/cloudbalancing/benchmark/cloudBalancingBenchmarkConfig.xml");
        PlannerBenchmark benchmark = benchmarkFactory.buildPlannerBenchmark();
        benchmark.benchmark();
    }

}