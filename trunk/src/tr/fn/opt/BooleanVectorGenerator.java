package tr.fn.opt;

import java.math.BigInteger;

public class BooleanVectorGenerator {
	private BigInteger integer;
	private final int vectorSize;
	private final int bound;
	
	public BooleanVectorGenerator(int vectorSize) {
		if (vectorSize > 10) {
			throw new RuntimeException("Limit of size of boolean vectors is 10");
		}
		this.vectorSize = vectorSize;
		this.bound = (int) Math.pow(2, vectorSize);
		this.integer = BigInteger.valueOf(0);
	}
	
	public boolean hasNext() {
		return integer.intValue() < bound;
	}
	
	public boolean[] next() {
		boolean[] vector = new boolean[vectorSize];
		for (int i = 0; i < vectorSize; i++) {
			vector[i] = integer.testBit(i);
		}
		
		integer = integer.add(BigInteger.valueOf(1));
		
		return vector;
	}
}
