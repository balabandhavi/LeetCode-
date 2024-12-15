import java.util.*;

public class Conversions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the initial currency
        String initialCurrency = sc.nextLine();

        // Read day 1 data
        int n = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        List<List<String>> pairs1 = new ArrayList<>();
        double[] rates1 = new double[n];

        for (int i = 0; i < n; ++i) {
            List<String> c = new ArrayList<>();
            c.add(sc.nextLine());
            c.add(sc.nextLine());
            pairs1.add(c);
            rates1[i] = sc.nextDouble();
            sc.nextLine(); // Consume the leftover newline
        }

        // Read day 2 data
        int m = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        List<List<String>> pairs2 = new ArrayList<>();
        double[] rates2 = new double[m];

        for (int i = 0; i < m; ++i) {
            List<String> c = new ArrayList<>();
            c.add(sc.nextLine());
            c.add(sc.nextLine());
            pairs2.add(c);
            rates2[i] = sc.nextDouble();
            sc.nextLine(); // Consume the leftover newline
        }

        // Call the function and print the result
        Conversions solver = new Conversions();
        System.out.println(solver.maxAmount(initialCurrency, pairs1, rates1, pairs2, rates2));

        sc.close();
    }

    public static double maxAmount(String initialCurrency, List<List<String>> pairs1, double[] rates1,
                            List<List<String>> pairs2, double[] rates2) {

        Map<String, Map<String, Double>> graph1 = buildGraph(pairs1, rates1);
        Map<String, Map<String, Double>> graph2 = buildGraph(pairs2, rates2);

        Map<String, Map<String, Double>> maxRates1 = floydWarshall(graph1);
        Map<String, Map<String, Double>> maxRates2 = floydWarshall(graph2);

        double maxAmount = 1.0;

        for (String currency : maxRates1.keySet()) {
            if (maxRates1.get(initialCurrency).containsKey(currency) &&
                maxRates2.get(currency).containsKey(initialCurrency)) {

                double amount = maxRates1.get(initialCurrency).get(currency) *
                                maxRates2.get(currency).get(initialCurrency);
                maxAmount = Math.max(maxAmount, amount);
            }
        }

        return maxAmount;
    }

    private static Map<String, Map<String, Double>> buildGraph(List<List<String>> pairs, double[] rates) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < pairs.size(); i++) {
            String start = pairs.get(i).get(0);
            String target = pairs.get(i).get(1);
            double rate = rates[i];

            graph.putIfAbsent(start, new HashMap<>());
            graph.putIfAbsent(target, new HashMap<>());

            graph.get(start).put(target, rate);
            graph.get(target).put(start, 1.0 / rate);
        }
        return graph;
    }

    private static Map<String, Map<String, Double>> floydWarshall(Map<String, Map<String, Double>> graph) {
        Map<String, Map<String, Double>> dist = new HashMap<>();
        for (String src : graph.keySet()) {
            dist.putIfAbsent(src, new HashMap<>());
            for (String tgt : graph.keySet()) {
                dist.get(src).put(tgt, src.equals(tgt) ? 1.0 : 0.0);
            }
            for (String neighbor : graph.get(src).keySet()) {
                dist.get(src).put(neighbor, graph.get(src).get(neighbor));
            }
        }

        for (String k : graph.keySet()) {
            for (String i : graph.keySet()) {
                for (String j : graph.keySet()) {
                    dist.get(i).put(j, Math.max(dist.get(i).get(j),
                                                dist.get(i).get(k) * dist.get(k).get(j)));
                }
            }
        }

        return dist;
    }
}
