package bugs;

/**
A type of bug
*/
public class ConcurrentModificationBug extends Bug{
    public ConcurrentModificationBug(String name, int level, int initialSteps) {
        super(name, 20, 4, level, initialSteps);
    }
}
