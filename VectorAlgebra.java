package VectorAlgebra;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 * @author: Bit Jet Kit
 * Title: Vector.java
 * Date: April 3, 2021
 * Purpose: In the physical sciences and engineering, mathematics is required.
 *          This class defines commonly used vector algebra.
 */
public class VectorAlgebra {
    // Declare the Scanner.
    Scanner readUserInput = new Scanner(System.in);
    // Declare the Vectors.
    private List<Double> a = new Vector<Double>();
    private List<Double> b = new Vector<Double>();
    private List<Double> c = new Vector<Double>();
    private List<Double> d = new Vector<Double>();
    // Declare the Vector sizes.
    private int vectorASize;
    private int vectorBSize;
    private int vectorCSize;
    private int vectorDSize;
    // These are the accessors.
    public void setVectorASize(){
        System.out.println("Define the size of vector A: ");
        vectorASize = readUserInput.nextInt();
    }
    public void setVectorBSize(){
        System.out.println("Define the size of vector B: ");
        vectorBSize = readUserInput.nextInt();
    }
    public void setVectorCSize(){
        System.out.println("Define the size of vector C: ");
        vectorCSize = readUserInput.nextInt();
    }
    public void setVectorDSize(){
        System.out.println("Define the size of vector D: ");
        vectorDSize = readUserInput.nextInt();
    }
    
    // This defines the Scalar Product^a algorithm.
    public void solveScalar(){
        // TO-DO: define the Scalar Product.
    }
}
