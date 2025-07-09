package SJB.DSA;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       stack st=new stack(5);
       st.push(10);
       st.push(20);
       st.push(30);
       System.out.println(st.peak());
       st.pop();
       st.display();
    }
}
