import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jaewa.BasicChristmasTree;
import com.jaewa.ChristmasTreeDecorator;
import com.jaewa.Lights;

public class ChristmasTreeDecoratorTest{ 
	
	
	ChristmasTreeDecorator tree;
    Lights lights;
	
	@BeforeEach
	public void setUp() {
		tree = new BasicChristmasTree();
        Lights lights =  new Lights();
	}
	
	@Test
    public void testSetUp() {
        System.out.println(tree.decorate());
        assertEquals("Albero di natale",  tree.decorate());
    }

    @Test
    public void testTreeWithLight(){
       assertEquals("Albero di natale con le luci", lights.decorate());
    }
    
}
