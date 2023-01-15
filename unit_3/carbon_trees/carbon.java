import java.util.*;

class Main {
    public static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) {
        usr_in();
    }

    // user input
    public static void usr_in() {
        System.out.print(":Enter number of trees in cluser\n> ");
        int tree_count = kb.nextInt();

        double[][] tree_data = new double[tree_count][];
        System.out.printf("\n:Enter tree height and diameter in cm formatted as [H D] %dx\n-----\n", tree_count);
        for (int tree=0; tree<tree_count; tree++) {
            // take in measurement
            boolean stupid;
            do {
                System.out.printf("Tree: %d\n> ", tree+1);
                double height = kb.nextDouble();
                double diameter = kb.nextDouble();

                // handle err 
                if (height<30.48) {
                    System.out.println("--\nErr. Height must be greater than 30.48 cm");
                    stupid = true;
                } else if (diameter<2.0) {
                    System.out.println("--\nErr. Diameter must be greater than 2.0 cm");
                    stupid = true;
                } else {
                    tree_data[tree] = tree_calc(height, diameter);
                    System.out.println();
                    stupid = false;
                }
            } while (stupid);
        }
        out(tree_data);
    }

    // program logic
    public static double[] tree_calc(double height, double diameter) {
        double green_weight = 0;
        if (diameter < 28) {
            green_weight += (0.0577 * height * (Math.pow(diameter, 2)));  // kg
        } else if (diameter >= 28) {
            green_weight += (0.0346 * height * (Math.pow(diameter, 2)));  // kg
        }

        double carbon_mass = 0.25 * green_weight;
        double CO2_stored = 3.67 * carbon_mass;

        double[] calc_arr = new double[5];
        calc_arr[0] = height;
        calc_arr[1] = diameter;
        calc_arr[2] = green_weight;
        calc_arr[3] = carbon_mass;
        calc_arr[4] = CO2_stored;

        return calc_arr;
    }

    // print out
    public static void out(double[][] tree_data) {
        bad_cls(5);
        System.out.printf("%16s%10s%10s%10s%10s\n", "Height", "Diameter", "Mass", "Carbon", "CO2");
        System.out.printf("%16s%10s%10s%10s%10s\n", "------", "--------", "----", "------", "---");
        double total_co2 = 0;

        for (int tree=0; tree<tree_data.length; tree++) {
            System.out.printf("Tree %d: %8.2f%10.2f%10.2f%10.2f%10.2f\n", tree+1, tree_data[tree][0], tree_data[tree][1], tree_data[tree][2], tree_data[tree][3], tree_data[tree][4]);
            total_co2 += tree_data[tree][4];
        }
        System.out.printf("\nTotal CO2: %.2f\n\n", total_co2);

        for (double[] tree: tree_data) {
            //System.out.println(Arrays.toString(tree));
        }
    }

    // clear screen but stupid
    public static void bad_cls(int rep) {
        while (rep>0) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n");
            rep--;
        }
    }
}


