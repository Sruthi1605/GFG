class Solution:
    def isBST(self, root):
        #code here
        def inorder(node):
            nonlocal prev
            if not node:
                return True
            if not inorder(node.left):
                return False
            if prev is not None and node.data <= prev:
                return False
            prev = node.data
            return inorder(node.right)
        
        prev = None
        return inorder(root)
