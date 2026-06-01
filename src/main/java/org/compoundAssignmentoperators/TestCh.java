package org.compoundAssignmentoperators;

public class TestCh {
    public static void main(String[] args) {
        char c='a';
        System.out.println(c>='A'&&c<='Z'?"uppercase":(c>='a'&&c<='z'?"lowercase":"digit"));
    }
}
