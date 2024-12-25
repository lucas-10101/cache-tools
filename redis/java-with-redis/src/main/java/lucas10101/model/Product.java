package lucas10101.model;

/**
 * POJO generated with Chat-GPT.
 */
public class Product {

    private int productID;
    private String name;
    private String productNumber;
    private String color;
    private double standardCost;
    private double listPrice;
    private int categoryID;
    private int subcategoryID;
    private boolean discontinued;

    // Construtores
    public Product() {
    }

    // Getters e Setters
    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getStandardCost() {
        return standardCost;
    }

    public void setStandardCost(double standardCost) {
        this.standardCost = standardCost;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getSubcategoryID() {
        return subcategoryID;
    }

    public void setSubcategoryID(int subcategoryID) {
        this.subcategoryID = subcategoryID;
    }

    public boolean isDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }

    // Métodos adicionais, como toString(), hashCode(), equals() podem ser
    // adicionados conforme necessário
    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", name='" + name + '\'' +
                ", productNumber='" + productNumber + '\'' +
                ", color='" + color + '\'' +
                ", standardCost=" + standardCost +
                ", listPrice=" + listPrice +
                ", categoryID=" + categoryID +
                ", subcategoryID=" + subcategoryID +
                ", discontinued=" + discontinued +
                '}';
    }
}
