///* You have a browser of one tab where you start on the homepage and you can visit another url, get back in the history number of steps or move forward in the history number of steps.
//
//Implement the BrowserHistory class:
//
//BrowserHistory(string homepage) Initializes the object with the homepage of the browser.
//void visit(string url) Visits url from the current page. It clears up all the forward history.
//string back(int steps) Move steps back in history. If you can only return x steps in the history and steps > x, you will return only x steps. Return the current url after moving back in history at most steps.
//string forward(int steps) Move steps forward in history. If you can only forward x steps in the history and steps > x, you will forward only x steps. Return the current url after forwarding in history at most steps
//
//Input:
//["BrowserHistory","visit","visit","visit","back","back","forward","visit","forward","back","back"]
//[["google.com"],["facebook.com"],["youtube.com"],[1],[1],[1],["linkedin.com"],[2],[2],[7]]
//Output:
//[null,null,null,null,"facebook.com","google.com","facebook.com",null,"linkedin.com","google.com"
//
// */
public class CollectionsExample2 {

    public class Node {
        String url;
        Node next, prev;

        public Node(String url) {
            this.url = url;
            next = null;
            prev = null;
        }
    }

    Node head, curr;

    public CollectionsExample2(String homepage) {
        head = new Node(homepage);
        curr = head;
    }

    public void visit(String url) {
        Node node = new Node(url);
        curr.next = node;
        node.prev = curr;
        curr = node;
    }

    public String back(int steps) {
        while (curr.prev != null && steps-- > 0) {
            curr = curr.prev;
        }
        return curr.url;
    }

    public String forward(int steps) {
        while (curr.next != null && steps-- > 0) {
            curr = curr.next;
        }
        return curr.url;
    }


    public static void main(String[] args) {
        CollectionsExample2 browserHistory = new CollectionsExample2("Home.com");
        browserHistory.visit("google.com");
        browserHistory.visit("facebook.com");
        browserHistory.visit("youtube.com");
        browserHistory.back(1);
        browserHistory.back(1);
        browserHistory.forward(1);
        browserHistory.visit("linkedin.com");
        browserHistory.forward(2);
        browserHistory.back(2);
        browserHistory.back(7);
        System.out.println(browserHistory);
//    }
    }
}