public class Fib extends Thread {
    private int x;
    public int answer;

    public static void main(String[] args) throws Exception {
        Fib f = new Fib(2);
        f.start();
        f.join();

        System.out.println(f.answer);
    }

    public Fib(int x) {
        this.x = x;
    }

    public void run() {
        if (x <= 2) {
            answer = 1;
        } else {

            try {
                Fib f1 = new Fib(x-1);  // call 1
                Fib f2 = new Fib(x-2);  // call 2

                f1.start(); f2.start();
                f1.join();  f2.join();

                answer = f1.answer + f2.answer;  // return
            }
            catch(InterruptedException ex) {}

        }
    }
}