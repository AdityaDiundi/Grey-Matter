public class DOMEcho {

    static final String outputEncoding = "UTF-8";

    private static void usage() {
        // ...
    }

    public static void main(String[] args) throws Exception {
        String filename = null;
    
        for (int i = 0; i < args.length; i++) {
            if (...) { 
                // ...
            } 
            else {
                filename = args[i];
                if (i != args.length - 1) {
                    usage();
                }
            }
        }

        if (filename == null) {
            usage();
        }
    }
}