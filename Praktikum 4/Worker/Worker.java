import java.util.ArrayList;
import java.util.List;

public class Worker {
  public static int run(List<Integer> durations, int machineCount) {
    // implementation here
    int[] workMachine = new int[machineCount];
    int size = durations.size();

    // fill working machine with 0
    for (int i = 0; i < machineCount; i++) {
      workMachine[i] = 0;
    }
    // find smallest working duration
    for (int i = 0; i < size; i++) {
      int minIdx = 0;
      for (int j = 0; j < machineCount; j++) {
        if (workMachine[j] < workMachine[minIdx]) {
          minIdx = j;
        }
      }
      workMachine[minIdx] += durations.get(i);
    }

    int totalDur = 0;
    for (int i = 0; i < machineCount; i++) {
      if (workMachine[i] > totalDur) {
        totalDur = workMachine[i];
      }
    }
    return totalDur;
  }
}
