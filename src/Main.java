public class Main {
    public static void main(String[] args){
        switch (args[0]){
            case "kubam":
                KubaM km = new KubaM();
                km.squareField(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                break;
            case "patryks":
                PatrykS ps = new PatrykS();
                ps.PatrykS(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                break;

            default:
                KubaM kmInstructions = new KubaM();
                kmInstructions.showInstructions();
                PatrykS psInstructions = new PatrykS();
                psInstructions.showInstructions();
        }
    }
}
