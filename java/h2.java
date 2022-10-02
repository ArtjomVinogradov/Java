public class h2 {
    public static void main(String[] args) {
		
        int tollid = 40;
        double t = tollideArvutamine(tollid);
        System.out.println(tollid+" tollid  on "+ t +" meetrit");
        
        double s = ellipsiArvutamine(3,9);
        System.out.println("Ellipsi pindala on "+ s);
        
        minutid(610);
        
        double[] answer = kiirus(10,20,30,40);
        System.out.println("Esimese sportlase kiirus on "+answer[0]+"km/h ja teise sportlase kiirus on "+answer[1]+" km/h");
        
        kiirused(answer[0], answer[1]);
        
        
        }
        
        /*Tollid-meetriteks*/
        static double tollideArvutamine(int a){
            double tolli = a * 0.0254;
        return tolli;
        }
        
        /*Ellipsi pindala*/
        static double ellipsiArvutamine(int a,int b){
            double pii = 3.14;
            double ellips = pii * a * b;
            return ellips;
        }
        
        /*Minutid-tundideks*/
        static void minutid(double minutid){
            int tundideks = (int)minutid / 60;
            int minut =(int) minutid % 60;
            System.out.println("Vastus: "+ tundideks+"h, "+ "ja " +minut+"min");
        }
        
        /*kahe sportlase kiiruse*/
        static double[] kiirus(double s, double t, double s2, double t2){
            double[] answers = new double[2];
            double v = s/t;
            double v2 = s2/t2;
            answers[0] = v;
            answers[1] = v2;
        return answers;
        }
        
        /*kiiruste vahe*/
        static void kiirused(double kiirus1, double kiirus2) {
            if (kiirus1 > kiirus2) {
                double answer = kiirus1 - kiirus2;
                System.out.println("Kahe kiiruse vahe on "+answer);
                } else {
                double answer = kiirus2 - kiirus1;
                System.out.println("Vastus: "+answer);
                }
        }
        
        
        
        }



