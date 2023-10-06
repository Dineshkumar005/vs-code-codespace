#include <stdio.h>  
#include <stdlib.h>  
  
struct node {  
    int element;  
    struct node* left;  
    struct node* right;  
};  
  
/*To create a new node*/  
struct node* createNode(int val)  
{  
    struct node* Node = (struct node*)malloc(sizeof(struct node));  
    Node->element = val;  
    Node->left = NULL;  
    Node->right = NULL;  
  
    return (Node);  
}  
  
  
/*function to traverse the nodes of binary tree in preorder*/  
void traversePreorder(struct node* root)  
{  
    if (root == NULL)  
        return;  
    printf(" %d ", root->element);  
    traversePreorder(root->left);  
    traversePreorder(root->right);  
}  
  
int main()  
{  
    struct node* root = createNode(1);  
    root->left = createNode(2);  
    root->right = createNode(3);  
    root->left->left = createNode(4);  
    root->left->right = createNode(5);  
    root->left->left->left = createNode(6);  
    root->left->left->right = createNode(7);  
    root->right->left = createNode(8);  
    root->right->right = createNode(9);  
    root->right->right->left = createNode(10);  
    root->right->right->right = createNode(11);  
      
    printf("\n The Preorder traversal of given binary tree is -\n");  
    traversePreorder(root);  
    return 0;  
}  