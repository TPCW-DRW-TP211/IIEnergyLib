package org.tp211.integrated_industry.energy;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IIEnergyLib implements ModInitializer {
	public static final String MOD_ID = "iienergylib";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		class PowerEnergy {
			public int volt;
			public int watt;
			public String MachineUUID;
			public int PowerEnergyStatus;
			public int PowerEnergyChange;
			public int UsedWatt;
			public int UsedVolt;
			public String ExtInfo;

			public PowerEnergy(int volt, int watt, String MachineUUID, int PowerEnergyStatus, int PowerEnergyChange, int UsedWatt, int UsedVolt, String ExtInfo) {
				this.volt = volt;
				this.watt = watt;
				this.MachineUUID = MachineUUID;
				this.PowerEnergyStatus = PowerEnergyStatus;
				this.PowerEnergyChange = PowerEnergyChange;
				this.UsedWatt = UsedWatt;
				this.UsedVolt = UsedVolt;
			}
		}
	}
}