package org.optaplanner.examples.cloudbalancing.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

@PlanningEntity
@XStreamAlias("CloudProcess")
public class CloudProcess extends AbstractPersistable {
    
    private int requiredCpuPower;
    
    private int requiredMemory;
    
    private int requiredNetworkBandwidth;
    
    private CloudComputer computer;
    
    public CloudProcess() {
    }
    
    public CloudProcess(Long id, int requiredCpuPower, int requiredMemory, int requiredNetworkBandwidth) {
		super(id);
        this.requiredCpuPower = requiredCpuPower;
        this.requiredMemory = requiredMemory;
        this.requiredNetworkBandwidth = requiredNetworkBandwidth;
    }

	/**
	 * @return the requiredCpuPower
	 */
	public int getRequiredCpuPower() {
		return requiredCpuPower;
	}

	/**
	 * @param requiredCpuPower the requiredCpuPower to set
	 */
	public void setRequiredCpuPower(int requiredCpuPower) {
		this.requiredCpuPower = requiredCpuPower;
	}

	/**
	 * @return the requiredMemory
	 */
	public int getRequiredMemory() {
		return requiredMemory;
	}

	/**
	 * @param requiredMemory the requiredMemory to set
	 */
	public void setRequiredMemory(int requiredMemory) {
		this.requiredMemory = requiredMemory;
	}

	/**
	 * @return the requiredNetworkBandwidth
	 */
	public int getRequiredNetworkBandwidth() {
		return requiredNetworkBandwidth;
	}

	/**
	 * @param requiredNetworkBandwidth the requiredNetworkBandwidth to set
	 */
	public void setRequiredNetworkBandwidth(int requiredNetworkBandwidth) {
		this.requiredNetworkBandwidth = requiredNetworkBandwidth;
	}

	/**
	 * @return the computer
	 */
	@PlanningVariable(valueRangeProviderRefs = {"computerRange"})
	public CloudComputer getComputer() {
		return computer;
	}

	/**
	 * @param computer the computer to set
	 */
	public void setComputer(CloudComputer computer) {
		this.computer = computer;
	}
	
}
