import static org.junit.Assert.*;  
import hello;
import org.junit.Test;  
  
public class TestHelloWorld {  
  
    @Test  
    public void testMessage(){  
        assertTrue( HelloWorld.getMessage().contains('Hello'));  
    }  
}  
