public class Main {
    public static void main(String[] args){
        switch (args[0]){
            case "kubam":
                KubaM km = new KubaM();
                km.squareField(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
            case "tomekz":
                TomekZ tz = new TomekZ();
                tz.CubeCapacity(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                break;
            case "patryks":
                PatrykS ps = new PatrykS();
                ps.PatrykS(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                break;

            case "michalz":
                MichalZ mz = new MichalZ();
                mz.plusTwoNumbers(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                break;
            case "maciekb":
                MaciekB mb = new MaciekB();
                mb.showInstructions();
            case "danield":
                DanielD dd = new DanielD();
                dd.triangleCircumference(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]) );
                break;

            default:
                KubaM kmInstructions = new KubaM();
                kmInstructions.showInstructions();
                DanielD ddInstructions = new DanielD();
                ddInstructions.showInstructions();
                PatrykS psInstructions = new PatrykS();
                psInstructions.showInstructions();

                MichalZ mzInstruction = new MichalZ();
                mzInstruction.showInstructions();
                //Tu dodaj swoje instrukcje
        }

    }
}

