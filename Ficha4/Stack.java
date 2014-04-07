import java.util.ArrayList;
import java.lang.StringBuilder;

public class Stack
{
    private ArrayList<String> stack;

	public Stack() {
        this.stack = new ArrayList<String>();
	}

    public Stack(Stack st) {
        this.stack = st.getStack();
    }

    public String top(){
        return this.stack.get(this.stack.size() - 1);
    }


    public int length()
    { return this.stack.size();}


    public void push(String s)
    {
        this.stack.add(s);
    }


    public void pop()
    {
        if (this.stack.size() != 0)
            this.stack.remove(this.stack.size() - 1);
    }


    public boolean empty()
    {
        return this.stack.size() == 0;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(String s: this.stack){
            sb.append(s);
            sb.append("\n");}

        return sb.toString();
    }

    public Stack clone()
    {
        Stack cl = new Stack(this);
        return cl;
    }

    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if ((o == null) || (this.getClass() != o.getClass()))
            return false;
        Stack st = (Stack) o;
        if (st.length() != this.stack.size())
            return false;
        for(int i = 0; i < this.stack.size(); i++)
            if (!st.getStack().get(i).equals(this.stack.get(i)))
                return false;
        return true;
    }




    public ArrayList<String> getStack()
    {

        ArrayList<String> st = new ArrayList<String>();
        for(String s: this.stack)
            st.add(s);

        return st;
    }
}

