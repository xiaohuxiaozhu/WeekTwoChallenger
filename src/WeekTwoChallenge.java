import java.util.*;

public class WeekTwoChallenge {
    public static void main(String[] args) {





        //Rice Array
        ArrayList<String> rice = new ArrayList<>();
        rice.add("white rice");
        rice.add("brown rice");
        rice.add("no rice");



        //Meat array
        ArrayList<String> meat = new ArrayList<>();
        meat.add("chicken");
        meat.add("steak");
        meat.add("carnidas");
        meat.add("chorizo");
        meat.add("sofritas");
        meat.add("no meat");



        //Beans array
        ArrayList<String> beans = new ArrayList<>();
        beans.add("pinto beans");
        beans.add("black beans");
        beans.add("no beans");


        //Salsa Array
        ArrayList<String> salsa = new ArrayList<>();
        salsa.add("mild salsa");
        salsa.add("medium salsa");
        salsa.add("hot salsa");
        salsa.add("no salsa");



        //Veggies Array
        ArrayList<String> veggies = new ArrayList<>();
        veggies.add("lettuce");
        veggies.add("fajita veggies");
        veggies.add("no veggies");






        //   riceadd.add(rice.get((int) (Math.random() * rice.size())));
        //   meatadd.add(meat.get((int) (Math.random() * meat.size())));
        //  beansadd.add(beans.get((int) (Math.random() * beans.size())));
        //  salsaadd.add(salsa.get((int) (Math.random() * salsa.size())));
        //   veggiesadd.add(veggies.get((int) (Math.random() * veggies.size())));

        for (int i=0; i<10;i++) {

            System.out.println("Burrito" +" " +  (i + 1)
                    +" "   +":" +" "+ (rice.get((int) (Math.random() * rice.size())))
                    +" "   +"," +" "+  meat.get((int) (Math.random() * meat.size()))
                    +" "   +"," +" "+  beans.get((int) (Math.random() * beans.size()))
                    +" "   +"," +" "+  salsa.get((int) (Math.random() * salsa.size()))
                    +" "   +"," +" "+  veggies.get((int) (Math.random() * veggies.size())));


            //     System.out.println("Burrito" +" " +  (i + 1)+" "+"Cost: $3.00");


        }


    }
}