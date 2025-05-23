/* The structure of the class is
class StackQueue{
private:
    // These are STL stacks ( http://goo.gl/LxlRZQ )
    stack<int> s1;
    stack<int> s2;
public:
    void push(int);
    int pop();
}; */
void StackQueue::push(int B) {
    s1.push(x);
}

int StackQueue::pop() {
    if(s2.empty()) {
        while(!s1.empty()) {
            s2.push(s1.top());
            s1.pop();
        }
    }
    if(s2.empty()) return -1;
    int val = s2.top();
    s2.pop();
    return val;
}
