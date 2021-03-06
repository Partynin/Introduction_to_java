package Chapter_29;

import Chapter_28.AbstractGraph;

public class WeightedEdge extends AbstractGraph.Edge implements Comparable<WeightedEdge> {
    public double weight; // The weight on edge (u, v)

    /** Create a weighted edge on (u, v) */
    public WeightedEdge(int u, int v, double weight) {
        super(u, v);
        this.weight = weight;
    }

    @Override
    public int compareTo(WeightedEdge edge) {
        if (weight > edge.weight)
            return 1;
        else if (weight == edge.weight)
            return 0;
        else return -1;
    }
}
