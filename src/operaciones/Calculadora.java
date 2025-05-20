package operaciones;

public class Calculadora {
    private int ans = 0;

    public int add(int a, int b) {
        ans = a + b;
        return ans;
    }

    public int sub(int a, int b) {
        ans = a - b;
        return ans;
    }

    public int add_ans(int v) {
        ans += v;
        return ans;
    }

    public int sub_ans(int v) {
        ans -= v;
        return ans;
    }

    public int ans() {
        return ans;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No puedes dividir entre 0!!");
        }
        ans = a / b;
        return ans;
    }

    public void operacionOptima() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
        }
    }

    public void clear() {
        ans = 0;
    }
}

