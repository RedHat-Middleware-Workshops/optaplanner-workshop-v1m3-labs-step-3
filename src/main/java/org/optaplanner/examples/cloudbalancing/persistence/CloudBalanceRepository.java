package org.optaplanner.examples.cloudbalancing.persistence;

import java.io.File;

import org.optaplanner.examples.cloudbalancing.domain.CloudBalance;
import org.optaplanner.examples.cloudbalancing.domain.CloudComputer;
import org.optaplanner.examples.cloudbalancing.domain.CloudProcess;
import org.optaplanner.persistence.xstream.impl.domain.solution.XStreamSolutionFileIO;

public class CloudBalanceRepository {

    public static CloudBalance load(File inputSolutionFile) {
        XStreamSolutionFileIO<CloudBalance> solutionFileIO = new XStreamSolutionFileIO<>(CloudBalance.class,
                CloudProcess.class, CloudComputer.class);
        return solutionFileIO.read(inputSolutionFile);
    }
}