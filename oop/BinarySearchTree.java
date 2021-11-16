package oop;

//create a class BinarySearchTree
public class BinarySearchTree {
    //create a class Node
    private class Node {
        //create a private instance variable
        private int data;
        //create a private instance variable
        private Node left;
        //create a private instance variable
        private Node right;
        //create a constructor
        public Node(int data) {
            //assign the data to the instance variable
            this.data = data;
            //assign the left to null
            this.left = null;
            //assign the right to null
            this.right = null;
        }
    }
    //create a private instance variable
    private Node root;
    //create a constructor
    public BinarySearchTree() {
        //assign the root to null
        this.root = null;
    }
    //create a method insert
    public void insert(int data) {
        //create a new node
        Node newNode = new Node(data);
        //if the root is null
        if (this.root == null) {
            //assign the root to the new node
            this.root = newNode;
        } else {
            //create a variable to store the current node
            Node current = this.root;
            //create a variable to store the parent node
            Node parent = null;
            //while the current node is not null
            while (current != null) {
                //assign the parent to the current node
                parent = current;
                //if the data is less than the current node
                if (data < current.data) {
                    //assign the current node to the left node
                    current = current.left;
                } else {
                    //assign the current node to the right node
                    current = current.right;
                }
            }
            //if the data is less than the parent
            if (data < parent.data) {
                //assign the left node to the new node
                parent.left = newNode;
            } else {
                //assign the right node to the new node
                parent.right = newNode;
            }
        }
    }
    //create a method search
    public boolean search(int data) {
        //create a variable to store the current node
        Node current = this.root;
        //while the current node is not null
        while (current != null) {
            //if the data is equal to the current node
            if (data == current.data) {
                //return true
                return true;
            } else if (data < current.data) {
                //assign the current node to the left node
                current = current.left;
            } else {
                //assign the current node to the right node
                current = current.right;
            }
        }
        //return false
        return false;
    }   
    //create a method delete
    public void delete(int data) {
        //create a variable to store the current node
        Node current = this.root;
        //create a variable to store the parent node
        Node parent = null;
        //while the current node is not null
        while (current != null) {
            //if the data is equal to the current node
            if (data == current.data) {
                //if the current node has no children
                if (current.left == null && current.right == null) {
                    //if the parent is null
                    if (parent == null) {
                        //assign the root to null
                        this.root = null;
                    } else {
                        //if the data is less than the parent
                        if (data < parent.data) {
                            //assign the left node to null
                            parent.left = null;
                        } else {
                            //assign the right node to null
                            parent.right = null;
                        }
                    }
                } else if (current.left == null) {
                    //if the parent is null
                    if (parent == null) {
                        //assign the root to the right node
                        this.root = current.right;
                    } else {
                        //if the data is less than the parent
                        if (data < parent.data) {
                            //assign the left node to the right node
                            parent.left = current.right;
                        } else {
                            //assign the right node to the right node
                            parent.right = current.right;
                        }
                    }
                } else if (current.right == null) {
                    //if the parent is null
                    if (parent == null) {
                        //assign the root to the left node
                        this.root = current.left;
                    } else {
                        //if the data is less than the parent
                        if (data < parent.data) {
                            //assign the left node to the left node
                            parent.left = current.left;
                        } else {
                            //assign the right node to the left node
                            parent.right = current.left;
                        }
                    }
                } else {
                    //create a variable to store the successor node
                    Node successor = current.right;
                    //create a variable to store the successor parent node
                    Node successorParent = current;
                    //while the successor node is not null
                    while (successor.left != null) {
                        //assign the successor parent to the successor node
                        successorParent = successor;
                        //assign the successor node to the left node
                        successor = successor.left;
                    }
                    //if the successor node is not the right node
                    if (successor != current.right) {
                        //assign the successor parent left node to the right node
                        successorParent.left = successor.right;
                        //assign the right node to the right node
                        successor.right = current.right;
                    }
                    //if the parent is null
                    if (parent == null) {
                        //assign the root to the successor node
                        this.root = successor;
                    } else {
                        //if the data is less than the parent
                        if (data < parent.data) {
                            //assign the left node to the successor node
                            parent.left = successor;
                        } else {
                            //assign the right node to the successor node
                            parent.right = successor;
                        }
                    }
                    //assign the successor node left node to the left node
                    successor.left = current.left;
                }
                //return
                return;
            } else if (data < current.data) {
                //assign the current node to the left node
                current = current.left;
            } else {
                //assign the current node to the right node
                current = current.right;
            }
        }
    }
    //create a method inOrderTraversal
    public void inOrderTraversal() {
        //create a variable to store the current node
        Node current = this.root;
        //create a stack
        Stack<Node> stack = new Stack<Node>();
        //while the current node is not null
        while (current != null || !stack.isEmpty()) {
            //if the current node is not null
            if (current != null) {
                //push the current node to the stack
                stack.push(current);
                //assign the current node to the left node
                current = current.left;
            } else {
                //assign the current node to the top of the stack
                current = stack.pop();
                //print the current node
                System.out.println(current.data);
                //assign the current node to the right node
                current = current.right;
            }
        }
    }
    //create a method preOrderTraversal
    public void preOrderTraversal() {
        //create a variable to store the current node
        Node current = this.root;
        //create a stack
        Stack<Node> stack = new Stack<Node>();
        //while the current node is not null
        while (current != null || !stack.isEmpty()) {
            //if the current node is not null
            if (current != null) {
                //print the current node
                System.out.println(current.data);
                //push the current node to the stack
                stack.push(current);
                //assign the current node to the left node
                current = current.left;
            } else {
                //assign the current node to the top of the stack
                current = stack.pop();
                //assign the current node to the right node
                current = current.right;
            }
        }
    }
    //create a method postOrderTraversal
    public void postOrderTraversal() {
        //create a variable to store the current node
        Node current = this.root;
        //create a stack
        Stack<Node> stack = new Stack<Node>();
        //create a variable to store the previous node
        Node previous = null;
        //while the current node is not null
        while (current != null || !stack.isEmpty()) {
            //if the current node is not null
            if (current != null) {
                //push the current node to the stack
                stack.push(current);
                //assign the current node to the left node
                current = current.left;
            } else {
                //assign the current node to the top of the stack
                current = stack.peek();
                //if the current node is the right node
                if (current.right == null || current.right == previous) {
                    //print the current node
                    System.out.println(current.data);
                    //pop the current node from the stack
                    stack.pop();
                    //assign the previous node to the current node
                    previous = current;
                    //assign the current node to null
                    current = null;
                } else {
                    //assign the current node to the right node
                    current = current.right;
                }
            }
        }
    }
    //create a method levelOrderTraversal
    public void levelOrderTraversal() {
        //create a variable to store the current node
        Node current = this.root;
        //create a queue
        Queue<Node> queue = new LinkedList<Node>();
        //while the current node is not null
        while (current != null) {
            //print the current node
            System.out.println(current.data);
            //if the current node is not null
            if (current.left != null) {
                //add the current node left node to the queue
                queue.add(current.left);
            }
            //if the current node is not null
            if (current.right != null) {
                //add the current node right node to the queue
                queue.add(current.right);
            }
            //remove the current node from the queue
            queue.remove();
            //assign the current node to the top of the queue
            current = queue.peek();
        }
    }
    //create a method getHeight
    public int getHeight() {
        //create a variable to store the current node
        Node current = this.root;
        //create a stack
        Stack<Node> stack = new Stack<Node>();
        //create a variable to store the height
        int height = 0;
        //while the current node is not null
        while (current != null || !stack.isEmpty()) {
            //if the current node is not null
            if (current != null) {
                //push the current node to the stack
                stack.push(current);
                //assign the current node to the left node
                current = current.left;
            } else {
                //assign the current node to the top of the stack
                current = stack.pop();
                //assign the current node to the right node
                current = current.right;
            }
            //increment the height
            height++;
        }
        //return the height
        return height;
    }
}