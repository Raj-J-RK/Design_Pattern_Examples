package com.rk.dp.creational.builder;

public class Computer {
	
	private String cpu;
	private String hdd;
	private String ram;
	private boolean graphicEnabled;
	private boolean wifiEnabled;
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public boolean isGraphicEnabled() {
		return graphicEnabled;
	}
	public void setGraphicEnabled(boolean graphicEnabled) {
		this.graphicEnabled = graphicEnabled;
	}
	public boolean isWifiEnabled() {
		return wifiEnabled;
	}
	public void setWifiEnabled(boolean wifiEnabled) {
		this.wifiEnabled = wifiEnabled;
	}
	
	@Override
	public String toString() {
		return "Computer [cpu=" + cpu + ", hdd=" + hdd + ", ram=" + ram + ", graphicEnabled=" + graphicEnabled
				+ ", wifiEnabled=" + wifiEnabled + "]";
	}
	
	private Computer(ComputerBuilder builder) {
		this.ram = builder.ram;
		this.hdd = builder.hdd;
		this.cpu = builder.cpu;
		this.graphicEnabled = builder.graphicEnabled;
		this.wifiEnabled = builder.wifiEnabled;
	}
	
	public static class ComputerBuilder {

		private String cpu;
		private String hdd;
		private String ram;
		private boolean graphicEnabled;
		private boolean wifiEnabled;
		
		public ComputerBuilder(String ram, String hdd, String cpu) {
			this.ram=ram;
			this.hdd=hdd;
			this.cpu=cpu;
		}
		
		public ComputerBuilder setGraphicsEnabled(boolean graphicEnabled) {
			this.graphicEnabled = graphicEnabled;
			return this;
		}
		
		public ComputerBuilder setWifiEnabled(boolean wifiEnabled) {
			this.wifiEnabled = wifiEnabled;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}
	
}



