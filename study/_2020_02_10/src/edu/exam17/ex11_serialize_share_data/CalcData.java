package edu.exam17.ex11_serialize_share_data;

import java.io.Serializable;

public class CalcData implements Serializable{
	public int op0;
	public int op1;
	public String opCode;
	public int result;
	public CalcData(int op0, int op1, String opCode) {
		this.op0 = op0;
		this.op1 = op1;
		this.opCode = opCode;
		result = 0;
	}
	
	public String toString() {
		return op0 + " " +  opCode + " " + op1 + " = " + result;
	}
}





