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
            case "michalz":
                MichalZ mz = new MichalZ();
                mz.plusTwoNumbers(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
                break;
            //Tu dodaj swój kod

            default:
                KubaM kmInstructions = new KubaM();
                kmInstructions.showInstructions();

                MichalZ mzInstruction = new MichalZ();
                mzInstruction.showInstructions();
                //Tu dodaj swoje instrukcje
        }

    }
}

