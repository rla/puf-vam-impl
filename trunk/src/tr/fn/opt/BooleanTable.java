package tr.fn.opt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Extremely primitive and inefficient implementation
 * of truth values table.
 */
public class BooleanTable {
	private final int numberOfColumns;
	private final Set<TableRow> tableRows;
	
	public BooleanTable(int numberOfColumns) {
		this.numberOfColumns = numberOfColumns;
		tableRows = new HashSet<TableRow>();
	}
	
	public boolean isTrue(boolean[] values) {
		return tableRows.contains(new TableRow(values));
	}
	
	public void assertTrue(boolean[] values) {
		tableRows.add(new TableRow(values));
	}
	
	public void assertFalse(boolean[] values) {
		tableRows.remove(new TableRow(values));
	}
	
	public void assertValue(boolean[] values, boolean result) {
		if (result) {
			assertTrue(values);
		} else {
			assertFalse(values);
		}
	}
	
	public boolean isTrueWithNthArgumentFalse(int argument) {
		for (TableRow row : tableRows) {
			if (!row.values[argument]) {
				return true;
			}
		}
		
		return false;
	}
	
	public int getNumberOfColumns() {
		return numberOfColumns;
	}

	private static class TableRow {
		private boolean[] values;

		public TableRow(boolean[] values) {
			this.values = values;
		}

		@Override
		public int hashCode() {
			int prime = 31;
			int result = 1;
			result = prime * result + Arrays.hashCode(values);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (getClass() != obj.getClass()) {
				return false;
			}
			TableRow other = (TableRow) obj;
			if (!Arrays.equals(values, other.values)) {
				return false;
			}
			return true;
		}
		
	}
	
}
