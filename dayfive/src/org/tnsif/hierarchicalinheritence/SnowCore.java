package org.tnsif.hierarchicalinheritence;
//child class2
public class SnowCore extends Android {

	//private data members
		private int version;
		
		//getters and setters method
		
		public int getVersion() {
			return version;
		}

		public void setVersion(int version) {
			this.version = version;
		}

		//toString() method
	
	@Override
		public String toString() {
			return "SnowCore [version=" + version + ", toString()=" + super.toString() + "]";
		}

	//parameterized constructors
	public SnowCore(String brand, String slotType, int version) {
		super(brand, slotType);
		this.version=version;
	}

}
