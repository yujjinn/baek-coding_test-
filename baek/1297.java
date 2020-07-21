import java.util.*;

public class Main
{    
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long vert = sc.nextLong();
		long h = sc.nextLong();
		long w = sc.nextLong();
		double x = (double)vert*vert/(double)(h*h+w*w); // *** 여기 형 변환 안 해줘서 처음에 틀렸음
		System.out.println((int)(h*Math.sqrt(x))+ " " +(int)(w*Math.sqrt(x)) );    
        // int 써도 되고 Math.floor() 써도 된다
        // System.out.println((long)Math.floor(h*Math.sqrt(x))+ " " +(long)Math.floor(w*Math.sqrt(x)) );
    }
}
