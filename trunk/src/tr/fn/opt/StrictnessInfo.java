package tr.fn.opt;

public class StrictnessInfo {
	private BooleanTable booleanTable;
	
	public StrictnessInfo() {
		this.booleanTable = new BooleanTable();
	}
	
	public boolean resultWithArguments(boolean[] values) {
		return booleanTable.isTrue(values);
	}

	public BooleanTable getBooleanTable() {
		return booleanTable;
	}
	
}
