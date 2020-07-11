package day.problems.easy;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 剑指offer09 {
    Stack<Integer> stack1 = null;
    Stack<Integer> stack2 = null;

    public 剑指offer09() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        this.stack1.push(value);
    }

    public int deleteHead() {
        if (this.stack1.size() == 0) {
            return -1;
        } else {
            while (this.stack1.size() != 1) {
                this.stack2.push(this.stack1.pop());
            }
            int value = this.stack1.pop();
            while (!this.stack2.empty()) {
                this.stack1.push(this.stack2.pop());
            }
            return value;
        }
    }
}
