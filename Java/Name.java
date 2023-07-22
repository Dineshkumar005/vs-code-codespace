package Java;

public class Name {
    public String name;
    public char Initial;
    
    public Name(String name,char Initial)
    {
        this.name=name;
        this.Initial=Initial;
    }

    public static int Compare(Name n1,Name n2){
        return n1.name.compareTo(n2.name);
    }
 
    public String toString(){
        return this.name+" "+this.Initial;
    }
}
