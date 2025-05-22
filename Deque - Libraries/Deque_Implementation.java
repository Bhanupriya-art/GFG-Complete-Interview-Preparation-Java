
public static void pb(ArrayDeque<Integer> dq, int x) {
    //  code here
    dq.addLast(x);
}

public static void ppb(ArrayDeque<Integer> dq) {
    if(!dq.isEmpty()) dq.removeLast();
    //  code here
}

    
public static int front_dq(ArrayDeque<Integer> dq) {
    //  code here
    return dq.isEmpty() ? -1 : dq.peekFirst();
}
    

public static void pf(ArrayDeque<Integer> dq, int x) {
    //  code here
    dq.addFirst(x);
}
