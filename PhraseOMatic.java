/**
 * Created by ritwick on 29/10/16.
 *        File = PhraseOMatic.java
 * Description = Randomize strings to make phrases.
 */
public class PhraseOMatic {
    public static void main(String[] args) {
        //Strings with words
        String[] listOne = {"Large", "Tasty", "Hungry", "Multi-Tier", "30,000 foot", "B-to-B", "Win-win", "Front-end",
                "Web-based", "Pervasive", "Smart", "Six-sigma", "Critical-path", "Dynamic"};
        String[] listTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered",
                "branded", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned",
                "targeted", "shared", "cooperative", "accelerated"};
        String[] listThree = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy",
                "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        //Randomizing and finding numbers withing the length range of strings
        int rand1 = (int) (Math.random() * listOne.length);
        int rand2 = (int) (Math.random() * listTwo.length);
        int rand3 = (int) (Math.random() * listThree.length);

        String phrase = listOne[rand1] + " " + listTwo[rand2] + " " + listThree[rand3];
        System.out.println("All we need in life is " + phrase);
    }
}
