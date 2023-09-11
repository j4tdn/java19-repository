package functional;

import bean.Item;

@FunctionalInterface
public interface ItemComparator {
     boolean compare(Item i1, Item i2);
}
