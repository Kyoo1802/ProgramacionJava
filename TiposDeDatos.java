class TiposDeDatos {
	public static void main(String args[]){
		// Tipos numericos

		// 8 bits
                byte byte_value = 123;
                System.out.println(byte_value);
	
		// 16 bits
		short short_value = 12123;
                System.out.println(short_value);

		// 32 bits
		int int_value = 12312312;
                System.out.println(int_value);

		// 64 bits
		long long_value = 12312312312312L;
                System.out.println(long_value);

		// 32 bits
		float float_value = 213.12f;
		System.out.println(float_value);

		// 64 bits
		double double_value = 123123123.12;
		System.out.println(double_value);


		// Cast implicito
		short short_value1 = byte_value;
                // No cast
		short short_value2 = short_value;
		// Cast explicito
		short short_value3 = (short)int_value;
		long long_value1 = (long)double_value;
		short short_value4 = (short)float_value; 
		System.out.println(short_value4);
		byte byte_value1 = (byte)float_value;
		System.out.println(byte_value1);

		// Tipos texto
			
		// Codigo ASCII
		char value_c1 = 65;
		char value_c2 = 'h';

		String value_str1 = "";
		String value_str2 = "a";
		String value_str3 = "Rodrigo San Martin Monroy_?/\"";

		// Tipo boolean
		boolean value_bool1 = true;
		boolean value_bool2 = false; 
	}
}
