package com.rockwellcollins.atc.agree.codegen.ast;

import com.rockwellcollins.atc.agree.codegen.visitors.MATLABTypeVisitor;

public class MATLABInt32Type extends MATLABType {

	public final int defaultValue = 0;
	public final String name = "int32";
	
	@Override
	public <T> T accept(MATLABTypeVisitor<T> visitor) {
		return visitor.visit(this);
	}

	@Override
	public String getValueStr() {
		return Integer.toString(defaultValue);
	}
	
	public String toString() {
		return name;
	}
	
}
