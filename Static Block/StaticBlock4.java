class demo{
        static{
                System.out.println("Static blokc 1");
        }
}
class client{
        static{
                System.out.println("Statci block 2");
        }
        public static void main(String[] args){
                System.out.println("Main method of client");
		demo obj = new demo();
        }
        static{
                System.out.println("Static block 3");
        }
}


