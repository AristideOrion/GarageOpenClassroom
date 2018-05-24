import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Saver {
	
	public Saver () {};
	//TODO serialize to file
	public <T> void serializeSaver(Garage<T> gar) throws IOException
	{
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(new BufferedOutputStream(
					new FileOutputStream(
							new File("garage.txt"))));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e)
		{
			e.getMessage();
		}
		oos.writeObject(gar);
		oos.close();
	}
	public void saverDeserialize()
	{
		ObjectInputStream ois=null;
		 Garage<?> ga=null;
		try {
			ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("garage.txt"))));
		}catch(IOException e)
		{
			e.getMessage();
		}
		try {
			
			ga=((Garage<?>) ois.readObject());
			  ga.getAllVehicule();
			  ois.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
	}
	
	
		
	

}
