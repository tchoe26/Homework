public class Conditionals {
    public static void main(String[] args) {

    }
    public Conditionals() {
        //define question and random number
        String question = "cats or dogs?";
        System.out.println(question);
        int randomInt = (int)(Math.random()*10);

        //determine what to print
        if(randomInt==1)
            System.out.println("yes");
        else if (randomInt==2)
            System.out.println("no");
        else if (randomInt==3)
            System.out.println("maybe");
        else if (randomInt==4)
            System.out.println("yes if you really believe in it");
        else if (randomInt==5)
            System.out.println("no of course not lol");
        else if (randomInt==6)
            System.out.println("results are inconclusive becuase I don't feel like answering ur question");
        else if (randomInt==7)
            System.out.println("i shouldn't tell you right now ");
        else if (randomInt==8)
            System.out.println("yesn't");
        else if (randomInt==9)
            System.out.println("whatever answer is the opposite of what you wanted");
        else if (randomInt==10)
            System.out.println("wheeeeeeeeeeeeeeeeeeeeeeee");
    }
}
