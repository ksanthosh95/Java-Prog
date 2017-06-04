package interFace;

public class Threadsample {

		   public static void main(String args[]) {
			   Threadconcept R1 = new Threadconcept( "Animation");
		      R1.start();
		      
		      Threadconcept R2 = new Threadconcept( "Sound");
		      R2.start();
		   }
		   
}
