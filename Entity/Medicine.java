package Entity;
public class Medicine {
    private String name;
    private int alertLine, stock, request = 0;

    public Medicine(String name, int alertLine, int stock, int request) {
        this.name = name;
        this.alertLine = alertLine;
        this.stock = stock;
        this.request = request;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlertLine() {
        return alertLine;
    }

    public void setAlertLine(int alertLine) {
        this.alertLine = alertLine;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getRequest() {
        return request;
    }

    public void setRequest(int request) {
        this.request = request;
    }

    public boolean reduceStock(int amount){
        if(stock >= amount){
            System.out.printf("Successfully reduced %d amount of %s\n", amount, name);
            return true;
        }
        System.out.printf("Error! %s not enough!\n", name);
        return false;
    }
}
