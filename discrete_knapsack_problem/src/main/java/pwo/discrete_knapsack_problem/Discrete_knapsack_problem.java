package pwo.discrete_knapsack_problem;

import pwo.products.Products;
import pwo.products.Products_template;

public class Discrete_knapsack_problem {

    /*static int max(int a, int b) {
        return (a > b) ? a : b;
    }*/
    static int[] knapSack(int W) {// maximum weight of knapsack
        Products_template[] products = Products.set_products();
        int N = products.length;   // number of items

        int[] profit = new int[N + 1];
        int[] weight = new int[N + 1];

        // generate random instance, items 1..N
        for (int n = 1; n <= N; n++) {
            profit[n] = products[n - 1].value;
            weight[n] = products[n - 1].weight;
        }
        int[] indexes = new int[N];
        for (int j = 0; j < N; j++) {
            indexes[j] = -1;
        }
        int[][] opt = new int[N + 1][W + 1];
        boolean[][] sol = new boolean[N + 1][W + 1];

        for (int n = 1; n <= N; n++) {
            for (int w = 1; w <= W; w++) {

                // don't take item n
                int option1 = opt[n - 1][w];

                // take item n
                int option2 = Integer.MIN_VALUE;
                if (weight[n] <= w) {
                    option2 = profit[n] + opt[n - 1][w - weight[n]];
                }

                // select better of two options
                opt[n][w] = Math.max(option1, option2);
                sol[n][w] = (option2 > option1);
            }
        }

        // determine which items to take
        boolean[] take = new boolean[N + 1];
        int z = N-1;
        for (int n = N, w = W; n > 0; n--) {
            if (sol[n][w]) {
                take[n] = true;
                indexes[z] = n-1;
                w = w - weight[n];
                z--;
            } else {
                take[n] = false;
            }
        }
        return indexes;
    }
}
