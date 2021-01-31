package collectionsset;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class StringsHandler {

    public Set<String> filterUniqueStrings(Collection<String> stringCollection){
        Set<String> uniqueSet = new HashSet<>(stringCollection);
        return uniqueSet;

    }

    public Set<String> selectIdenticalStrings(Set<String> setA, Set<String> setB){
        Set<String> identicalStrings = new HashSet<>(setA);
        identicalStrings.retainAll(setB);
        return identicalStrings;
    }
}
