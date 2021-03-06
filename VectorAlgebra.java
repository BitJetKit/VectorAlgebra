package VectorAlgebra;

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
    // TO-DO: To the limit, n, make a user-defined vector count.
    private Vector<Double> a = new Vector<Double>();
    private Vector<Double> b = new Vector<Double>();
    private Vector<Double> c = new Vector<Double>();
    private Vector<Double> d = new Vector<Double>();
    // Instantiate the Vector sizes.
    private int vectorASize;
    private int vectorBSize;
    private int vectorCSize;
    private int vectorDSize;
    // Instantiate the Vector content variable.
    private double x;
    // Declare the solution variables.
    private double dotProduct = 0.0;
    private Vector<Double> crossProduct = new Vector<Double>();
    // These are the accessors.
    public void setVectorASize(){
        System.out.println("Define the size of vector A: ");
        vectorASize = readUserInput.nextInt();
        a.setSize(vectorASize);
    }
    public void setVectorBSize(){
        System.out.println("Define the size of vector B: ");
        vectorBSize = readUserInput.nextInt();
        b.setSize(vectorBSize);
    }
    public void setVectorCSize(){
        System.out.println("Define the size of vector C: ");
        vectorCSize = readUserInput.nextInt();
        c.setSize(vectorCSize);
    }
    public void setVectorDSize(){
        System.out.println("Define the size of vector D: ");
        vectorDSize = readUserInput.nextInt();
        d.setSize(vectorDSize);
    }
    // TO-DO: To the limit n vectors, consolidate these vector content adders. 
    public void setVecAContents(){
        for(int i = 0; i < vectorASize; i++){
            System.out.println("Enter vector a, variable " + (i + 1));
            x = readUserInput.nextDouble();
            a.add(x);
        }
    }
    public void setVecBContents(){
        for(int i = 0; i < vectorBSize; i++){
            System.out.println("Enter vector b, variable " + (i + 1));
            x = readUserInput.nextDouble();
            b.add(x);
        }
    }
    public void setVecCContents(){
        for(int i = 0; i < vectorCSize; i++){
            System.out.println("Enter vector c, variable " + (i + 1));
            x = readUserInput.nextDouble();
            c.add(x);
        }
    }
    public void setVecDContents(){
        for(int i = 0; i < vectorDSize; i++){
            System.out.println("Enter vector d, variable " + (i + 1));
            x = readUserInput.nextDouble();
            d.add(x);
        }
    }
    // TO-DO: Make these compatible with n vectors.
    // This defines the Scalar Product^a algorithm.
    public void solveScalar(){
        // This is the base version: of 2 vectors, get the dot product.
        for(int i = 0; i < vectorASize; i++){
            dotProduct += (a.get(i) * b.get(i));
        }                 
        System.out.println("Of vectors a and b, the dot product is: " + dotProduct);
    }
    // This defines the Cross Product algorithm.
    public void solveCross(){
        // This is the base version: of 2 vectors, get the cross product.
            int i = 0;
            int j = 0;
            String crossProductI;
            String crossProductJ;
            // Of the cross product, this is the i variable. 
            crossProduct.add((a.get(i+1) * b.get(b.size() - 1) - a.get(a.size()) * b.get(i + 1)));
            crossProductI = String.valueOf(crossProduct.get(0)) + "i";
            // Of the cross product, this is the j variable.
            crossProduct.add((a.get(i) * b.get(vectorASize)) - a.get(a.size()) * b.get(i));
            crossProductJ = String.valueOf(crossProduct.get(1)) + "j";
    }
}
