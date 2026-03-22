import java.util.Stack;

class BrowserHistory {
    // Nesne değişkenleri (Senin Hayvan.java'daki değişkenler gibi)
    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String current;

    // Yapıcı Metot (Constructor)
    public BrowserHistory(String homepage) {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        current = homepage;
    }
    
    // Yeni bir sayfaya gitme
    public void visit(String url) {
        backStack.push(current);
        current = url;
        // Yeni bir yere gidince "İleri" geçmişi silinir (Tarayıcı kuralı)
        forwardStack.clear();
    }
    
    // Geri gitme
    public String back(int steps) {
        while (steps > 0 && !backStack.isEmpty()) {
            forwardStack.push(current);
            current = backStack.pop();
            steps--;
        }
        return current;
    }
    
    // İleri gitme
    public String forward(int steps) {
        while (steps > 0 && !forwardStack.isEmpty()) {
            backStack.push(current);
            current = forwardStack.pop();
            steps--;
        }
        return current;
    }
}