public interface LispList {
    boolean empty();
    Object head();
    LispList tail();
    NonEmptyList cons(Object input);
    EmptyList NIL = new EmptyList();
    boolean contains(Object input);
    int length();
    LispList merge(LispList other);
}
