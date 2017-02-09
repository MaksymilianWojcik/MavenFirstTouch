package mavik.mavenik;

import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App 
{
	static boolean hasInternet = false;
    public static void main( String[] args )
    {
    	 adnoChecker();
        //System.out.println( "Hello World!" );
        new App();
    
    }
    
    
    public App(){
    	
    }
    
    @InfoAdno(info = "testowa adnotacja", usingInternet = true)
    public void testAdd(){
    	// nic nie robi ta metoda
    	
    }
    
    
    @InfoAdno(info = "metoda run ktora uruchamia cos tam", usingInternet = false)
    public void run(){
    	
    	//nic nie robi metoda
    }
    
    
    private static void adnoChecker(){
    	App app = new App();
    	for(Method m : app.getClass().getDeclaredMethods()){
    		if(m.isAnnotationPresent(InfoAdno.class)){
    			InfoAdno adno = m.getAnnotation(InfoAdno.class);
    			//System.out.println("-------------------");
    			//System.out.println("Nazwa metody: " + m.getName());

    			//System.out.println("Opis metody: " + adno.info());
    			
    			if(adno.usingInternet()){
    				if(!hasInternet){
    					System.out.println(m.getName() + ": " + adno.info());
    				}
    			}
    			
    		}
    	}
    }
}
