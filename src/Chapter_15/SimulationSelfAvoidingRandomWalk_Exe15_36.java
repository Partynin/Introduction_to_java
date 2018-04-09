package Chapter_15;

public class SimulationSelfAvoidingRandomWalk_Exe15_36 {
    public static void main(String[] args) {
        WalkPane1 walkPane1 = new WalkPane1();
        walkPane1.setCell(80);
        for (int i = 0; i < 10000; i++) {
            walkPane1.getRandomWalk();
            walkPane1.resetWalk();
        }

        System.out.println("For a lattice of size 10, the probability of ded-end paths is " +
        walkPane1.getCountDedEnds());
    }
}
