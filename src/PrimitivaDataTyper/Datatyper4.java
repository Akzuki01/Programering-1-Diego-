package PrimitivaDataTyper;
import java.lang.*;
import java.math.BigDecimal;

public class Datatyper4 {
	public static void main(String[] args) {
		float x = 451.326412f;
		BigDecimal result;
		int decima_place = 4; 
		BigDecimal bd_num = new BigDecimal(Float.toString(x));
		bd_num = bd_num.setScale(decimal_place, BigDecimal.Round.HALF_UP);
		System.out.print("Orginal number: %.7f\n" ,x);
		System.out.println("Rounded up to 4 decimal:"+bd_num);
	}
}
