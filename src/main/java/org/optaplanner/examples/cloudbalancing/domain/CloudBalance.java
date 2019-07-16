package org.optaplanner.examples.cloudbalancing.domain;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

@PlanningSolution
@XStreamAlias("CloudBalance")
public class CloudBalance extends AbstractPersistable {
    
    private List<CloudComputer> computerList;
    
	private List<CloudProcess> processList;
	
	private HardSoftScore score;
    
    public CloudBalance() {
    }

    public CloudBalance(Long id, List<CloudComputer> computerList, List<CloudProcess> processList) {
		super(id);
        this.computerList = computerList;
        this.processList = processList;
    }

	/**
	 * @return the computerList
	 */
	@ValueRangeProvider(id = "computerRange")
	public List<CloudComputer> getComputerList() {
		return computerList;
	}

	/**
	 * @param computerList the computerList to set
	 */
	public void setComputerList(List<CloudComputer> computerList) {
		this.computerList = computerList;
	}

	/**
	 * @return the processList
	 */
	@PlanningEntityCollectionProperty
	public List<CloudProcess> getProcessList() {
		return processList;
	}

	/**
	 * @param processList the processList to set
	 */
	public void setProcessList(List<CloudProcess> processList) {
		this.processList = processList;
	}

	/**
	 * @return the score
	 */
	@PlanningScore
	public HardSoftScore getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(HardSoftScore score) {
		this.score = score;
	}
    
}
