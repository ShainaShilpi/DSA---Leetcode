class BrowserHistory {

    public BrowserHistory(String homepage) {
        visit(homepage);
    }
    
    public void visit(String url) {
        if (++index < urls.size())
            urls.set(index, url);
        else
            urls.add(url);
        lastIndex = index;
    }
    
    public String back(int steps) {
        index = Math.max(0, index - steps);
        return urls.get(index);
    }
    
    public String forward(int steps) {
        index = Math.min(lastIndex, index + steps);
        return urls.get(index);
    }
    
    private List<String> urls = new ArrayList<>();
    private int index = -1;
    private int lastIndex = -1;
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */