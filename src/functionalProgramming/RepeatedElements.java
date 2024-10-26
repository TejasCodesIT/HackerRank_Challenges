package functionalProgramming;

import java.util.*;
import java.util.stream.Collectors;

public class RepeatedElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        int N = scanner.nextInt();

        int[] A = new int[N];
        

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        

        int K = scanner.nextInt();
        

        findRepeatedElements(A, K);
        
        scanner.close();
    }

    private static void findRepeatedElements(int[] A, int K) {
    
        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();
   
        List<Integer> result = new ArrayList<>();

       
        for (int num : A) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }


        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() >= K) {
                result.add(entry.getKey());
            }
        }

       
        if (result.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(result.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" ")));
        }
    }
}
