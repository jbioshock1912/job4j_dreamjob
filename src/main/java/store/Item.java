package store;

import java.util.Objects;

public class Item {
    int weight;
    int cost;
    String name;

    @Override
    public boolean equals(Object other) {
        if (!super.equals(other)) return false;
        if (this == other) return true;
        if (other == null) return false;
        if (this.getClass() != other.getClass()) return false;
        Item otherObj = (Item) other;
        return this.weight == otherObj.weight && this.cost == otherObj.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, cost);
    }
}
