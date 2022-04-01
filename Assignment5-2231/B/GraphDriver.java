import java.util.*;

public class GraphDriver {

    public static void main (String[] args){

        Graph<String> graph = new Graph(); 
        // add Five vertices to the graph. 
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        
        // building Edges between vertex so that the graph is connected. 
        graph.addEdge("A", "C");
        graph.addEdge("C", "B");
        graph.addEdge("B", "E");
        graph.addEdge("E", "D");
        graph.addEdge("D", "A");
        
        
        System.out.println("Testing implemented methods of graph Class:"); 
        System.out.println();
        System.out.println("Printing the Graph Adjancy Matrix and Vertex Values:"); 
        System.out.println();
        System.out.println(graph); 
        System.out.println("isConnected should be true  |  isConnected = " + graph.isConnected());
        System.out.println("isEmpty should be false  |  isEmpty = " + graph.isEmpty()); 
        System.out.println();
        
        
        // testing by removing some edges 
        graph.removeEdge("A", "C");
        graph.removeEdge("A", "D");
        System.out.println("Removing edge between A-C and C-A"); 
        System.out.println("isConnected should be false  | isConnected = " + graph.isConnected());
        System.out.println("Printing Adjacency Matrix and Verteces values to show updated chagnes"); 
        System.out.println(graph); 
        
        
        graph.removeEdge(3, 25); 
        System.out.println("Trying to pass invalid index 25 to removeEdge | Nothing should happen. Graph won't change");
        graph.addEdge("Y", "Z");
        System.out.println("Trying to add an Edge between non existing vertices Y-Z | Nothing will happen. Graph won't change"); 
        System.out.println("Printing Verteces values and matrixVertices to show nothing really happened to the graph"); 
        System.out.println(graph); 
        System.out.println(); 
        
        //add a new vertext to expand capacity, 
        System.out.println("Adding new unconnected Vertex F to trigger expand capacity"); 
        graph.addVertex("F");
        System.out.println("Default Capacity is 5. Since over-bound error occured means expand capacity executed which increases size of graph to 6");
        System.out.println("Size of the graph after adding F vertex should be 6 = " + graph.size()); 
        System.out.println("The index of vertex F should be (6-1=5) | Vertex F index = " + graph.getIndex("F")); 
        System.out.println("Size of the graph should be 6 Vertecies | Size  of graph = " + graph.size()); 
        System.out.println("Index of non existent vertex Z should be -1 | index of vertex Z = " + graph.getIndex("Z")); 
        System.out.println(); 
        
       
        // testing remove vertex
        try {
        	System.out.println("Trying to remove the non existent vertex Z"); 
        	graph.removeVertex("Z");
        } catch (ElementNotFoundException e) {
        	System.out.println(e.getMessage()); 
        }
        
        System.out.println(); 
        System.out.println("Removing vertex C"); 
        graph.removeVertex("C");
        System.out.println("Printing values of graph after vertex C is removed"); 
        System.out.println(graph); 
        
        
    }
}
