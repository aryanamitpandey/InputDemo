import java.io.*;

class InputDemo{

	public static void main(String args[]){

		DataInputStream sc = new DataInputStream(System.in);

		try{

			System.out.println(" Enter the Integer value = ");
			String str = sc.readLine();
			int x = Integer.parseInt(str);

			System.out.println(" The Integer value = " + x);

		}
	    catch(Exception e){}
	} 

}