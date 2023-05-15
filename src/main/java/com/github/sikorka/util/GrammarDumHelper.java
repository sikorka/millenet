package com.github.sikorka.util;

import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.StringUtils;

public class GrammarDumHelper {

    public static void printTree(ParseTree tree) {
        printTree(tree, 0);
    }

    private static void printTree(ParseTree tree, int spacing) {
        if (tree.getChildCount() == 0) {
            System.out.println(StringUtils.repeat(' ', spacing) + tree.getText());
        } else {
            for (int i = 0; i < tree.getChildCount(); i++) {
                printTree(tree.getChild(i), spacing + 1);
            }
        }
    }
}
