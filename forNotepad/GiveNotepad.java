package forNotepad;
import java.io.*;
public class GiveNotepad {
	public static void main(String[] args) {
		try{
			File file=new File("file1.txt");
			file.createNewFile();
			PrintWriter pw=new PrintWriter(file);
			String[] input={"fname","lname","dname","====="};
			int i=0;
			int c=20;
			while(c>=0){
			while(i!=4){
				String x[]=getValues();
				pw.println(input[i]+"="+x[i]);
				pw.flush();
				i++;
			}
			c--;
			i=0;
			}	
			pw.close();
		}catch(IOException e){e.printStackTrace();}}	
	public static String[] getValues(){
		int ind=(int) (Math.random()*8);
		String fname=new String[]{"Joseph","Patel","Verma","Iyer","Kanchwala","Salian","Dalal","Bose"}[ind];
		int y=(int)(Math.random()*8);
		String lname=new String[]{"Tista","Ushma","Nityae","Archana","Qaish","Nikita","Binoy","Arindam"}[y];
		int z=(int)(Math.random()*6);
		String dname=new String[]{"IT","CO","EL","EX","PR","BI"}[z];
		return new String[]{lname,fname,dname,"====="};
	}
}

