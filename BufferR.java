import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

	public class BufferR{
			BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	    public int ingresarNumero(){
	    int num=0;
	    try {
	        num=Integer.parseInt(bf.readLine());
	    } catch (IOException ioe) {
	        System.out.println("***ERROR***");
	        System.exit(1);
	    }
	    return num;
	    }
	    public char ingresarSigno(){
	        char sign=0;

	        try {
	            sign=bf.readLine().charAt(0);
	        } catch (IOException ioe) {
	            System.out.println("***ERROR***");
	            System.exit(1);
	        }
	        return sign;
	}
}

		

