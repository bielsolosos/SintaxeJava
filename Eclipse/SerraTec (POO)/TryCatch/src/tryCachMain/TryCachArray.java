package tryCachMain;

public class TryCachArray {
	public static void main(String[] Args) {
		//fazer duas listas que cada número tem que dividir com outro
		int[] a1 = {1,2,3,4,5,6,7,8,9,10};
		int[] a2 = {11,12,13};
		
		for(int i = 0; i < a1.length; i++) {
			try{
			System.out.println(i + " = " + " " + (a1[i]/a2[i]));
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Agora esse Array foi pra fora né amigão??? " + e.getMessage());
			}catch(ArithmeticException e) {
				System.out.println("Conta feia pra caralho" + e.getMessage());
			}
		}
		
	}
}
