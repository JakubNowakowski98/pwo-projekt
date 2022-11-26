package pwo.discrete_knapsack_problem;

import pwo.discrete_knapsack_problem.Discrete_knapsack_problem;
import pwo.products.Products;
import pwo.products.Products_template;

public class GetData {

    public static int[] compute() {

        Products_template[] products = Products.set_products();
        int n = products.length;
        int[] indexes = new int[n];
        indexes = Discrete_knapsack_problem.knapSack(30);
        for (int i = 0; i < n; i++) {
            if(indexes[i] != -1)
            {
                System.out.println("Nazwa: " + products[indexes[i]].name + ", waga: " + products[indexes[i]].weight +", cena: " + products[indexes[i]].value + "\n");
            }
        }
        return indexes;
    }
}
