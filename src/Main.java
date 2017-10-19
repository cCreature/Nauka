public class Main {
    public static void main(String[] args){
        switch (args[0]){
            case "kubam":
                KubaM km = new KubaM();
                km.squareField(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                break;

            case "danield":
                DanielD dd = new DanielD();
                dd.triangleCircumference(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]) );
                break;

            default:
                KubaM kmInstructions = new KubaM();
                kmInstructions.showInstructions();
                DanielD ddInstructions = new DanielD();
                ddInstructions.showInstructions();
        }
    }
}
