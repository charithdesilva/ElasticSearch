package chades.elasticsearch.elasticsearch;

import org.elasticsearch.client.Client;
import org.elasticsearch.node.Node;
import static org.elasticsearch.node.NodeBuilder.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	Node node = nodeBuilder().clusterName("chades1").node();
	Client client = node.client();
	// on shutdown

	
	//node.close();
    }
}
