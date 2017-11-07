package codingBath;

import java.util.Arrays;

public class Traversals {

    //print post order traversal from given inorder an preorder traversals

    // in[] = {4, 2, 5, 1, 3, 6};
    //pre[] = {1, 2, 4, 5, 3, 6};

    public static void main(String[] args) {


        int in[] = {4, 2, 5, 1, 3, 6};
        int pre[] = {4, 5, 2, 6, 3, 1};
        int n = in.length;

        printPostOrder(in, pre, n);

    }

    public static int search(int arr[], int x, int n) {

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;

    }

    //prints postorder traversal from given inorder an preorder traversals
    public static void printPostOrder(int[] in, int[] pre, int n) {

        //the first element in pre[] is always the root, search it
        // in in[] to fint left an right subtrees

        int root = search(in, pre[0], n);

        int tempPre[], tempIn[];

        //if left subtree is not empty, print left subtree
        if (root != 0) {
            tempPre = Arrays.copyOfRange(pre, pre.length, 1);
            printPostOrder(in, tempPre, root);
        }

        //if right subtree is not empty, print right subtree
        if (root != n - 1) {
            tempPre = Arrays.copyOfRange(pre, root + 1, pre.length);
            tempIn = Arrays.copyOfRange(in, root + 1, in.length);
            printPostOrder(tempIn, tempPre, n - root - 1);

        }

        // print root

        System.out.print(pre[0] + " ");

    }
}

