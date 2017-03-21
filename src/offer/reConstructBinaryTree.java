package offer;

/**
 * Created by liangnan on 17/3/18.
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class reConstructBinaryTree {

    public static TreeNode reConstruct(int [] pre,int [] in) {
        int len = pre.length;
        if(len == 0){
            return null;
        }
        return BuildTree(pre, in, 0, len-1, 0, len-1);
    }

    public static TreeNode BuildTree(int[] pre, int[] in, int prestart, int preend, int instart, int inend){
        if(prestart > preend || instart > inend){
            return null;
        }

        int rootValue = pre[prestart];
        TreeNode tree = new TreeNode(rootValue);

        for(int i = instart; i <= inend; i++){
            if(in[i] == pre[prestart]){
                tree.left = BuildTree(pre, in, prestart + 1, prestart + i - instart, instart, i-1);
                tree.right = BuildTree(pre, in, prestart + i - instart + 1, preend, i + 1, inend);
            }

        }
        return tree;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};

        reConstruct(pre, in);

    }
}
