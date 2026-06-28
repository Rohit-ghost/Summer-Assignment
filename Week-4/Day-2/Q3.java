/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

int** zigzagLevelOrder(struct TreeNode* root, int* returnSize,
                       int** returnColumnSizes) {
    *returnSize = 0;

    if (root == NULL) {
        *returnColumnSizes = NULL;
        return NULL;
    }

    int **result = (int **)malloc(2000 * sizeof(int *));
    *returnColumnSizes = (int *)malloc(2000 * sizeof(int));

    struct TreeNode *queue[2000];
    int front = 0, rear = 0;

    queue[rear++] = root;
    int leftToRight = 1;

    while (front < rear) {
        int size = rear - front;

        result[*returnSize] = (int *)malloc(size * sizeof(int));
        (*returnColumnSizes)[*returnSize] = size;

        for (int i = 0; i < size; i++) {
            struct TreeNode *node = queue[front++];

            int index;
            if (leftToRight)
                index = i;
            else
                index = size - 1 - i;

            result[*returnSize][index] = node->val;

            if (node->left)
                queue[rear++] = node->left;

            if (node->right)
                queue[rear++] = node->right;
        }

        leftToRight = !leftToRight;
        (*returnSize)++;
    }

    return result;
}
