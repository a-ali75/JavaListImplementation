public class EmptyList implements LispList{
    EmptyList() {
    }

    @Override
    public boolean empty() {
        return true;
    }

    @Override
    public Object head() {
        throw new UnsupportedOperationException("Empty List doesn't support this method");
    }

    @Override
    public LispList tail() {
        throw new UnsupportedOperationException("Empty List doesn't support this method");
    }

    @Override
    public NonEmptyList cons(Object input) {
        return new NonEmptyList(input, LispList.NIL);
    }

    @Override
    public boolean contains(Object input) {
        return false;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public LispList merge(LispList other) {
        if (other.empty()) {
            return new EmptyList();
        } else {
            return other;
        }
    }

    @Override
    public String toString() {
        return "";
    }
}
