public class Main {
    public static void main(String[] args){
        HavingSuperAbillity heroes[] = {new medic(),new megic(),new warrior()};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].apllySuperAbillity();
        }
    }
}