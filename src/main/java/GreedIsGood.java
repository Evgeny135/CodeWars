public class GreedIsGood {
    public static int greedy(int[] dice) {
        int count = 0;
        for (int i = 0; i < dice.length - 2; i++) {
            if (dice[i] == dice[i + 1] && dice[i] == dice[i + 2]) {

                switch (dice[i]) {
                    case 1:
                        count += 1000;
                        break;
                    case 2:
                        count += 200;
                        break;
                    case 3:
                        count += 300;
                        break;
                    case 4:
                        count += 400;
                        break;
                    case 5:
                        count += 500;
                        break;
                    case 6:
                        count += 600;
                        break;
                }
            } else {
                if (i == dice.length - 3) {
                    if (dice[i] == 1 || dice[i + 1] == 1 || dice[i + 2] == 1) {
                        count += 100;
                    } if (dice[i] == 5 || dice[i + 1] == 5 || dice[i + 2] == 5) {
                        count += 50;
                    }
                }
                else {
                    if (dice[i]==1){
                        count+=100;
                    }
                    if (dice[i]==5){
                        count+=50;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        greedy(new int[]{3, 4, 5, 5, 5});
    }

}
