package HashMapsPractice;

import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> whoIOwe;
    public IOU() {
        this.whoIOwe = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.whoIOwe.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.whoIOwe.get(toWhom);
    }

    public static void main(String[] args) {
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

        mattsIOU.setSum("Arthur", 10.5);
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));

    }
}
