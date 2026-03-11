import java.util.Scanner;

/**
 * Assignment 1: Nonlinear System Simulation - Logistic Map
 * Description: This program simulates a discrete-time dynamic system 
 * to demonstrate how population growth transitions from stability to chaos.
 */
class PopulationModel {
    /**
     * Executes the Logistic Map iteration: x_{n+1} = r * x_n * (1 - x_n)
     * @param x Initial population ratio (0 to 1)
     * @param r Growth rate parameter
     * @param iterations Number of generations to simulate
     */
    public void simulate(double x, double r, int iterations) {
        System.out.println("\n--- Starting Iterative Computation ---");
        System.out.printf("%-15s | %-15s%n", "Generation", "Population Ratio");
        System.out.println("---------------------------------------");

        for (int i = 0; i <= iterations; i++) {
            System.out.printf("Gen %-11d | %.10f%n", i, x);
            
            // Core Mathematical Model
            x = r * x * (1 - x); 
            
            // Early exit if the population becomes extinct
            if (x <= 0 && i < iterations) {
                System.out.println("System Alert: Population reached extinction.");
                break;
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("Simulation process completed.\n");
    }
}

public class JAVA_0303_Assignments_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PopulationModel model = new PopulationModel();

        System.out.println("===============================================");
        System.out.println("   Nonlinear System Simulation: Logistic Map   ");
        System.out.println("===============================================");
        
        // User Input Handling
        System.out.print("Enter initial population ratio x0 (0.0 - 1.0): ");
        double x0 = scanner.nextDouble();
        
        System.out.print("Enter growth rate r (e.g., 2.5, 3.5, or 3.9): ");
        double r = scanner.nextDouble();
        
        System.out.print("Enter number of iterations (e.g., 100): ");
        int iterations = scanner.nextInt();

        // Method Invocation
        model.simulate(x0, r, iterations);

        System.out.println("Instructions: Capture the terminal output for your IEEE paper.");
        scanner.close();
    }
}