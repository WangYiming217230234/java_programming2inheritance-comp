package HomeBuyingRenting;

public class Main {
    public static void main(String[] args) throws Exception {
       HomesEnum[] homes = {HomesEnum.HOME01,HomesEnum.HOME02,HomesEnum.HOME03,HomesEnum.HOME04};

       for(HomesEnum home : homes) {
        System.out.println(home.toString());
        System.out.println("-----------------------------");
       }

    }
}
