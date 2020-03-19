package soft2project;

public class Binary_Hexadecimal {
	
	private Binary_Hexadecimal() {}
	
	public static String BinAdd(int input_one, int input_two){
		int result_three = input_one + input_two;
		// convert the result from integer back to binary and turn it to a string
		String result = Integer.toBinaryString(result_three);
		return result;	
	}
	
	public static String BinSub(int input_one, int input_two){
		int result_three = input_one - input_two;
		// convert the result from integer back to binary and turn it to a string
		String result = Integer.toBinaryString(result_three);
		return result;	
	}
	
	public static String HexAdd(int input_one, int input_two){
		int result_three = input_one + input_two;
		// convert the result from integer back to hex and turn it to a string
		String result = Integer.toHexString(result_three);
		return result;	
	}
	
	public static String HexSub(int input_one, int input_two){
		int result_three = input_one - input_two;
		// convert the result from integer back to hex and turn it to a string
		String result = Integer.toHexString(result_three);
		return result;	
	}
	
	public static String Bin2Dec(int input){
		String result = Integer.toString(input);
		return result;	
	}
	
	public static String Dec2Bin(int input){
		String result = Integer.toBinaryString(input);
		return result;	
	}
	
	public static String Hex2Dec(int input){
		String result = Integer.toString(input);
		return result;	
	}
	
	public static String Dec2Hex(int input){
		String result = Integer.toHexString(input);
		return result;	
	}
	
	public static String Bin2Hex(int input){
		String result = Integer.toHexString(input);
		return result;	
	}
	
	public static String Hex2Bin(int input){
		String result = Integer.toBinaryString(input);
		return result;	
	}

}
