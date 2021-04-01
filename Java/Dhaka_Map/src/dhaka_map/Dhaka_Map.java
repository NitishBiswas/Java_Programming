package dhaka_map;

import java.util.Scanner;

public class Dhaka_Map {

    private static int n = 5, st, en, INF = 9999, nextNode, m;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] G = {{0, 2, 0, 1, 4}, {2, 0, 3, 0, 0}, {0, 3, 0, 0, 2}, {0, 0, 3, 0, 2}, {0, 0, 0, 2, 0}};
        System.out.print("Enter Starting Location : ");
        st = input.nextInt();
        System.out.print("Enter Ending Location : ");
        en = input.nextInt();

        Dhaka_Map dm = new Dhaka_Map();

        dm.dhakaMap(G, n, st);
        dm.dhakaMap(G, n, en);
    }

    public void dhakaMap(int[][] G, int n, int startnode) {
        int[][] cost = new int[n][n];
        int[] distance = new int[n];
        int[] pred = new int[n];
        int[] visited = new int[n];
        int count, minDistance;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (G[i][j] == 0) {
                    cost[i][j] = INF;
                } else {
                    cost[i][j] = G[i][j];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            distance[i] = cost[startnode][i];
            pred[i] = startnode;
            visited[i] = 0;
        }

        distance[startnode] = 0;
        visited[startnode] = 1;
        count = 1;

        while (count < n - 1) {
            minDistance = INF;

            for (int i = 0; i < n; i++) {
                if (distance[i] < minDistance && visited[i] == 0) {

                    minDistance = distance[i];

                    nextNode = i;

                }
            }

            visited[nextNode] = 1;

            for (int i = 0; i < n; i++) {
                if (visited[i] == 0) {
                    if (minDistance + cost[nextNode][i] < distance[i]) {

                        distance[i] = minDistance + cost[nextNode][i];

                        pred[i] = nextNode;

                    }
                }
            }

            count++;
        }

        if (startnode == st) {
            for (int i = 0; i < n; i++) {

                int a[] = new int[n];
                if (i != startnode) {
                    m = 0;
                }
                {

                    if (i != en) {
                        continue;
                    }
                    System.out.println("Total Distance : " + distance[i]+" km");

                    int j = i;
                    a[m] = j;

                    do {

                        m++;
                        j = pred[j];
                        a[m] = j;

                    } while (j != startnode);

                    System.out.print("Path : ");

                    for (int k = m; k >= 0;) {

                        switch (a[k]) {
                            case 0:
                                System.out.print("Farmgate");
                                break;
                            case 1:
                                System.out.print("Kallanpur");
                                break;
                            case 2:
                                System.out.print("Technical");
                                break;
                            case 3:
                                System.out.print("Kazipara");
                                break;
                            case 4:
                                System.out.print("Mirpur");
                                break;

                        }
                        k--;
                        if (k >= 0) {
                            System.out.print(" -> ");
                        } else {
                            break;
                        }
                    }

                }
            }
        } else if (startnode == en) {
            for (int i = 0; i < n; i++) {

                int a[] = new int[n];
                if (i != startnode) {
                    m = 0;
                }
                {

                    if (i != st) {
                        continue;
                    }
                    System.out.println("\nTotal Distance : " + distance[i]+" km");

                    int j = i;
                    a[m] = j;

                    do {

                        m++;
                        j = pred[j];
                        a[m] = j;

                    } while (j != startnode);

                    System.out.print("Path : ");

                    for (int k = 0; k <= m;) {

                        switch (a[k]) {
                            case 0:
                                System.out.print("Farmgate");
                                break;
                            case 1:
                                System.out.print("Kallanpur");
                                break;
                            case 2:
                                System.out.print("Technical");
                                break;
                            case 3:
                                System.out.print("Kazipara");
                                break;
                            case 4:
                                System.out.print("Mirpur");
                                break;

                        }
                        k++;
                        if (k <= m) {
                            System.out.print(" -> ");
                        } else {
                            break;
                        }
                    }

                }
            }
        }
    }

}

