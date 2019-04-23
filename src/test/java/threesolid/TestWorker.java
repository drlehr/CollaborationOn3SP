package threesolid;
/* Adding comment to kick off  a build */

import org.junit.jupiter.api.BeforeAll;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


/*
public class TestWorker {

   private  Worker w = new Worker();
	
   @Test
   @DisplayName("No Name Test")
   public void testWorkerWithNoName()
   {
      assertEquals(w.getName(),"");
      assertEquals(w.work(),"I'm working already!");
   }
   
*/
   @Test
   @DisplayName("A + B")
   public void testAandB()
   {
      assertTrue((w.addpositive(1,4)),"message");
   }


   @Test
   @DisplayName("With Name Test")
   public void testWorkerWithName()
   {
      w.setName("Corvus Glaive");
      assertEquals(w.getName(),"Corvus Glaive");
      assertEquals(w.work(),"Corvus Glaive is working very hard!");
   }

}