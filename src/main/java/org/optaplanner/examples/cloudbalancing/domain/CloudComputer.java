package org.optaplanner.examples.cloudbalancing.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("CloudComputer")
public class CloudComputer extends AbstractPersistable {
    
    private int cpuPower;
    
    private int memory;
    
    private int networkBandwidth;
    
    private int cost;

    public CloudComputer() {
    }
    
    public CloudComputer(Long id, int cpuPower, int memory, int networkBandwidth, int cost) {
		super(id);
        this.cpuPower = cpuPower;
        this.memory = memory;
        this.networkBandwidth = networkBandwidth;
        this.cost = cost;
    }

	/**
	 * @return the cpuPower
	 */
	public int getCpuPower() {
		return cpuPower;
	}

	/**
	 * @param cpuPower the cpuPower to set
	 */
	public void setCpuPower(int cpuPower) {
		this.cpuPower = cpuPower;
	}

	/**
	 * @return the memory
	 */
	public int getMemory() {
		return memory;
	}

	/**
	 * @param memory the memory to set
	 */
	public void setMemory(int memory) {
		this.memory = memory;
	}

	/**
	 * @return the networkBandwidth
	 */
	public int getNetworkBandwidth() {
		return networkBandwidth;
	}

	/**
	 * @param networkBandwidth the networkBandwidth to set
	 */
	public void setNetworkBandwidth(int networkBandwidth) {
		this.networkBandwidth = networkBandwidth;
	}

	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}



}


