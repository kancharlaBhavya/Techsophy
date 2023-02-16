import java.util.*;

public class CycleDetection {
    public static boolean hasCycle(Map<Integer, List<Integer>> graph) {
        Set<Integer> visited = new HashSet<>();
        Set<Integer> recursiveStack = new HashSet<>();
        for (Integer node : graph.keySet()) {
            if (hasCycleHelper(graph, node, visited, recursiveStack)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasCycleHelper(Map<Integer, List<Integer>> graph, Integer node, Set<Integer> visited,
            Set<Integer> recursiveStack) {
        visited.add(node);
        recursiveStack.add(node);
        for (Integer neighbor : graph.get(node)) {
            if (!visited.contains(neighbor)) {
                if (hasCycleHelper(graph, neighbor, visited, recursiveStack)) {
                    return true;
                }
            } else if (recursiveStack.contains(neighbor)) {
                return true;
            }
        }
        recursiveStack.remove(node);
        return false;
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2));
        graph.put(2, Arrays.asList(3));
        graph.put(3, Arrays.asList(4));
        graph.put(4, Arrays.asList());
        if (hasCycle(graph)) {
            System.out.println("The graph contains a cycle :Deadlock Detected");
        } else {
            System.out.println("The graph does not contain a cycle: doesn't contains Deadlock");
        }
    }
}
