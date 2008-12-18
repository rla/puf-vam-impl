package tr.fn.opt;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Extremely primitive and inefficient implementation
 * of true table.
 */
public class BooleanTable {
	private Set<TableRow> tableRows;
	
	public BooleanTable() {
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
	
	private static class TableRow {
		private boolean[] values;

		public TableRow(boolean[] values) {
			this.values = values;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
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
