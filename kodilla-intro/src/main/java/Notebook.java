public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 700 && this.weight <= 1900) {
            System.out.println("This notebook has a standard weight.");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }
    public void checkYear() {
        if (this.year < 2010) {
            System.out.println("This notebook is ancient.");
        } else if (this.weight >= 2010 && this.weight <= 2020) {
            System.out.println("This notebook is old.");
        } else {
            System.out.println("This notebook is modern.");
        }
    }
    public void checkPriceAndYear() {
        if (this.price > 1000 && this.year >2020) {
            System.out.println("Good choice");
        } else if (this.price >= 1000 && this.year <2019) {
            System.out.println("Bad choice");
        }

    }
}
