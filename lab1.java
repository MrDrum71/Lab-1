
class Node {
    
    constructor(value) {
        this.value = value;
        this.next = null;
    }
}

class Stack {
    
    constructor() {
        this.top = null;
    }

    public push(value) {
        const newNode = new Node(value);

        newNode.next = this.top;
        this.top = newNode;
    }

    public pop() {
        if (this.isEmpty()) {
            return null;
        }

        const value = this.top.value;
        this.top = this.top.next;

        return value;
    }

    public isEmpty() {
        return this.top === null;
    }
}


function sortStack(A) {
    const B = new Stack();  // Create new empty stack, soon to be sorted stack

    while (!A.isEmpty()) {
        const temp = A.pop();   // Create placeholder for the insertion value

        while (!B.isEmpty()) {     

            if (B.top.value > temp) {      // Compare the current top value in the new stack to our insertion value
                A.push(B.pop());           // Put our top value in B to our old unsorted stack 
            }
            else {
                break;
            }
        }

        B.push(temp);                      // Put our insertion value in the new stack
    }

    return B;
}



git config --global user.email "lucas.bjork05@gmail.com"
  git config --global user.name "MrDrum71"
