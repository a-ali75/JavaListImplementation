public class NonEmptyList implements LispList{
    private final Object head;
    private final LispList tail;
    NonEmptyList(Object item, LispList tail) {
        this.head = item;
        this.tail = tail;
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public Object head() {
        return head;
    }

    @Override
    public LispList tail() {
        return tail;
    }

    @Override
    public NonEmptyList cons(Object input) {
        return new NonEmptyList(input, new NonEmptyList(head(), tail));
    }

    @Override
    public boolean contains(Object input) {
        if (head == input) {
            return true;
        } else {
            return tail.contains(input);
        }
    }

    @Override
    public int length() {
        return (1 + tail.length());
    }

    @Override
    public LispList merge(LispList other) {
        if (other.empty()) {
            return this;
        }
        Object secondaryHead = other.head();
        LispList secondaryTail = other.tail();
        if (this.tail.empty() && !secondaryTail.empty()) {
            return new NonEmptyList(this.head, new NonEmptyList(secondaryHead, other.tail()));
        } else if (!this.tail.empty() && secondaryTail.empty()) {
            return new NonEmptyList(this.head, new NonEmptyList(secondaryHead, this.tail));
        } else if (this.tail.empty() && secondaryTail.empty()) {
            return new NonEmptyList(this.head, new NonEmptyList(secondaryHead, LispList.NIL));
        } else {
            return new NonEmptyList(this.head, new NonEmptyList(secondaryHead, this.tail.merge(secondaryTail)));
        }
    }

    @Override
    public String toString() {
        return head() + tail().toString();
    }
}
