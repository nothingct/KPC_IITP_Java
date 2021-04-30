package java_20210430;

public class CastingDemo {
	public static void main(String[] args) {
		//overflow 발생 하여 컴파일 에러 
		//byte b1 = 120; 
		
		//circuit 발생 (권장하지 않음 ) 
		byte b1 = (byte)(129); 
		System.out.println(b1);
		
		//cut 발생 ( 유용하게 쓰일 때가 있음 )
		int i1 = (int)129.25;
		System.out.println(i1);
		
		//auto-casting (자동 형변환 ) 
		double d1 = 124.5f;
		System.out.println(d1);
		
		System.out.println(3.14+2);
	}
}
