package ro.dix.algorithms.structures;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dan
 */
public class LeastRecentlyUsedCacheTest {

    @Test
    public void testPutAndGet() {
        System.out.println("put");
        String key = "ana";

        LeastRecentlyUsedCache<String> instance = new LeastRecentlyUsedCache<String>();
        instance.put("ana", "ana");
        instance.put("are", "are");
        instance.get("are");
        instance.get("are");
        instance.get("ana");
        instance.get("ana");
        instance.get("ana");
        instance.put("mere", "mere");
        
        instance.get("mere");
        instance.put("pere", "pere");

        assertEquals(3, instance.pq.size());

        System.out.println("queue: " + Arrays.toString(instance.pq.toArray()));
        
    }
}