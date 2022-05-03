package Graph;
import java.util.*;
public class prims
{
    public static void prims(int matrix[][]) {
        int n = matrix.length;
        boolean visited[] = new boolean[n];
        int parent[] = new int[n];
        int weight[] = new int[n];

        parent[0] = -1;
        weight[0] = 0;
        for (int i = 1; i < n; i++) {
            weight[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < n; i++)
        {
            int minvertix = findminimum(visited, weight);
            visited[minvertix] = true;

            for (int j = 0; j < n; j++)
            {
                if (matrix[minvertix][j] != 0 && !visited[j])
                {
                    if (weight[j] > matrix[minvertix][j])
                    {
                        weight[j] = matrix[minvertix][j];
                        parent[j] = minvertix;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++)
        {
            if (i < parent[i])
            {
                System.out.println(i + " " + parent[i] + " " + weight[i]);
            } else
                System.out.println(parent[i] + " " + i + " " + weight[i]);
        }
    }

    private static int findminimum(boolean[] visited , int[] weight)
    {
        int minvertix = -1;
        for(int i=0;i<visited.length;i++)
        {
            if(!visited[i] && (minvertix==-1 || weight[i]<weight[minvertix]))
            {
                minvertix = i;
            }
        }
        return minvertix;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of nodes");
        int n = sc.nextInt();
        System.out.println("enter the number of edges");
        int e = sc.nextInt();
        int matrix[][]=new int[n][n];
        for(int i =0;i<e;i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();

            matrix[v1][v2]=weight;
            matrix[v2][v1]=weight;
        }
        prims(matrix);
    }
}
