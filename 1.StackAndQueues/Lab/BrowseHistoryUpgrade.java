package JavaAdvanced.StackAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowseHistoryUpgrade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<String> browserHistory = new ArrayDeque<>();
        ArrayDeque<String> forwardHistory = new ArrayDeque<>();

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (browserHistory.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    String currentUrl = browserHistory.pop();
                    forwardHistory.push(currentUrl);
                    System.out.println(browserHistory.peek());
                }
            }else if(input.equals("forward")){
                if(forwardHistory.isEmpty()){
                    System.out.println("no next URLs");
                }else {
                    String forwardUrl = forwardHistory.pop();
                    System.out.println(forwardUrl);
                    browserHistory.push(forwardUrl);
                }
            }else {
                browserHistory.push(input);
                System.out.println(input);
                forwardHistory.clear();
            }
            input = scanner.nextLine();
        }
    }
}
