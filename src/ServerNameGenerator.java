import org.w3c.dom.ls.LSOutput;

public class ServerNameGenerator {
    public static String[] nouns= {"Jessie", "Pippin", "Molly", "Britta", "Patrick", "Travis", "Chris", "puppies", "doggos", "footballs"};
    public static String[] adjectives = {"annoying", "energetic", "funny", "stupid", "loud", "silly","dumb", "smart", "fast", "slow"};
    public static String returnString(String[] list){
        int listLength=list.length;
        int randomNumber = (int)Math.round(Math.random())*(listLength-1);
        return list[randomNumber];
    }

    public static void main(String[] args) {
        System.out.println(returnString(adjectives)+ "-" + returnString(nouns));
    }
}
