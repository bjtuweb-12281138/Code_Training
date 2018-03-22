package nowcoder;

public class T_MirrorTree {

	/**
	 * 题目描述 操作给定的二叉树，将其变换为源二叉树的镜像。
	 */

	public void Mirror(TreeNode root) {
		if(root != null){
			reverse(root);
			Mirror(root.left);
			Mirror(root.right);
		}
	}
	
	public void reverse(TreeNode root){
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
